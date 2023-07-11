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
public class ShopingCart {
    private float totalPrice;
    private ArrayList<Dress> cart;
    BetterScanner scanner = new BetterScanner();
    DressManager dressManager = new DressManager();
    SalesManager salesManager = new SalesManager();
    
    public ShopingCart(){
        cart = new ArrayList<>();
    }
    
    public void addToCart() {
        Dress dress = dressManager.searchDress();
        if(dress != null) {
            System.out.println("Ingrese la cantidad: ");
            int quantity = scanner.getValidInt();

            Dress dressOnCart = searchOnCart(dress);

            if(dressOnCart == null) {
                dress.setQuantity(quantity);
            } else {
                dressOnCart.setQuantity(quantity + dressOnCart.getQuantity());
            }
            getCart().add(dress);
            System.out.println("Vestido: "+dress.getName()+" añadido correctamente");
            
        }
    }
    
    public void removeFromCart() {
        int dressOption;
        int menuOption;
        Dress dress;
        
        System.out.println("1.Borrar una cantidad");
        System.out.println("2. Borrar todo el carrito");
        menuOption = scanner.getValidInt();
            
        switch (menuOption){
            case 1:
                printShopingCart();
                System.out.println("Seleccione el numero del vestido a borrar: ");
                dressOption = scanner.getValidInt();
                dress = getCart().get(dressOption-1);
                
                System.out.println("Ingresa la cantidad a borrar: ");
                int quantity = scanner.getValidInt();
                quantity = dress.getQuantity() - quantity;
                if(quantity == 0){
                    cart.remove(dress);
                }else{
                    dress.setQuantity(quantity);
                }
            break;
                
            case 2:
                cart.clear();
            break;
            }
            
    }
    
    public Dress searchOnCart(Dress dressToSearch) {
        
            for (Dress dress : getCart()) {
                if (dress.getName().equalsIgnoreCase(dressToSearch.getName())) {
                    return dress;
                }
            }
            
        return null;
    }
    
    public void printShopingCart() {
        int cartIndex = 1, option = 0;
        float taxes;
        
        System.out.println("VESTIDOS EN EL CARRITO: ");
        for(Dress dressIndex : getCart()) {
            System.out.println("("+cartIndex+") "+dressIndex.getName() + "--->"+dressIndex.getQuantity()
                    +"   $"+dressIndex.getPrice());
            cartIndex++;
            totalPrice += dressIndex.getPrice();
        }
        taxes = calculateTaxes();
        System.out.println("Total sin impuestos: "+getTotalPrice());
        System.out.println("Impuestos: "+taxes);
        System.out.println("Total agregado impuestos: "+(getTotalPrice()+taxes));
        
        System.out.println("OPCIONES:");
        System.out.println("1.COMPRAR");
        System.out.println("2.SALIR");
        option = scanner.getValidInt();
        switch (option) {
            case 1 -> salesManager.createSale(cart, totalPrice, taxes);
            case 2 -> System.out.println("");
            default -> System.err.println("Opcion Incorrecta, escoja un numero del 1 al 2");
        }
        
        
        
    }
    
    public float calculateTaxes() {   
            float taxes = getTotalPrice()*0.12f;
            return taxes;
        }
    

    /**
     * @return the cart
     */
    public ArrayList<Dress> getCart() {
        return cart;
    }

    /**
     * @param cart the cart to set
     */
    public void setCart(ArrayList<Dress> cart) {
        this.cart = cart;
    }

    /**
     * @return the totalPrice
     */
    public float getTotalPrice() {
        return totalPrice;
    }
}

