/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rosterms.service.impl;

import com.mycompany.rosterms.entity.ContactPersonDetails;
import com.mycompany.rosterms.service.ContactPersonDetailsService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ubuntu
 */
@Service("ContactPersonDetailsService")
@Transactional
public class ContactPersonDetailsServiceIMPL implements ContactPersonDetailsService{

    @Autowired
    ContactPersonDetailsService contactPersonDetailsService;
    
    @Override
    public void insert(ContactPersonDetails cpd) {
        this.contactPersonDetailsService.insert(cpd);
    }

    @Override
    public void update(ContactPersonDetails cpd) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        this.contactPersonDetailsService.update(cpd);
    }

    @Override
    public List<ContactPersonDetails> getAll() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return contactPersonDetailsService.getAll();
    }

    @Override
    public ContactPersonDetails getByContactPersonDetailId(int cpdId) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return contactPersonDetailsService.getByContactPersonDetailId(cpdId);
    }
    
}
