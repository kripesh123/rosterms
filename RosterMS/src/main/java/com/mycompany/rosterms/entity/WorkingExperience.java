/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rosterms.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author ubuntu
 */
@Entity
@Table(name = "working_experience", catalog = "rms", schema = "")
@NamedQueries({
    @NamedQuery(name = "WorkingExperience.findAll", query = "SELECT w FROM WorkingExperience w")})
public class WorkingExperience implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "we_id", nullable = false)
    private Integer weId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "organization_name", nullable = false, length = 255)
    private String organizationName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 500)
    @Column(name = "experience_details", nullable = false, length = 500)
    private String experienceDetails;
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date duration;
    @Basic(optional = false)
    @NotNull
    @Column(name = "user_id", nullable = false)
    private int userId;

    public WorkingExperience() {
    }

    public WorkingExperience(Integer weId) {
        this.weId = weId;
    }

    public WorkingExperience(Integer weId, String organizationName, String experienceDetails, Date duration, int userId) {
        this.weId = weId;
        this.organizationName = organizationName;
        this.experienceDetails = experienceDetails;
        this.duration = duration;
        this.userId = userId;
    }

    public Integer getWeId() {
        return weId;
    }

    public void setWeId(Integer weId) {
        this.weId = weId;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getExperienceDetails() {
        return experienceDetails;
    }

    public void setExperienceDetails(String experienceDetails) {
        this.experienceDetails = experienceDetails;
    }

    public Date getDuration() {
        return duration;
    }

    public void setDuration(Date duration) {
        this.duration = duration;
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
        hash += (weId != null ? weId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WorkingExperience)) {
            return false;
        }
        WorkingExperience other = (WorkingExperience) object;
        if ((this.weId == null && other.weId != null) || (this.weId != null && !this.weId.equals(other.weId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.rosterms.entity.WorkingExperience[ weId=" + weId + " ]";
    }
    
}
