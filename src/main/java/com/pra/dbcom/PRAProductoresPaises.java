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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author obper
 */
@Entity
@Table(name = "PRA_Productores_Paises")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PRAProductoresPaises.findAll", query = "SELECT p FROM PRAProductoresPaises p"),
    @NamedQuery(name = "PRAProductoresPaises.findByIDProductoresPais", query = "SELECT p FROM PRAProductoresPaises p WHERE p.iDProductoresPais = :iDProductoresPais"),
    @NamedQuery(name = "PRAProductoresPaises.findByIDProductores", query = "SELECT p FROM PRAProductoresPaises p WHERE p.iDProductores = :iDProductores"),
    @NamedQuery(name = "PRAProductoresPaises.findByCODPais", query = "SELECT p FROM PRAProductoresPaises p WHERE p.cODPais = :cODPais"),
    @NamedQuery(name = "PRAProductoresPaises.findByActivo", query = "SELECT p FROM PRAProductoresPaises p WHERE p.activo = :activo"),
    @NamedQuery(name = "PRAProductoresPaises.findByFechaCreador", query = "SELECT p FROM PRAProductoresPaises p WHERE p.fechaCreador = :fechaCreador")})
public class PRAProductoresPaises implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_Productores_Pais")
    private Long iDProductoresPais;
    @Column(name = "ID_Productores")
    private Long iDProductores;
    @Column(name = "COD_Pais")
    private Integer cODPais;
    @Column(name = "Activo")
    private Integer activo;
    @Column(name = "Fecha_Creador")
    @Temporal(TemporalType.DATE)
    private Date fechaCreador;

    public PRAProductoresPaises() {
    }

    public PRAProductoresPaises(Long iDProductoresPais) {
        this.iDProductoresPais = iDProductoresPais;
    }

    public Long getIDProductoresPais() {
        return iDProductoresPais;
    }

    public void setIDProductoresPais(Long iDProductoresPais) {
        this.iDProductoresPais = iDProductoresPais;
    }

    public Long getIDProductores() {
        return iDProductores;
    }

    public void setIDProductores(Long iDProductores) {
        this.iDProductores = iDProductores;
    }

    public Integer getCODPais() {
        return cODPais;
    }

    public void setCODPais(Integer cODPais) {
        this.cODPais = cODPais;
    }

    public Integer getActivo() {
        return activo;
    }

    public void setActivo(Integer activo) {
        this.activo = activo;
    }

    public Date getFechaCreador() {
        return fechaCreador;
    }

    public void setFechaCreador(Date fechaCreador) {
        this.fechaCreador = fechaCreador;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDProductoresPais != null ? iDProductoresPais.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PRAProductoresPaises)) {
            return false;
        }
        PRAProductoresPaises other = (PRAProductoresPaises) object;
        if ((this.iDProductoresPais == null && other.iDProductoresPais != null) || (this.iDProductoresPais != null && !this.iDProductoresPais.equals(other.iDProductoresPais))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pra.dbcom.PRAProductoresPaises[ iDProductoresPais=" + iDProductoresPais + " ]";
    }
    
}
