/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rosterms.dao;

import com.mycompany.rosterms.entity.ReferenceRecommendation;
import java.util.List;

/**
 *
 * @author ubuntu
 */
public interface ReferenceRecommendationDAO {

    void insert(ReferenceRecommendation rr);

    void update(ReferenceRecommendation rr);

    List<ReferenceRecommendation> getAll();

    ReferenceRecommendation getByReferenceRecommendationId(int rrId);
}
