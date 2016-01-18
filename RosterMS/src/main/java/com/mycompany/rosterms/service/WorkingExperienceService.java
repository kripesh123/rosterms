/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rosterms.service;

import com.mycompany.rosterms.entity.WorkingExperience;
import java.util.List;

/**
 *
 * @author ubuntu
 */
public interface WorkingExperienceService {
    
    void insert(WorkingExperience we);

    void update(WorkingExperience we);

    List<WorkingExperience> getAll();

    WorkingExperience getByWorkingExperienceId(int weId);
}
