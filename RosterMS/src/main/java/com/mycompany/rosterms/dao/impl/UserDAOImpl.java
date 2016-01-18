/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rosterms.dao.impl;

import com.mycompany.rosterms.dao.UserDAO;
import com.mycompany.rosterms.entity.User;
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
public class UserDAOImpl implements UserDAO{

    @Autowired
    SessionFactory sessionFactory;
    Session session;
    
    @Override
    public void insert(User user) {
        sessionFactory.getCurrentSession().save(user);
    }

    @Override
    public void update(User user) {
        sessionFactory.getCurrentSession().update(user);
    }

    @Override
    public List<User> getAll() {
        session=sessionFactory.openSession();
        Transaction trans=session.beginTransaction();
        Criteria criteria = session.createCriteria(User.class);
        
        
       List<User> userList= criteria.list();
        trans.commit();
        //List<User> userList=session.createQuery("SELECT u FROM User u").list();
        session.close();
       // System.out.println(userList);
       return userList;
    }

    @Override
    public User getByUserId(int userId) {
        Criteria criteria = sessionFactory.getCurrentSession().createCriteria(User.class);
        criteria.add(Restrictions.ge("userId", userId));
        return (User)criteria.uniqueResult();
    }
    
}
