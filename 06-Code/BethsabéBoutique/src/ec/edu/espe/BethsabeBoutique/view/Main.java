
package ec.edu.espe.BethsabeBoutique.view;

import ec.edu.espe.BethsabeBoutique.controller.FileManager;
import ec.edu.espe.BethsabeBoutique.model.Dress;
import java.util.ArrayList;

/**
 *
 * @author Carlos Jaya,Software Juniors, DCOO-ESPE
 */

public class Main {
    public static void main(String[] args) {
        ArrayList<Dress> dressList;
        dressList = new ArrayList<>();
        BethsabéBoutique dressShop = new BethsabéBoutique();
        FileManager fileManager = new FileManager();
        dressShop.displayMenu();
        

        
    }
}
