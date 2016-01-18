/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rosterms.service.impl;

import com.mycompany.rosterms.entity.ExpectedRemuneration;
import com.mycompany.rosterms.service.ExpectedRemunerationService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ubuntu
 */
@Service("ExpectedRemunerationService")
@Transactional
public class ExpectedRemunerationServiceImpl implements ExpectedRemunerationService{

    @Autowired
    ExpectedRemunerationService expectedRemunerationService;
    
    @Override
    public void insert(ExpectedRemuneration er) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        this.expectedRemunerationService.insert(er);
    }

    @Override
    public void update(ExpectedRemuneration er) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        this.expectedRemunerationService.update(er);
    }

    @Override
    public List<ExpectedRemuneration> getAll() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return expectedRemunerationService.getAll();
    }

    @Override
    public ExpectedRemuneration getByExpectedRemunerationId(int erId) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return expectedRemunerationService.getByExpectedRemunerationId(erId);
    }
    
}
