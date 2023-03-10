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
@Table(name = "PRA_Mercados")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PRAMercados.findAll", query = "SELECT p FROM PRAMercados p"),
    @NamedQuery(name = "PRAMercados.findByIDMercado", query = "SELECT p FROM PRAMercados p WHERE p.iDMercado = :iDMercado"),
    @NamedQuery(name = "PRAMercados.findByNombreMercado", query = "SELECT p FROM PRAMercados p WHERE p.nombreMercado = :nombreMercado"),
    @NamedQuery(name = "PRAMercados.findByIDSistemaMAG", query = "SELECT p FROM PRAMercados p WHERE p.iDSistemaMAG = :iDSistemaMAG"),
    @NamedQuery(name = "PRAMercados.findByActivo", query = "SELECT p FROM PRAMercados p WHERE p.activo = :activo"),
    @NamedQuery(name = "PRAMercados.findByFechaCreado", query = "SELECT p FROM PRAMercados p WHERE p.fechaCreado = :fechaCreado")})
public class PRAMercados implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_Mercado")
    private Long iDMercado;
    @Size(max = 50)
    @Column(name = "Nombre_Mercado")
    private String nombreMercado;
    @Column(name = "ID_Sistema_MAG")
    private Long iDSistemaMAG;
    @Column(name = "Activo")
    private Integer activo;
    @Column(name = "Fecha_Creado")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreado;

    public PRAMercados() {
    }

    public PRAMercados(Long iDMercado) {
        this.iDMercado = iDMercado;
    }

    public Long getIDMercado() {
        return iDMercado;
    }

    public void setIDMercado(Long iDMercado) {
        this.iDMercado = iDMercado;
    }

    public String getNombreMercado() {
        return nombreMercado;
    }

    public void setNombreMercado(String nombreMercado) {
        this.nombreMercado = nombreMercado;
    }

    public Long getIDSistemaMAG() {
        return iDSistemaMAG;
    }

    public void setIDSistemaMAG(Long iDSistemaMAG) {
        this.iDSistemaMAG = iDSistemaMAG;
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
        hash += (iDMercado != null ? iDMercado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PRAMercados)) {
            return false;
        }
        PRAMercados other = (PRAMercados) object;
        if ((this.iDMercado == null && other.iDMercado != null) || (this.iDMercado != null && !this.iDMercado.equals(other.iDMercado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pra.dbcom.PRAMercados[ iDMercado=" + iDMercado + " ]";
    }
    
}
