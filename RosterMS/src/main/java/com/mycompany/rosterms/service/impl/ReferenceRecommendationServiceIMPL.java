/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rosterms.service.impl;

import com.mycompany.rosterms.entity.ReferenceRecommendation;
import com.mycompany.rosterms.service.ReferenceRecommendationService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ubuntu
 */
@Service("ReferenceRecommendationService")
@Transactional
public class ReferenceRecommendationServiceIMPL implements ReferenceRecommendationService{

    @Autowired
    ReferenceRecommendationService referenceRecommendationService;
    
    @Override
    public void insert(ReferenceRecommendation rr) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        this.referenceRecommendationService.insert(rr);
    }

    @Override
    public void update(ReferenceRecommendation rr) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        this.referenceRecommendationService.update(rr);
    }

    @Override
    public List<ReferenceRecommendation> getAll() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return referenceRecommendationService.getAll();
    }

    @Override
    public ReferenceRecommendation getByReferenceRecommendationId(int rrId) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return referenceRecommendationService.getByReferenceRecommendationId(rrId);
    }
    
}
