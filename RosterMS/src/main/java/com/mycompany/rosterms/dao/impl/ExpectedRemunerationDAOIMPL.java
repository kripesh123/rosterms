/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rosterms.dao.impl;

import com.mycompany.rosterms.dao.ExpectedRemunerationDAO;
import com.mycompany.rosterms.entity.ExpectedRemuneration;
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
public class ExpectedRemunerationDAOIMPL implements ExpectedRemunerationDAO{

    @Autowired
    SessionFactory sessionFactory;
    Session session;
    
    @Override
    public void insert(ExpectedRemuneration er) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        sessionFactory.getCurrentSession().save(er);
    }

    @Override
    public void update(ExpectedRemuneration er) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        sessionFactory.getCurrentSession().update(er);
    }

    @Override
    public List<ExpectedRemuneration> getAll() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        session=sessionFactory.openSession();
        Transaction t= session.beginTransaction();
        Criteria c= session.createCriteria(ExpectedRemuneration.class);
        List<ExpectedRemuneration> erList=c.list();
        t.commit();
        session.close();
        return erList;
    }

    @Override
    public ExpectedRemuneration getByExpectedRemunerationId(int erId) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Criteria c= sessionFactory.getCurrentSession().createCriteria(ExpectedRemuneration.class);
        c.add(Restrictions.ge("erId", erId));
        return (ExpectedRemuneration) c.uniqueResult();
    }
    
}
