package ec.edu.espe.bethsabeboutique.utils;

import com.google.gson.Gson;
import ec.edu.espe.bethsabeboutique.model.Dress;

/**
 *
 * @author caeta
 */
public class JsonManager {
    public String convertToJson(Dress dress) {
        Gson gson = new Gson();
        
        String FormatedData = gson.toJson(dress);
        return FormatedData;  
    }
    
}
