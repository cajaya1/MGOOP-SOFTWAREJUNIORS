/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.BethsabeBoutique.model;

import ec.edu.espe.BethsabeBoutique.controller.utils.BetterScanner;
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
