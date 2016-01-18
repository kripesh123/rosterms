/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rosterms.service;

import com.mycompany.rosterms.entity.ExpectedRemuneration;
import java.util.List;

/**
 *
 * @author ubuntu
 */
public interface ExpectedRemunerationService {
    
    void insert(ExpectedRemuneration er);

    void update(ExpectedRemuneration er);

    List<ExpectedRemuneration> getAll();

    ExpectedRemuneration getByExpectedRemunerationId(int erId);
}
