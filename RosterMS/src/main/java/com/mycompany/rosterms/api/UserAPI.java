/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rosterms.api;

import com.mycompany.rosterms.entity.User;
import com.mycompany.rosterms.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ubuntu
 */
@RestController
@RequestMapping(value = "/api/users")
public class UserAPI {

    @Autowired
    UserService uService;

    @RequestMapping(method = RequestMethod.GET)
    public List<User> Users() {
        return uService.getAll();
    }
    
    
}
