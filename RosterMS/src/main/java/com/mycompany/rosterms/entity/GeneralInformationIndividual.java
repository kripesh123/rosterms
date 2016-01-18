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
@Table(name = "general_information_individual", catalog = "rms", schema = "")
@NamedQueries({
    @NamedQuery(name = "GeneralInformationIndividual.findAll", query = "SELECT g FROM GeneralInformationIndividual g")})
public class GeneralInformationIndividual implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "gii_id", nullable = false)
    private Integer giiId;
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
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dateofbirth;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(nullable = false, length = 50)
    private String nationality;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(nullable = false, length = 25)
    private String gender;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 55)
    @Column(nullable = false, length = 55)
    private String email;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 55)
    @Column(nullable = false, length = 55)
    private String telephone;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 55)
    @Column(nullable = false, length = 55)
    private String mobile;
    @Basic(optional = false)
    @NotNull
    @Column(name = "user_id", nullable = false)
    private int userId;

    public GeneralInformationIndividual() {
    }

    public GeneralInformationIndividual(Integer giiId) {
        this.giiId = giiId;
    }

    public GeneralInformationIndividual(Integer giiId, String firstName, String middleName, String lastName, Date dateofbirth, String nationality, String gender, String email, String telephone, String mobile, int userId) {
        this.giiId = giiId;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.dateofbirth = dateofbirth;
        this.nationality = nationality;
        this.gender = gender;
        this.email = email;
        this.telephone = telephone;
        this.mobile = mobile;
        this.userId = userId;
    }

    public Integer getGiiId() {
        return giiId;
    }

    public void setGiiId(Integer giiId) {
        this.giiId = giiId;
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

    public Date getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(Date dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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
        hash += (giiId != null ? giiId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GeneralInformationIndividual)) {
            return false;
        }
        GeneralInformationIndividual other = (GeneralInformationIndividual) object;
        if ((this.giiId == null && other.giiId != null) || (this.giiId != null && !this.giiId.equals(other.giiId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.rosterms.entity.GeneralInformationIndividual[ giiId=" + giiId + " ]";
    }
    
}
