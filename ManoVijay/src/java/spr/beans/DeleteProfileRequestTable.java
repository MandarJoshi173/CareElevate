/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spr.beans;

/**
 *
 * @author hp
 */
public class DeleteProfileRequestTable {
     private String userId; 
     private String request; 
     private String userType;

    public DeleteProfileRequestTable() {
    }

    public DeleteProfileRequestTable(String userId, String request, String userType) {
        this.userId = userId;
        this.request = request;
        this.userType = userType;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }
     
    

}
