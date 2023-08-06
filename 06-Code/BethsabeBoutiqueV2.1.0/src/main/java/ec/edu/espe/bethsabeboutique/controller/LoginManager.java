package ec.edu.espe.bethsabeboutique.controller;

/**
 *
 * @author caeta
 */
public class LoginManager {
    String defaultUser = "miriam";
    String defaultpassword = "miriam";
    
    public Boolean checkPassword(String user, String password) {
        if (user.equalsIgnoreCase(defaultUser)) {
            if(password.equalsIgnoreCase(defaultpassword)) {
               return true; 
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
