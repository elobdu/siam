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
@Table(name = "PRA_Contactos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PRAContactos.findAll", query = "SELECT p FROM PRAContactos p"),
    @NamedQuery(name = "PRAContactos.findByIDContacto", query = "SELECT p FROM PRAContactos p WHERE p.iDContacto = :iDContacto"),
    @NamedQuery(name = "PRAContactos.findByNumero", query = "SELECT p FROM PRAContactos p WHERE p.numero = :numero"),
    @NamedQuery(name = "PRAContactos.findByCorreo", query = "SELECT p FROM PRAContactos p WHERE p.correo = :correo"),
    @NamedQuery(name = "PRAContactos.findByIDTipoContacto", query = "SELECT p FROM PRAContactos p WHERE p.iDTipoContacto = :iDTipoContacto"),
    @NamedQuery(name = "PRAContactos.findByActivo", query = "SELECT p FROM PRAContactos p WHERE p.activo = :activo"),
    @NamedQuery(name = "PRAContactos.findByFechaCreado", query = "SELECT p FROM PRAContactos p WHERE p.fechaCreado = :fechaCreado")})
public class PRAContactos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_Contacto")
    private Integer iDContacto;
    @Size(max = 50)
    @Column(name = "Numero")
    private String numero;
    @Size(max = 100)
    @Column(name = "Correo")
    private String correo;
    @Column(name = "ID_Tipo_Contacto")
    private Integer iDTipoContacto;
    @Column(name = "Activo")
    private Integer activo;
    @Column(name = "Fecha_Creado")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreado;

    public PRAContactos() {
    }

    public PRAContactos(Integer iDContacto) {
        this.iDContacto = iDContacto;
    }

    public Integer getIDContacto() {
        return iDContacto;
    }

    public void setIDContacto(Integer iDContacto) {
        this.iDContacto = iDContacto;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Integer getIDTipoContacto() {
        return iDTipoContacto;
    }

    public void setIDTipoContacto(Integer iDTipoContacto) {
        this.iDTipoContacto = iDTipoContacto;
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
        hash += (iDContacto != null ? iDContacto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PRAContactos)) {
            return false;
        }
        PRAContactos other = (PRAContactos) object;
        if ((this.iDContacto == null && other.iDContacto != null) || (this.iDContacto != null && !this.iDContacto.equals(other.iDContacto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pra.dbcom.PRAContactos[ iDContacto=" + iDContacto + " ]";
    }
    
}
