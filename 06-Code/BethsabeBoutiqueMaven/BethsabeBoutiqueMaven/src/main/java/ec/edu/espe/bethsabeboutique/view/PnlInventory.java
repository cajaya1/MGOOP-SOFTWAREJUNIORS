package ec.edu.espe.bethsabeboutique.view;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import ec.edu.espe.bethsabeboutique.controller.InventoryController;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.table.TableModel;
import org.bson.Document;

/**
 *
 * @author caeta
 */
public class PnlInventory extends javax.swing.JFrame {
    MongoClient client;

    /**
     * Creates new form LoginPanel
     */
    public PnlInventory(MongoClient client) {
        this.client = client;
        initComponents();
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
        jButton1 = new javax.swing.JButton();
        txtUserInput = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblInventory = new javax.swing.JTable();
        BtnAddProduct = new javax.swing.JButton();
        BtnDeleteProduct = new javax.swing.JButton();
        BtnEditProduct = new javax.swing.JButton();

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
        jLabel1.setText("Catálogo");

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
                .addGap(114, 114, 114)
                .addComponent(jLabel1)
                .addContainerGap(230, Short.MAX_VALUE))
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

        jButton1.setBackground(new java.awt.Color(226, 76, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(227, 227, 227));
        jButton1.setText("Buscar");
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtUserInput.setBackground(new java.awt.Color(227, 227, 227));

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

        BtnAddProduct.setBackground(new java.awt.Color(226, 76, 51));
        BtnAddProduct.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnAddProduct.setForeground(new java.awt.Color(227, 227, 227));
        BtnAddProduct.setText("Añadir Producto");
        BtnAddProduct.setBorderPainted(false);
        BtnAddProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAddProductActionPerformed(evt);
            }
        });

        BtnDeleteProduct.setBackground(new java.awt.Color(158, 124, 118));
        BtnDeleteProduct.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnDeleteProduct.setForeground(new java.awt.Color(227, 227, 227));
        BtnDeleteProduct.setText("Eliminar Producto");
        BtnDeleteProduct.setBorderPainted(false);
        BtnDeleteProduct.setEnabled(false);
        BtnDeleteProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDeleteProductActionPerformed(evt);
            }
        });

        BtnEditProduct.setBackground(new java.awt.Color(158, 124, 118));
        BtnEditProduct.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnEditProduct.setForeground(new java.awt.Color(227, 227, 227));
        BtnEditProduct.setText("Editar Producto");
        BtnEditProduct.setBorderPainted(false);
        BtnEditProduct.setEnabled(false);
        BtnEditProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEditProductActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtUserInput)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(BtnAddProduct)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                        .addComponent(BtnDeleteProduct)
                        .addGap(77, 77, 77)
                        .addComponent(BtnEditProduct)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUserInput, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnAddProduct, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(BtnDeleteProduct, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(BtnEditProduct, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ;
    }//GEN-LAST:event_jButton1ActionPerformed

    private void BtnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnReturnActionPerformed
        PnlMain pnlMain = new PnlMain(client);
        pnlMain.setVisible(true);
        pnlMain.setLocationRelativeTo(this);
        this.dispose();
    }//GEN-LAST:event_BtnReturnActionPerformed

    private void BtnAddProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAddProductActionPerformed
        PnlInsertProduct pnlInsertProduct = new PnlInsertProduct(client);
        pnlInsertProduct.setVisible(true);
        pnlInsertProduct.setLocationRelativeTo(this);
        this.dispose();
    }//GEN-LAST:event_BtnAddProductActionPerformed

    private void BtnDeleteProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDeleteProductActionPerformed
        InventoryController inventoryController = new InventoryController(client); 
        int selectedId = obtainSelectedDress();
        inventoryController.deleteDressOfDb(selectedId);
        
        disableButton(BtnDeleteProduct);
        disableButton(BtnEditProduct);
        loadTable();
    }//GEN-LAST:event_BtnDeleteProductActionPerformed

    private void BtnEditProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEditProductActionPerformed
        PnlEditProduct pnlEditProduct = new PnlEditProduct(client, obtainSelectedDress());
        pnlEditProduct.setVisible(true);
        pnlEditProduct.setLocationRelativeTo(this);
        this.dispose();
    }//GEN-LAST:event_BtnEditProductActionPerformed

    private void TblInventoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TblInventoryMouseClicked
        enableButton(BtnDeleteProduct);
        enableButton(BtnEditProduct);
    }//GEN-LAST:event_TblInventoryMouseClicked

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
            java.util.logging.Logger.getLogger(PnlInventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PnlInventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PnlInventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PnlInventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PnlInventory(null).setVisible(true);
            }
        });
    }
    
    private void loadTable() {
        FindIterable<Document> dresses;
        InventoryController inventoryController = new InventoryController(client);
        dresses = inventoryController.retrieveDocuments();
        DefaultTableModel model = new DefaultTableModel();
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
    private javax.swing.JButton BtnDeleteProduct;
    private javax.swing.JButton BtnEditProduct;
    private javax.swing.JButton BtnReturn;
    private javax.swing.JTable TblInventory;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtUserInput;
    // End of variables declaration//GEN-END:variables
}