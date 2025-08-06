package spr.dao;

import org.springframework.orm.hibernate3.HibernateTemplate;

public class LogicalCodeDAO {
    private HibernateTemplate template;

    public LogicalCodeDAO() {
    }

    public LogicalCodeDAO(HibernateTemplate template) {
        this.template = template;
    }
    
    
    public HibernateTemplate getTemplate() {
        return template;
    }

    public void setTemplate(HibernateTemplate template) {
        this.template = template;
    }
    
    
}
