/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import static Business.Enterprise.Enterprise.EnterpriseType.Restaurant;
import Business.Organization;
import static Business.Organization.Type.RestaurantAdmin;
import Business.Role.RestaurantAdminRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author sayu
 */
public class CreateRestaurantJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateManagerJPanel
     */
    JPanel cardSequenceJPanel;
    EcoSystem system;
    Enterprise enterprise;
    Organization organization;
    public CreateRestaurantJPanel(JPanel cardSequenceJPanel,EcoSystem system) {
        initComponents();
        this.cardSequenceJPanel = cardSequenceJPanel;
        this.system=system;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtRestaurantName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtRestaurantAddress = new javax.swing.JTextField();
        BtnSaveRestaurant = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Create Restaurant");

        btnBack.setText(" Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Restaurant Name:");

        txtRestaurantName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRestaurantNameActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Address :");

        txtRestaurantAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRestaurantAddressActionPerformed(evt);
            }
        });

        BtnSaveRestaurant.setText("Create ");
        BtnSaveRestaurant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSaveRestaurantActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRestaurantName, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRestaurantAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(BtnSaveRestaurant)))))
                .addContainerGap(182, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnBack))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRestaurantName, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRestaurantAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(BtnSaveRestaurant)
                .addContainerGap(325, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
          CardLayout layout = (CardLayout)cardSequenceJPanel.getLayout();
        cardSequenceJPanel.remove(this);
        layout.previous(cardSequenceJPanel);
        
        
        Component[] comps = this.cardSequenceJPanel.getComponents();
        for(Component comp : comps){
            if(comp instanceof ManageRestaurantsJPanel){
                ManageRestaurantsJPanel manageRestaurantsJPanel= (ManageRestaurantsJPanel) comp;
               manageRestaurantsJPanel.populateTable(); 
            }
        }
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtRestaurantNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRestaurantNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRestaurantNameActionPerformed

    private void txtRestaurantAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRestaurantAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRestaurantAddressActionPerformed

    private void BtnSaveRestaurantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSaveRestaurantActionPerformed
        // TODO add your handling code here:
        String name=txtRestaurantName.getText();
        String address=txtRestaurantAddress.getText();
                String a = String.valueOf(system.getEnterpriseDirectory().searchEnterprise(name));
                 
                 
                 if (name.equals("") || address.equals("") ){
                    JOptionPane.showMessageDialog(null,"Fields cannot be empty");
                   
                 }
                 
                 else if((String.valueOf(system.getEnterpriseDirectory().searchEnterprise(name))).equalsIgnoreCase(name)){
                     JOptionPane.showMessageDialog(null,"Restaurant by this name already exists");
                }
                 else { 
                     enterprise= system.getEnterpriseDirectory().createAndAddEnterprise(name,address,Restaurant);
                     organization=  (Organization)enterprise.getRestaurantDirectory().createOrganization(Organization.Type.RestaurantAdmin);
                     System.out.println("in new restaurant"+ organization.getUserAccountDirectory().getUserAccountList().isEmpty());
//                     Employee employee=organization.getEmployeeDirectory().createEmployee("No Manager");
//                     organization.getUserAccountDirectory().createUserAccount("","" , employee, new RestaurantAdminRole());
//     

                      System.out.println("New restaurant created "+enterprise.getName());
                      
                     JOptionPane.showMessageDialog(null, "Restaurant saved successfully");
                     BtnSaveRestaurant.setEnabled(false);
                 }
              
    }//GEN-LAST:event_BtnSaveRestaurantActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnSaveRestaurant;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtRestaurantAddress;
    private javax.swing.JTextField txtRestaurantName;
    // End of variables declaration//GEN-END:variables
}
