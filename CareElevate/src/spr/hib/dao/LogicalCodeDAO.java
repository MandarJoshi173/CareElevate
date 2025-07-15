package spr.hib.dao;

import java.util.List;
import javax.swing.JOptionPane;
import org.springframework.orm.hibernate3.HibernateTemplate;
import spr.beans.AdminLoginTable;
import spr.beans.DoctorProfileTable;
import spr.beans.FeedbackTable;
import spr.beans.FoodMenu;
import spr.beans.NurseProfileTable;
import spr.beans.PatientProfileTable;

public class LogicalCodeDAO {
    private HibernateTemplate template;

    public LogicalCodeDAO() {
    }
    
    
    public LogicalCodeDAO(HibernateTemplate template) {
        this.template = template;
    }
    

    public void setTemplate(HibernateTemplate template) {
        this.template = template;
    }

    public HibernateTemplate getTemplate() {
        return template;
    }
    public boolean checkLogin(String id,String pass,String post){
        if(post.equalsIgnoreCase("doctor")){
            List <DoctorProfileTable> recor= template.find("from DoctorProfileTable where doctorId=? and password=?",id,pass);
            if(recor.isEmpty()){
                return false;
            }
            else{
                return true;
            }
        }
        else if(post.equalsIgnoreCase("nurse")){
            List <NurseProfileTable> recor= template.find("from NurseProfileTable where nurseId=? and password=?",id,pass);
            if(recor.isEmpty()){
                return false;
            }
            else{
                return true;
            }
        }
        else if(post.equalsIgnoreCase("patient")){
            List <PatientProfileTable> recor= template.find("from PatientProfileTable where patientId=? and password=?",id,pass);
            if(recor.isEmpty()){
                return false;
            }
            else{
                return true;
            }
        }
        else if(post.equalsIgnoreCase("Canteen Operator")){
            List <FoodMenu> recor= template.find("from FoodMenu where doctorId=? and password=?",id,pass);
            if(recor.isEmpty()){
                return false;
            }
            else{
                return true;
            }
        }
        else if(post.equalsIgnoreCase("Pharmacy Operator")){
            List <FoodMenu> recor= template.find("from FoodMenu where doctorId=? and password=?",id,pass);
            if(recor.isEmpty()){
                return false;
            }
            else{
                return true;
            }
        }
        else{
            return false;
        }
    }
    public boolean checkAdminLogin(String id,String pwd){
        List<AdminLoginTable> recor = template.find("from AdminLoginTable where adminId=? and password=?",id,pwd);
        if(recor.isEmpty()){
            return false;
        }
        else{
        return true;
        }
    }
    public boolean checkDoctorLogin(String id,String pwd){
        List<DoctorProfileTable> recor = template.find("from DoctorProfileTable where doctorId=? and password=?",id,pwd);
        if(recor.isEmpty()){
            return false;
        }
        else{
        return true;
        }
    }
    public void insertDoctorProfile(DoctorProfileTable doctorprofiletable){
        template.save(doctorprofiletable);
    }
    public void deleteDoctorProfile(String id,String pwd){
        List<DoctorProfileTable> recor = template.find("from DoctorProfileTable where doctorId=? and password=?",id,pwd);
        template.delete(recor);
    }
    public void insertNurseProfile(NurseProfileTable nurseprofiletable){
        template.save(nurseprofiletable);
    }
    public void insertPatientProfile(PatientProfileTable patientprofiletable){
        template.save(patientprofiletable);
    }
    public void insertPatientFeedback(FeedbackTable feedbacktable){
        template.save(feedbacktable);
    }
    
}
