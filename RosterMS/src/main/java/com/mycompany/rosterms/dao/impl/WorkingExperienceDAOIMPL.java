/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rosterms.dao.impl;

import com.mycompany.rosterms.dao.WorkingExperienceDAO;
import com.mycompany.rosterms.entity.WorkingExperience;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ubuntu
 */
@Repository
public class WorkingExperienceDAOIMPL implements WorkingExperienceDAO{

    @Autowired
    SessionFactory sessionFactory;
    Session session;
    
    @Override
    public void insert(WorkingExperience we) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        sessionFactory.getCurrentSession().save(we);
    }

    @Override
    public void update(WorkingExperience we) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        sessionFactory.getCurrentSession().update(we);
    }

    @Override
    public List<WorkingExperience> getAll() {
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        session = sessionFactory.openSession();
        Transaction t=session.beginTransaction();
        Criteria c= session.createCriteria(WorkingExperience.class);
        List<WorkingExperience> weList=c.list();
        t.commit();
        session.close();
        return weList;
    }

    @Override
    public WorkingExperience getByWorkingExperienceId(int weId) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   Criteria c= sessionFactory.getCurrentSession().createCriteria(WorkingExperience.class);
   c.add(Restrictions.ge("weId", weId));
   return (WorkingExperience) c.uniqueResult();
    }
    
}
