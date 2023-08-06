package ec.edu.espe.bethsabeboutique.controller;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import ec.edu.espe.bethsabeboutique.model.Dress;
import ec.edu.espe.bethsabeboutique.utils.DbConnectionManager;
import ec.edu.espe.bethsabeboutique.utils.JsonManager;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import org.bson.Document;

/**
 *
 * @author caeta
 */
public class ReportController {
    Dress dress;
    MongoClient client;
    SalesController salesController;
    InventoryController inventoryController;

    public ReportController() {
        this.client = DbConnectionManager.getInstance().getClient();
        salesController = new SalesController();
        inventoryController = new InventoryController();
    }
    
    
    public void generateSalesReport(String path) {
        FindIterable<Document> documents = salesController.retrieveDocuments("SelledDresses");
        for (Document document : documents) {
            int id = document.getInteger("id");
            float price = Math.round(document.getDouble("price") * 100) / 100.0f;;
            String name = document.getString("name");
            String sellDate = document.getString("sellDate");
            int quantity = document.getInteger("quantity");
            
            try {
                FileWriter writer = new FileWriter("C:\\Users\\caeta\\OneDrive\\Escritorio\\reporteDeVentas.csv");
                writer.write("id ;" + "precio ;" + "nombre ;" + "Fecha de Venta ;" + "Cantidad \n");
                writer.write(id + ";" + price + ";" + name + ";" + sellDate + ";" + quantity + "\n\n");
                writer.close();
            }catch (IOException e){  
                System.err.println("ERRRRROOORRR");
            }
        }
    }
    
    public void generateInventoryReport(String path) {
        FindIterable<Document> documents = inventoryController.retrieveDocuments();
        for (Document document : documents) {
            int id = document.getInteger("id");
            float price = Math.round(document.getDouble("price") * 100) / 100.0f;;
            String name = document.getString("name");
            String sellDate = document.getString("registerDate");
            String size = document.getString("size");
            int quantity = document.getInteger("quantity");
            
            try {
                FileWriter writer = new FileWriter(path + "\\ReporteInventario.csv", true);
                writer.write("id ;" + "precio ;" + "nombre ;" + "talla ;" + "Fecha de registro ;" + "Cantidad ;\n");
                writer.write(id + ";" + price + ";" + name + ";" + size + ";" + sellDate + ";" + quantity + "\n\n");
                writer.close();
            }catch (IOException e){  
            }
        }
    }
}
