/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import model.Profile;

/**
 *
 * @author anshitaverma
 */
public class CreateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form createPanel
     */
    Profile profile;
    
    public CreateJPanel(Profile profile) {
        initComponents();
        this.profile=profile;
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
        jLabel2 = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblGeo = new javax.swing.JLabel();
        lblDOB = new javax.swing.JLabel();
        lblTelephone = new javax.swing.JLabel();
        lblFax = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblSSN = new javax.swing.JLabel();
        lblMedical = new javax.swing.JLabel();
        lblHealthPlan = new javax.swing.JLabel();
        lblBankAccountNumber = new javax.swing.JLabel();
        lblCertificate = new javax.swing.JLabel();
        lblVehicle = new javax.swing.JLabel();
        lblDevice = new javax.swing.JLabel();
        lblLinkedIn = new javax.swing.JLabel();
        lblIP = new javax.swing.JLabel();
        lblPhoto = new javax.swing.JLabel();
        lblCode = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtDOB = new javax.swing.JTextField();
        txtTelephone = new javax.swing.JTextField();
        txtFax = new javax.swing.JTextField();
        txtSSN = new javax.swing.JTextField();
        txtMedical = new javax.swing.JTextField();
        txtHealthPlan = new javax.swing.JTextField();
        txtBankAccountNumber = new javax.swing.JTextField();
        txtCertificate = new javax.swing.JTextField();
        txtVehicle = new javax.swing.JTextField();
        txtDevice = new javax.swing.JTextField();
        txtLinkedIn = new javax.swing.JTextField();
        txtIP = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtGeo = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        txtupload = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        txtCode = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setText("Welcome to Pheonix Group");

        jLabel2.setText("Create Your Profile Here:");

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

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jButton1.setText("Upload");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtFax, javax.swing.GroupLayout.Alignment.TRAILING)
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
                            .addComponent(txtIP)
                            .addComponent(txtHealthPlan))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(176, 176, 176)
                            .addComponent(jButton1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(103, 103, 103)
                            .addComponent(txtupload, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(166, 166, 166)
                            .addComponent(lblCode)
                            .addGap(18, 18, 18)
                            .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(lblPhoto)))
                .addGap(120, 120, 120))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(356, 356, 356)
                        .addComponent(btnSave))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPhoto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGeo)
                    .addComponent(txtGeo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtupload, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDOB)
                    .addComponent(jButton1))
                .addGap(25, 25, 25)
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
                    .addComponent(txtHealthPlan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCode)
                    .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(btnSave))
        );
    }// </editor-fold>//GEN-END:initComponents
//Methods for validations of profile attributes

private boolean isValidName(String name){
    return (name==null)||!(name.matches("[A-Za-z]+( [A-Za-z]+)?"));
}

private boolean isValidGeoData(String geo){
    return (geo==null)||(geo.equals(""));
}

private boolean isValidDob(String dob){
    return (dob==null)||!(dob.matches("([0][1-9]|1[0-2])/([0][1-9]|[1][0-9]|[2][0-9]|[3][0-1])/([1][789]|[2][0])[0-9]{2}"));
}

private boolean isValidTelephone(Long telephone){
    return (telephone==null)||!(telephone.toString().matches("\\d{10}"));
}

private boolean isValidFax(String fax){
    return (fax==null)||!(fax.matches("\\+[0-9]{1,3}-[0-9]{3}\\-[0-9]{7}"));
}

private boolean isValidEmail(String email){
    return (email==null)||!(email.matches("([A-Za-z0-9._%-])+@([A-Za-z0-9.-])+\\.[A-Za-z]{2,64}"));
}

private boolean isValidSsn(String ssn){
    return (ssn==null)||!(ssn.matches("[0-9]{3}-[0-9]{2}-[0-9]{4}"));
}

private boolean isValidMedical(String medical){
    return (medical==null)||medical.equals("")||!(medical.matches("[A-Za-z0-9]+"));
}

private boolean isValidHealth(String health){
    return (health==null)||health.equals("")||!(health.matches("[A-Za-z0-9]+"));
}

private boolean isValidBankAccount(Long bank){
    return (bank==null)||!(bank.toString().matches("\\d{6,17}"));
}

private boolean isValidLicense(String license){
    return (license==null)||license.equals("")||!(license.matches("[A-Za-z0-9]+"));
}

private boolean isValidLicensePlate(String licensePlate){
    return (licensePlate==null)||licensePlate.equals("")||!(licensePlate.matches("[A-Za-z0-9]+"));
}

private boolean isValidDevice(String device){
    return (device==null)||device.equals("")||!(device.matches("[A-Za-z0-9]+"));
}


private boolean isValidlinkedIn(String linkedIn){
    return (linkedIn==null)||!(linkedIn.matches("https://www.linkedin.com/in/"+"[a-z0-9-]+/?"));
}

private boolean isValidipAddress(String ipAddress){
    return (ipAddress==null)||!(ipAddress.matches("(([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])"));
}

