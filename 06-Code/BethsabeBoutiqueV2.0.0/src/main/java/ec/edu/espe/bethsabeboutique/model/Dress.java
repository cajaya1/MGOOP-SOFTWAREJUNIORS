package ec.edu.espe.bethsabeboutique.model;

import ec.edu.espe.bethsabeboutique.controller.DressController;
import java.time.LocalDate;

/**
 *
 * @author caeta
 */
public class Dress {
    private int id;
    private float price;
    private String name;
    private String size;
    private int quantity;
    private String registerDate;
    private String sellDate;

    public Dress(int id, float price, String name, String size, String registerDate, int quantity) {
        this.id = id;
        this.price = price;
        this.name = name;
        this.size = size;
        this.registerDate = registerDate;
        this.quantity = quantity;
    }
    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the price
     */
    public float getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the size
     */
    public String getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     * @return the registerDate
     */
    public String getRegisterDate() {
        return registerDate;
    }

    /**
     * @param registerDate the registerDate to set
     */
    public void setRegisterDate(String registerDate) {
        this.registerDate = registerDate;
    }

    /**
     * @return the sellDate
     */
    public String getSellDate() {
        return sellDate;
    }

    /**
     * @param sellDate the sellDate to set
     */
    public void setSellDate(String sellDate) {
        this.sellDate = sellDate;
    }

    /**
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    
}
