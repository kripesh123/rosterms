/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rosterms.dao.impl;

import com.mycompany.rosterms.dao.PerivousWorkWithUsDAO;
import com.mycompany.rosterms.entity.PerivousWorkWithUs;
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
public class PerivousWorkWithUsDAOIMPL implements PerivousWorkWithUsDAO{

    @Autowired
    SessionFactory sessionFactory;
    Session session;
    
    @Override
    public void insert(PerivousWorkWithUs pwu) {
        sessionFactory.getCurrentSession().save(pwu);
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(PerivousWorkWithUs pwu) {
        sessionFactory.getCurrentSession().update(pwu);
// throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<PerivousWorkWithUs> getAll() {
        session = sessionFactory.openSession();
        Transaction t= session.beginTransaction();
        Criteria c= session.createCriteria(PerivousWorkWithUs.class);
        List<PerivousWorkWithUs> pwuList=c.list();
        t.commit();
        session.close();
        return pwuList;
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PerivousWorkWithUs getByPerivousWorkWithUsId(int pwuId) {
        Criteria c= sessionFactory.getCurrentSession().createCriteria(PerivousWorkWithUs.class);
        c.add(Restrictions.ge("pwuId", pwuId));
        return (PerivousWorkWithUs) c.uniqueResult();
// throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
