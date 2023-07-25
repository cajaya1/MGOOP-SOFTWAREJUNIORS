package ec.edu.espe.BethsabeBoutique.utils;

import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

/**
 *
 * @author caeta
 */
public class DbConnectionManager {
    MongoClient client;
    public MongoClient connectDb() {
        String uri = "mongodb+srv://FCaetano:FCaetano@cluster0.erktrrv.mongodb.net/?retryWrites=true&w=majority";
        try {
            client = MongoClients.create(uri);
        } catch (MongoException e) {
            System.err.println("Error al conectar a MongoDB: " + e.getMessage());
            return null;
        }
        return client;
    }

    public void closeConnection() {
        client.close();
    }
}
