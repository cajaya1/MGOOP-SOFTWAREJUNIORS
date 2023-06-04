package ec.edu.espe.BethsabeBoutique.controller;

import ec.edu.espe.BethsabeBoutique.model.Dress;
import java.util.ArrayList;

/**
 *
 * @author Caetano Flores, Juniors, DCCO-ESPE
 */
public class ShopingCart {
    float totalPrice;
    ArrayList<Dress> cart;
    
    public ShopingCart(){
        cart = new ArrayList<>();
    }
    
    public void addToCart(Dress dress, int quantity) {
        
        
        Dress dressOnCart = searchOnCart(dress);
        System.out.println(""+dress);
        cart.add(dress);
        
        if(dressOnCart == null) {
            dress.setQuantity(quantity);
            cart.add(dress);
        } else {
            dressOnCart.setQuantity(quantity + dressOnCart.getQuantity());
        }
        
        System.out.println("Vestido: "+dress.getName()+" añadido correctamente");
    }
    
    public void removeFromCart() {
        
    }
    
    public Dress searchOnCart(Dress dressToSearch) {
        int quantity = 0;
        
        try {
            for (Dress dress : cart) {
                if (dress.getName().equalsIgnoreCase(dressToSearch.getName())) {
                return dress;
                }
            }
        }catch(NullPointerException e) {
            return null;
        }
        return null;
    }
    
    public void printShopingCart() {
        int cartIndex = 1;
        for(Dress dressIndex : cart) {
            System.out.println("PRODUCTOS EN EL CARRITO: ");
            System.out.println("("+cartIndex+") "+dressIndex.getName() + "--->"+dressIndex.getQuantity());
        }
    }
}
