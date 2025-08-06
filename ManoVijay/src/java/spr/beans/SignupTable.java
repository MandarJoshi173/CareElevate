package spr.beans;

public class SignupTable {
    private String UserId;
    private String userName;
    private String password;
    private String userType;
    private String occupation; 
    private String salary; 
    private String description;
    private String dateOfBirth; 
    private String emailId; 
    private String address; 
    private String guardianName; 
    private String guardianEmailId; 
    private String guardianContactNo;
    private String therapistId; 
    private String therapistName;
    private String yearsInService; 
    private String qualifications;

    public SignupTable() {
    }

    public SignupTable(String UserId, String userName, String password, String userType, String occupation, String salary, String description, String dateOfBirth, String emailId, String address, String guardianName, String guardianEmailId, String guardianContactNo, String therapistId, String therapistName, String yearsInService, String qualifications) {
        this.UserId = UserId;
        this.userName = userName;
        this.password = password;
        this.userType = userType;
        this.occupation = occupation;
        this.salary = salary;
        this.description = description;
        this.dateOfBirth = dateOfBirth;
        this.emailId = emailId;
        this.address = address;
        this.guardianName = guardianName;
        this.guardianEmailId = guardianEmailId;
        this.guardianContactNo = guardianContactNo;
        this.therapistId = therapistId;
        this.therapistName = therapistName;
        this.yearsInService = yearsInService;
        this.qualifications = qualifications;
    }

    @Override
    public String toString() {
        return  UserId + " " + userName + " " + password + " " + userType + " " + occupation + " " + salary + " " + description + " " + dateOfBirth + " " + emailId + " " + address + " " + guardianName + " " + guardianEmailId + " " + guardianContactNo + " " + therapistId + " " + therapistName + " " + yearsInService + " " + qualifications;
    }

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
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

    public String getGuardianName() {
        return guardianName;
    }

    public void setGuardianName(String guardianName) {
        this.guardianName = guardianName;
    }

    public String getGuardianEmailId() {
        return guardianEmailId;
    }

    public void setGuardianEmailId(String guardianEmailId) {
        this.guardianEmailId = guardianEmailId;
    }

    public String getGuardianContactNo() {
        return guardianContactNo;
    }

    public void setGuardianContactNo(String guardianContactNo) {
        this.guardianContactNo = guardianContactNo;
    }

    public String getTherapistId() {
        return therapistId;
    }

    public void setTherapistId(String therapistId) {
        this.therapistId = therapistId;
    }

    public String getTherapistName() {
        return therapistName;
    }

    public void setTherapistName(String therapistName) {
        this.therapistName = therapistName;
    }

    public String getYearsInService() {
        return yearsInService;
    }

    public void setYearsInService(String yearsInService) {
        this.yearsInService = yearsInService;
    }

    public String getQualifications() {
        return qualifications;
    }

    public void setQualifications(String qualifications) {
        this.qualifications = qualifications;
    }
    
    
    
}
