package spr.beans;
public class PharmacyOperatorLoginTable {
    private String operatorId;
    private String password;

    public PharmacyOperatorLoginTable() {
    }

    public PharmacyOperatorLoginTable(String operatorId, String password) {
        this.operatorId = operatorId;
        this.password = password;
    }

    
    @Override
    public String toString() {
       return  operatorId + " " + password;
    }

    public String getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
