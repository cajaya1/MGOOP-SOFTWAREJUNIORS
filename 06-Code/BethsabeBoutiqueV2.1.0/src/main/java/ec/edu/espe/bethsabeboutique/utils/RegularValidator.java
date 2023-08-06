package ec.edu.espe.bethsabeboutique.utils;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 *
 * @author caeta
 */
public class RegularValidator {
    public Boolean validateEmail(String dressSize) {
        Pattern pattern = Pattern.compile("\\d{1,5}\\w[x]\\d{1,5}");
        Matcher matcher = pattern.matcher(dressSize);
        
       return matcher.matches();
    }
    public Boolean validatePhoneNumber(String dressSize) {
        Pattern pattern = Pattern.compile("\\d{1,5}\\w[x]\\d{1,5}");
        Matcher matcher = pattern.matcher(dressSize);
        
       return matcher.matches();
    }
}
