package ec.edu.espe.BethsabeBoutique.controller;

import ec.edu.espe.BethsabeBoutique.model.Customer;
import ec.edu.espe.BethsabeBoutique.model.Dress;
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
    Customer customer;
    float total, bills;
    LocalDate date;
    
    public BillingSystem(Customer customer, float total, float bills) {
        this.customer = customer;
        this.total = total;
        this.bills = bills;
        this.date = LocalDate.now();
    }
    
   public void createBill() {
        //Creates the folder "Reportes" in root 
        File file = new File("Facturas");
        file.mkdir();
        String actualDate = date.toString();
        
        
        try {
            FileWriter writer = new FileWriter("Facturas/"+actualDate+".txt", true);
            writer.write("Datos del cliente:");
            writer.write(customer.getName());
            writer.write(customer.getIdCard());
            writer.write(customer.getEmail());
            writer.close();
        }catch (IOException e) { 
            
        }
    }
               
}
