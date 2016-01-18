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
@Table(name = "education_details", catalog = "rms", schema = "")
@NamedQueries({
    @NamedQuery(name = "EducationDetails.findAll", query = "SELECT e FROM EducationDetails e")})
public class EducationDetails implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ed_id", nullable = false)
    private Integer edId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "university_qualification", nullable = false, length = 255)
    private String universityQualification;
    @Basic(optional = false)
    @NotNull
    @Column(name = "attended_from", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date attendedFrom;
    @Basic(optional = false)
    @NotNull
    @Column(name = "attended_to", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date attendedTo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "name_of_degree", nullable = false, length = 255)
    private String nameOfDegree;
    @Basic(optional = false)
    @NotNull
    @Column(name = "user_id", nullable = false)
    private int userId;

    public EducationDetails() {
    }

    public EducationDetails(Integer edId) {
        this.edId = edId;
    }

    public EducationDetails(Integer edId, String universityQualification, Date attendedFrom, Date attendedTo, String nameOfDegree, int userId) {
        this.edId = edId;
        this.universityQualification = universityQualification;
        this.attendedFrom = attendedFrom;
        this.attendedTo = attendedTo;
        this.nameOfDegree = nameOfDegree;
        this.userId = userId;
    }

    public Integer getEdId() {
        return edId;
    }

    public void setEdId(Integer edId) {
        this.edId = edId;
    }

    public String getUniversityQualification() {
        return universityQualification;
    }

    public void setUniversityQualification(String universityQualification) {
        this.universityQualification = universityQualification;
    }

    public Date getAttendedFrom() {
        return attendedFrom;
    }

    public void setAttendedFrom(Date attendedFrom) {
        this.attendedFrom = attendedFrom;
    }

    public Date getAttendedTo() {
        return attendedTo;
    }

    public void setAttendedTo(Date attendedTo) {
        this.attendedTo = attendedTo;
    }

    public String getNameOfDegree() {
        return nameOfDegree;
    }

    public void setNameOfDegree(String nameOfDegree) {
        this.nameOfDegree = nameOfDegree;
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
        if (!(object instanceof EducationDetails)) {
            return false;
        }
        EducationDetails other = (EducationDetails) object;
        if ((this.edId == null && other.edId != null) || (this.edId != null && !this.edId.equals(other.edId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.rosterms.entity.EducationDetails[ edId=" + edId + " ]";
    }
    
}
