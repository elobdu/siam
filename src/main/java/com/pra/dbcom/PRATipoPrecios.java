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
@Table(name = "PRA_Tipo_Precios")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PRATipoPrecios.findAll", query = "SELECT p FROM PRATipoPrecios p"),
    @NamedQuery(name = "PRATipoPrecios.findByIDTipoPrecio", query = "SELECT p FROM PRATipoPrecios p WHERE p.iDTipoPrecio = :iDTipoPrecio"),
    @NamedQuery(name = "PRATipoPrecios.findByNombre", query = "SELECT p FROM PRATipoPrecios p WHERE p.nombre = :nombre"),
    @NamedQuery(name = "PRATipoPrecios.findByActivo", query = "SELECT p FROM PRATipoPrecios p WHERE p.activo = :activo"),
    @NamedQuery(name = "PRATipoPrecios.findByFechaCreado", query = "SELECT p FROM PRATipoPrecios p WHERE p.fechaCreado = :fechaCreado")})
public class PRATipoPrecios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_Tipo_Precio")
    private Integer iDTipoPrecio;
    @Size(max = 100)
    @Column(name = "Nombre")
    private String nombre;
    @Column(name = "Activo")
    private Integer activo;
    @Column(name = "Fecha_Creado")
    @Temporal(TemporalType.DATE)
    private Date fechaCreado;

    public PRATipoPrecios() {
    }

    public PRATipoPrecios(Integer iDTipoPrecio) {
        this.iDTipoPrecio = iDTipoPrecio;
    }

    public Integer getIDTipoPrecio() {
        return iDTipoPrecio;
    }

    public void setIDTipoPrecio(Integer iDTipoPrecio) {
        this.iDTipoPrecio = iDTipoPrecio;
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
        hash += (iDTipoPrecio != null ? iDTipoPrecio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PRATipoPrecios)) {
            return false;
        }
        PRATipoPrecios other = (PRATipoPrecios) object;
        if ((this.iDTipoPrecio == null && other.iDTipoPrecio != null) || (this.iDTipoPrecio != null && !this.iDTipoPrecio.equals(other.iDTipoPrecio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pra.dbcom.PRATipoPrecios[ iDTipoPrecio=" + iDTipoPrecio + " ]";
    }
    
}
