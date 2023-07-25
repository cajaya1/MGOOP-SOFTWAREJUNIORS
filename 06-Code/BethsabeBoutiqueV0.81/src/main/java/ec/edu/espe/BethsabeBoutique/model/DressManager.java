/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.BethsabeBoutique.model;

import ec.edu.espe.BethsabeBoutique.controller.BetterScanner;
import java.util.ArrayList;

/**
 *
 * @author Carlos Jaya,Software Juniors, DCOO-ESPE
 */
public class DressManager {
    BetterScanner scanner = new BetterScanner();
    FileManager fileManager = new FileManager();
    ArrayList<Dress> dressList;
    
    public DressManager() {
        dressList = new ArrayList<>();
    }
    
    public Dress getDressInformation() {
        System.out.print("Ingrese el nombre del vestido: ");
        String name = scanner.getNoSpacedString();
        
        System.out.print("Ingrese la marca del vestido: ");
        String brand = scanner.getNoSpacedString();
        
        System.out.print("Ingrese las medidas del vestido: ");
        String size = scanner.getNoSpacedString();
        
        System.out.print("Ingrese el precio del vestido: ");
        float price = scanner.getValidFloat();

        System.out.print("Ingrese la cantidad de vestidos: ");
        int quantity = scanner.getValidInt();
        
        return new Dress(name, brand, size, price, quantity);
    }
    
    
    
    public Dress searchDress() {
        dressList = fileManager.loadJson(dressList);
        System.out.print("Ingrese el nombre del vestido: ");
        String name = scanner.getNoSpacedString();
        boolean dressFounded = false;
        
        for (Dress dressToSearch : dressList) {
            if (dressToSearch.getName().equalsIgnoreCase(name)) {
                dressFounded = true;
                return dressToSearch;
            }
        }
        if (dressFounded == false) {
            System.err.println("No hay ningun vestido con el nombre: "+name+" en la base de datos");
            System.out.println("Revise que el nombre este escrito correctamente e intelo nuevamente");
        }
        return null;
    }
    
    public Dress getUpdatedDressInformation() {
        System.out.print("Enter New Dress Name: ");
        String name = scanner.getNoSpacedString();
        
        System.out.print("Enter New Dress Brand: ");
        String brand = scanner.getNoSpacedString();
        
        System.out.print("Enter New Dress Size: ");
        String size = scanner.getNoSpacedString();
        
        System.out.print("Enter New Price: ");
        float price = scanner.getValidFloat();
        
        System.out.print("Enter New Dress Quantity: ");
        int quantity = scanner.getValidInt();
        
        return new Dress(name, brand, size, price, quantity);
    }
}

