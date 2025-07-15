package spr.beans;
public class MedicineMenu {
    private int medId;
    private String patientId;
    private String medicineName;
    private String medicineDescription;
    private String expiryDate;
    private String cost;
    private String availability;
    private String wardNo;
    private String orderStatus;

    public MedicineMenu() {
    }

    public MedicineMenu(int medId, String patientId, String medicineName, String medicineDescription, String expiryDate, String cost, String availability, String wardNo, String orderStatus) {
        this.medId = medId;
        this.patientId = patientId;
        this.medicineName = medicineName;
        this.medicineDescription = medicineDescription;
        this.expiryDate = expiryDate;
        this.cost = cost;
        this.availability = availability;
        this.wardNo = wardNo;
        this.orderStatus = orderStatus;
    }

    
    @Override
    public String toString() {
        return medId + " " + patientId + " " + medicineName + " " + medicineDescription + " " + expiryDate + " " + cost + " " + availability + " " + wardNo + " " + orderStatus;
    }

    public int getMedId() {
        return medId;
    }

    public void setMedId(int medId) {
        this.medId = medId;
    }
    

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public String getMedicineDescription() {
        return medicineDescription;
    }

    public void setMedicineDescription(String medicineDescription) {
        this.medicineDescription = medicineDescription;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public String getWardNo() {
        return wardNo;
    }

    public void setWardNo(String wardNo) {
        this.wardNo = wardNo;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }
    
    
    
    
    
}
