package ec.edu.espe.BethsabeBoutique.controller;

import ec.edu.espe.BethsabeBoutique.model.Customer;
import ec.edu.espe.BethsabeBoutique.model.Dress;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Caetano Flores, Juniors, DCCO-ESPE
 */
public class SalesManager {
    Scanner scanner = new Scanner(System.in);
    InventoryManager inventoryManager = new InventoryManager();
    
    public void createSale(ArrayList<Dress> cart){
        String name, email, idCard;
        
        System.out.print("Ingrese nombre del cliente: ");
        name = scanner.next();
        System.out.print("Ingrese correo electronico del cliente: ");
        email = scanner.next();
        System.out.print("Ingrese cedula cliente: ");
        idCard = scanner.next();
        
        Customer customer = new Customer(name, email, idCard);
        for(Dress dressOnCart : cart) {
            System.err.println("asdasdasdasdasd");
            for(Dress dressOnInventory : inventoryManager.getDressList()){
                System.out.println("DRESEES::::"+dressOnCart +"------"+dressOnInventory);
                if(dressOnCart.getName().equalsIgnoreCase(dressOnInventory.getName())) {
                    int quantity = dressOnInventory.getQuantity()-dressOnCart.getQuantity();
                    System.out.println("CANTIDAD::::::"+quantity);
                    if (quantity == 0)
                        inventoryManager.getDressList().remove(dressOnInventory);
                    else
                        dressOnInventory.setQuantity(quantity);
                }
                    
            }
            
        }
        
        
        
    }
    
}
