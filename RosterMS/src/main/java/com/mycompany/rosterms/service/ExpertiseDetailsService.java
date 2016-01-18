/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rosterms.service;

import com.mycompany.rosterms.entity.ExpertiseDetails;
import java.util.List;

/**
 *
 * @author ubuntu
 */
public interface ExpertiseDetailsService {
    
    void insert(ExpertiseDetails ed);

    void update(ExpertiseDetails ed);

    List<ExpertiseDetails> getAll();

    ExpertiseDetails getByExpertiseDetailId(int edId);
}
