package ec.edu.espe.bethsabeboutique.controller;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.bethsabeboutique.utils.DbConnectionManager;
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

    public InventoryController() {
        this.client = DbConnectionManager.getInstance().getClient();
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
    
    public void updateInventoryAfterSale(int id, int selledDresses) {
        Document filter = new Document("id", id);
        FindIterable<Document> documents = collection.find(filter);
        int quantity = 0;
        for (Document document : documents) {
            quantity = document.getInteger("quantity");
        }
        int newQuantity = quantity - selledDresses;
        if(newQuantity != 0) {
            Document update = new Document("$set", new Document("quantity", quantity-selledDresses));
            collection.updateOne(filter, update);
        } else {
            deleteDressOfDb(id);
        }
        
    }
    
    public FindIterable<Document> retrieveDocuments() {
        Document filter = new Document(); // Filtro vacío para obtener todos los documentos
        FindIterable<Document> documents = collection.find(filter);
        return documents;
    }
}
