/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rosterms.dao;

import com.mycompany.rosterms.entity.User;
import java.util.List;

/**
 *
 * @author ubuntu
 */
public interface UserDAO {

    void insert(User user);

    void update(User user);

    List<User> getAll();

    User getByUserId(int userId);
}
