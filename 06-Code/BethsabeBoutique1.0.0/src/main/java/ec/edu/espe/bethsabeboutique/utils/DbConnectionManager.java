package ec.edu.espe.bethsabeboutique.utils;

import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import javax.swing.JOptionPane;
public class DbConnectionManager {
    MongoClient client;
    public MongoClient connectDb() {
        String uri = "mongodb+srv://FCaetano:FCaetano@cluster0.erktrrv.mongodb.net/?retryWrites=true&w=majority";
        try {
            client = MongoClients.create(uri);
        } catch (MongoException e) {
            JOptionPane.showMessageDialog(null, "Error al conectar con la base de datos!", "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        return client;
    }

    public void closeConnection() {
        client.close();
    }
}


