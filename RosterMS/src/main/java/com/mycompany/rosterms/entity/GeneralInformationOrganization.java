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
import javax.persistence.Lob;
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
@Table(name = "general_information_organization", catalog = "rms", schema = "")
@NamedQueries({
    @NamedQuery(name = "GeneralInformationOrganization.findAll", query = "SELECT g FROM GeneralInformationOrganization g")})
public class GeneralInformationOrganization implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "gio_id", nullable = false)
    private Integer gioId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "organization_name", nullable = false, length = 255)
    private String organizationName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 500)
    @Column(name = "organization_mission", nullable = false, length = 500)
    private String organizationMission;
    @Basic(optional = false)
    @NotNull
    @Column(name = "establish_year", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date establishYear;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "organization_type", nullable = false, length = 25)
    private String organizationType;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "pan_number", nullable = false, length = 65535)
    private String panNumber;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "swc_registration_number", nullable = false, length = 65535)
    private String swcRegistrationNumber;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "office_telephone", nullable = false, length = 25)
    private String officeTelephone;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "office_fax", nullable = false, length = 50)
    private String officeFax;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(nullable = false, length = 255)
    private String website;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "office_email", nullable = false, length = 255)
    private String officeEmail;
    @Basic(optional = false)
    @NotNull
    @Column(name = "user_id", nullable = false)
    private int userId;

    public GeneralInformationOrganization() {
    }

    public GeneralInformationOrganization(Integer gioId) {
        this.gioId = gioId;
    }

    public GeneralInformationOrganization(Integer gioId, String organizationName, String organizationMission, Date establishYear, String organizationType, String panNumber, String swcRegistrationNumber, String officeTelephone, String officeFax, String website, String officeEmail, int userId) {
        this.gioId = gioId;
        this.organizationName = organizationName;
        this.organizationMission = organizationMission;
        this.establishYear = establishYear;
        this.organizationType = organizationType;
        this.panNumber = panNumber;
        this.swcRegistrationNumber = swcRegistrationNumber;
        this.officeTelephone = officeTelephone;
        this.officeFax = officeFax;
        this.website = website;
        this.officeEmail = officeEmail;
        this.userId = userId;
    }

    public Integer getGioId() {
        return gioId;
    }

    public void setGioId(Integer gioId) {
        this.gioId = gioId;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getOrganizationMission() {
        return organizationMission;
    }

    public void setOrganizationMission(String organizationMission) {
        this.organizationMission = organizationMission;
    }

    public Date getEstablishYear() {
        return establishYear;
    }

    public void setEstablishYear(Date establishYear) {
        this.establishYear = establishYear;
    }

    public String getOrganizationType() {
        return organizationType;
    }

    public void setOrganizationType(String organizationType) {
        this.organizationType = organizationType;
    }

    public String getPanNumber() {
        return panNumber;
    }

    public void setPanNumber(String panNumber) {
        this.panNumber = panNumber;
    }

    public String getSwcRegistrationNumber() {
        return swcRegistrationNumber;
    }

    public void setSwcRegistrationNumber(String swcRegistrationNumber) {
        this.swcRegistrationNumber = swcRegistrationNumber;
    }

    public String getOfficeTelephone() {
        return officeTelephone;
    }

    public void setOfficeTelephone(String officeTelephone) {
        this.officeTelephone = officeTelephone;
    }

    public String getOfficeFax() {
        return officeFax;
    }

    public void setOfficeFax(String officeFax) {
        this.officeFax = officeFax;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getOfficeEmail() {
        return officeEmail;
    }

    public void setOfficeEmail(String officeEmail) {
        this.officeEmail = officeEmail;
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
        hash += (gioId != null ? gioId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GeneralInformationOrganization)) {
            return false;
        }
        GeneralInformationOrganization other = (GeneralInformationOrganization) object;
        if ((this.gioId == null && other.gioId != null) || (this.gioId != null && !this.gioId.equals(other.gioId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.rosterms.entity.GeneralInformationOrganization[ gioId=" + gioId + " ]";
    }
    
}
