package ec.edu.espe.bethsabeboutique.controller;

import com.mongodb.MongoException;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
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
        this.collection = database.getCollection("Cart");
        
    }
    
    public void addDressToCart(int id, String name, float price) {
        if(checkProductAlreadyInCart(id) == false) {
            Document dressDoc = new Document("id", id).append("name", name).append("price", price)
                                 .append("quantity", 1);
            collection.insertOne(dressDoc);
        }  
    }
    
    public void deleteDressOfCart(int dressId) {
        Document filter = new Document("id", dressId);
        collection.deleteOne(filter);
    }
    
    public boolean checkProductAlreadyInCart(int id) { //If is on cart adds 1 to quantity
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
    
    public FindIterable<Document> retrieveDocuments() {
        Document filter = new Document(); // Filtro vacío para obtener todos los documentos
        FindIterable<Document> documents = collection.find(filter);
        return documents;
    }
    
    public float calculateTotal() {
        double total = 0;
        FindIterable<Document> documents = retrieveDocuments();
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
        FindIterable<Document> documents = retrieveDocuments();
        for (Document document : documents) {
            int id = document.getInteger("id");
            int quantity = document.getInteger("quantity");
            inventoryController.updateInventoryAfterSale(id, quantity);
        }
    }
    
    public void cleanCart() {
        collection.deleteMany(new Document());
    }
    
}
