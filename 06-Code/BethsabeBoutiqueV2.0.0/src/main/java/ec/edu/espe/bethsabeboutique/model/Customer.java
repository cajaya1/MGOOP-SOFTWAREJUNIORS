package ec.edu.espe.bethsabeboutique.model;

import java.util.ArrayList;

/**
 *
 * @author caeta
 */
public class Customer {
    ArrayList<Dress> dressesBought;
    String idCardNumber;
    String name;
    String email;
    String phoneNumber;
    String adress;

    public Customer(String idCardNumber, String name, String email, String phoneNumber, String adress) {
        this.idCardNumber = idCardNumber;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.adress = adress;
    }
    
    
}
