package ec.edu.espe.bethsabeboutique.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author caeta
 */
public class FormData {
    private String price;
    private String name;
    private String quantity;
    private String size;
    private String actualDate;
    
    public FormData() {
        if (actualDate == null) {
            LocalDate nowDate = LocalDate.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            this.actualDate = nowDate.format(formatter);
        }
    }

    /**
     * @return the price
     */
    public String getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(String price) {
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
     * @return the quantity
     */
    public String getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(String quantity) {
        this.quantity = quantity;
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
     * @return the actualDate
     */
    public String getActualDate() {
        return actualDate;
    }

    /**
     * @param actualDate the actualDate to set
     */
    public void setActualDate(String actualDate) {
        this.actualDate = actualDate;
    }


}
