package ec.edu.espe.bethsabeboutique.view;

import com.mongodb.client.MongoClient;
import ec.edu.espe.bethsabeboutique.utils.DbConnectionManager;
import javax.swing.UIManager;

/**
 *
 * @author caeta
 */
public class Main {
    public static void main(String[] args) {
       PnlSplash pnlSplash = new PnlSplash();
       pnlSplash.setVisible(true);
       pnlSplash.setLocationRelativeTo(null);
       
       DbConnectionManager.getInstance().connectDb();
       
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
       PnlLogin loginPanel = new PnlLogin();
       pnlSplash.dispose();
       loginPanel.setVisible(true);
       loginPanel.setLocationRelativeTo(null);
       
       
    }
}
