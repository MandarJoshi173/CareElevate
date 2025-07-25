package spr.hib.dao;

import java.sql.SQLException;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateTemplate;
import spr.beans.AdminLoginTable;
import spr.beans.CanteenOperatorLoginTable;
import spr.beans.CanteenOperatorTable;
import spr.beans.DoctorProfileTable;
import spr.beans.FeedbackTable;
import spr.beans.FoodMenu;
import spr.beans.MedicineMenu;
import spr.beans.NurseProfileTable;
import spr.beans.PatientProfileTable;
import spr.beans.PharmacyOperatorLoginTable;
import spr.beans.PharmacyOperatorTable;

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
            List <CanteenOperatorLoginTable> recor= template.find("from CanteenOperatorLoginTable where operatorId=? and password=?",id,pass);
            if(recor.isEmpty()){
                return false;
            }
            else{
                return true;
            }
        }
        else if(post.equalsIgnoreCase("Pharmacy Operator")){
            List <PharmacyOperatorLoginTable> recor= template.find("from PharmacyOperatorLoginTable where operatorId=? and password=?",id,pass);
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
    public boolean checkNurseLogin(String id,String pwd){
        List<NurseProfileTable> recor = template.find("from NurseProfileTable where nurseId=? and password=?",id,pwd);
        if(recor.isEmpty()){
            return false;
        }
        else{
        return true;
        }
    }
    public boolean checkPatientLogin(String id,String pwd){
        List<PatientProfileTable> recor = template.find("from PatientProfileTable where patientId=? and password=?",id,pwd);
        if(recor.isEmpty()){
            return false;
        }
        else{
        return true;
        }
    }
    public boolean checkCanteenOperatorLogin(String id,String pwd){
        List<CanteenOperatorLoginTable> recor = template.find("from CanteenOperatorLoginTable where operatorId=? and password=?",id,pwd);
        if(recor.isEmpty()){
            return false;
        }
        else{
        return true;
        }
    }
    public boolean checkPharmacyOperatorLogin(String id,String pwd){
        List<PharmacyOperatorLoginTable> recor = template.find("from PharmacyOperatorLoginTable where operatorId=? and password=?",id,pwd);
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
        for(DoctorProfileTable data:recor){
            template.delete(data);
        }
    }
    public void insertNurseProfile(NurseProfileTable nurseprofiletable){
        template.save(nurseprofiletable);
    }
    public void deleteNurseProfile(String id,String pwd){
        List<NurseProfileTable> recor = template.find("from NurseProfileTable where nurseId=? and password=?",id,pwd);
        for(NurseProfileTable data:recor){
            template.delete(data);
        }
    }
    public void insertPatientProfile(PatientProfileTable patientprofiletable){
        template.save(patientprofiletable);
    }
    public void insertCanteenOperatorProfile(CanteenOperatorLoginTable canteenoperatorlogintable){
        template.save(canteenoperatorlogintable);
    }
    public void insertPharmacyOperatorProfile(PharmacyOperatorLoginTable pharmacyoperatorlogintable){
        template.save(pharmacyoperatorlogintable);
    }
    public void insertFoodOrder(FoodMenu foodmenu){
        template.save(foodmenu);
    }
    public void insertMedicineOrder(MedicineMenu medicinemenu){
        template.save(medicinemenu);
    }
    public void deletePatientProfile(String id,String pwd){
        List<PatientProfileTable> recor = template.find("from PatientProfileTable where patientId=? and password=?",id,pwd);
        for(PatientProfileTable data:recor){
            template.delete(data);
        }
    }
    public void deleteCanteenOperatorProfile(String id,String pwd){
        List<CanteenOperatorLoginTable> recor = template.find("from CanteenOperatorLoginTable where operatorId=? and password=?",id,pwd);
        for(CanteenOperatorLoginTable data:recor){
            template.delete(data);
        }
    }
    public void deletePharmacyOperatorProfile(String id,String pwd){
        List<PharmacyOperatorLoginTable> recor = template.find("from PharmacyOperatorLoginTable where operatorId=? and password=?",id,pwd);
        for(PharmacyOperatorLoginTable data:recor){
            template.delete(data);
        }
    }
    public void insertPatientFeedback(FeedbackTable feedbacktable){
        template.save(feedbacktable);
    }
    public void insertFoodMenuRecord(CanteenOperatorTable canteenoperatortable){
        template.save(canteenoperatortable);
    }
    public void insertMedicineMenuRecord(PharmacyOperatorTable pharmacyoperatortable){
        template.save(pharmacyoperatortable);
    }
    public List getDoctorProfileInfo(String id){
        List<DoctorProfileTable>list=template.find("from DoctorProfileTable where doctorId=?",id);
        return list;
    }
    public List getAllDoctorProfiles(){
        List<DoctorProfileTable>list=template.find("from DoctorProfileTable");
        return list;
    }
    public List getNurseProfileInfo(String id) {
        List<NurseProfileTable>list=template.find("from NurseProfileTable where nurseId=?",id);
        return list;
    }
    public List getAllNurseProfiles(){
        List<NurseProfileTable>list=template.find("from NurseProfileTable");
        return list;
    }
    public List getFoodMenu(){
        List<CanteenOperatorTable>list=template.find("from CanteenOperatorTable");
        return list;
    }
    public List getMedicineMenu(){
        List<PharmacyOperatorTable>list=template.find("from PharmacyOperatorTable");
        return list;
    }
    public List getFoodItem(int id) {
        List<CanteenOperatorTable>list=template.find("from CanteenOperatorTable where itemId=?",id);
        return list;
    }
    public List getMedicineItem(int id) {
        List<PharmacyOperatorTable>list=template.find("from PharmacyOperatorTable where itemId=?",id);
        return list;
    }
    public List getPatientProfileInfo(String id) {
        List<PatientProfileTable>list=template.find("from PatientProfileTable where patientId=?",id);
        return list;
    }
    public List getAllPatientProfiles(){
        List<PatientProfileTable>list=template.find("from PatientProfileTable");
        return list;
    }
    public List getFeedbackInfo(int id) {
        List<FeedbackTable>list=template.find("from FeedbackTable where feedbackId=?",id);
        return list;
    }
    public void updateDoctorProfile(String id,String password,String fullName,String emailId,String address,String qualification,String experience,String achievements,String post,String gender,String DOB,String contactNo){
        template.execute(new HibernateCallback<Object>() {
            @Override
            public Object doInHibernate(Session session) throws HibernateException, SQLException {
                DoctorProfileTable doctorprofiletable =(DoctorProfileTable)session.get(DoctorProfileTable.class,id);
                doctorprofiletable.setDoctorId(id);
                doctorprofiletable.setFullName(fullName);
                doctorprofiletable.setPassword(password);
                doctorprofiletable.setEmailId(emailId);
                doctorprofiletable.setAddress(address);
                doctorprofiletable.setAchievements(achievements);
                doctorprofiletable.setQualification(qualification);
                doctorprofiletable.setExperience(experience);
                doctorprofiletable.setPost(post);
                doctorprofiletable.setDOB(DOB);
                doctorprofiletable.setGender(gender);
                doctorprofiletable.setContactNo(contactNo);
                session.update(doctorprofiletable);
                return null;
            }
        });
    }
    public void updateNurseProfile(String nurseId, String password, String fullName, String emailId, String address, String qualification, String experience, String gender, String dob, String contactNo){
        template.execute(new HibernateCallback<Object>() {
            @Override
            public Object doInHibernate(Session session) throws HibernateException, SQLException {
                NurseProfileTable nurseprofiletable =(NurseProfileTable)session.get(NurseProfileTable.class,nurseId);
                nurseprofiletable.setNurseId(nurseId);
                nurseprofiletable.setFullName(fullName);
                nurseprofiletable.setPassword(password);
                nurseprofiletable.setEmailId(emailId);
                nurseprofiletable.setAddress(address);
                nurseprofiletable.setQualification(qualification);
                nurseprofiletable.setExperience(experience);
                nurseprofiletable.setDob(dob);
                nurseprofiletable.setGender(gender);
                nurseprofiletable.setContactNo(contactNo);
                session.update(nurseprofiletable);
                return null;
            }
        });
    }
    public void updatePatientProfile(String id,String password,String fullName,String emailId,String address,String ailment,String nationality,String description,String gender,String DOB,String contactNo){
        template.execute(new HibernateCallback<Object>() {
            @Override
            public Object doInHibernate(Session session) throws HibernateException, SQLException {
                PatientProfileTable patientprofiletable = (PatientProfileTable)session.get(PatientProfileTable.class,id);
                patientprofiletable.setPatientId(id);
                patientprofiletable.setFullName(fullName);
                patientprofiletable.setPassword(password);
                patientprofiletable.setEmailId(emailId);
                patientprofiletable.setAddress(address);
                patientprofiletable.setAilment(ailment);
                patientprofiletable.setContactNo(contactNo);
                patientprofiletable.setDescription(description);
                patientprofiletable.setDob(DOB);
                patientprofiletable.setGender(gender);
                patientprofiletable.setNationality(nationality);
                session.update(patientprofiletable);
                return null;
            }
        });
    }
    public void updateCanteenOperatorProfile(String oldid, String password){
        template.execute(new HibernateCallback<Object>() {
            @Override
            public Object doInHibernate(Session session) throws HibernateException, SQLException {
                CanteenOperatorLoginTable canteenoperatorlogintable = (CanteenOperatorLoginTable)session.get(CanteenOperatorLoginTable.class,oldid);
                canteenoperatorlogintable.setOperatorId(oldid);
                canteenoperatorlogintable.setPassword(password);
                session.update(canteenoperatorlogintable);
                return null;
            }
        });
    }
    public void updatePharmacyOperatorProfile(String id, String password){
        template.execute(new HibernateCallback<Object>() {
            @Override
            public Object doInHibernate(Session session) throws HibernateException, SQLException {
                PharmacyOperatorLoginTable pharmacyoperatorlogintable = (PharmacyOperatorLoginTable)session.get(PharmacyOperatorLoginTable.class,id);
                pharmacyoperatorlogintable.setOperatorId(id);
                pharmacyoperatorlogintable.setPassword(password);
                session.update(pharmacyoperatorlogintable);
                return null;
            }
        });
    }
    public void updateFeedbackStatus(int id,String newStatus){
        template.execute(new HibernateCallback<Object>() {
            @Override
            public Object doInHibernate(Session session) throws HibernateException, SQLException {
                FeedbackTable feedbacktable=(FeedbackTable)session.get(FeedbackTable.class,id);
                feedbacktable.setStatus(newStatus);
                session.update(feedbacktable);
                return null;
            }
        });
    }
    public void updateFoodMenu(int id,String itemName,String price){
        template.execute(new HibernateCallback<Object>() {
            @Override
            public Object doInHibernate(Session session) throws HibernateException, SQLException {
                CanteenOperatorTable canteenoperatortable = (CanteenOperatorTable)session.get(CanteenOperatorTable.class,id);
                canteenoperatortable.setItemName(itemName);
                canteenoperatortable.setPrice(price);
                return null;
            }
        });
    }
    public void updateMedicineMenu(int id,String itemName,String price){
        template.execute(new HibernateCallback<Object>() {
            @Override
            public Object doInHibernate(Session session) throws HibernateException, SQLException {
                PharmacyOperatorTable pharmacyoperatortable = (PharmacyOperatorTable)session.get(PharmacyOperatorTable.class,id);
                pharmacyoperatortable.setItemName(itemName);
                pharmacyoperatortable.setPrice(price);
                session.update(pharmacyoperatortable);
                return null;
            }
        });
    }

   public List getAllFeedbacks(){
        List<FeedbackTable>list=template.find("from FeedbackTable");
        return list;
    }
}
