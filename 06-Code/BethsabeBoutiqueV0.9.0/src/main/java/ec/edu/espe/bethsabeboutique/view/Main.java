package ec.edu.espe.bethsabeboutique.view;

import com.mongodb.client.MongoClient;
import ec.edu.espe.bethsabeboutique.utils.DbConnectionManager;

/**
 *
 * @author caeta
 */
public class Main {
    public static void main(String[] args) {
       DbConnectionManager dbConnectionManager = new DbConnectionManager();
       MongoClient client; 
       client = dbConnectionManager.connectDb();
       if(client == null) {
           return;
       }
       
       PnlLogin loginPanel = new PnlLogin(client);
       loginPanel.setVisible(true);
       loginPanel.pack();
       loginPanel.setLocationRelativeTo(null);
       
       
    }
}
