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
import javax.persistence.Lob;
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
@Table(name = "expertise_details", catalog = "rms", schema = "")
@NamedQueries({
    @NamedQuery(name = "ExpertiseDetails.findAll", query = "SELECT e FROM ExpertiseDetails e")})
public class ExpertiseDetails implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ed_id", nullable = false)
    private Integer edId;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "expertise_area", nullable = false, length = 65535)
    private String expertiseArea;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(nullable = false, length = 255)
    private String year;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1000)
    @Column(nullable = false, length = 1000)
    private String details;
    @Basic(optional = false)
    @NotNull
    @Column(name = "user_id", nullable = false)
    private int userId;

    public ExpertiseDetails() {
    }

    public ExpertiseDetails(Integer edId) {
        this.edId = edId;
    }

    public ExpertiseDetails(Integer edId, String expertiseArea, String year, String details, int userId) {
        this.edId = edId;
        this.expertiseArea = expertiseArea;
        this.year = year;
        this.details = details;
        this.userId = userId;
    }

    public Integer getEdId() {
        return edId;
    }

    public void setEdId(Integer edId) {
        this.edId = edId;
    }

    public String getExpertiseArea() {
        return expertiseArea;
    }

    public void setExpertiseArea(String expertiseArea) {
        this.expertiseArea = expertiseArea;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
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
        hash += (edId != null ? edId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ExpertiseDetails)) {
            return false;
        }
        ExpertiseDetails other = (ExpertiseDetails) object;
        if ((this.edId == null && other.edId != null) || (this.edId != null && !this.edId.equals(other.edId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.rosterms.entity.ExpertiseDetails[ edId=" + edId + " ]";
    }
    
}
