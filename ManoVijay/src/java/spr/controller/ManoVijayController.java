/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import spr.beans.SignupTable;
import spr.dao.LogicalCodeDAO;

/**
 *
 * @author hp
 */
@Controller
public class ManoVijayController {
    private LogicalCodeDAO dao;

    public LogicalCodeDAO getDao() {
        return dao;
    }

    @Autowired
    public void setDao(LogicalCodeDAO dao) {
        this.dao = dao;
    }
    
    @RequestMapping("/loadFirstPage.html")
    public void myFirstPage(ModelMap map, SignupTable signup){
        
    }
    
}
