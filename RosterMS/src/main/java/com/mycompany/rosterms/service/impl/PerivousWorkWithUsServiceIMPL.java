/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rosterms.service.impl;

import com.mycompany.rosterms.entity.PerivousWorkWithUs;
import com.mycompany.rosterms.service.PerivousWorkWithUsService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ubuntu
 */
@Service("PerivousWorkWithUsService")
@Transactional
public class PerivousWorkWithUsServiceIMPL implements PerivousWorkWithUsService{

    @Autowired
    PerivousWorkWithUsService perivousWorkWithUsService;
    
    @Override
    public void insert(PerivousWorkWithUs pwu) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        this.perivousWorkWithUsService.insert(pwu);
    }

    @Override
    public void update(PerivousWorkWithUs pwu) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        this.perivousWorkWithUsService.update(pwu);
    }

    @Override
    public List<PerivousWorkWithUs> getAll() {
       //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return perivousWorkWithUsService.getAll();
    }

    @Override
    public PerivousWorkWithUs getByPerivousWorkWithUsId(int pwuId) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return perivousWorkWithUsService.getByPerivousWorkWithUsId(pwuId);
    }
    
}
