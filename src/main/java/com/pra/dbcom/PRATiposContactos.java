/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pra.dbcom;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author obper
 */
@Entity
@Table(name = "PRA_Tipos_Contactos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PRATiposContactos.findAll", query = "SELECT p FROM PRATiposContactos p"),
    @NamedQuery(name = "PRATiposContactos.findByIDTipoContacto", query = "SELECT p FROM PRATiposContactos p WHERE p.iDTipoContacto = :iDTipoContacto"),
    @NamedQuery(name = "PRATiposContactos.findByNombre", query = "SELECT p FROM PRATiposContactos p WHERE p.nombre = :nombre"),
    @NamedQuery(name = "PRATiposContactos.findByActivo", query = "SELECT p FROM PRATiposContactos p WHERE p.activo = :activo"),
    @NamedQuery(name = "PRATiposContactos.findByFechaCreado", query = "SELECT p FROM PRATiposContactos p WHERE p.fechaCreado = :fechaCreado")})
public class PRATiposContactos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_Tipo_Contacto")
    private Integer iDTipoContacto;
    @Size(max = 50)
    @Column(name = "Nombre")
    private String nombre;
    @Column(name = "Activo")
    private Integer activo;
    @Column(name = "Fecha_Creado")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreado;

    public PRATiposContactos() {
    }

    public PRATiposContactos(Integer iDTipoContacto) {
        this.iDTipoContacto = iDTipoContacto;
    }

    public Integer getIDTipoContacto() {
        return iDTipoContacto;
    }

    public void setIDTipoContacto(Integer iDTipoContacto) {
        this.iDTipoContacto = iDTipoContacto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getActivo() {
        return activo;
    }

    public void setActivo(Integer activo) {
        this.activo = activo;
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
        hash += (iDTipoContacto != null ? iDTipoContacto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PRATiposContactos)) {
            return false;
        }
        PRATiposContactos other = (PRATiposContactos) object;
        if ((this.iDTipoContacto == null && other.iDTipoContacto != null) || (this.iDTipoContacto != null && !this.iDTipoContacto.equals(other.iDTipoContacto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pra.dbcom.PRATiposContactos[ iDTipoContacto=" + iDTipoContacto + " ]";
    }
    
}
