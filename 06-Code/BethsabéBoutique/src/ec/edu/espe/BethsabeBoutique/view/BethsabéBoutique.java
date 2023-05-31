package ec.edu.espe.BethsabeBoutique.view;
import ec.edu.espe.BethsabeBoutique.controller.InventoryManager;
import ec.edu.espe.BethsabeBoutique.controller.ReportManager;
/**
 *
 * @author Carlos Jaya,Software Juniors, DCOO-ESPE
 */

import java.util.Scanner;

public class BethsabéBoutique {
    private Scanner scanner;
    InventoryManager inventory = new InventoryManager();
    ReportManager report = new ReportManager();
    
    public BethsabéBoutique() {
        scanner = new Scanner(System.in);
    }
    
    public void displayMenu() {
        int option; 
        do{
            System.out.println("BethsabéBoutique");
            System.out.println("--------------------");
            System.out.println("1. Mostrar vestidos");
            System.out.println("2. Añadir vestido");
            System.out.println("3. Editar informacion de un vestido");
            System.out.println("4. Eliminar vestido");
            System.out.println("5. Generar reportes");
            System.out.println("0. Salir");
            System.out.print("Escoja una opcion: ");
            
            option = scanner.nextInt();
            switch (option) {
                case 0 -> System.out.println("Saliendo del programa...");
                case 1 -> inventory.displayDressList();
                case 2 -> inventory.addDress();
                case 3 -> inventory.editDress();
                case 4 -> inventory.deleteDress();
                case 5 -> report.createReport(inventory.getDressList());
                default -> System.err.println("Opcion invalida, ingrese un numero del 0 al 5\n");
            }
        }while(option != 0);
    }
}
