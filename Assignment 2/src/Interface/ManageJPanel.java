/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.Car;
import Business.CarDirectory;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sayu
 */
public class ManageJPanel extends javax.swing.JPanel {
 
    private CarDirectory carDirectory;
    private JPanel userProcessContainer;

    /**
     * Creates new form ManageJPanel
     */
    
  ManageJPanel(JPanel userProcessContainer, CarDirectory carDirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.carDirectory = carDirectory;
        //this.car=car;
        populateTable();
    }
  private void populateTable()
    {
        DefaultTableModel tmodel = (DefaultTableModel) tblCarDetails.getModel();
        tmodel.setRowCount(0);
        for(Car car: carDirectory.getCarList())
        {
            Object[] row = new Object[4];
            row[0] = car;
            row[1] = car.getmodelNo();
            row[2] = car.getAvailablity();
            row[3] = car.getPrice();
            
            tmodel.addRow(row);
        }
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCarDetails = new javax.swing.JTable();
        btnCity = new javax.swing.JButton();
        txtCity = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();
        btnBrand = new javax.swing.JButton();
        txtBrand = new javax.swing.JTextField();
        btnYear = new javax.swing.JButton();
        txtYearSearch = new javax.swing.JTextField();
        btnModelNo = new javax.swing.JButton();
        txtModelNo = new javax.swing.JTextField();
        btnCertificate = new javax.swing.JButton();
        btnViewDetails = new javax.swing.JButton();
        lblMinSeats = new javax.swing.JLabel();
        txtMinSeats = new javax.swing.JTextField();
        lblMinSeats1 = new javax.swing.JLabel();
        txtMaxSeats = new javax.swing.JTextField();
        btnSeatCapacity = new javax.swing.JButton();
        btnFirstAvailableCar = new javax.swing.JButton();
        btnLastUpdate = new javax.swing.JButton();
        txtLastUpdated = new javax.swing.JTextField();
        btnAllAvailableCar = new javax.swing.JButton();
        btnUnavailableCar = new javax.swing.JButton();
        btnserialNoS = new javax.swing.JButton();
        txtserialNoS = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        tblCarDetails.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        tblCarDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Brand", "Model Number", "Availablity", "Cost"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCarDetails);

        btnCity.setBackground(new java.awt.Color(255, 255, 255));
        btnCity.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnCity.setText("Search by City");
        btnCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCityActionPerformed(evt);
            }
        });

        txtCity.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCityActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(255, 255, 255));
        btnDelete.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnBrand.setBackground(new java.awt.Color(255, 255, 255));
        btnBrand.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnBrand.setText("Search by Brand");
        btnBrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrandActionPerformed(evt);
            }
        });

        txtBrand.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtBrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBrandActionPerformed(evt);
            }
        });

        btnYear.setBackground(new java.awt.Color(255, 255, 255));
        btnYear.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnYear.setText("Search by Manufactured Year");
        btnYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYearActionPerformed(evt);
            }
        });

        txtYearSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtYearSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtYearSearchActionPerformed(evt);
            }
        });

        btnModelNo.setBackground(new java.awt.Color(255, 255, 255));
        btnModelNo.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnModelNo.setText("Search by Model Number");
        btnModelNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModelNoActionPerformed(evt);
            }
        });

        txtModelNo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtModelNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModelNoActionPerformed(evt);
            }
        });

        btnCertificate.setBackground(new java.awt.Color(255, 255, 255));
        btnCertificate.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnCertificate.setText("Expired Maintenance Certificate");
        btnCertificate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCertificateActionPerformed(evt);
            }
        });

        btnViewDetails.setBackground(new java.awt.Color(255, 255, 255));
        btnViewDetails.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnViewDetails.setText("View Details of selected Car");
        btnViewDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDetailsActionPerformed(evt);
            }
        });

        lblMinSeats.setBackground(new java.awt.Color(0, 0, 0));
        lblMinSeats.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblMinSeats.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblMinSeats.setText("Min Seats:");

        txtMinSeats.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtMinSeats.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtMinSeats.setBorder(null);
        txtMinSeats.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblMinSeats1.setBackground(new java.awt.Color(0, 0, 0));
        lblMinSeats1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblMinSeats1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblMinSeats1.setText("Max Seats:");

        txtMaxSeats.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtMaxSeats.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtMaxSeats.setBorder(null);
        txtMaxSeats.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnSeatCapacity.setBackground(new java.awt.Color(255, 255, 255));
        btnSeatCapacity.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnSeatCapacity.setText("Seat Capacity");
        btnSeatCapacity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeatCapacityActionPerformed(evt);
            }
        });

        btnFirstAvailableCar.setBackground(new java.awt.Color(255, 255, 255));
        btnFirstAvailableCar.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnFirstAvailableCar.setText("1st Available Car");
        btnFirstAvailableCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstAvailableCarActionPerformed(evt);
            }
        });

        btnLastUpdate.setBackground(new java.awt.Color(255, 255, 255));
        btnLastUpdate.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnLastUpdate.setText("Last Updated on");
        btnLastUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastUpdateActionPerformed(evt);
            }
        });

        txtLastUpdated.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLastUpdatedActionPerformed(evt);
            }
        });

        btnAllAvailableCar.setBackground(new java.awt.Color(255, 255, 255));
        btnAllAvailableCar.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnAllAvailableCar.setText("All Available Cars");
        btnAllAvailableCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAllAvailableCarActionPerformed(evt);
            }
        });

        btnUnavailableCar.setBackground(new java.awt.Color(255, 255, 255));
        btnUnavailableCar.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnUnavailableCar.setText("Unavailable Cars");
        btnUnavailableCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnavailableCarActionPerformed(evt);
            }
        });

        btnserialNoS.setBackground(new java.awt.Color(255, 255, 255));
        btnserialNoS.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnserialNoS.setText("Search by Serial No");
        btnserialNoS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnserialNoSActionPerformed(evt);
            }
        });

        txtserialNoS.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtserialNoS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtserialNoSActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jButton1.setText("Registered with Uber");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnserialNoS, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtserialNoS, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnLastUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnBrand, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnModelNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnSeatCapacity, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnYear, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(lblMinSeats, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtMinSeats, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtModelNo, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtLastUpdated)
                                            .addComponent(txtYearSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnCity, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnUnavailableCar, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnFirstAvailableCar, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnAllAvailableCar, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnCertificate, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lblMinSeats1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtMaxSeats, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnViewDetails)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnserialNoS)
                    .addComponent(txtserialNoS, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCity)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModelNo)
                    .addComponent(txtModelNo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAllAvailableCar)
                    .addComponent(btnFirstAvailableCar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBrand)
                    .addComponent(txtBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUnavailableCar)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnYear)
                    .addComponent(txtYearSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCertificate))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSeatCapacity)
                    .addComponent(txtMinSeats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMinSeats)
                    .addComponent(lblMinSeats1)
                    .addComponent(txtMaxSeats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLastUpdate)
                    .addComponent(txtLastUpdated, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete))
                .addContainerGap(219, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCityActionPerformed
        // TODO add your handling code here:
        
        String city = txtCity.getText();
        ArrayList<Car> cityList = carDirectory.cityCarlist(city);
        SerachListJPanel panel = new SerachListJPanel(userProcessContainer,cityList);
        userProcessContainer.add("SerachListJPanel",panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnCityActionPerformed

    private void txtCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCityActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblCarDetails.getSelectedRow();
        if(selectedRow >= 0)
        {
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(null, "Would you like to delete the car details", "Warning", dialogButton);
            if(dialogResult == JOptionPane.YES_OPTION);
            {
                Car car = (Car) tblCarDetails.getValueAt(selectedRow, 0);
                carDirectory.deleteCar(car);
                populateTable();
            }

        }
        else
        {
            JOptionPane.showMessageDialog(null,"Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnBrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrandActionPerformed
        // TODO add your handling code here:
       
        String brand = txtBrand.getText();
        ArrayList<Car> brandList = carDirectory.brandCarList(brand);
        SerachListJPanel panel = new SerachListJPanel(userProcessContainer,brandList);
        userProcessContainer.add("SerachListJPanel",panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnBrandActionPerformed

    private void txtBrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBrandActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBrandActionPerformed

    private void btnYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYearActionPerformed
        // TODO add your handling code here:
       
        int manufactureYear = Integer.parseInt(txtYearSearch.getText());
        ArrayList<Car> yearList = carDirectory.manufactureYearCar(manufactureYear);
        SerachListJPanel panel = new SerachListJPanel(userProcessContainer,yearList);
        userProcessContainer.add("SerachListJPanel",panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnYearActionPerformed

    private void txtYearSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtYearSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtYearSearchActionPerformed

    private void btnserialNoSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnserialNoSearchActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_btnserialNoSearchActionPerformed

    private void txtserialNoSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtserialNoSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtserialNoSearchActionPerformed

    private void btnModelNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModelNoActionPerformed
        // TODO add your handling code here:
        
        String modelNo = txtModelNo.getText();
        ArrayList<Car> modelList = carDirectory.modelNoList(modelNo);
        SerachListJPanel panel = new SerachListJPanel(userProcessContainer,modelList);
        userProcessContainer.add("SerachListJPanel",panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnModelNoActionPerformed

    private void txtModelNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModelNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModelNoActionPerformed

    private void btnregisteredwithUberSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregisteredwithUberSearchActionPerformed
        // TODO add your handling code here:
   
    }//GEN-LAST:event_btnregisteredwithUberSearchActionPerformed

    private void btnCertificateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCertificateActionPerformed
        // TODO add your handling code here:
        
        String expired = "Expired";
        ArrayList<Car> expiredCertiList = carDirectory.expiredCertificate(expired);
        SerachListJPanel panel = new SerachListJPanel(userProcessContainer,expiredCertiList);
        userProcessContainer.add("SerachListJPanel",panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnCertificateActionPerformed

    private void btnViewDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDetailsActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblCarDetails.getSelectedRow();
        if(selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row from the table to view details", "Warning",JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            Car car = (Car) tblCarDetails.getValueAt(selectedRow, 0);
            ViewJPanel panel = new ViewJPanel(userProcessContainer, car, carDirectory);
            userProcessContainer.add("ViewJPanel", panel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_btnViewDetailsActionPerformed

    private void btnSeatCapacityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeatCapacityActionPerformed
        // TODO add your handling code here:
        String minSeats = txtMinSeats.getText();
        String maxseats = txtMaxSeats.getText();
        int minS = minSeats.equals("") ? Integer.MIN_VALUE : Integer.parseInt(minSeats);
        int maxS = maxseats.equals("") ? Integer.MAX_VALUE : Integer.parseInt(maxseats);
        ArrayList<Car> seatCapacityList = carDirectory.minMaxseatsCount(minS, maxS);
        SerachListJPanel panel = new SerachListJPanel(userProcessContainer,seatCapacityList);
        userProcessContainer.add("SerachListJPanel",panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
       
    }//GEN-LAST:event_btnSeatCapacityActionPerformed

    private void btnFirstAvailableCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstAvailableCarActionPerformed
        // TODO add your handling code here:
        String firstAvailable = "Yes";
        ArrayList<Car> availableFirstList = carDirectory.firstAvailable(firstAvailable);
        SerachListJPanel panel = new SerachListJPanel(userProcessContainer,availableFirstList);
        userProcessContainer.add("SerachListJPanel",panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnFirstAvailableCarActionPerformed

    private void btnLastUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastUpdateActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblCarDetails.getSelectedRow();
        if(selectedRow < 0)
        {
            JOptionPane.showMessageDialog(null,"Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            Car car = (Car) tblCarDetails.getValueAt(selectedRow, 0);
            txtLastUpdated.setText(car.getDate());
        }

    }//GEN-LAST:event_btnLastUpdateActionPerformed

    private void txtLastUpdatedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLastUpdatedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLastUpdatedActionPerformed

    private void btnAllAvailableCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAllAvailableCarActionPerformed
        // TODO add your handling code here:
        String available = "Yes";
        ArrayList<Car> allAvailableList = carDirectory.allAvailable(available);
        SerachListJPanel panel = new SerachListJPanel(userProcessContainer,allAvailableList);
        userProcessContainer.add("SerachListJPanel",panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnAllAvailableCarActionPerformed

    private void btnUnavailableCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnavailableCarActionPerformed
        // TODO add your handling code here:
        String unavailable = "Yes";
        ArrayList<Car> unavailableList = carDirectory.unavailableCar(unavailable);
        SerachListJPanel panel = new SerachListJPanel(userProcessContainer,unavailableList);
        userProcessContainer.add("SerachListJPanel",panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnUnavailableCarActionPerformed

    private void btnserialNoSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnserialNoSActionPerformed
        // TODO add your handling code here:
        String serialNo = txtserialNoS.getText();
        ArrayList<Car> serialList = carDirectory.serialNoList(serialNo);
        SerachListJPanel panel = new SerachListJPanel(userProcessContainer,serialList);
        userProcessContainer.add("SerachListJPanel",panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnserialNoSActionPerformed

    private void txtserialNoSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtserialNoSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtserialNoSActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         String registeredwithUber = "Yes";
        ArrayList<Car> searchregisteredwithUber = carDirectory.uberUsedCarList(registeredwithUber);
        SerachListJPanel panel = new SerachListJPanel(userProcessContainer,searchregisteredwithUber);
        userProcessContainer.add("SerachListJPanel",panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAllAvailableCar;
    private javax.swing.JButton btnBrand;
    private javax.swing.JButton btnCertificate;
    private javax.swing.JButton btnCity;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFirstAvailableCar;
    private javax.swing.JButton btnLastUpdate;
    private javax.swing.JButton btnModelNo;
    private javax.swing.JButton btnSeatCapacity;
    private javax.swing.JButton btnUnavailableCar;
    private javax.swing.JButton btnViewDetails;
    private javax.swing.JButton btnYear;
    private javax.swing.JButton btnserialNoS;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMinSeats;
    private javax.swing.JLabel lblMinSeats1;
    private javax.swing.JTable tblCarDetails;
    private javax.swing.JTextField txtBrand;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtLastUpdated;
    private javax.swing.JTextField txtMaxSeats;
    private javax.swing.JTextField txtMinSeats;
    private javax.swing.JTextField txtModelNo;
    private javax.swing.JTextField txtYearSearch;
    private javax.swing.JTextField txtserialNoS;
    // End of variables declaration//GEN-END:variables
}