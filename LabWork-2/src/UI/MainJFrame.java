/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import Model.DeliveryPackage;
/**
 *
 * @author mandalore
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    private DeliveryPackage deliveryPackage;
    
    public MainJFrame() {
        initComponents();
        
        this.deliveryPackage = new DeliveryPackage();
    }
    
    MainJFrame(DeliveryPackage delPackage){
         this.setVisible(true);
         initComponents();
        
        this.deliveryPackage = delPackage;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        controlJPane = new javax.swing.JPanel();
        CreateJPanel = new javax.swing.JButton();
        UpdateJPanel = new javax.swing.JButton();
        DisplayJPanel = new javax.swing.JButton();
        rightPane = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CreateJPanel.setText("Create");
        CreateJPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateJPanelActionPerformed(evt);
            }
        });

        UpdateJPanel.setText("Update");
        UpdateJPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateJPanelActionPerformed(evt);
            }
        });

        DisplayJPanel.setText("Display");
        DisplayJPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisplayJPanelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout controlJPaneLayout = new javax.swing.GroupLayout(controlJPane);
        controlJPane.setLayout(controlJPaneLayout);
        controlJPaneLayout.setHorizontalGroup(
            controlJPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlJPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(controlJPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DisplayJPanel)
                    .addGroup(controlJPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(CreateJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(UpdateJPanel, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        controlJPaneLayout.setVerticalGroup(
            controlJPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlJPaneLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(CreateJPanel)
                .addGap(65, 65, 65)
                .addComponent(UpdateJPanel)
                .addGap(81, 81, 81)
                .addComponent(DisplayJPanel)
                .addContainerGap(243, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(controlJPane);

        javax.swing.GroupLayout rightPaneLayout = new javax.swing.GroupLayout(rightPane);
        rightPane.setLayout(rightPaneLayout);
        rightPaneLayout.setHorizontalGroup(
            rightPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 993, Short.MAX_VALUE)
        );
        rightPaneLayout.setVerticalGroup(
            rightPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );

        jSplitPane1.setRightComponent(rightPane);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CreateJPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateJPanelActionPerformed
        // TODO add your handling code here:
        jSplitPane1.setRightComponent(new CreateJPanel(this.deliveryPackage));
    }//GEN-LAST:event_CreateJPanelActionPerformed

    private void DisplayJPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisplayJPanelActionPerformed
        // TODO add your handling code here:
        
        jSplitPane1.setRightComponent(new ViewJPanel(this.deliveryPackage));
    }//GEN-LAST:event_DisplayJPanelActionPerformed

    private void UpdateJPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateJPanelActionPerformed
        // TODO add your handling code here:
        System.out.println("UI.MainJFrame.UpdateJPanelActionPerformed()");
        jSplitPane1.setRightComponent(new EditJPanel(this.deliveryPackage));
    }//GEN-LAST:event_UpdateJPanelActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CreateJPanel;
    private javax.swing.JButton DisplayJPanel;
    private javax.swing.JButton UpdateJPanel;
    private javax.swing.JPanel controlJPane;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPanel rightPane;
    // End of variables declaration//GEN-END:variables
}
