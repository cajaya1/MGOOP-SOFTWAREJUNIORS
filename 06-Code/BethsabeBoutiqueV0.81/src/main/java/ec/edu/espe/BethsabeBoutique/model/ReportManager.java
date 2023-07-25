package ec.edu.espe.BethsabeBoutique.model;

import ec.edu.espe.BethsabeBoutique.controller.BetterScanner;
import java.util.ArrayList;
/**
 *
 * @author Carlos Jaya,Software Juniors, DCOO-ESPE
 */
public class ReportManager {
    BetterScanner scanner = new BetterScanner();
    FileManager fileManager = new FileManager();
    
    public void createReport(ArrayList<Dress> dressList){
        String reportName;
        System.out.println("Ingrese el nombre del reporte: ");
        reportName = scanner.getNoSpacedString();
        fileManager.createCsv(dressList, reportName);
    }
}
