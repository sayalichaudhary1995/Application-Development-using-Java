/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sayu
 */
public class ManageRestaurantsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageRestaurantsJPanel
     */
    
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    
           Enterprise enterprise; 
      Organization organization;
    public ManageRestaurantsJPanel(JPanel userProcessContainer,EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.ecosystem=ecosystem;
        populateTable();
        if(enterprise!=null &&organization!=null ){
        //this.enterprise = ecosystem.getEnterpriseDirectory().searchEnterprise(txtSearchRestaurant.getText());
        //this.organization=enterprise.getRestaurantDirectory().searchOrganization("RestaurantAdmin") ;
        }
    }
public void populateTable(){
        DefaultTableModel dtm = (DefaultTableModel) tblRestaurantsList.getModel();
        dtm.setRowCount(0);
        String m = "Not yet registered";
        
        for(Enterprise enterprise:ecosystem.getEnterpriseDirectory().getEnterpriseList()) {
            
                
                
      //          System.out.println(" In Managerestaurants populate table "+OrgRes.getName());
      //          System.out.println(" Enterprise name "+enterprise.getName());
     //           System.out.println(" New account username recorded in organization "+OrgRes.getUserAccountDirectory().getUserAccountList().get(0).getUsername());
            Object row[] = new Object[4];
//            row[0] = enterprise.getName();
            row[0] = enterprise;
            row[1] = enterprise.getAddress();
            
            Organization OrgRes=(Organization)enterprise.getRestaurantDirectory().searchOrganization("RestaurantAdmin");
            if(OrgRes.getUserAccountDirectory().getUserAccountList().isEmpty()){
            row[2] = m;
            row[3] = "";
                }
            else
                {
    //            System.out.println(""+OrgRes.getUserAccountDirectory().getUserAccountList().get(0).getEmployee().getName());
            row[2] = OrgRes.getUserAccountDirectory().getUserAccountList().get(0).getEmployee().getName();
            row[3] = OrgRes.getUserAccountDirectory().getUserAccountList().get(0).getUsername();
            }
            //row[4] = airliner.getFlightDir().getFlightList().size();
            dtm.addRow(row);
            
        }
    }
    
