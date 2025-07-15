package spr.beans;
public class DoctorProfileTable {
    private String doctorId;
    private String password;
    private String fullName;
    private String emailId;
    private String address;
    private String qualification;
    private String experience;
    private String achievements;
    private String post;
    private String gender;
    private String DOB;
    private String contactNo;

    public DoctorProfileTable() {
    }

    public DoctorProfileTable(String doctorId, String password, String fullName, String emailId, String address, String qualification, String experience, String achievements, String post, String gender, String DOB, String contactNo) {
        this.doctorId = doctorId;
        this.password = password;
        this.fullName = fullName;
        this.emailId = emailId;
        this.address = address;
        this.qualification = qualification;
        this.experience = experience;
        this.achievements = achievements;
        this.post = post;
        this.gender = gender;
        this.DOB = DOB;
        this.contactNo = contactNo;
    }

    
    
    @Override
    public String toString() {
        return doctorId + " " + fullName + " " + emailId + " " + address + " " + qualification + " " + experience + " " + achievements + " " + post + " " + gender + " " + DOB + " " + contactNo;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }
    
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
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

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getAchievements() {
        return achievements;
    }

    public void setAchievements(String achievements) {
        this.achievements = achievements;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
