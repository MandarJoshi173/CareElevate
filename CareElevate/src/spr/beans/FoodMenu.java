package spr.beans;
public class FoodMenu {
    private int orderId;
    private String foodName;
    private String foodDescription;
    private String patientId;
    private String cost;
    private String wardNo;
    private String status;
    private String quantity;
    public FoodMenu() {
    }

    public FoodMenu(int orderId, String foodName, String foodDescription, String patientId, String cost, String wardNo, String status, String quantity) {
        this.orderId = orderId;
        this.foodName = foodName;
        this.foodDescription = foodDescription;
        this.patientId = patientId;
        this.cost = cost;
        this.wardNo = wardNo;
        this.status = status;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return  orderId + "" + foodName + "" + foodDescription + "" + patientId + "" + cost + "" + wardNo + "" + status + "" + quantity;
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

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
    
    
    
    
    
    
}
