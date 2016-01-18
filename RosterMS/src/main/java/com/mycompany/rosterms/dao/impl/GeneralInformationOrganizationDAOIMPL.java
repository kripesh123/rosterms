/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rosterms.dao.impl;

import com.mycompany.rosterms.dao.GeneralInformationOrganizationDAO;
import com.mycompany.rosterms.entity.GeneralInformationOrganization;
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
public class GeneralInformationOrganizationDAOIMPL implements GeneralInformationOrganizationDAO{

    @Autowired
    SessionFactory sessionFactory;
    Session session;
    
    @Override
    public void insert(GeneralInformationOrganization gio) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        sessionFactory.getCurrentSession().save(gio);
    }

    @Override
    public void update(GeneralInformationOrganization gio) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        sessionFactory.getCurrentSession().update(gio);
    }

    @Override
    public List<GeneralInformationOrganization> getAll() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        session=sessionFactory.openSession();
        Transaction t=session.beginTransaction();
        Criteria c= session.createCriteria(GeneralInformationOrganization.class);
        List<GeneralInformationOrganization> gioList= c.list();
        t.commit();
        session.close();
        return gioList;
    }

    @Override
    public GeneralInformationOrganization getByGeneralInformationOrganizationId(int gioId) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Criteria c= sessionFactory.getCurrentSession().createCriteria(GeneralInformationOrganization.class);
        c.add(Restrictions.ge("gioId", gioId));
        return (GeneralInformationOrganization) c.uniqueResult();
    }
    
}
