/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spr.beans;

/**
 *
 * @author hp
 */
public class NotificationsTable {
    private String sno;
    private String userType;
    private String notification; 
    private String date;

    public NotificationsTable() {
    }

    public NotificationsTable(String sno, String userType, String notification, String date) {
        this.sno = sno;
        this.userType = userType;
        this.notification = notification;
        this.date = date;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getNotification() {
        return notification;
    }

    public void setNotification(String notification) {
        this.notification = notification;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    
    

}
