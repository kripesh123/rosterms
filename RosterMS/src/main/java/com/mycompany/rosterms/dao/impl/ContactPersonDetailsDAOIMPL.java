/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rosterms.dao.impl;

import com.mycompany.rosterms.dao.ContactPersonDetailsDAO;
import com.mycompany.rosterms.entity.ContactPersonDetails;
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
public class ContactPersonDetailsDAOIMPL implements ContactPersonDetailsDAO{

    @Autowired
    SessionFactory sessionFactory;
    Session session;

    @Override
    public void insert(ContactPersonDetails cpd) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        sessionFactory.getCurrentSession().save(cpd);
    }

    @Override
    public void update(ContactPersonDetails cpd) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   sessionFactory.getCurrentSession().update(cpd);
    }

    @Override
    public List<ContactPersonDetails> getAll() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    session=sessionFactory.openSession();
        Transaction t = session.beginTransaction();
        Criteria c = session.createCriteria(ContactPersonDetails.class);
        List<ContactPersonDetails> cpdList=c.list();
        t.commit();
        session.close();
        return cpdList;
    }

    @Override
    public ContactPersonDetails getByContactPersonDetailId(int cpdId) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Criteria c=sessionFactory.getCurrentSession().createCriteria(ContactPersonDetails.class);
        c.add(Restrictions.ge("cpdId", cpdId));
        return (ContactPersonDetails) c.uniqueResult();
    }
    
}