//public void populateManagersTable(){
//    Enterprise result = ecosystem.getEnterpriseDirectory().searchEnterprise(txtSearchRestaurant.getText());
//        Organization organization1=result.getRestaurantDirectory().searchOrganization("RestaurantAdmin") ;
//        DefaultTableModel dtm = (DefaultTableModel) tblSearchRestaurant.getModel();
//            dtm.setRowCount(0);
//  for(  UserAccount userAccount:organization1.getUserAccountDirectory().getUserAccountList()) 
//  {
//            Object row[] = new Object[3];
//            row[0] = result.getName();
//            row[1] = userAccount.getEmployee().getName();
//            
//            row[2] = userAccount;
//           
//            dtm.addRow(row);
//  }
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblRestaurantsList = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnNewRestaurant = new javax.swing.JButton();
        btnUpdateRestaurant = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        DeleteRestaurant = new javax.swing.JButton();
        btnAddManager = new javax.swing.JButton();
        btnUpdateMngr = new javax.swing.JButton();

        tblRestaurantsList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Restaurant Name", "Address", "Manager", "Manager Username"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblRestaurantsList);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Restaurants");

        btnNewRestaurant.setText("Create Restaurant ");
        btnNewRestaurant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewRestaurantActionPerformed(evt);
            }
        });

        btnUpdateRestaurant.setText("Update Restaurant");
        btnUpdateRestaurant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateRestaurantActionPerformed(evt);
            }
        });

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        DeleteRestaurant.setText("Delete Restaurant");
        DeleteRestaurant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteRestaurantActionPerformed(evt);
            }
        });

        btnAddManager.setText("Add Manager");
        btnAddManager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddManagerActionPerformed(evt);
            }
        });

        btnUpdateMngr.setText("Update Manager");
        btnUpdateMngr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateMngrActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 648, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnNewRestaurant)
                                    .addComponent(btnAddManager))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnUpdateMngr)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnUpdateRestaurant)
                                        .addGap(18, 18, 18)
                                        .addComponent(DeleteRestaurant)))))))
                .addGap(133, 133, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(3, 3, 3)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNewRestaurant)
                    .addComponent(btnUpdateRestaurant)
                    .addComponent(DeleteRestaurant))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddManager)
                    .addComponent(btnUpdateMngr))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewRestaurantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewRestaurantActionPerformed
        // TODO add your handling code here:
          CreateRestaurantJPanel panel = new CreateRestaurantJPanel(userProcessContainer,ecosystem);
        userProcessContainer.add("CreateRestaurantJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_btnNewRestaurantActionPerformed

    private void btnUpdateRestaurantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateRestaurantActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblRestaurantsList.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }
        else{
         Enterprise ep = (Enterprise)tblRestaurantsList.getValueAt(selectedRow, 0);   
         UpdateRestaurantJPanel panel = new UpdateRestaurantJPanel(userProcessContainer,ecosystem,ep);
         userProcessContainer.add("UpdateRestaurantJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer); 
        }
    }//GEN-LAST:event_btnUpdateRestaurantActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        
        
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
        Component[] comps = this.userProcessContainer.getComponents();
        for(Component comp : comps){
            if(comp instanceof SystemAdminWorkAreaJPanel){
                SystemAdminWorkAreaJPanel systemAdminWorkAreaJPanel= (SystemAdminWorkAreaJPanel) comp;
               systemAdminWorkAreaJPanel.populateTree(); 
            }
        }
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void DeleteRestaurantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteRestaurantActionPerformed
        // TODO add your handling code here:
        
        int selectedRow = tblRestaurantsList.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }
        else{
            Enterprise e = (Enterprise)tblRestaurantsList.getValueAt(selectedRow, 0);
            Organization orgResAdmin = e.getRestaurantDirectory().searchOrganization("RestaurantAdmin");
            
            if (orgResAdmin.equals(null)) {
            for (UserAccount userAccount:orgResAdmin.getUserAccountDirectory().getUserAccountList()){
                orgResAdmin.getUserAccountDirectory().deleteUserAccount(userAccount);
                orgResAdmin.getEmployeeDirectory().deleteEmployee(userAccount.getEmployee());
                e.getRestaurantDirectory().deleteOrganization(orgResAdmin);
                ecosystem.getEnterpriseDirectory().deleteEnterprise(e);
                JOptionPane.showMessageDialog(null, "Restaurant deleted successfully");
                populateTable();
              }
            }else {
                ecosystem.getEnterpriseDirectory().deleteEnterprise(e);
                JOptionPane.showMessageDialog(null, "Restaurant deleted successfully");
                populateTable();
            }
        }
        
        
    }//GEN-LAST:event_DeleteRestaurantActionPerformed

    private void btnAddManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddManagerActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblRestaurantsList.getSelectedRow();
        
           
        
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
          
        }
        else{
            
            Enterprise e = (Enterprise)tblRestaurantsList.getValueAt(selectedRow, 0);
        
        Organization OrgRes=(Organization)e.getRestaurantDirectory().searchOrganization("RestaurantAdmin");
          //  Organization orgResAdmin = s.getRestaurantDirectory().searchOrganization("RestaurantAdmin");
            if(!(OrgRes.getUserAccountDirectory().getUserAccountList().isEmpty())){
                JOptionPane.showMessageDialog(null, "Manager already exists.");
            }
            else {
                CreateManagerJPanel panel = new CreateManagerJPanel(userProcessContainer,ecosystem,e,organization);
                 userProcessContainer.add("CreateNewFlightJPanel", panel);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                 layout.next(userProcessContainer);
            }
            
            }

    }//GEN-LAST:event_btnAddManagerActionPerformed

    private void btnUpdateMngrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateMngrActionPerformed

        // TODO add your handling code here:
        
          //  Organization orgResAdmin = s.getRestaurantDirectory().searchOrganization("RestaurantAdmin");
            
        int selectedRow = tblRestaurantsList.getSelectedRow();
        
        
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a Manager");
        }
        else{
            
             Enterprise e = (Enterprise)tblRestaurantsList.getValueAt(selectedRow, 0);
        
        Organization OrgRes=(Organization)e.getRestaurantDirectory().searchOrganization("RestaurantAdmin");
            if((OrgRes.getUserAccountDirectory().getUserAccountList().isEmpty())){
                JOptionPane.showMessageDialog(null, "No Manager exists.Please Add a manager first!");
            }
           
            else{
           // UserAccount ua = e.getUserAccountDirectory().getUserAccountList().get(0);
          //  System.out.println(""+ua.getUsername());
            UpdateManagerJPanel panel = new UpdateManagerJPanel(userProcessContainer,ecosystem,e);
            userProcessContainer.add("UpdateManagerJPanel", panel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
            }
            //CreateManagerJPanel panel = new CreateManagerJPanel(cardSequenceJPanel,system,enterprise,organization);
        }
    }//GEN-LAST:event_btnUpdateMngrActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeleteRestaurant;
    private javax.swing.JButton btnAddManager;
    private javax.swing.JButton btnNewRestaurant;
    private javax.swing.JButton btnUpdateMngr;
    private javax.swing.JButton btnUpdateRestaurant;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblRestaurantsList;
    // End of variables declaration//GEN-END:variables
}
