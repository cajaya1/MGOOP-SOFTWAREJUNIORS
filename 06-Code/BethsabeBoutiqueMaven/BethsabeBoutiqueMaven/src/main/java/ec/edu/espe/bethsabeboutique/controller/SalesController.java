package ec.edu.espe.bethsabeboutique.controller;

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
        Document dressDoc = new Document("id", id).append("name", name).append("price", price);
        collection.insertOne(dressDoc);
    }
    
    public void deleteDressOfCart(int dressId) {
        Document filter = new Document("id", dressId);
        collection.deleteOne(filter);
    }
    
    public FindIterable<Document> retrieveDocuments() {
        Document filter = new Document(); // Filtro vacío para obtener todos los documentos
        FindIterable<Document> documents = collection.find(filter);
        return documents;
    }
}
