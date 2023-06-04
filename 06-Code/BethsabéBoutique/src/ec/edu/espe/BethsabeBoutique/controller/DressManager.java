/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.BethsabeBoutique.controller;

import ec.edu.espe.BethsabeBoutique.model.Dress;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Caetano Flores, Juniors, DCCO-ESPE
 */
public class DressManager {
    Scanner scanner = new Scanner(System.in);
    
    public Dress getDressInformation() {
        System.out.print("Ingrese el nombre del vestido: ");
        String name = scanner.next();
        
        System.out.print("Ingrese la marca del vestido: ");
        String brand = scanner.next();
        
        System.out.print("Ingrese las medidas del vestido: ");
        String size = scanner.next();
        
        System.out.print("Ingrese el precio del vestido: ");
        float price = scanner.nextFloat();
        
        System.out.print("Ingrese la cantidad de vestidos: ");
        int quantity = scanner.nextInt();
        
        return new Dress(name, brand, size, quantity);
    }
    
    
    
    public Dress searchDress(ArrayList<Dress> dressList) {
        System.out.print("Ingrese el nombre del vestido: ");
        String name = scanner.next();
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
        String name = scanner.next();
        
        System.out.print("Enter New Dress Brand: ");
        String brand = scanner.next();
        
        System.out.print("Enter New Dress Size: ");
        String size = scanner.next();
        
        System.out.print("Enter New Dress Quantity: ");
        int quantity = scanner.nextInt();
        
        return new Dress(name, brand, size, quantity);
    }
}
