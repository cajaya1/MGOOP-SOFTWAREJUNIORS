package ec.edu.espe.bethsabeboutique.controller;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.bethsabeboutique.utils.JsonManager;
import org.bson.Document;

/**
 *
 * @author caeta
 */
public class InventoryController {
    MongoClient client;
    MongoDatabase database;
    MongoCollection<Document> collection;
    JsonManager jsonManager = new JsonManager();

    public InventoryController(MongoClient client) {
        this.client = client;
        this.database = client.getDatabase("BethsabeBoutique");
        this.collection = database.getCollection("Dresses");
    }
    
    
    
    public void addDressToDb(String dressData) {
        Document dressDoc = Document.parse(dressData);
        collection.insertOne(dressDoc);
    }
    
    public void deleteDressOfDb(int dressId) {
        Document filter = new Document("id", dressId);
        collection.deleteOne(filter);
    }
    
    public void editDressOfDb(int dressId, String dressData) {
        MongoCollection collection = client.getDatabase("BethsabeBoutique").getCollection("Aux");
        Document filter = new Document("id", dressId); // Filtro vacío para obtener todos los documentos
        
        Document actual = new Document("$set", new Document().parse(dressData));
        collection.updateOne(filter, actual);
    }
    
    public FindIterable<Document> retrieveDocuments() {
        Document filter = new Document(); // Filtro vacío para obtener todos los documentos
        FindIterable<Document> documents = collection.find(filter);
        return documents;
    }
}
