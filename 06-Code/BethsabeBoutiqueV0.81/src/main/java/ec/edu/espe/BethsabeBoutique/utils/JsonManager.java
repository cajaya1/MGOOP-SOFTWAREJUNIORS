package ec.edu.espe.BethsabeBoutique.utils;

import com.google.gson.Gson;
import ec.edu.espe.BethsabeBoutique.model.Dress;

/**
 *
 * @author caeta
 */
public class JsonManager {
    Gson gson = new Gson();
    public String convertToJson(Dress dress) {
        String FormatedData = gson.toJson(dress);
        return FormatedData;  
    }
    
    public Dress fromJsonToDress(String data) {
        Dress dress = gson.fromJson(data, Dress.class);
        return dress;
    }
}
