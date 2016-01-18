/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rosterms.dao;

import com.mycompany.rosterms.entity.GeneralInformationIndividual;
import java.util.List;

/**
 *
 * @author ubuntu
 */
public interface GeneralInformationIndividualDAO {

    void insert(GeneralInformationIndividual gii);

    void update(GeneralInformationIndividual gii);

    List<GeneralInformationIndividual> getAll();

    GeneralInformationIndividual getByGeneralInformationIndividualId(int giiId);
}
