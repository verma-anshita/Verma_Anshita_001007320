/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author anshitaverma
 */
public class Profile {
    private String name;
    private String geoData;
    //private Date dob;
    private String dob;
    private Long phone;
    private String fax;
    private String email;
    private String ssn;
    private String medicalRecord;
    private String healthPlan;
    private Long bankAccount;
    private String license;
    private String licensePlate;
    private String deviceIdentifier;
    private String linkedIn;
    private String ipAddress;
    //private datatype biometricIdentifier;
    //private datatype facePhoto;
    private String imagePath; //store path of image from create panel to show in view panel
    private String code;

    public String getMedicalRecord() {
        return medicalRecord;
    }

    public void setMedicalRecord(String medicalRecord) {
        this.medicalRecord = medicalRecord;
    }

    
    
    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    
    
    
    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    
    
    public String getName() {
        return name;
    }

    public String getGeoData() {
        return geoData;
    }

//    public Date getDob() {
//        return dob;
//    }

    public Long getPhone() {
        return phone;
    }

    

    public String getEmail() {
        return email;
    }

    public String getSsn() {
        return ssn;
    }

  

    public String getHealthPlan() {
        return healthPlan;
    }

    public Long getBankAccount() {
        return bankAccount;
    }

    public String getLicense() {
        return license;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getDeviceIdentifier() {
        return deviceIdentifier;
    }

    public String getLinkedIn() {
        return linkedIn;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public String getCode() {
        return code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGeoData(String geoData) {
        this.geoData = geoData;
    }

//    public void setDob(Date dob) {
//        this.dob = dob;
//    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

   

    public void setHealthPlan(String healthPlan) {
        this.healthPlan = healthPlan;
    }

    public void setBankAccount(Long bankAccount) {
        this.bankAccount = bankAccount;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public void setDeviceIdentifier(String deviceIdentifier) {
        this.deviceIdentifier = deviceIdentifier;
    }

    public void setLinkedIn(String linkedIn) {
        this.linkedIn = linkedIn;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
    
    
    
    
    
}
