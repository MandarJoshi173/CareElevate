/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package careelevate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spr.hib.dao.LogicalCodeDAO;

/**
 *
 * @author hp
 */
public class CareElevate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("/SpringXmlConfig.xml");
        LogicalCodeDAO ref= (LogicalCodeDAO)context.getBean("firstStep");
        System.out.println(ref);
    }
    
}
