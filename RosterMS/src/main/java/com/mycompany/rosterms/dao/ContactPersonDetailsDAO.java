/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rosterms.dao;

import com.mycompany.rosterms.entity.ContactPersonDetails;
import java.util.List;

/**
 *
 * @author ubuntu
 */
public interface ContactPersonDetailsDAO {
    void insert(ContactPersonDetails cpd);

    void update(ContactPersonDetails cpd);

    List<ContactPersonDetails> getAll();

    ContactPersonDetails getByContactPersonDetailId(int cpdId);
}
