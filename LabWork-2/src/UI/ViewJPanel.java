/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;
import Model.Customer;
import Model.DeliveryPackage;
import Model.Product;
/**
 *
 * @author mandalore
 */
public class ViewJPanel extends javax.swing.JPanel {
    
    private DeliveryPackage delPackage;

    /**
     * Creates new form UpdateJPanel
     */
    public ViewJPanel() {
        initComponents();
    }
    
    ViewJPanel(DeliveryPackage deliveryPackage) {
        initComponents();
        
        this.delPackage = deliveryPackage;
        display();
    }
    
    public void display() {
        pkID.setText(String.valueOf(this.delPackage.getPackageId()));
        pkWeight.setText(String.valueOf(this.delPackage.getPackageWeight()));
        
        Customer customer = this.delPackage.getCustomer();
        customerID.setText(String.valueOf(customer.getCustomerId()));
        customerName.setText(customer.getFullName());
    }    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        customerName = new javax.swing.JTextField();
        pdName = new javax.swing.JTextField();
        customerID = new javax.swing.JTextField();
        pdID = new javax.swing.JTextField();
        cnmLabel = new javax.swing.JLabel();
        pdPrice = new javax.swing.JTextField();
        cidLabel = new javax.swing.JLabel();
        pkWeight = new javax.swing.JTextField();
        pkID = new javax.swing.JTextField();
        pnLabel = new javax.swing.JLabel();
        pidLabel = new javax.swing.JLabel();
        ppLabel = new javax.swing.JLabel();
        pkwLabel = new javax.swing.JLabel();
        pkidLabel = new javax.swing.JLabel();

        customerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerNameActionPerformed(evt);
            }
        });

        pdName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pdNameActionPerformed(evt);
            }
        });

        customerID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerIDActionPerformed(evt);
            }
        });

        pdID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pdIDActionPerformed(evt);
            }
        });

        cnmLabel.setForeground(new java.awt.Color(255, 51, 51));
        cnmLabel.setText("Customer Name");

        pdPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pdPriceActionPerformed(evt);
            }
        });

        cidLabel.setForeground(new java.awt.Color(255, 51, 51));
        cidLabel.setText("Customer ID");

        pkWeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pkWeightActionPerformed(evt);
            }
        });

        pkID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pkIDActionPerformed(evt);
            }
        });

        pnLabel.setForeground(new java.awt.Color(255, 51, 51));
        pnLabel.setText("Product Name");

        pidLabel.setForeground(new java.awt.Color(255, 51, 51));
        pidLabel.setText("Product ID");

        ppLabel.setForeground(new java.awt.Color(255, 51, 51));
        ppLabel.setText("Product Price");

        pkwLabel.setForeground(new java.awt.Color(255, 51, 51));
        pkwLabel.setText("Package Weight");

        pkidLabel.setForeground(new java.awt.Color(255, 51, 51));
        pkidLabel.setText("Package ID");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pidLabel)
                    .addComponent(ppLabel)
                    .addComponent(pkidLabel)
                    .addComponent(pkwLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(pkWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pkID, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pdPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pdID, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cidLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pdName, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cnmLabel)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(customerID, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(customerName, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 362, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pnLabel)
                    .addComponent(pdName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cnmLabel))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pidLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pdID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customerID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cidLabel))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ppLabel)
                    .addComponent(pdPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pkidLabel)
                    .addComponent(pkID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pkwLabel)
                    .addComponent(pkWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(278, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void customerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customerNameActionPerformed

    private void pdNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pdNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pdNameActionPerformed

    private void customerIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customerIDActionPerformed

    private void pdIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pdIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pdIDActionPerformed

    private void pdPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pdPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pdPriceActionPerformed

    private void pkWeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pkWeightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pkWeightActionPerformed

    private void pkIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pkIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pkIDActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cidLabel;
    private javax.swing.JLabel cnmLabel;
    private javax.swing.JTextField customerID;
    private javax.swing.JTextField customerName;
    private javax.swing.JTextField pdID;
    private javax.swing.JTextField pdName;
    private javax.swing.JTextField pdPrice;
    private javax.swing.JLabel pidLabel;
    private javax.swing.JTextField pkID;
    private javax.swing.JTextField pkWeight;
    private javax.swing.JLabel pkidLabel;
    private javax.swing.JLabel pkwLabel;
    private javax.swing.JLabel pnLabel;
    private javax.swing.JLabel ppLabel;
    // End of variables declaration//GEN-END:variables
}
