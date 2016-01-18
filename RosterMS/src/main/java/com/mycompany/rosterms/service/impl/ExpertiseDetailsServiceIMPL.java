/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rosterms.service.impl;

import com.mycompany.rosterms.entity.ExpertiseDetails;
import com.mycompany.rosterms.service.ExpertiseDetailsService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ubuntu
 */
@Service("ExpertiseDetailsService")
@Transactional
public class ExpertiseDetailsServiceIMPL implements ExpertiseDetailsService{

    @Autowired
    ExpertiseDetailsService expertiseDetailsService;
    @Override
    public void insert(ExpertiseDetails ed) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        this.expertiseDetailsService.insert(ed);
    }

    @Override
    public void update(ExpertiseDetails ed) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         this.expertiseDetailsService.update(ed);
    }

    @Override
    public List<ExpertiseDetails> getAll() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return expertiseDetailsService.getAll();
    }

    @Override
    public ExpertiseDetails getByExpertiseDetailId(int edId) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       return expertiseDetailsService.getByExpertiseDetailId(edId);
    }
    
}
