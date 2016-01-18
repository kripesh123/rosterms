/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rosterms.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author ubuntu
 */
@Entity
@Table(name = "expected_remuneration", catalog = "rms", schema = "")
@NamedQueries({
    @NamedQuery(name = "ExpectedRemuneration.findAll", query = "SELECT e FROM ExpectedRemuneration e")})
public class ExpectedRemuneration implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "er-id", nullable = false)
    private Integer erId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1000)
    @Column(nullable = false, length = 1000)
    private String details;
    @Basic(optional = false)
    @NotNull
    @Column(name = "user_id", nullable = false)
    private int userId;

    public ExpectedRemuneration() {
    }

    public ExpectedRemuneration(Integer erId) {
        this.erId = erId;
    }

    public ExpectedRemuneration(Integer erId, String details, int userId) {
        this.erId = erId;
        this.details = details;
        this.userId = userId;
    }

    public Integer getErId() {
        return erId;
    }

    public void setErId(Integer erId) {
        this.erId = erId;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (erId != null ? erId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ExpectedRemuneration)) {
            return false;
        }
        ExpectedRemuneration other = (ExpectedRemuneration) object;
        if ((this.erId == null && other.erId != null) || (this.erId != null && !this.erId.equals(other.erId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.rosterms.entity.ExpectedRemuneration[ erId=" + erId + " ]";
    }
    
}
