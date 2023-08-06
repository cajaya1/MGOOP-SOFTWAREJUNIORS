package ec.edu.espe.bethsabeboutique.view;

import com.mongodb.client.MongoClient;

/**
 *
 * @author caeta
 */
public class PnlSalesMenu extends javax.swing.JFrame {

    /**
     * Creates new form LoginPanel
     */
    public PnlSalesMenu() {
        initComponents();
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
        BtnReturn2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        BtnInventory = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        BtnCart = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

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
        jLabel1.setText("Ventas");

        BtnReturn2.setBackground(new java.awt.Color(227, 227, 227));
        BtnReturn2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnReturn2.setForeground(new java.awt.Color(226, 76, 51));
        BtnReturn2.setText("Regresar");
        BtnReturn2.setBorderPainted(false);
        BtnReturn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnReturn2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnReturn2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(137, 137, 137)
                .addComponent(jLabel1)
                .addContainerGap(243, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 2, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnReturn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.add(jPanel1);
        jPanel1.setBounds(0, 0, 600, 50);

        jPanel3.setBackground(new java.awt.Color(227, 227, 227));
        jPanel3.setFocusable(false);
        jPanel3.setRequestFocusEnabled(false);
        jPanel3.setVerifyInputWhenFocusTarget(false);

        BtnInventory.setBackground(new java.awt.Color(227, 227, 227));
        BtnInventory.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnInventory.setForeground(new java.awt.Color(227, 227, 227));
        BtnInventory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/box.png"))); // NOI18N
        BtnInventory.setAlignmentY(0.0F);
        BtnInventory.setBorderPainted(false);
        BtnInventory.setContentAreaFilled(false);
        BtnInventory.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnInventory.setFocusable(false);
        BtnInventory.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnInventory.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/box.png"))); // NOI18N
        BtnInventory.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/boxHover.png"))); // NOI18N
        BtnInventory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnInventoryActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Vender Producto(s)");

        BtnCart.setBackground(new java.awt.Color(227, 227, 227));
        BtnCart.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnCart.setForeground(new java.awt.Color(227, 227, 227));
        BtnCart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cart.png"))); // NOI18N
        BtnCart.setAlignmentY(0.0F);
        BtnCart.setBorderPainted(false);
        BtnCart.setContentAreaFilled(false);
        BtnCart.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnCart.setFocusable(false);
        BtnCart.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnCart.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/cart.png"))); // NOI18N
        BtnCart.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/cartHover.png"))); // NOI18N
        BtnCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCartActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Carrrito de Compras");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel2))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(BtnInventory, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(112, 112, 112)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnCart, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel3)))
                .addContainerGap(119, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(97, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnCart, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BtnInventory, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(92, 92, 92))
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

    private void BtnInventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnInventoryActionPerformed
        PnlSales pnlSales = new PnlSales();
        pnlSales.setVisible(true);
        pnlSales.setLocationRelativeTo(this);
        this.dispose(); 
    }//GEN-LAST:event_BtnInventoryActionPerformed

    private void BtnCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCartActionPerformed
        PnlCart pnlCart = new PnlCart();
        pnlCart.setVisible(true);
        pnlCart.setLocationRelativeTo(this);
        this.dispose();
    }//GEN-LAST:event_BtnCartActionPerformed

    private void BtnReturn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnReturn2ActionPerformed
        PnlMain pnlMain = new PnlMain();
        pnlMain.setVisible(true);
        pnlMain.setLocationRelativeTo(this);
        this.dispose();
    }//GEN-LAST:event_BtnReturn2ActionPerformed

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
            java.util.logging.Logger.getLogger(PnlSalesMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PnlSalesMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PnlSalesMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PnlSalesMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new PnlSalesMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCart;
    private javax.swing.JButton BtnInventory;
    private javax.swing.JButton BtnReturn2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}