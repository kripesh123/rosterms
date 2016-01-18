/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rosterms.dao.impl;

import com.mycompany.rosterms.dao.ReferenceRecommendationDAO;
import com.mycompany.rosterms.entity.ReferenceRecommendation;
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
public class ReferenceRecommendationDAOIMPL implements ReferenceRecommendationDAO{

    @Autowired
    SessionFactory sessionFactory;
    Session session;
    
    @Override
    public void insert(ReferenceRecommendation rr) {
        sessionFactory.getCurrentSession().save(rr);
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(ReferenceRecommendation rr) {
        sessionFactory.getCurrentSession().update(rr);
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ReferenceRecommendation> getAll() {
       session = sessionFactory.openSession();
        Transaction t= session.beginTransaction();
        Criteria c= session.createCriteria(ReferenceRecommendation.class);
        List<ReferenceRecommendation> rrList=c.list();
        t.commit();
        session.close();
        return rrList;
// throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ReferenceRecommendation getByReferenceRecommendationId(int rrId) {
        Criteria c= sessionFactory.getCurrentSession().createCriteria(ReferenceRecommendation.class);
        c.add(Restrictions.ge("rrId", rrId));
        return (ReferenceRecommendation) c.uniqueResult();
// throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
