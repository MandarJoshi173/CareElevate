package spr.beans;
public class MedicineMenu {
    private int medId;
    private String patientId;
    private String medicineName;
    private String quantity;
    private String cost;
    private String wardNo;
    private String orderStatus;

    public MedicineMenu() {
    }

    public MedicineMenu(int medId, String patientId, String medicineName, String quantity, String cost, String wardNo, String orderStatus) {
        this.medId = medId;
        this.patientId = patientId;
        this.medicineName = medicineName;
        this.quantity = quantity;
        this.cost = cost;
        this.wardNo = wardNo;
        this.orderStatus = orderStatus;
    }

    @Override
    public String toString() {
        return  medId + "" + patientId + "" + medicineName + "" + quantity + "" + cost + "" + wardNo + "" + orderStatus;
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

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
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
