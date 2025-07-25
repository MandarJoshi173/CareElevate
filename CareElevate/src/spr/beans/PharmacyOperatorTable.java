package spr.beans;
public class PharmacyOperatorTable {
    private int itemId;
    private String itemName;
    private String price;

    public PharmacyOperatorTable() {
    }

    public PharmacyOperatorTable (String itemName, String price) {
        this.itemName = itemName;
        this.price = price;
    }

    @Override
    public String toString() {
        return itemId + "" + itemName + "" + price;
    }
    

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
    
}
