/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rosterms.service.impl;

import com.mycompany.rosterms.entity.OfficeAddressDetails;
import com.mycompany.rosterms.service.OfficeAddressDetailsService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ubuntu
 */
@Service("OfficeAddressDetailsService")
@Transactional
public class OfficeAddressDetailsServiceIMPL implements OfficeAddressDetailsService{

    @Autowired
    OfficeAddressDetailsService officeAddressDetailsService;
    
    @Override
    public void insert(OfficeAddressDetails oad) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        this.officeAddressDetailsService.insert(oad);
    }

    @Override
    public void update(OfficeAddressDetails oad) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        this.officeAddressDetailsService.update(oad);
    }

    @Override
    public List<OfficeAddressDetails> getAll() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return officeAddressDetailsService.getAll();
    }

    @Override
    public OfficeAddressDetails getByOfficeAddressDetailId(int oadId) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return officeAddressDetailsService.getByOfficeAddressDetailId(oadId);
    }
    
}
