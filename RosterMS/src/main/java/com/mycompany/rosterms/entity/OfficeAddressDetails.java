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
@Table(name = "office_address_details", catalog = "rms", schema = "")
@NamedQueries({
    @NamedQuery(name = "OfficeAddressDetails.findAll", query = "SELECT o FROM OfficeAddressDetails o")})
public class OfficeAddressDetails implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "oad_id", nullable = false)
    private Integer oadId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(nullable = false, length = 255)
    private String country;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(nullable = false, length = 255)
    private String district;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(nullable = false, length = 255)
    private String city;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "permanent_address", nullable = false, length = 255)
    private String permanentAddress;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "mailing_postal_address", nullable = false, length = 255)
    private String mailingPostalAddress;
    @Basic(optional = false)
    @NotNull
    @Column(name = "user_id", nullable = false)
    private int userId;

    public OfficeAddressDetails() {
    }

    public OfficeAddressDetails(Integer oadId) {
        this.oadId = oadId;
    }

    public OfficeAddressDetails(Integer oadId, String country, String district, String city, String permanentAddress, String mailingPostalAddress, int userId) {
        this.oadId = oadId;
        this.country = country;
        this.district = district;
        this.city = city;
        this.permanentAddress = permanentAddress;
        this.mailingPostalAddress = mailingPostalAddress;
        this.userId = userId;
    }

    public Integer getOadId() {
        return oadId;
    }

    public void setOadId(Integer oadId) {
        this.oadId = oadId;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPermanentAddress() {
        return permanentAddress;
    }

    public void setPermanentAddress(String permanentAddress) {
        this.permanentAddress = permanentAddress;
    }

    public String getMailingPostalAddress() {
        return mailingPostalAddress;
    }

    public void setMailingPostalAddress(String mailingPostalAddress) {
        this.mailingPostalAddress = mailingPostalAddress;
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
        hash += (oadId != null ? oadId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OfficeAddressDetails)) {
            return false;
        }
        OfficeAddressDetails other = (OfficeAddressDetails) object;
        if ((this.oadId == null && other.oadId != null) || (this.oadId != null && !this.oadId.equals(other.oadId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.rosterms.entity.OfficeAddressDetails[ oadId=" + oadId + " ]";
    }
    
}
