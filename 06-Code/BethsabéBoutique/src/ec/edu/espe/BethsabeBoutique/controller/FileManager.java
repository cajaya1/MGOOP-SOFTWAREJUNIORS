package ec.edu.espe.BethsabeBoutique.controller;

import ec.edu.espe.BethsabeBoutique.model.Dress;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author Caetano Flores, Juniors, DCCO-ESPE
 */
public class FileManager {
    public void createJson() {
        
    }
    
    public void createCsv(List<Dress> dressList, String reportName) {
        //Creates the folder "Reportes" in root 
        File file = new File("Reportes");
        file.mkdir();
        String[] reportsList = file.list(); //Obtains all the reports in "Reportes"
        
        int dressIndex=0;  
        for (Dress dress : dressList) {
            
            try {
                FileWriter writer = new FileWriter("Reportes/"+reportName+".csv", true);
                writer.write("\nVestido #"+dressIndex);
                writer.write("\nnombre: ;"+dress.getName());
                writer.write("\nmarca: ;"+dress.getBrand());
                writer.write("\nmedidas: ;"+dress.getSize());
                writer.write("\ncantidad: ;"+dress.getQuantity());
                writer.write("\nFechaRecepcion: ;"+dress.getDateReceived()+"\n");
                writer.close();
                dressIndex++;
            }catch (IOException e){ 
                
            }
        }
    }
    
    
}
