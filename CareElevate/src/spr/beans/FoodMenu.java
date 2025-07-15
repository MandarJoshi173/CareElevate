package spr.beans;
public class FoodMenu {
    private int orderId;
    private String foodName;
    private String foodDescription;
    private String patientId;
    private String cost;
    private String availability;
    private String wardNo;
    private String status;

    public FoodMenu() {
    }

    public FoodMenu(int orderId, String foodName, String foodDescription, String patientId, String cost, String availability, String wardNo, String status) {
        this.orderId = orderId;
        this.foodName = foodName;
        this.foodDescription = foodDescription;
        this.patientId = patientId;
        this.cost = cost;
        this.availability = availability;
        this.wardNo = wardNo;
        this.status = status;
    }

    
    @Override
    public String toString() {
        return  orderId + " " + foodName + " " + foodDescription + " " + patientId + " " + cost + " " + availability + " " + wardNo + " " + status;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
    
    
    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getFoodDescription() {
        return foodDescription;
    }

    public void setFoodDescription(String foodDescription) {
        this.foodDescription = foodDescription;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
}
