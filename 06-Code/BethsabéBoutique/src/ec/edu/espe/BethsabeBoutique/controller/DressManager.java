/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.BethsabeBoutique.controller;

import ec.edu.espe.BethsabeBoutique.model.Dress;
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
    
    
    
    public String getDressName() {
        System.out.print("Ingrese el nombre del vestido: ");
        return scanner.next();
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
