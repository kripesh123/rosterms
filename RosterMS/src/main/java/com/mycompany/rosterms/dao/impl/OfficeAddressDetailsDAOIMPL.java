/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rosterms.dao.impl;

import com.mycompany.rosterms.dao.OfficeAddressDetailsDAO;
import com.mycompany.rosterms.entity.OfficeAddressDetails;
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
public class OfficeAddressDetailsDAOIMPL implements OfficeAddressDetailsDAO{

    @Autowired
    SessionFactory sessionFactory;
    Session session;
    
    @Override
    public void insert(OfficeAddressDetails oad) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        sessionFactory.getCurrentSession().save(oad);
    }

    @Override
    public void update(OfficeAddressDetails oad) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       sessionFactory.getCurrentSession().update(oad);
    }

    @Override
    public List<OfficeAddressDetails> getAll() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        session = sessionFactory.openSession();
        Transaction t= session.beginTransaction();
        Criteria c=session.createCriteria(OfficeAddressDetails.class);
        List<OfficeAddressDetails> oadList=c.list();
        t.commit();
        session.close();
        return oadList;
    }

    @Override
    public OfficeAddressDetails getByOfficeAddressDetailId(int oadId) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Criteria c= sessionFactory.getCurrentSession().createCriteria(OfficeAddressDetails.class);
        c.add(Restrictions.ge("oadId", oadId));
        return (OfficeAddressDetails) c.uniqueResult();
    }
    
}
