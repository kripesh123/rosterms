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
@Table(name = "contact_person_details", catalog = "rms", schema = "")
@NamedQueries({
    @NamedQuery(name = "ContactPersonDetails.findAll", query = "SELECT c FROM ContactPersonDetails c")})
public class ContactPersonDetails implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cpd_id", nullable = false)
    private Integer cpdId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "first_name", nullable = false, length = 255)
    private String firstName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "middle_name", nullable = false, length = 255)
    private String middleName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "last_name", nullable = false, length = 255)
    private String lastName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1000)
    @Column(nullable = false, length = 1000)
    private String designation;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(nullable = false, length = 255)
    private String email;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(nullable = false, length = 50)
    private String telephone;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(nullable = false, length = 50)
    private String mobile;
    @Basic(optional = false)
    @NotNull
    @Column(name = "user_id", nullable = false)
    private int userId;

    public ContactPersonDetails() {
    }

    public ContactPersonDetails(Integer cpdId) {
        this.cpdId = cpdId;
    }

    public ContactPersonDetails(Integer cpdId, String firstName, String middleName, String lastName, String designation, String email, String telephone, String mobile, int userId) {
        this.cpdId = cpdId;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.designation = designation;
        this.email = email;
        this.telephone = telephone;
        this.mobile = mobile;
        this.userId = userId;
    }

    public Integer getCpdId() {
        return cpdId;
    }

    public void setCpdId(Integer cpdId) {
        this.cpdId = cpdId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
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
        hash += (cpdId != null ? cpdId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ContactPersonDetails)) {
            return false;
        }
        ContactPersonDetails other = (ContactPersonDetails) object;
        if ((this.cpdId == null && other.cpdId != null) || (this.cpdId != null && !this.cpdId.equals(other.cpdId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.rosterms.entity.ContactPersonDetails[ cpdId=" + cpdId + " ]";
    }
    
}
