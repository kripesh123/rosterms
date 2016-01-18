/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rosterms.dao;

import com.mycompany.rosterms.entity.PerivousWorkWithUs;
import java.util.List;

/**
 *
 * @author ubuntu
 */
public interface PerivousWorkWithUsDAO {

    void insert(PerivousWorkWithUs pwu);

    void update(PerivousWorkWithUs pwu);

    List<PerivousWorkWithUs> getAll();

    PerivousWorkWithUs getByPerivousWorkWithUsId(int pwuId);
}
