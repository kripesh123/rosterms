/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rosterms.service.impl;

import com.mycompany.rosterms.entity.GeneralInformationIndividual;
import com.mycompany.rosterms.service.GeneralInformationIndividualService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ubuntu
 */
@Service("GeneralInformationIndividualService")
@Transactional
public class GeneralInformationIndividualServiceIMPL implements GeneralInformationIndividualService{

    @Autowired
    GeneralInformationIndividualService generalInformationIndividualService;
    
    @Override
    public void insert(GeneralInformationIndividual gii) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        this.generalInformationIndividualService.insert(gii);
    }

    @Override
    public void update(GeneralInformationIndividual gii) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        this.generalInformationIndividualService.update(gii);
    }

    @Override
    public List<GeneralInformationIndividual> getAll() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return generalInformationIndividualService.getAll();
    }

    @Override
    public GeneralInformationIndividual getByGeneralInformationIndividualId(int giiId) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return generalInformationIndividualService.getByGeneralInformationIndividualId(giiId);
    }
    
}
