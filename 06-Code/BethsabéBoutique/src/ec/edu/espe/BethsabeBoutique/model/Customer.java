package ec.edu.espe.BethsabeBoutique.model;

/**
 *
 * @author Caetano Flores, Juniors, DCCO-ESPE
 */
public class Customer {

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
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the idCard
     */
    public String getIdCard() {
        return idCard;
    }

    /**
     * @param idCard the idCard to set
     */
    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }
    private String name;
    private String email;
    private String idCard;
    
    public Customer(String name, String email, String idCard){
        this.name = name;
        this.email = email;
        this.idCard = idCard;
    }
}
