/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rosterms.dao.impl;

import com.mycompany.rosterms.dao.ResearchPublicationDAO;
import com.mycompany.rosterms.entity.ResearchPublication;
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
public class ResearchPublicationDAOIMPL implements ResearchPublicationDAO{

    @Autowired
    SessionFactory sessionFactory;
    Session session;
    
    @Override
    public void insert(ResearchPublication rp) {
        sessionFactory.getCurrentSession().save(rp);
// throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(ResearchPublication rp) {
        sessionFactory.getCurrentSession().update(rp);
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ResearchPublication> getAll() {
      session=sessionFactory.openSession();
        Transaction t= session.beginTransaction();
        Criteria c= session.createCriteria(ResearchPublication.class);
        List<ResearchPublication> rpList= c.list();
        t.commit();
        session.close();
        return rpList;
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResearchPublication getByResearchPublicationId(int rpId) {
       Criteria c= sessionFactory.getCurrentSession().createCriteria(ResearchPublication.class);
       c.add(Restrictions.ge("rpId", rpId));
       return (ResearchPublication) c.uniqueResult();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
