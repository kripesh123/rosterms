/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rosterms.service.impl;

import com.mycompany.rosterms.entity.ResearchPublication;
import com.mycompany.rosterms.service.ResearchPublicationService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ubuntu
 */
@Service("ResearchPublicationService")
@Transactional
public class ResearchPublicationServiceIMPL implements ResearchPublicationService{

    @Autowired
    ResearchPublicationService researchPublicationService;
    
    @Override
    public void insert(ResearchPublication rp) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        this.researchPublicationService.insert(rp);
    }

    @Override
    public void update(ResearchPublication rp) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        this.researchPublicationService.update(rp);
    }

    @Override
    public List<ResearchPublication> getAll() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return researchPublicationService.getAll();
    }

    @Override
    public ResearchPublication getByResearchPublicationId(int rpId) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return researchPublicationService.getByResearchPublicationId(rpId);
    }
    
}
