package ec.edu.espe.BethsabeBoutique.controller;
import ec.edu.espe.BethsabeBoutique.controller.InventoryManager;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import ec.edu.espe.BethsabeBoutique.model.Customer;
import ec.edu.espe.BethsabeBoutique.model.Dress;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Caetano Flores, Juniors, DCCO-ESPE
 */
public class FileManager {
    public void createJson(ArrayList<Dress> dressList) {
        File file = new File("SavedFiles");
        file.mkdir();
        Gson gson = new GsonBuilder().registerTypeAdapter(LocalDate.class, 
                new TypeAdapter<LocalDate>() {
                    @Override
                    public void write(JsonWriter jsonWriter, LocalDate localDate) throws IOException{
                        jsonWriter.value(localDate.toString());
                    }
                    @Override
                    public LocalDate read(JsonReader jsonReader) throws IOException {
                        return LocalDate.parse(jsonReader.nextString());
                    }
                }).create();
        
        String jsonDressList = gson.toJson(dressList);

        try (FileWriter fileWriter = new FileWriter("SavedFiles/Inventory.json")) {
            fileWriter.write(jsonDressList);
        } catch (IOException e) {
            e.printStackTrace();
        }
            

        System.out.println("Se ha creado el reporte con éxito");
    }
    
    public ArrayList<Dress> loadJson(ArrayList<Dress> dressList) {
        Type type = new TypeToken<List<Dress>>(){}.getType();
        Gson gson = new GsonBuilder().registerTypeAdapter(LocalDate.class, 
                new TypeAdapter<LocalDate>() {
                    @Override
                    public void write(JsonWriter jsonWriter, LocalDate localDate) throws IOException{
                        jsonWriter.value(localDate.toString());
                    }
                    @Override
                    public LocalDate read(JsonReader jsonReader) throws IOException {
                        return LocalDate.parse(jsonReader.nextString());
                    }
                }).create();
        try (FileReader fileReader = new FileReader("SavedFiles/Inventory.json")) {
            dressList = gson.fromJson(fileReader, type);
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return dressList;
    }
    
    public void createCsv(ArrayList<Dress> dressList, String reportName) {
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
    
    public void createBill(){
        
    }
    
    
}
