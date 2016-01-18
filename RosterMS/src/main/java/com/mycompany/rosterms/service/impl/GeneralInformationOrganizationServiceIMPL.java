/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rosterms.service.impl;

import com.mycompany.rosterms.entity.GeneralInformationOrganization;
import com.mycompany.rosterms.service.GeneralInformationOrganizationService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ubuntu
 */
@Service("GeneralInformationOrganizationService")
@Transactional
public class GeneralInformationOrganizationServiceIMPL implements GeneralInformationOrganizationService{

    @Autowired
    GeneralInformationOrganizationService generalInformationOrganizationService;
    
    @Override
    public void insert(GeneralInformationOrganization gio) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        this.generalInformationOrganizationService.insert(gio);
    }

    @Override
    public void update(GeneralInformationOrganization gio) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        this.generalInformationOrganizationService.update(gio);
    }

    @Override
    public List<GeneralInformationOrganization> getAll() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return generalInformationOrganizationService.getAll();
    }

    @Override
    public GeneralInformationOrganization getByGeneralInformationOrganizationId(int gioId) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return generalInformationOrganizationService.getByGeneralInformationOrganizationId(gioId);
    }
    
}
