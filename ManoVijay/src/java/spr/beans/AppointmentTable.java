/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spr.beans;

/**
 *
 * @author hp
 */
public class AppointmentTable {
    private String victimUserId; 
    private String victimTherapistName; 
    private String appointmentDate; 
    private String appointmentTime; 
    private String status;

    public AppointmentTable() {
    }

    public AppointmentTable(String victimUserId, String victimTherapistName, String appointmentDate, String appointmentTime, String status) {
        this.victimUserId = victimUserId;
        this.victimTherapistName = victimTherapistName;
        this.appointmentDate = appointmentDate;
        this.appointmentTime = appointmentTime;
        this.status = status;
    }

    public String getVictimUserId() {
        return victimUserId;
    }

    public void setVictimUserId(String victimUserId) {
        this.victimUserId = victimUserId;
    }

    public String getVictimTherapistName() {
        return victimTherapistName;
    }

    public void setVictimTherapistName(String victimTherapistName) {
        this.victimTherapistName = victimTherapistName;
    }

    public String getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(String appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public String getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(String appointmentTime) {
        this.appointmentTime = appointmentTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    

}
