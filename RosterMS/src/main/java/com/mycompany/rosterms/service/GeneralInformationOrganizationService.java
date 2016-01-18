/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rosterms.service;

import com.mycompany.rosterms.entity.GeneralInformationOrganization;
import java.util.List;

/**
 *
 * @author ubuntu
 */
public interface GeneralInformationOrganizationService {
    
    void insert(GeneralInformationOrganization gio);

    void update(GeneralInformationOrganization gio);

    List<GeneralInformationOrganization> getAll();

    GeneralInformationOrganization getByGeneralInformationOrganizationId(int gioId);
}
