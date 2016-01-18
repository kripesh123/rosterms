/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rosterms.service.impl;

import com.mycompany.rosterms.entity.EducationDetails;
import com.mycompany.rosterms.service.EducationDetailsService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ubuntu
 */
@Service("EducationDetailsService")
@Transactional
public class EducationDetailsServiceIMPL implements EducationDetailsService{

    @Autowired
    EducationDetailsService educationDetailsService;
    
    @Override
    public void insert(EducationDetails ed) {
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        this.educationDetailsService.insert(ed);
    }

    @Override
    public void update(EducationDetails ed) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        this.educationDetailsService.update(ed);
    }

    @Override
    public List<EducationDetails> getAll() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return educationDetailsService.getAll();
    }

    @Override
    public EducationDetails getByEducationDetailId(int edId) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return educationDetailsService.getByEducationDetailId(edId);
    }
    
}
