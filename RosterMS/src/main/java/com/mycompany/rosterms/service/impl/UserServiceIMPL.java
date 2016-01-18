/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rosterms.service.impl;

import com.mycompany.rosterms.dao.UserDAO;
import com.mycompany.rosterms.entity.User;
import com.mycompany.rosterms.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ubuntu
 */
@Service("UserService")
@Transactional
public class UserServiceIMPL implements UserService{

    @Autowired
    UserDAO userDAO;
    
    @Override
    public void insert(User user) {
        this.userDAO.insert(user);
    }

    @Override
    public void update(User user) {
        this.userDAO.update(user);
    }

    @Override
    public List<User> getAll() {
        return userDAO.getAll();
    }

    @Override
    public User getByUserId(int userId) {
        return userDAO.getByUserId(userId);
    }
    
}
