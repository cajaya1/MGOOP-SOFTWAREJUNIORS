/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.BethsabeBoutique.model;

import ec.edu.espe.BethsabeBoutique.controller.utils.BetterScanner;
import java.util.ArrayList;

/**
 *
 * @author Carlos Jaya,Software Juniors, DCOO-ESPE
 */
public class SalesManager {
    BetterScanner BetterScanner = new BetterScanner();
    InventoryManager inventoryManager = new InventoryManager();
    BillingSystem billingSystem = new BillingSystem();
    
    public void createSale(ArrayList<Dress> cart, float totalPrice, float taxes){
        String name, email, idCard;
        
        System.out.print("Ingrese nombre del cliente: ");
        name = BetterScanner.getNoSpacedString();
        System.out.print("Ingrese correo electronico del cliente: ");
        email = BetterScanner.getNoSpacedString();
        System.out.print("Ingrese cedula cliente: ");
        idCard = BetterScanner.getNoSpacedString();
        
        Customer customer = new Customer(name, email, idCard);
        for(Dress dressOnCart : cart) {
            for(Dress dressOnInventory : inventoryManager.getDressList()){
                if(dressOnCart.getName().equalsIgnoreCase(dressOnInventory.getName())) {
                    int quantity = dressOnInventory.getQuantity()-dressOnCart.getQuantity();
                    if (quantity == 0)
                        inventoryManager.getDressList().remove(dressOnInventory);
                    else
                        dressOnInventory.setQuantity(quantity);
                }
                    
            }
            
        }
        
        billingSystem.createBill(cart, customer, totalPrice, taxes);
        
    }
    
}
