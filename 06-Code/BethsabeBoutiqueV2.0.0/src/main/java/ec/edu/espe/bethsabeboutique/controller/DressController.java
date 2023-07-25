package ec.edu.espe.bethsabeboutique.controller;

import com.mongodb.client.FindIterable;
import ec.edu.espe.bethsabeboutique.model.FormData;
import ec.edu.espe.bethsabeboutique.model.Dress;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import ec.edu.espe.bethsabeboutique.utils.JsonManager;
import org.bson.Document;

/**
 *
 * @author caeta
 */
public class DressController {
    JsonManager jsonManager = new JsonManager();
    MongoClient client;
    InventoryController inventoryController;

    public DressController(MongoClient client) {
        this.client = client;
        inventoryController = new InventoryController(client);
    }
    
    public String convertFormToDress(FormData formData) {
        int id = calculateId();
        float price = Float.parseFloat(formData.getPrice());
        String name = formData.getName();
        String size = formData.getSize();
        String registerDate = formData.getActualDate();
        int quantity = Integer.parseInt(formData.getQuantity());
        
        
        Dress dress = new Dress(id, price, name, size, registerDate, quantity);
        String dressData = jsonManager.convertToJson(dress);
        
        return dressData;
    }
    
    public int calculateId() {
        MongoCollection collection = client.getDatabase("BethsabeBoutique").getCollection("Aux");
        Document filter = new Document(); // Filtro vacío para obtener todos los documentos
        FindIterable<Document> documents = collection.find(filter);
        int lastId = 0;
        for (Document document : documents) {
            lastId = document.getInteger("lastId");
        }

        int id = lastId+1;
        filter = new Document("lastId", lastId);
        Document actualizacion = new Document("$set", new Document("lastId", id));
        collection.updateOne(filter, actualizacion);
        return id;
    }
}
