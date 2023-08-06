package ec.edu.espe.bethsabeboutique.view;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import ec.edu.espe.bethsabeboutique.controller.InventoryController;
import ec.edu.espe.bethsabeboutique.controller.SalesController;
import ec.edu.espe.bethsabeboutique.controller.SearchBarController;
import ec.edu.espe.bethsabeboutique.model.Dress;
import java.awt.Color;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JButton;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import org.bson.Document;

/**
 *
 * @author caeta
 */
public class PnlSales extends javax.swing.JFrame {
    DefaultTableModel model = new DefaultTableModel();

    /**
     * Creates new form LoginPanel
     */
    public PnlSales() {
        initComponents();
        LblProductAdded.setForeground(new Color(0, 153, 0, 100));
        loadTable();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BtnReturn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        txtSearhBar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblInventory = new javax.swing.JTable();
        BtnAddProduct = new javax.swing.JButton();
        LblProductAdded = new javax.swing.JLabel();
        LblSearch = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setAlignmentX(0.0F);
        jPanel2.setAlignmentY(0.0F);
        jPanel2.setPreferredSize(new java.awt.Dimension(600, 400));
        jPanel2.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(226, 76, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 200));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(227, 227, 227));
        jLabel1.setText("Vender");

        BtnReturn.setBackground(new java.awt.Color(227, 227, 227));
        BtnReturn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnReturn.setForeground(new java.awt.Color(226, 76, 51));
        BtnReturn.setText("Regresar");
        BtnReturn.setBorderPainted(false);
        BtnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnReturnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(133, 133, 133)
                .addComponent(jLabel1)
                .addContainerGap(241, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 2, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnReturn, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.add(jPanel1);
        jPanel1.setBounds(0, 0, 600, 50);

        jPanel3.setBackground(new java.awt.Color(227, 227, 227));
        jPanel3.setFocusable(false);
        jPanel3.setRequestFocusEnabled(false);
        jPanel3.setVerifyInputWhenFocusTarget(false);

        txtSearhBar.setBackground(new java.awt.Color(227, 227, 227));
        txtSearhBar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearhBarKeyReleased(evt);
            }
        });

        TblInventory.setBackground(new java.awt.Color(227, 227, 227));
        TblInventory.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TblInventory.setForeground(new java.awt.Color(51, 51, 51));
        TblInventory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        TblInventory.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TblInventory.setGridColor(new java.awt.Color(226, 76, 51));
        TblInventory.setName(""); // NOI18N
        TblInventory.setShowGrid(false);
        TblInventory.setShowVerticalLines(true);
        TblInventory.getTableHeader().setResizingAllowed(false);
        TblInventory.getTableHeader().setReorderingAllowed(false);
        TblInventory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TblInventoryMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TblInventory);
        if (TblInventory.getColumnModel().getColumnCount() > 0) {
            TblInventory.getColumnModel().getColumn(0).setResizable(false);
            TblInventory.getColumnModel().getColumn(0).setHeaderValue("Id");
            TblInventory.getColumnModel().getColumn(1).setResizable(false);
            TblInventory.getColumnModel().getColumn(1).setHeaderValue("Nombre");
            TblInventory.getColumnModel().getColumn(2).setResizable(false);
            TblInventory.getColumnModel().getColumn(2).setHeaderValue("Precio");
            TblInventory.getColumnModel().getColumn(3).setResizable(false);
            TblInventory.getColumnModel().getColumn(3).setHeaderValue("Cantidad");
        }

        BtnAddProduct.setBackground(new java.awt.Color(158, 124, 118));
        BtnAddProduct.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnAddProduct.setForeground(new java.awt.Color(227, 227, 227));
        BtnAddProduct.setText("Añadir al carrito");
        BtnAddProduct.setBorderPainted(false);
        BtnAddProduct.setEnabled(false);
        BtnAddProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAddProductActionPerformed(evt);
            }
        });

        LblProductAdded.setBackground(new java.awt.Color(227, 227, 227));
        LblProductAdded.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LblProductAdded.setForeground(new java.awt.Color(0, 153, 0));
        LblProductAdded.setText("Producto añadido al carrito!");
        LblProductAdded.setOpaque(true);

        LblSearch.setBackground(new java.awt.Color(0, 0, 0));
        LblSearch.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LblSearch.setForeground(new java.awt.Color(102, 102, 102));
        LblSearch.setText("Buscar: ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(LblSearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSearhBar))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(BtnAddProduct)
                        .addGap(18, 18, 18)
                        .addComponent(LblProductAdded)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearhBar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnAddProduct, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(LblProductAdded))
                .addContainerGap())
        );

        jPanel2.add(jPanel3);
        jPanel3.setBounds(0, 50, 600, 350);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.getAccessibleContext().setAccessibleName("Login");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnReturnActionPerformed
        PnlSalesMenu pnlSalesMenu = new PnlSalesMenu();
        pnlSalesMenu.setVisible(true);
        pnlSalesMenu.setLocationRelativeTo(this);
        this.dispose();
    }//GEN-LAST:event_BtnReturnActionPerformed

    private void BtnAddProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAddProductActionPerformed
        TableModel clientDressesModel = TblInventory.getModel();
        int selectedRow = TblInventory.getSelectedRow();
        Object selectedValue = clientDressesModel.getValueAt(selectedRow, 0);
        int id = Integer.parseInt(selectedValue.toString());
        selectedValue = clientDressesModel.getValueAt(selectedRow, 1);
        String name = selectedValue.toString();
        selectedValue = clientDressesModel.getValueAt(selectedRow, 2);
        Float price = Float.parseFloat(selectedValue.toString());
        
        SalesController salesController = new SalesController();
        salesController.addDressToCart(id, name, price);
        LblProductAdded.setForeground(new Color(0, 153, 0, 255));
        
        countAndResetLbl();
    }//GEN-LAST:event_BtnAddProductActionPerformed

    private void TblInventoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TblInventoryMouseClicked
        enableButton(BtnAddProduct);
    }//GEN-LAST:event_TblInventoryMouseClicked

    private void txtSearhBarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearhBarKeyReleased
        SearchBarController searchBarController = new SearchBarController();
        String searchText = txtSearhBar.getText();
        TableRowSorter<DefaultTableModel> tableRowSorter = searchBarController.searchOnTable(new TableRowSorter<>(model), searchText);
        
        TblInventory.setRowSorter(tableRowSorter);
    }//GEN-LAST:event_txtSearhBarKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PnlSales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PnlSales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PnlSales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PnlSales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PnlSales().setVisible(true);
            }
        });
    }
    
    private void loadTable() {
        FindIterable<Document> dresses;
        InventoryController inventoryController = new InventoryController();
        dresses = inventoryController.retrieveDocuments();
        String[] columns = {"id", "nombre", "precio", "fecha registro", "cantidad"};
        model.setColumnIdentifiers(columns);
        
        String id, name, price, registeredDate, quantity;
        for(Document dress : dresses) {
            int index = 0;
            id = String.valueOf(dress.getInteger("id"));
            name = dress.getString("name");
            price = String.valueOf(dress.getDouble("price"));
            registeredDate = dress.getString("registerDate");
            quantity = String.valueOf(dress.getInteger("quantity"));
            
            model.addRow(new Object[]{id, name, price, registeredDate, quantity});
            
            
            index++;  
        }
        TblInventory.setModel(model); 
    }
    
    public void countAndResetLbl() {
        
        int delay = 500;

        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                LblProductAdded.setOpaque(true);
                LblProductAdded.setForeground(new Color(0, 153, 0, 100));
            }
        };

        Timer timer = new Timer();
        timer.schedule(task, delay);
        
        
        
    }
    
    public int obtainSelectedDress() {
        TableModel inventoryModel = TblInventory.getModel();
        int selectedRow = TblInventory.getSelectedRow();
        Object selectedValue = inventoryModel.getValueAt(selectedRow, 0);
        int selectedId = Integer.parseInt(selectedValue.toString());
        
        return selectedId;
    }
    
    private void disableButton(JButton button) {
        Color lighColor = button.getBackground();
        Color mutedColor = new Color(lighColor.getRed()-68, lighColor.getGreen()+48, lighColor.getBlue()+67);
        
        button.setBackground(mutedColor);
        button.setEnabled(false);
    }
    
    private void enableButton(JButton button) {
        Color mutedColor = button.getBackground();
        Color lightColor = new Color(mutedColor.getRed()+68, mutedColor.getGreen()-48, mutedColor.getBlue()-67);
        
        button.setBackground(lightColor);
        button.setEnabled(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAddProduct;
    private javax.swing.JButton BtnReturn;
    private javax.swing.JLabel LblProductAdded;
    private javax.swing.JLabel LblSearch;
    private javax.swing.JTable TblInventory;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtSearhBar;
    // End of variables declaration//GEN-END:variables
}
