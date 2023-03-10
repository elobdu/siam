/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pra.dbcom;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author obper
 */
@Entity
@Table(name = "PRA_Roles")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PRARoles.findAll", query = "SELECT p FROM PRARoles p"),
    @NamedQuery(name = "PRARoles.findByIDRol", query = "SELECT p FROM PRARoles p WHERE p.iDRol = :iDRol"),
    @NamedQuery(name = "PRARoles.findByNombre", query = "SELECT p FROM PRARoles p WHERE p.nombre = :nombre"),
    @NamedQuery(name = "PRARoles.MaxIdRol", query = "SELECT max(p.iDRol) FROM PRARoles p"),
    @NamedQuery(name = "PRARoles.findByFechaCreado", query = "SELECT p FROM PRARoles p WHERE p.fechaCreado = :fechaCreado")})
public class PRARoles implements Serializable {



    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Rol" , unique=true, nullable = false)
    private Integer iDRol;
    @Size(max = 100)
    @Column(name = "Nombre")
    private String nombre;
    @Column(name = "Fecha_Creado")
    @Temporal(TemporalType.DATE)
    private Date fechaCreado;

    public PRARoles() {
    }

    public PRARoles(Integer iDRol) {
        this.iDRol = iDRol;
    }

    public Integer getIDRol() {
        return iDRol;
    }

    public void setIDRol(Integer iDRol) {
        this.iDRol = iDRol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaCreado() {
        return fechaCreado;
    }

    public void setFechaCreado(Date fechaCreado) {
        this.fechaCreado = fechaCreado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDRol != null ? iDRol.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PRARoles)) {
            return false;
        }
        PRARoles other = (PRARoles) object;
        if ((this.iDRol == null && other.iDRol != null) || (this.iDRol != null && !this.iDRol.equals(other.iDRol))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pra.dbcom.PRARoles[ iDRol=" + iDRol + " ]";
    }
    
}
