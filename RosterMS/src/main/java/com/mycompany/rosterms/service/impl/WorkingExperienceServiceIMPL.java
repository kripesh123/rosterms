/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rosterms.service.impl;

import com.mycompany.rosterms.entity.WorkingExperience;
import com.mycompany.rosterms.service.WorkingExperienceService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ubuntu
 */
@Service("WorkingExperienceService")
@Transactional
public class WorkingExperienceServiceIMPL implements WorkingExperienceService{

    @Autowired
    WorkingExperienceService workingExperienceService;
    
    @Override
    public void insert(WorkingExperience we) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        this.workingExperienceService.insert(we);
    }

    @Override
    public void update(WorkingExperience we) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        this.workingExperienceService.update(we);
    }

    @Override
    public List<WorkingExperience> getAll() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return workingExperienceService.getAll();
    }

    @Override
    public WorkingExperience getByWorkingExperienceId(int weId) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return workingExperienceService.getByWorkingExperienceId(weId);
    }
    
}
