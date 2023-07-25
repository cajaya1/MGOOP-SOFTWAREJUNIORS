package ec.edu.espe.BethsabeBoutique.controller;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.BethsabeBoutique.model.Dress;
import ec.edu.espe.BethsabeBoutique.utils.JsonManager;
import java.util.ArrayList;
import org.bson.Document;

/**
 *
 * @author caeta
 */
public class DbHandler {
    JsonManager jsonManager = new JsonManager();
    MongoDatabase database;
    MongoCollection<Document> collection;
    public DbHandler(MongoClient dbClient) {
        database = dbClient.getDatabase("DressShop");
        collection = database.getCollection("Dresses");
    }
    
    public void searchOnDb(String document) {
        
    }
    
    public void addOnDb(String data) {
        Document document = Document.parse(data);
        collection.insertOne(document);
        
    }
    
    public void deleteOnDb(int id) {
        
    }
    
    public void printCollection(String name) {
        
    }
    
    
    public void addDressesOnDb(ArrayList<Dress> dresses) {
        for (Dress dress : dresses) {
            String data = jsonManager.convertToJson(dress);
            Document document = Document.parse(data);
            
            collection.insertOne(document);
        }
    }
    
    public void readDressesOnDb(ArrayList<Dress> dresses) {
        dresses.clear();
        long DressesAmount = collection.countDocuments();
        for ()
    }
}

