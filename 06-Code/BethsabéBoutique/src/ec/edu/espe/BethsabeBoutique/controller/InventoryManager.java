
package ec.edu.espe.BethsabeBoutique.controller;

import ec.edu.espe.BethsabeBoutique.model.Dress;
import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;
import java.util.Scanner;
/**
 *
 * @author Carlos Jaya,Software Juniors, DCOO-ESPE
 */


public class InventoryManager {
    private List<Dress> dressList;
    Scanner scanner = new Scanner(System.in);
    DressManager dressManager = new DressManager();
    
    public void InventoryManager() {
        dressList = new ArrayList<>();
    }
    
    public void addDress() {
        String name, brand, size;
        int quantity;
        
        Dress dress = dressManager.getDressInformation();
        dress.setDateReceived(LocalDate.now());
        getDressList().add(dress);
    }
    
    public void editDress() {
        String name = dressManager.getDressName();
        
        for (Dress dress : getDressList()) {
            if (dress.getName().equalsIgnoreCase(name)) {
                Dress updatedDress = dressManager.getUpdatedDressInformation();
                dress.setName(updatedDress.getName());
                dress.setBrand(updatedDress.getBrand());
                dress.setSize(updatedDress.getSize());
                dress.setQuantity(updatedDress.getQuantity());
                System.out.println("Vestido -"+dress.getName()+"- editado exitosamente");
                return;
            }
        }
        //In case theres no dress with that name in dressList:
        System.err.println("No hay ningun vestido con el nombre: "+name+" en la base de datos");
        System.out.println("Revise que el nombre este escrito correctamente");
    }
    
    public void deleteDress() {
        String name = dressManager.getDressName();
        
        for (Dress dress : getDressList()) {
            if (dress.getName().equalsIgnoreCase(name)) {
                getDressList().remove(dress);
                System.out.println("Vestido -"+dress.getName()+"- Eliminado");
            }
        }
        //In case theres no dress with that name in dressList:
        System.err.println("No hay ningun vestido con el nombre: "+name+" en la base de datos");
        System.out.println("Revise que el nombre este escrito correctamente");
    }
    
    public void displayDressList() {
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

    public List<Dress> getDressList() {
        return dressList;
    }
}

