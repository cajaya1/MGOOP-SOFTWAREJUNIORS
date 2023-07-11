/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.BethsabeBoutique.model;

import java.util.ArrayList;
import java.time.LocalDate;
/**
 *
 * @author Carlos Jaya,Software Juniors, DCOO-ESPE
 */
public class InventoryManager {
    private ArrayList<Dress> dressList = new ArrayList<>();
    DressManager dressManager = new DressManager();
    FileManager fileManager = new FileManager();
    
    public InventoryManager() {
        dressList = fileManager.loadJson(dressList);
    }
    
    public void addDress() {
        
        Dress dress = dressManager.getDressInformation();
        dress.setDateReceived(LocalDate.now());
        getDressList().add(dress);
        fileManager.createJson(dressList);
    }
    
    public void editDress() {
        Dress dress = dressManager.searchDress();
        if (dress != null) {
            Dress updatedDress = dressManager.getUpdatedDressInformation();
            dress.setName(updatedDress.getName());
            dress.setBrand(updatedDress.getBrand());
            dress.setSize(updatedDress.getSize());
            dress.setQuantity(updatedDress.getQuantity());
            System.out.println("Vestido -"+dress.getName()+"- editado exitosamente");
        }
    }
    
    public void deleteDress() {
        Dress dress = dressManager.searchDress();
        if (dress != null) {
            getDressList().remove(dress);
            System.out.println("Vestido -"+dress.getName()+"- Eliminado");
            fileManager.createJson(dressList);
        }

    }
    
    
    public void displayDressList() {
        dressList.clear();
        dressList = fileManager.loadJson(dressList);
        
        System.out.println("Inventario de vestidos: ");
        System.out.println("-----------------");
        
        int dressIndex = 1;
        for (Dress dress : getDressList()) {
            System.out.println("VESTIDO #"+dressIndex);
            System.out.println("Nombre: " + dress.getName());
            System.out.println("Marca: " + dress.getBrand());
            System.out.println("Medidas: " + dress.getSize());
            System.out.println("Cantidad: " + dress.getQuantity());
            System.out.println("\n-----------------\n");
            dressIndex++;
            
        }
    }

    /**
     * @return the dressList
     */
    public ArrayList<Dress> getDressList() {
        return dressList;
    }
}
