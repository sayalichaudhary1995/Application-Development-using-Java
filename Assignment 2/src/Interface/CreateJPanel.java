/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.Car;
import Business.CarDirectory;
import java.awt.CardLayout;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author sayu
 */
public class CreateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateJPanel
     */
public String checkbox;
private JPanel userProcessContainer;
private CarDirectory carDirectory;
   public CreateJPanel(JPanel userProcessContainer, CarDirectory carDirectory) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.carDirectory=carDirectory;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblEnterDetails = new javax.swing.JLabel();
        lblTransitLevel = new javax.swing.JLabel();
        lblBrand = new javax.swing.JLabel();
        txtBrand = new javax.swing.JTextField();
        lblModelNo = new javax.swing.JLabel();
        txtmodelNo = new javax.swing.JTextField();
        lblSerialNo = new javax.swing.JLabel();
        txtserialNo = new javax.swing.JTextField();
        lblCity = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        lblCost = new javax.swing.JLabel();
        txtCost = new javax.swing.JTextField();
        lblYear = new javax.swing.JLabel();
        txtManufactureYear = new javax.swing.JTextField();
        lblMaintenanceCertificate = new javax.swing.JLabel();
        lblAvailable = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        txtTransitLevel = new javax.swing.JComboBox();
        txtmaintenanceCertificate = new javax.swing.JComboBox();
        lblRegisteredWithUber = new javax.swing.JLabel();
        txtRegisteredWithUber = new javax.swing.JComboBox();
        lblSeatcount = new javax.swing.JLabel();
        txtNoOfSeats = new javax.swing.JTextField();
        checkBox = new javax.swing.JCheckBox();

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblEnterDetails.setBackground(new java.awt.Color(0, 0, 0));
        lblEnterDetails.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        lblEnterDetails.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEnterDetails.setText("Enter Car Details");

        lblTransitLevel.setBackground(new java.awt.Color(0, 0, 0));
        lblTransitLevel.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblTransitLevel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblTransitLevel.setText("Transit Level");

        lblBrand.setBackground(new java.awt.Color(0, 0, 0));
        lblBrand.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblBrand.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblBrand.setText("Brand Name:");

        txtBrand.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtBrand.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtBrand.setBorder(null);
        txtBrand.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtBrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBrandActionPerformed(evt);
            }
        });

        lblModelNo.setBackground(new java.awt.Color(0, 0, 0));
        lblModelNo.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblModelNo.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblModelNo.setText("Model Number:");

        txtmodelNo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtmodelNo.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtmodelNo.setBorder(null);
        txtmodelNo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblSerialNo.setBackground(new java.awt.Color(0, 0, 0));
        lblSerialNo.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblSerialNo.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblSerialNo.setText("Serial Number:");

        txtserialNo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtserialNo.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtserialNo.setBorder(null);
        txtserialNo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblCity.setBackground(new java.awt.Color(0, 0, 0));
        lblCity.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblCity.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblCity.setText("City Available:");

        txtCity.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtCity.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtCity.setBorder(null);
        txtCity.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblCost.setBackground(new java.awt.Color(0, 0, 0));
        lblCost.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblCost.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblCost.setText("Cost");

        txtCost.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtCost.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtCost.setBorder(null);
        txtCost.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCostActionPerformed(evt);
            }
        });

        lblYear.setBackground(new java.awt.Color(0, 0, 0));
        lblYear.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblYear.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblYear.setText("Manufacture Year:");

        txtManufactureYear.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtManufactureYear.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtManufactureYear.setBorder(null);
        txtManufactureYear.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblMaintenanceCertificate.setBackground(new java.awt.Color(0, 0, 0));
        lblMaintenanceCertificate.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblMaintenanceCertificate.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblMaintenanceCertificate.setText("Maintenance Certificate:");

        lblAvailable.setBackground(new java.awt.Color(0, 0, 0));
        lblAvailable.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblAvailable.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblAvailable.setText("Available:");

        btnSave.setBackground(new java.awt.Color(255, 255, 255));
        btnSave.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(153, 204, 255));
        btnBack.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(51, 0, 51));
        btnBack.setText("< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        txtTransitLevel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtTransitLevel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Prime", "SUV", "Mini", "Micro", " " }));
        txtTransitLevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTransitLevelActionPerformed(evt);
            }
        });

        txtmaintenanceCertificate.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtmaintenanceCertificate.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Valid", "Expired" }));
        txtmaintenanceCertificate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmaintenanceCertificateActionPerformed(evt);
            }
        });

        lblRegisteredWithUber.setBackground(new java.awt.Color(0, 0, 0));
        lblRegisteredWithUber.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblRegisteredWithUber.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblRegisteredWithUber.setText("Registered with Uber:");

        txtRegisteredWithUber.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtRegisteredWithUber.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Yes", "No" }));
        txtRegisteredWithUber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRegisteredWithUberActionPerformed(evt);
            }
        });

        lblSeatcount.setBackground(new java.awt.Color(0, 0, 0));
        lblSeatcount.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblSeatcount.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblSeatcount.setText("No of Seats:");

        txtNoOfSeats.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtNoOfSeats.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtNoOfSeats.setBorder(null);
        txtNoOfSeats.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        checkBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(293, 293, 293))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(btnBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblEnterDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblBrand)
                                    .addComponent(lblCost)
                                    .addComponent(lblCity))
                                .addGap(25, 25, 25)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblSerialNo))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtCost, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtTransitLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblYear)
                                            .addComponent(lblModelNo)
                                            .addComponent(lblSeatcount)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblRegisteredWithUber)
                                .addGap(18, 18, 18)
                                .addComponent(txtRegisteredWithUber, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblTransitLevel)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblMaintenanceCertificate)
                                .addGap(18, 18, 18)
                                .addComponent(txtmaintenanceCertificate, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblAvailable)
                                .addGap(29, 29, 29)
                                .addComponent(checkBox, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(99, 99, 99)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtserialNo, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtManufactureYear, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtmodelNo, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNoOfSeats, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(192, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEnterDetails)
                    .addComponent(btnBack))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSerialNo)
                    .addComponent(txtserialNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBrand)
                    .addComponent(txtBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCity)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblModelNo)
                    .addComponent(txtmodelNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTransitLevel)
                    .addComponent(txtTransitLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSeatcount)
                    .addComponent(txtNoOfSeats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCost)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblYear)
                            .addComponent(txtManufactureYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaintenanceCertificate)
                    .addComponent(txtmaintenanceCertificate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblAvailable)
                    .addComponent(checkBox))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRegisteredWithUber)
                    .addComponent(txtRegisteredWithUber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 187, Short.MAX_VALUE)
                .addComponent(btnSave)
                .addGap(59, 59, 59))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtCostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCostActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        String transitLevel = txtTransitLevel.getSelectedItem().toString();
        if (transitLevel == null || transitLevel.equalsIgnoreCase("Select")) {
            JOptionPane.showMessageDialog(null, "Please select a Transit Level!");
            return;
        }
        String brand = txtBrand.getText();
        if (brand == null || brand.equals("")) {
            JOptionPane.showMessageDialog(null, "Brand Name is empty!");
            return;
        }
        String modelNo = txtmodelNo.getText();
        if (modelNo == null || modelNo.equals("")) {
            JOptionPane.showMessageDialog(null, "Model Number is empty!");
            return;
        }
        String serialNo = txtserialNo.getText();
        if (serialNo == null || serialNo.equals("")) {
            JOptionPane.showMessageDialog(null, "Serial Number is empty!");
            return;
        }
        
        String city = txtCity.getText();
        if (city == null || city.equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter a valid City Name!");
            return;
        }
       
        
        
        String seatCount = txtNoOfSeats.getText();
        try{
            Integer.parseInt(seatCount);
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Please type in a integer value for No of Seats");
            return;
        }
        String cost = txtCost.getText();
        try{
            Double.parseDouble(cost);
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Please type in a Double value for Cost");
            return;
        }
        String manufactureYear = txtManufactureYear.getText();
        try{
            Integer.parseInt(manufactureYear);
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Please type in a Integer value for Manufactured Year");
            return;
        }
        String maintenanceCertificate = txtmaintenanceCertificate.getSelectedItem().toString();
        if (maintenanceCertificate == null || maintenanceCertificate.equalsIgnoreCase("Select")) {
            JOptionPane.showMessageDialog(null, "Please select the status of maintenance certificate");
            return;
        }
        
        String registeredwithUber = txtRegisteredWithUber.getSelectedItem().toString();
        if (registeredwithUber == null || registeredwithUber.equalsIgnoreCase("Select")) {
            JOptionPane.showMessageDialog(null, "Please select Registration with Uber");
            return;
        }
        DateFormat dateformat = new SimpleDateFormat("MM:dd:YYYY");
        Date dateObj = new Date();
        String j = dateformat.format(dateObj);
      

        Car car = carDirectory.addCar();
        car.setTransitLevel(transitLevel);
        car.setbrand(brand);
        car.setmodelNo(modelNo);
        car.setserialNo(serialNo);
        
        car.setCity(city);
        car.setSeatCount(Integer.parseInt(seatCount));
        car.setPrice(Double.parseDouble(cost));
        car.setManufactureYear(Integer.parseInt(manufactureYear));
        car.setmaintenanceCertificate(maintenanceCertificate);
        
        if(checkBox.isSelected())
        {
            car.setAvailablity("Yes");
            
        }
        else
        {
            car.setAvailablity("No");
        }
       // car.setAvailablity(checkbox);
        car.setregisteredwithUber(registeredwithUber);
        car.setDate(j);

        JOptionPane.showMessageDialog(null, "Car is Registered Successfully!");

        txtTransitLevel.setSelectedItem("Select");
        txtBrand.setText("");
        txtmodelNo.setText("");
        txtserialNo.setText("");
       
        txtCity.setText("");
        
      
        txtNoOfSeats.setText("");
        txtCost.setText("");
        txtManufactureYear.setText("");
        txtmaintenanceCertificate.setSelectedItem("Select");
        
        txtRegisteredWithUber.setSelectedItem("Select");
        
        checkBox.setSelected(Boolean.parseBoolean(""));

    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtTransitLevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTransitLevelActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtTransitLevelActionPerformed

    private void txtmaintenanceCertificateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmaintenanceCertificateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmaintenanceCertificateActionPerformed

    private void txtRegisteredWithUberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRegisteredWithUberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRegisteredWithUberActionPerformed

    private void checkBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_checkBoxActionPerformed

    private void txtBrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBrandActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBrandActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JCheckBox checkBox;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAvailable;
    private javax.swing.JLabel lblBrand;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblCost;
    private javax.swing.JLabel lblEnterDetails;
    private javax.swing.JLabel lblMaintenanceCertificate;
    private javax.swing.JLabel lblModelNo;
    private javax.swing.JLabel lblRegisteredWithUber;
    private javax.swing.JLabel lblSeatcount;
    private javax.swing.JLabel lblSerialNo;
    private javax.swing.JLabel lblTransitLevel;
    private javax.swing.JLabel lblYear;
    private javax.swing.JTextField txtBrand;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtCost;
    private javax.swing.JTextField txtManufactureYear;
    private javax.swing.JTextField txtNoOfSeats;
    private javax.swing.JComboBox txtRegisteredWithUber;
    private javax.swing.JComboBox txtTransitLevel;
    private javax.swing.JComboBox txtmaintenanceCertificate;
    private javax.swing.JTextField txtmodelNo;
    private javax.swing.JTextField txtserialNo;
    // End of variables declaration//GEN-END:variables
}
