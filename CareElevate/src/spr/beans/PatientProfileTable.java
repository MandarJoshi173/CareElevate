
package spr.beans;
public class PatientProfileTable {
    private String patientId;
    private String fullName;
    private String password;
    private String emailId;
    private String address;
    private String ailment;
    private String description;
    private String dob;
    private String gender;
    private String contactNo;
    private String nationality;
    
    public PatientProfileTable() {
    }

    public PatientProfileTable(String patientId, String fullName, String password, String emailId, String address, String ailment, String description, String dob, String gender, String contactNo, String nationality) {
        this.patientId = patientId;
        this.fullName = fullName;
        this.password = password;
        this.emailId = emailId;
        this.address = address;
        this.ailment = ailment;
        this.description = description;
        this.dob = dob;
        this.gender = gender;
        this.contactNo = contactNo;
        this.nationality = nationality;
    }
    
    
    
    @Override
    public String toString() {
        return patientId+ " " + fullName + " " + password + " " + emailId + " " + address + " " + ailment + " " + description + " " + dob + " " + gender + " " + contactNo + " " + nationality ;
    } 

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }
    
    
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAilment() {
        return ailment;
    }

    public void setAilment(String ailment) {
        this.ailment = ailment;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    
    
    
}
