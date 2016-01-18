/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rosterms.dao.impl;

import com.mycompany.rosterms.dao.EducationDetailsDAO;
import com.mycompany.rosterms.entity.EducationDetails;
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
public class EducationDetailsDAOIMPL implements EducationDetailsDAO{

    @Autowired
    SessionFactory sessionFactory;
    Session session;
    
    @Override
    public void insert(EducationDetails ed) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        sessionFactory.getCurrentSession().save(ed);
    }

    @Override
    public void update(EducationDetails ed) {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        sessionFactory.getCurrentSession().update(ed);
    }

    @Override
    public List<EducationDetails> getAll() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        session= sessionFactory.openSession();
        Transaction t=session.beginTransaction();
        Criteria c = session.createCriteria(EducationDetails.class);
        List<EducationDetails> edList=c.list();
        t.commit();
        session.close();
        return edList;
        
    }

    @Override
    public EducationDetails getByEducationDetailId(int edId) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Criteria c=sessionFactory.getCurrentSession().createCriteria(EducationDetails.class);
        c.add(Restrictions.ge("edId", edId));
        return (EducationDetails) c.uniqueResult();
    }
    
}
