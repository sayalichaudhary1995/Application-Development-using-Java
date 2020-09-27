/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.Person;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author sayu
 */
public class DisplayJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewJPanel
     */
   
    public DisplayJPanel(Person pr) {
        initComponents();
        displayDetails(pr);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtVehicleIdentifier = new javax.swing.JTextField();
        txtBankAccount = new javax.swing.JTextField();
        txtLicenseNo = new javax.swing.JTextField();
        txtDob = new javax.swing.JTextField();
        txtMedicalRecord = new javax.swing.JTextField();
        txtHealthPlan = new javax.swing.JTextField();
        txtFaxNo = new javax.swing.JTextField();
        txtTelephoneNo = new javax.swing.JTextField();
        txtSSN = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtEmailId = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        lblGeographicData = new javax.swing.JLabel();
        lblDob = new javax.swing.JLabel();
        lblTelephoneNo = new javax.swing.JLabel();
        lblFaxNo = new javax.swing.JLabel();
        lblEmailID = new javax.swing.JLabel();
        lblSSN = new javax.swing.JLabel();
        txtDeviceIdentifier = new javax.swing.JTextField();
        txtIp = new javax.swing.JTextField();
        lblMedicalRecord = new javax.swing.JLabel();
        txtLinkedIn = new javax.swing.JTextField();
        lblHealthPlan = new javax.swing.JLabel();
        lblBankAccount = new javax.swing.JLabel();
        lblBiometricIdentifier = new javax.swing.JLabel();
        lblLicenseNo = new javax.swing.JLabel();
        txtBiometricIdentifier = new javax.swing.JTextField();
        lblVehicleIdentifier = new javax.swing.JLabel();
        lblDeviceIdentifier = new javax.swing.JLabel();
        lblLinkedIn = new javax.swing.JLabel();
        lblIp = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtGeographicData = new javax.swing.JTextField();
        imageDisplayLabel = new javax.swing.JLabel();

        txtVehicleIdentifier.setText(" ");

        txtBankAccount.setText(" ");

        txtLicenseNo.setText(" ");

        txtDob.setText(" ");

        txtMedicalRecord.setText(" ");

        txtHealthPlan.setText(" ");

        txtFaxNo.setText(" ");

        txtTelephoneNo.setText(" ");

        txtSSN.setText(" ");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Profile Details");

        txtEmailId.setText(" ");

        lblName.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblName.setText("Name:");

        lblGeographicData.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblGeographicData.setText("Geographic Data:");

        lblDob.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblDob.setText("DOB:");

        lblTelephoneNo.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblTelephoneNo.setText("Telephone No.:");

        lblFaxNo.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblFaxNo.setText("Fax No.");

        lblEmailID.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblEmailID.setText("Email Id:");

        lblSSN.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblSSN.setText("SSN");

        txtDeviceIdentifier.setText(" ");

        txtIp.setText(" ");

        lblMedicalRecord.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblMedicalRecord.setText("Medical Record No.:");

        txtLinkedIn.setText(" ");

        lblHealthPlan.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblHealthPlan.setText("Health Plan :");

        lblBankAccount.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblBankAccount.setText("Bank Account:");

        lblBiometricIdentifier.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblBiometricIdentifier.setText("Biometric Identifier");

        lblLicenseNo.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblLicenseNo.setText("License No.:");

        txtBiometricIdentifier.setText(" ");

        lblVehicleIdentifier.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblVehicleIdentifier.setText("Vehicle Identifier");

        lblDeviceIdentifier.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblDeviceIdentifier.setText("Device Identifier:");

        lblLinkedIn.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblLinkedIn.setText("LinkedIn");

        lblIp.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblIp.setText("IP Adddress");

        txtName.setText(" ");

        txtGeographicData.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblName)
                            .addComponent(lblSSN)
                            .addComponent(lblEmailID)
                            .addComponent(lblFaxNo)
                            .addComponent(lblTelephoneNo)
                            .addComponent(lblMedicalRecord)
                            .addComponent(lblDob)
                            .addComponent(lblGeographicData))
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtMedicalRecord, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSSN, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEmailId, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFaxNo, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTelephoneNo, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDob, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtName, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtGeographicData, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(70, 70, 70)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblIp)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtIp, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblLinkedIn)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtLinkedIn, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblVehicleIdentifier)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtVehicleIdentifier, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblBankAccount)
                                            .addComponent(lblHealthPlan)
                                            .addComponent(lblLicenseNo))
                                        .addGap(83, 83, 83)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtHealthPlan)
                                            .addComponent(txtBankAccount)
                                            .addComponent(txtLicenseNo, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblDeviceIdentifier)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtDeviceIdentifier, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblBiometricIdentifier)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtBiometricIdentifier, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addComponent(jLabel1))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(imageDisplayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHealthPlan)
                    .addComponent(txtHealthPlan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGeographicData)
                    .addComponent(txtGeographicData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBankAccount)
                    .addComponent(txtBankAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDob)
                    .addComponent(txtDob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLicenseNo)
                    .addComponent(txtLicenseNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelephoneNo)
                    .addComponent(txtTelephoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblVehicleIdentifier)
                    .addComponent(txtVehicleIdentifier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFaxNo)
                    .addComponent(txtFaxNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDeviceIdentifier)
                    .addComponent(txtDeviceIdentifier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmailID)
                    .addComponent(txtEmailId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLinkedIn)
                    .addComponent(txtLinkedIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSSN)
                    .addComponent(txtSSN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIp)
                    .addComponent(txtIp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMedicalRecord)
                    .addComponent(txtMedicalRecord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBiometricIdentifier)
                    .addComponent(txtBiometricIdentifier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imageDisplayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imageDisplayLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblBankAccount;
    private javax.swing.JLabel lblBiometricIdentifier;
    private javax.swing.JLabel lblDeviceIdentifier;
    private javax.swing.JLabel lblDob;
    private javax.swing.JLabel lblEmailID;
    private javax.swing.JLabel lblFaxNo;
    private javax.swing.JLabel lblGeographicData;
    private javax.swing.JLabel lblHealthPlan;
    private javax.swing.JLabel lblIp;
    private javax.swing.JLabel lblLicenseNo;
    private javax.swing.JLabel lblLinkedIn;
    private javax.swing.JLabel lblMedicalRecord;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblSSN;
    private javax.swing.JLabel lblTelephoneNo;
    private javax.swing.JLabel lblVehicleIdentifier;
    private javax.swing.JTextField txtBankAccount;
    private javax.swing.JTextField txtBiometricIdentifier;
    private javax.swing.JTextField txtDeviceIdentifier;
    private javax.swing.JTextField txtDob;
    private javax.swing.JTextField txtEmailId;
    private javax.swing.JTextField txtFaxNo;
    private javax.swing.JTextField txtGeographicData;
    private javax.swing.JTextField txtHealthPlan;
    private javax.swing.JTextField txtIp;
    private javax.swing.JTextField txtLicenseNo;
    private javax.swing.JTextField txtLinkedIn;
    private javax.swing.JTextField txtMedicalRecord;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSSN;
    private javax.swing.JTextField txtTelephoneNo;
    private javax.swing.JTextField txtVehicleIdentifier;
    // End of variables declaration//GEN-END:variables

    private void displayDetails(Person pr) {
        String name=pr.getName();
        txtName.setText(name);
        
        String geographicdata=pr.getGeographicData();
        txtGeographicData.setText(geographicdata);
        
        String dob=pr.getDob();
        txtDob.setText(dob);
        
        String telephoneno=pr.getTelephoneNo();
        txtTelephoneNo.setText(telephoneno);
        
        String fax=pr.getFaxNo();
        txtFaxNo.setText(fax);
        
        String email=pr.getEmail();
        txtEmailId.setText(email);
        
        String medical=pr.getMedicalRecordNo();
        txtMedicalRecord.setText(medical);
        
        String health=pr.getHealthPlanBeneficiaryNo();
        txtHealthPlan.setText(health);
        
        String bank=pr.getBankaccountNo();
        txtBankAccount.setText(bank);
        
        String license=pr.getLicensePlate();
        txtLicenseNo.setText(license);
        
        String vehicle=pr.getVehicleIdentifier();
        txtVehicleIdentifier.setText(vehicle);
        
        String device=pr.getDeviceIdentifier();
        txtDeviceIdentifier.setText(device);
        
        String linkedin=pr.getLinkedin();
        txtLinkedIn.setText(linkedin);
        
        String ip=pr.getIpAddress();
        txtIp.setText(ip);
        
        String biometric=pr.getBiometricIdentifier();
        txtBiometricIdentifier.setText(biometric);
        
        String imageFilename = pr.getImageOfFace();
       
       ImageIcon imgIcon = new ImageIcon(imageFilename);
       
      
       imageDisplayLabel.setBounds(708, 300, 708, 300);
       Image imFit = imgIcon.getImage();
       Image imgFit = imFit.getScaledInstance(imageDisplayLabel.getWidth(), imageDisplayLabel.getHeight(), Image.SCALE_SMOOTH);
       ImageIcon scaledIcon = new ImageIcon(imgFit);
       imageDisplayLabel.setIcon(scaledIcon);
        
        
        
        
        
        
        
        
    }
}
