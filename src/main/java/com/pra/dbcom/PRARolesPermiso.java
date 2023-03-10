/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pra.dbcom;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author obper
 */
@Entity
@Table(name = "PRA_Roles_Permiso")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PRARolesPermiso.findAll", query = "SELECT p FROM PRARolesPermiso p"),
    @NamedQuery(name = "PRARolesPermiso.findByIDRolePersmiso", query = "SELECT p FROM PRARolesPermiso p WHERE p.iDRolePersmiso = :iDRolePersmiso"),
    @NamedQuery(name = "PRARolesPermiso.MaxIdPermisoRol", query = "SELECT max(p.iDRolePersmiso) FROM PRARolesPermiso p"),
    @NamedQuery(name = "PRARolesPermiso.findByIDRol", query = "SELECT p FROM PRARolesPermiso p WHERE p.iDRol = :iDRol"),
    @NamedQuery(name = "PRARolesPermiso.findByRol&Pantalla", query = "SELECT p FROM PRARolesPermiso p WHERE p.iDRol = :iDRol and p.iDPantallas = :iDPantallas"),
    @NamedQuery(name = "PRARolesPermiso.findByIDPantallas", query = "SELECT p FROM PRARolesPermiso p WHERE p.iDPantallas = :iDPantallas")})
public class PRARolesPermiso implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_Role_Persmiso", unique=true, nullable = false)
    private Integer iDRolePersmiso;
    @Column(name = "ID_Rol")
    private Integer iDRol;
    @Column(name = "ID_Pantallas")
    private Integer iDPantallas;


    public PRARolesPermiso() {
    }

    public PRARolesPermiso(Integer iDRolePersmiso) {
        this.iDRolePersmiso = iDRolePersmiso;
    }

    public Integer getIDRolePersmiso() {
        return iDRolePersmiso;
    }

    public void setIDRolePersmiso(Integer iDRolePersmiso) {
        this.iDRolePersmiso = iDRolePersmiso;
    }

    public Integer getIDRol() {
        return iDRol;
    }

    public void setIDRol(Integer iDRol) {
        this.iDRol = iDRol;
    }

    public Integer getIDPantallas() {
        return iDPantallas;
    }

    public void setIDPantallas(Integer iDPantallas) {
        this.iDPantallas = iDPantallas;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDRolePersmiso != null ? iDRolePersmiso.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PRARolesPermiso)) {
            return false;
        }
        PRARolesPermiso other = (PRARolesPermiso) object;
        if ((this.iDRolePersmiso == null && other.iDRolePersmiso != null) || (this.iDRolePersmiso != null && !this.iDRolePersmiso.equals(other.iDRolePersmiso))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pra.dbcom.PRARolesPermiso[ iDRolePersmiso=" + iDRolePersmiso + " ]";
    }
    
}
