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
@Table(name = "perivous_work_with_us", catalog = "rms", schema = "")
@NamedQueries({
    @NamedQuery(name = "PerivousWorkWithUs.findAll", query = "SELECT p FROM PerivousWorkWithUs p")})
public class PerivousWorkWithUs implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "pwu_id", nullable = false)
    private Integer pwuId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "work_experience", nullable = false, length = 25)
    private String workExperience;
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date year;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(nullable = false, length = 100)
    private String details;
    @Basic(optional = false)
    @NotNull
    @Column(name = "user_id", nullable = false)
    private int userId;

    public PerivousWorkWithUs() {
    }

    public PerivousWorkWithUs(Integer pwuId) {
        this.pwuId = pwuId;
    }

    public PerivousWorkWithUs(Integer pwuId, String workExperience, Date year, String details, int userId) {
        this.pwuId = pwuId;
        this.workExperience = workExperience;
        this.year = year;
        this.details = details;
        this.userId = userId;
    }

    public Integer getPwuId() {
        return pwuId;
    }

    public void setPwuId(Integer pwuId) {
        this.pwuId = pwuId;
    }

    public String getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(String workExperience) {
        this.workExperience = workExperience;
    }

    public Date getYear() {
        return year;
    }

    public void setYear(Date year) {
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
        hash += (pwuId != null ? pwuId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PerivousWorkWithUs)) {
            return false;
        }
        PerivousWorkWithUs other = (PerivousWorkWithUs) object;
        if ((this.pwuId == null && other.pwuId != null) || (this.pwuId != null && !this.pwuId.equals(other.pwuId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.rosterms.entity.PerivousWorkWithUs[ pwuId=" + pwuId + " ]";
    }
    
}
