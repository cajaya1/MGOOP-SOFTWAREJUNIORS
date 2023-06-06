package ec.edu.espe.BethsabeBoutique.view;
import ec.edu.espe.BethsabeBoutique.controller.InventoryManager;
import ec.edu.espe.BethsabeBoutique.controller.ReportManager;
import ec.edu.espe.BethsabeBoutique.controller.ShopingCart;

/**
 *
 * @author Carlos Jaya,Software Juniors, DCOO-ESPE
 */

import java.util.Scanner;

public class BethsabéBoutique {
    private Scanner scanner;
    InventoryManager inventory = new InventoryManager();
    ReportManager report = new ReportManager();
    ShopingCart shopingCart = new ShopingCart();
    
    public BethsabéBoutique() {
        scanner = new Scanner(System.in);
    }
    
    public void displayMenu() {
        int menuOption; 
        do{
            System.out.println("BethsabéBoutique");
            System.out.println("--------------------");
            System.out.println("1. Mostrar vestidos");
            System.out.println("2. Añadir vestido");
            System.out.println("3. Editar informacion de un vestido");
            System.out.println("4. Eliminar vestido");
            System.out.println("5. Vender un vestido");
            System.out.println("6. Generar reportes");
            System.out.println("0. Salir");
            System.out.print("Escoja una opcion: ");
            
            menuOption = scanner.nextInt();
            switch (menuOption) {

                case 0 -> System.out.println("Saliendo del programa...");
                case 1 -> inventory.displayDressList();
                case 2 -> inventory.addDress();
                case 3 -> inventory.editDress();
                case 4 -> inventory.deleteDress();
                case 5 -> displaySalesMenu();
                case 6 -> report.createReport(inventory.getDressList());
                default -> System.err.println("Opcion invalida, ingrese un numero del 0 al 5\n");
            }
        }while(menuOption != 0);
    }
    
    public void displaySalesMenu() {
        System.out.println(shopingCart.getCart());
            int menuOption;    
            System.out.println("\nVENTAS");
            System.out.println("--------------------");
            System.out.println("1. Añadir vestido al carrito de compras");
            System.out.println("2. Eliminar vestido del carrito de compras");
            System.out.println("3. Ver el carrito de compras");
            System.out.println("0. Salir");
            
            menuOption = scanner.nextInt();
            switch (menuOption) {

                case 0 -> System.out.println("Saliendo del menu...\n");
                case 1 -> shopingCart.addToCart();
                case 2 -> shopingCart.removeFromCart();
                case 3 -> shopingCart.printShopingCart();
                default -> System.err.println("Opcion invalida, ingrese un numero del 0 al 5\n");
            }
    }
}