private boolean isValidCode(String code){
    return (code==null)||(code.equals(""));
}
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
       profile.setName(txtName.getText());
       profile.setGeoData(txtGeo.getText());
       profile.setDob(txtDOB.getText());
       if(!(txtTelephone.getText()==null||txtTelephone.getText()==""||txtTelephone.getText().isBlank()||txtTelephone.getText().isEmpty())){
       long phone = Long.parseLong(txtTelephone.getText());
       profile.setPhone(phone);
       }
       profile.setFax(txtFax.getText());
       profile.setEmail(txtEmail.getText());
       profile.setSsn(txtSSN.getText());
     
       profile.setMedicalRecord(txtMedical.getText());
       profile.setHealthPlan(txtHealthPlan.getText());
       if(!(txtBankAccountNumber.getText()==null||txtBankAccountNumber.getText()==""||txtBankAccountNumber.getText().isBlank()||txtTelephone.getText().isEmpty())){
       long bankAccount = Long.parseLong(txtBankAccountNumber.getText());
       profile.setBankAccount(bankAccount);
       }
       
       profile.setLicense(txtCertificate.getText());
       profile.setLicensePlate(txtVehicle.getText());
       profile.setDeviceIdentifier(txtDevice.getText());
       profile.setLinkedIn(txtLinkedIn.getText());
       profile.setIpAddress(txtIP.getText());
       profile.setImagePath(txtupload.getText());
       profile.setCode(txtCode.getText());
       


//checking validations for each field
      if(isValidName(profile.getName()))
       JOptionPane.showMessageDialog(this, "Enter Valid Name ");
      
      else if(isValidGeoData(profile.getGeoData()))
        JOptionPane.showMessageDialog(this, "Enter Valid Geographic Data");
      
      else if(isValidDob(profile.getDob()))
        JOptionPane.showMessageDialog(this, "Enter Valid Date of Birth in mm/dd/yyyy");
      
      else if(isValidTelephone(profile.getPhone()))
        JOptionPane.showMessageDialog(this, "Enter Valid Phone Number, A vaild number should contain 10 digits");
      
      else if(isValidFax(profile.getFax()))
        JOptionPane.showMessageDialog(this, "Enter Valid Fax Number, A valid fax is +X-XXX-XXXXXXX ");
      
      else if(isValidEmail(profile.getEmail()))
        JOptionPane.showMessageDialog(this, "Enter Valid Email Id ");
      
      else if(isValidSsn(profile.getSsn()))
        JOptionPane.showMessageDialog(this, "Enter Valid SSN Number, A valid SSN is XXX-XX-XXXX ");
      
      else if(isValidMedical(profile.getMedicalRecord()))
        JOptionPane.showMessageDialog(this, "Enter Valid Medical Record Number");
      
      else if(isValidHealth(profile.getHealthPlan()))
        JOptionPane.showMessageDialog(this, "Enter Valid Health Plan Number");
      
      else if(isValidBankAccount(profile.getBankAccount()))
        JOptionPane.showMessageDialog(this, "Enter Valid Bank Account Number");
      
      else if(isValidLicense(profile.getLicense()))
        JOptionPane.showMessageDialog(this, "Enter Valid Certificate/License Number");
      
      else if(isValidLicensePlate(profile.getLicensePlate()))
        JOptionPane.showMessageDialog(this, "Enter Valid Vehicle Number");
      
      else if(isValidDevice(profile.getDeviceIdentifier()))
        JOptionPane.showMessageDialog(this, "Enter Valid Device Number");
      
      else if(isValidlinkedIn(profile.getLinkedIn()))
        JOptionPane.showMessageDialog(this, "Enter Valid LinkedIn ID");
      
      else if(isValidipAddress(profile.getIpAddress()))
        JOptionPane.showMessageDialog(this, "Enter Valid IP Address");
      
      else if(isValidCode(profile.getCode()))
        JOptionPane.showMessageDialog(this, "Enter Unique Code");
      
      else 
       JOptionPane.showMessageDialog(this, "Profile Information Saved.");
      
       // TODO add your handling code here:
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
              // TODO add your handling code here:
              
              //String tyop = txtName.getText();
              //boolean x = validate ();
              //if()
                  
              //g
      
    
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtEmailActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    JFileChooser chooser= new JFileChooser();      //code to upload photo for biometrics
    int selected= chooser.showOpenDialog(null);
    if(selected==JFileChooser.APPROVE_OPTION){
        File f=chooser.getSelectedFile();
        String filename= f.getAbsolutePath();
        txtupload.setText(filename);
    }


// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblBankAccountNumber;
    private javax.swing.JLabel lblCertificate;
    private javax.swing.JLabel lblCode;
    private javax.swing.JLabel lblDOB;
    private javax.swing.JLabel lblDevice;
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
    private javax.swing.JTextField txtupload;
    // End of variables declaration//GEN-END:variables
}



