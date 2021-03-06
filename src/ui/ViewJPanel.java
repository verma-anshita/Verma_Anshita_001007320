/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.Image;
import javax.swing.ImageIcon;
import model.Profile;

/**
 *
 * @author anshitaverma
 */
public class ViewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewPanel
     */
    Profile profile;
    public ViewJPanel(Profile profile) {
        initComponents();
        this.profile=profile;
        displayProfile();
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
        txtDOB = new javax.swing.JTextField();
        txtTelephone = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        txtFax = new javax.swing.JTextField();
        lblGeo = new javax.swing.JLabel();
        txtSSN = new javax.swing.JTextField();
        lblDOB = new javax.swing.JLabel();
        txtMedical = new javax.swing.JTextField();
        lblTelephone = new javax.swing.JLabel();
        txtHealthPlan = new javax.swing.JTextField();
        lblFax = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        txtBankAccountNumber = new javax.swing.JTextField();
        txtCertificate = new javax.swing.JTextField();
        lblSSN = new javax.swing.JLabel();
        txtVehicle = new javax.swing.JTextField();
        lblMedical = new javax.swing.JLabel();
        txtDevice = new javax.swing.JTextField();
        lblHealthPlan = new javax.swing.JLabel();
        txtLinkedIn = new javax.swing.JTextField();
        lblBankAccountNumber = new javax.swing.JLabel();
        txtIP = new javax.swing.JTextField();
        lblCertificate = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblVehicle = new javax.swing.JLabel();
        txtGeo = new javax.swing.JTextField();
        lblDevice = new javax.swing.JLabel();
        lblLinkedIn = new javax.swing.JLabel();
        lblIP = new javax.swing.JLabel();
        lblPhoto = new javax.swing.JLabel();
        lblCode = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblDisplay = new javax.swing.JLabel();
        txtCode = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setText("View Your Profile");

        lblName.setText("Name:");

        lblGeo.setText("Geographic Data:");

        lblDOB.setText("DOB:");

        lblTelephone.setText("Telephone Number:");

        lblFax.setText("FAX Number:");

        lblEmail.setText("Email Address:");

        lblSSN.setText("Social Security Number:");

        lblMedical.setText("Medical Record Number:");

        lblHealthPlan.setText("Health Plan Beneficiary Number:");

        lblBankAccountNumber.setText("Bank Account Number:");

        lblCertificate.setText("Certificate/license number:");

        lblVehicle.setText("Vehicle identifier:");

        lblDevice.setText("Device identifier:");

        lblLinkedIn.setText("LinkedIn:");

        lblIP.setText("IP address:");

        lblPhoto.setText("Upload your photo:");

        lblCode.setText("Enter Code:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(256, 256, 256)
                .addComponent(jLabel1)
                .addContainerGap(301, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblDisplay, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPhoto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblCode))
                        .addGap(28, 28, 28))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(46, 46, 46)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblMedical)
                        .addComponent(lblGeo)
                        .addComponent(lblName)
                        .addComponent(lblDOB)
                        .addComponent(lblTelephone)
                        .addComponent(lblFax)
                        .addComponent(lblEmail)
                        .addComponent(lblSSN)
                        .addComponent(lblHealthPlan)
                        .addComponent(lblBankAccountNumber)
                        .addComponent(lblCertificate)
                        .addComponent(lblVehicle)
                        .addComponent(lblDevice)
                        .addComponent(lblLinkedIn)
                        .addComponent(lblIP))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtGeo)
                                .addComponent(txtDOB)
                                .addComponent(txtTelephone, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                                .addComponent(txtEmail)
                                .addComponent(txtSSN)
                                .addComponent(txtMedical)
                                .addComponent(txtBankAccountNumber)
                                .addComponent(txtCertificate)
                                .addComponent(txtVehicle)
                                .addComponent(txtDevice)
                                .addComponent(txtLinkedIn)
                                .addComponent(txtIP))
                            .addGap(356, 356, 356))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 356, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtFax)
                                .addGap(357, 357, 357))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtHealthPlan)
                                .addGap(357, 357, 357))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(lblPhoto)
                .addGap(18, 18, 18)
                .addComponent(lblDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112)
                .addComponent(lblCode)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(270, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(153, 153, 153)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblName)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblGeo)
                        .addComponent(txtGeo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblDOB)
                        .addComponent(txtDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblTelephone)
                        .addComponent(txtTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblFax)
                        .addComponent(txtFax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblEmail)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblSSN)
                        .addComponent(txtSSN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(2, 2, 2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblMedical)
                        .addComponent(txtMedical, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(7, 7, 7)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblHealthPlan)
                        .addComponent(txtHealthPlan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(13, 13, 13)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblBankAccountNumber)
                        .addComponent(txtBankAccountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(11, 11, 11)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCertificate)
                        .addComponent(txtCertificate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblVehicle)
                        .addComponent(txtVehicle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblDevice)
                        .addComponent(txtDevice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblLinkedIn)
                        .addComponent(txtLinkedIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblIP))
                    .addContainerGap(71, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblBankAccountNumber;
    private javax.swing.JLabel lblCertificate;
    private javax.swing.JLabel lblCode;
    private javax.swing.JLabel lblDOB;
    private javax.swing.JLabel lblDevice;
    private javax.swing.JLabel lblDisplay;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFax;
    private javax.swing.JLabel lblGeo;
    private javax.swing.JLabel lblHealthPlan;
    private javax.swing.JLabel lblIP;
    private javax.swing.JLabel lblLinkedIn;
    private javax.swing.JLabel lblMedical;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPhoto;
    private javax.swing.JLabel lblSSN;
    private javax.swing.JLabel lblTelephone;
    private javax.swing.JLabel lblVehicle;
    private javax.swing.JTextField txtBankAccountNumber;
    private javax.swing.JTextField txtCertificate;
    private javax.swing.JTextField txtCode;
    private javax.swing.JTextField txtDOB;
    private javax.swing.JTextField txtDevice;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFax;
    private javax.swing.JTextField txtGeo;
    private javax.swing.JTextField txtHealthPlan;
    private javax.swing.JTextField txtIP;
    private javax.swing.JTextField txtLinkedIn;
    private javax.swing.JTextField txtMedical;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSSN;
    private javax.swing.JTextField txtTelephone;
    private javax.swing.JTextField txtVehicle;
    // End of variables declaration//GEN-END:variables

    private void displayProfile() {
        txtName.setText(profile.getName());
        txtGeo.setText(profile.getGeoData());
        txtDOB.setText(profile.getDob());
        txtTelephone.setText(profile.getPhone().toString());
        txtFax.setText(profile.getFax());
        txtEmail.setText(profile.getEmail());
        txtSSN.setText(profile.getSsn());
        //medical
        txtMedical.setText(profile.getMedicalRecord());
        txtHealthPlan.setText(profile.getHealthPlan());
        txtBankAccountNumber.setText(profile.getBankAccount().toString());
        txtCertificate.setText(profile.getLicense());
        txtVehicle.setText(profile.getLicensePlate());
        txtDevice.setText(profile.getDeviceIdentifier());
        txtLinkedIn.setText(profile.getLinkedIn());
        txtIP.setText(profile.getIpAddress());
        txtCode.setText(profile.getCode());
//To change body of generated methods, choose Tools | Templates.
        ImageIcon ic= new ImageIcon(profile.getImagePath());
        Image img=ic.getImage();
        Image imgScale= img.getScaledInstance(246, 246, 46);
        ImageIcon scaledIcon= new ImageIcon(imgScale);
        lblDisplay.setIcon(scaledIcon);
    }
}
