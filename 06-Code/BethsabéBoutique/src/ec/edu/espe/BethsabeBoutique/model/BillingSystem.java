package ec.edu.espe.BethsabeBoutique.model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Caetano Flores, Juniors, DCCO-ESPE
 */
public class BillingSystem {
    LocalDate dateOfPurchase;
    
   public void createBill(ArrayList<Dress> cart, Customer customer, float total, float taxes) {
        //Creates the folder "Reportes" in root 
        File file = new File("Facturas");
        file.mkdir();
        dateOfPurchase = LocalDate.now();
        String actualDate = dateOfPurchase.toString();
        
        
        try {
            FileWriter writer = new FileWriter("Facturas/"+actualDate+".txt", true);
            writer.write("Datos del cliente:\n");
            writer.write(customer.getName()+"\n");
            writer.write(customer.getIdCard()+"\n");
            writer.write(customer.getEmail()+"\n");
            writer.write(actualDate);
            writer.write("\nCOMPRAS\n:");
            int cartIndex = 1;
            for(Dress dressIndex : cart) {
                writer.write("("+cartIndex+") "+dressIndex.getName() + "--->"+dressIndex.getQuantity()
                    +"   $"+dressIndex.getPrice());
                cartIndex++;
            }
        System.out.println("Total sin impuestos: "+total);
        System.out.println("Impuestos: "+taxes);
        System.out.println("Total agregado impuestos: "+(total+taxes));
            writer.close();
        }catch (IOException e) { 
            
        }
    }
               
}
