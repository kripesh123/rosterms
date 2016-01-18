/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rosterms.dao;

import com.mycompany.rosterms.entity.ResearchPublication;
import java.util.List;

/**
 *
 * @author ubuntu
 */
public interface ResearchPublicationDAO {

    void insert(ResearchPublication rp);

    void update(ResearchPublication rp);

    List<ResearchPublication> getAll();

    ResearchPublication getByResearchPublicationId(int rpId);
}
