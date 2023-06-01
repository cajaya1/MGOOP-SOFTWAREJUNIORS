package ec.edu.espe.BethsabeBoutique.controller;

import ec.edu.espe.BethsabeBoutique.model.Dress;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Caetano Flores, Juniors, DCCO-ESPE
 */
public class ReportManager {
    Scanner scanner = new Scanner(System.in);
    FileManager fileManager = new FileManager();
    
    public void createReport(List<Dress> dressList){
        String reportName;
        System.out.println("Ingrese el nombre del reporte: ");
        reportName = scanner.next();
        fileManager.createCsv(dressList, reportName);
        fileManager.createJson(dressList, reportName);
    }
}
