package ec.edu.espe.bethsabeboutique.controller;

import com.mongodb.MongoException;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import org.bson.Document;

/**
 *
 * @author caeta
 */
public class SalesController {
    MongoClient client;
    MongoDatabase database;
    MongoCollection collection;
    
    
    public SalesController(MongoClient client) {
        this.client = client;
        this.database = client.getDatabase("BethsabeBoutique");
        
    }
    
    public void addDressToCart(int id, String name, float price) {
        collection = database.getCollection("Cart");
        if(checkProductAlreadyInCart(id, collection) == false) {
            Document dressDoc = new Document("id", id).append("name", name).append("price", price)
                                 .append("quantity", 1);
            collection.insertOne(dressDoc);
        }  
    }
    
    public void deleteDressOfCart(int dressId) {
        collection = database.getCollection("Cart");
        Document filter = new Document("id", dressId);
        collection.deleteOne(filter);
    }
    
    public boolean checkProductAlreadyInCart(int id, MongoCollection collection) { //If is on cart adds 1 to quantity
        Document filter = new Document("id", id);
        FindIterable<Document> documents = collection.find(filter);
        int quantity = 0;
        for (Document document : documents) {
            quantity = document.getInteger("quantity");
        }
        Document update = new Document("$set", new Document("quantity", quantity+1));
        if(quantity != 0) {
            collection.updateOne(filter, update);
            return true;
        }else {
            return false;
        }
    }
    
    public FindIterable<Document> retrieveDocuments(String collectionName) {
        collection = database.getCollection(collectionName);
        Document filter = new Document(); // Filtro vacío para obtener todos los documentos
        FindIterable<Document> documents = collection.find(filter);
        return documents;
    }
    
    public float calculateTotal() {
        double total = 0;
        FindIterable<Document> documents = retrieveDocuments("Cart");
        for (Document document : documents) {
            Double price = document.getDouble("price");
            int quantity = document.getInteger("quantity");
            total += (price * quantity);
        }
        float roundedTotal = Math.round(total * 100) / 100.0f;
        return roundedTotal;
    }
    
    public void updateInventory() {
        InventoryController inventoryController = new InventoryController(client);
        FindIterable<Document> documents = retrieveDocuments("Cart");
        for (Document document : documents) {
            int id = document.getInteger("id");
            int quantity = document.getInteger("quantity");
            inventoryController.updateInventoryAfterSale(id, quantity);
        }
    }
    
    public void updateSelledList() {
        FindIterable<Document> documents = retrieveDocuments("Cart");
        collection = database.getCollection("SelledDresses");
        for (Document document : documents) {
            int id = document.getInteger("id");
            String name = document.getString("name");
            Double price = document.getDouble("price");
            int quantity = document.getInteger("quantity");
            LocalDate nowDate = LocalDate.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            String sellDate =  nowDate.format(formatter);
            if(checkProductAlreadyInCart(id, collection) == false) {
                Document dressDoc = new Document("id", id).append("name", name).append("price", price)
                                    .append("quantity", 1).append("sellDate", sellDate);
                collection.insertOne(dressDoc);
            }
        }
    }
    
    public void cleanCart() {
        collection = database.getCollection("Cart");
        collection.deleteMany(new Document());
    }
    
}
