/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rosterms.service;

import com.mycompany.rosterms.entity.OfficeAddressDetails;
import java.util.List;

/**
 *
 * @author ubuntu
 */
public interface OfficeAddressDetailsService {
    
    void insert(OfficeAddressDetails oad);

    void update(OfficeAddressDetails oad);

    List<OfficeAddressDetails> getAll();

    OfficeAddressDetails getByOfficeAddressDetailId(int oadId);
}
