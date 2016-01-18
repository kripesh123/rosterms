/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rosterms.dao.impl;

import com.mycompany.rosterms.dao.GeneralInformationIndividualDAO;
import com.mycompany.rosterms.entity.GeneralInformationIndividual;
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
public class GeneralInformationIndividualDAOIMPL implements GeneralInformationIndividualDAO{

    @Autowired
    SessionFactory sessionFactory;
    Session session;
    
    @Override
    public void insert(GeneralInformationIndividual gii) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        sessionFactory.getCurrentSession().save(gii);
    }

    @Override
    public void update(GeneralInformationIndividual gii) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        sessionFactory.getCurrentSession().update(gii);
    }

    @Override
    public List<GeneralInformationIndividual> getAll() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        session= sessionFactory.openSession();
        Transaction t= session.beginTransaction();
        Criteria c= session.createCriteria(GeneralInformationIndividual.class);
        List<GeneralInformationIndividual> giiList = c.list();
        t.commit();
        session.close();
        return giiList;
    }

    @Override
    public GeneralInformationIndividual getByGeneralInformationIndividualId(int giiId) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Criteria c=sessionFactory.getCurrentSession().createCriteria(GeneralInformationIndividual.class);
        c.add(Restrictions.ge("giiId", giiId));
        return (GeneralInformationIndividual) c.uniqueResult();
    }
    
}
