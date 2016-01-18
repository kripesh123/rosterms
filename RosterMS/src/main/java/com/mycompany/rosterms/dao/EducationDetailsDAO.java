/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rosterms.dao;

import com.mycompany.rosterms.entity.EducationDetails;
import java.util.List;

/**
 *
 * @author ubuntu
 */
public interface EducationDetailsDAO {

    void insert(EducationDetails ed);

    void update(EducationDetails ed);

    List<EducationDetails> getAll();

    EducationDetails getByEducationDetailId(int edId);
}
