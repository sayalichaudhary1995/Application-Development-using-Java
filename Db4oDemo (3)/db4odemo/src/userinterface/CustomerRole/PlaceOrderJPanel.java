/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.Items;
import Business.Order;
import Business.Organization;

import Business.UserAccount.UserAccount;
import Business.WorkQueue.LabTestWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sayu
 */
public class PlaceOrderJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private EcoSystem business;
    private Enterprise enterprise;
    private Organization organization;
    private Order order; 
      String total;
    
    public PlaceOrderJPanel(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise, 
            EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business=business;
        this.enterprise=enterprise;
        this.organization=organization;
        this.order=business.getOrderDirectory().createOrder() ;
        
        populateComboBox();
          this.total=populateTable();
        totalBillTxt.setText(this.total);
    }
    public String populateTable(){
        DefaultTableModel dtm = (DefaultTableModel) workRequestJTable.getModel();
        dtm.setRowCount(0);
        int totalBill=0;
        for(Items i:order.getItemsList()) {
            Object row[] = new Object[2];
            row[0] = i;
            row[1] = i.getPrice();
            totalBill=totalBill+i.getPrice();
            dtm.addRow(row);
            
            
        }  System.out.println(totalBill);
        this.total=String.valueOf(totalBill);
        totalBillTxt.setText(this.total);
        return String.valueOf(totalBill);
     }
    
    public void populateComboBox(){
         DefaultComboBoxModel dm=new DefaultComboBoxModel();
           for(Enterprise e:business.getEnterpriseDirectory().getEnterpriseList()){
           dm.addElement(e);    
   }
       RestaurantComboBox.setModel(dm);
    }
    
    public void populateRequestTable(String restaurantName){
     DefaultTableModel dtm = (DefaultTableModel) workRequestJTable.getModel();
        dtm.setRowCount(0);
        for(Enterprise e:business.getEnterpriseDirectory().getEnterpriseList())
        {
         if(e.getName().equals(restaurantName))
   {
       for(Items item:e.getItemsList())
       {
            Object row[] = new Object[2];
            row[0] = item;
            row[1] = item.getPrice();
            dtm.addRow(row);
        }
    }
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        btnAddToCart = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        btnDeleteFromCart = new javax.swing.JButton();
        btnPlaceOrder = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        RestaurantComboBox = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        workCartTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        customerNotesTxt = new javax.swing.JTextField();
        totalBillTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Item", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);
        if (workRequestJTable.getColumnModel().getColumnCount() > 0) {
            workRequestJTable.getColumnModel().getColumn(0).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(1).setResizable(false);
        }

        btnAddToCart.setText("Add to cart");
        btnAddToCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddToCartActionPerformed(evt);
            }
        });

        btnMenu.setText("Menu");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        enterpriseLabel.setText("Place Order");

        btnDeleteFromCart.setText("Delete from cart");
        btnDeleteFromCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteFromCartActionPerformed(evt);
            }
        });

        btnPlaceOrder.setText("Place order");
        btnPlaceOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlaceOrderActionPerformed(evt);
            }
        });

        jLabel1.setText("Restaurant :");

        RestaurantComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestaurantComboBoxActionPerformed(evt);
            }
        });

        jButton3.setText("back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        workCartTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Item", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(workCartTable);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Cart");

        jLabel3.setText("Message");

        totalBillTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalBillTxtActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Total Bill: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(enterpriseLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnPlaceOrder)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(btnDeleteFromCart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnAddToCart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel1)
                                            .addGap(18, 18, 18)
                                            .addComponent(RestaurantComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnMenu))
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel3)
                                        .addGap(42, 42, 42)
                                        .addComponent(customerNotesTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(totalBillTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(218, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jButton3)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(RestaurantComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMenu))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAddToCart)
                                .addGap(18, 18, 18)
                                .addComponent(btnDeleteFromCart)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addComponent(jLabel3))
                        .addComponent(customerNotesTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(btnPlaceOrder))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalBillTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(163, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddToCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddToCartActionPerformed
      
      int selectedRow = workRequestJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }
        else{
        Items i = (Items)workRequestJTable.getValueAt(selectedRow,0 );        
        Items item =order.addItem();
        item.setItemName(i.getItemName());
        item.setPrice(i.getPrice());
        JOptionPane.showMessageDialog(null, "Added to cart successfully");
        populateTableCart();
        //populateTable();
        
        }
        
       
    }//GEN-LAST:event_btnAddToCartActionPerformed

    
    public void populateTableCart(){
        DefaultTableModel dtm1 = (DefaultTableModel) workCartTable.getModel();
        dtm1.setRowCount(0);
        
        for(Items i:order.getItemsList()) {
            Object row[] = new Object[2];
            row[0] = i;
            row[1] = i.getPrice();
            
            dtm1.addRow(row);
        }
         }
    
    public void repopulateTableCart(){
        DefaultTableModel dtm1 = (DefaultTableModel) workCartTable.getModel();
        dtm1.setRowCount(0);
        
         }
    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed

        
        
 Enterprise e = (Enterprise) RestaurantComboBox.getSelectedItem();
        
        if (e.getName() == null || e.getName()==""){
            return;
        }
        
        RestaurantComboBox.setEnabled(false);
        populateRequestTable(e.getName());
        
              
    }//GEN-LAST:event_btnMenuActionPerformed

    
    private void btnDeleteFromCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteFromCartActionPerformed
        // TODO add your handling code here:
        int selectedRow = workCartTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }
        else{
        Items i = (Items)workCartTable.getValueAt(selectedRow,0 );        
        order.deleteItem(i);
        
        JOptionPane.showMessageDialog(null, "Deleted from cart successfully");
         populateTableCart();
        }
    }//GEN-LAST:event_btnDeleteFromCartActionPerformed

    private void btnPlaceOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlaceOrderActionPerformed
        // TODO add your handling code here:
     
        if (order.getItemsList().isEmpty() == false){
        Enterprise selectedItem = (Enterprise) RestaurantComboBox.getSelectedItem();
        order.setRestaurantName(selectedItem.getName());
        order.setStatus("order placed");
        order.setCustomerNotes(customerNotesTxt.getText());
        order.setCustomerUserName(userAccount.getUsername());
        order.setCustomerName(userAccount.getEmployee().getName());
        order.setCustomerId(userAccount.getEmployee().getId());
        
//        totalBillTxt.setText(this.total);
//        System.out.println(this.total);
        JOptionPane.showMessageDialog(null, "Order placed successfully");
        populateTable();
            System.out.println("total:"+this.total);
        totalBillTxt.setText(this.total);
        
        repopulateTableCart();
        
        RestaurantComboBox.setEnabled(true);
        
//        CustomerBillJPanel panel = new CustomerBillJPanel(userProcessContainer,userAccount,order);
//        userProcessContainer.add("CustomerBillJPanel", panel);
//        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
//        layout.next(userProcessContainer);
        }
        else{
        JOptionPane.showMessageDialog(null, "No items in the order");
        }
        
    }//GEN-LAST:event_btnPlaceOrderActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        userProcessContainer.remove(this);
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void RestaurantComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestaurantComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RestaurantComboBoxActionPerformed

    private void totalBillTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalBillTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalBillTxtActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> RestaurantComboBox;
    private javax.swing.JButton btnAddToCart;
    private javax.swing.JButton btnDeleteFromCart;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnPlaceOrder;
    private javax.swing.JTextField customerNotesTxt;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField totalBillTxt;
    private javax.swing.JTable workCartTable;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
