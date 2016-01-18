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
@Table(name = "reference_recommendation", catalog = "rms", schema = "")
@NamedQueries({
    @NamedQuery(name = "ReferenceRecommendation.findAll", query = "SELECT r FROM ReferenceRecommendation r")})
public class ReferenceRecommendation implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "rr_id", nullable = false)
    private Integer rrId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1000)
    @Column(nullable = false, length = 1000)
    private String details;
    @Basic(optional = false)
    @NotNull
    @Column(name = "user_id", nullable = false)
    private int userId;

    public ReferenceRecommendation() {
    }

    public ReferenceRecommendation(Integer rrId) {
        this.rrId = rrId;
    }

    public ReferenceRecommendation(Integer rrId, String details, int userId) {
        this.rrId = rrId;
        this.details = details;
        this.userId = userId;
    }

    public Integer getRrId() {
        return rrId;
    }

    public void setRrId(Integer rrId) {
        this.rrId = rrId;
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
        hash += (rrId != null ? rrId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ReferenceRecommendation)) {
            return false;
        }
        ReferenceRecommendation other = (ReferenceRecommendation) object;
        if ((this.rrId == null && other.rrId != null) || (this.rrId != null && !this.rrId.equals(other.rrId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.rosterms.entity.ReferenceRecommendation[ rrId=" + rrId + " ]";
    }
    
}
