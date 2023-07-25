/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.BethsabeBoutique.view;

import com.mongodb.client.MongoClient;
import ec.edu.espe.BethsabeBoutique.utils.DbConnectionManager;

/**
 *
 * @author Carlos Jaya,Software Juniors, DCOO-ESPE
 */
public class Main {
    public static void main(String[] args) {
        DbConnectionManager dbConnectionManager = new DbConnectionManager();
        MongoClient mongoClient = dbConnectionManager.connectDb();
        
        BethsabéBoutique dressShop = new BethsabéBoutique();
        dressShop.displayMenu();   
    }
}