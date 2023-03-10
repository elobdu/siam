/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pra.dbcom;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author obper
 */
@Entity
@Table(name = "PRA_Mercados_MAG")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PRAMercadosMAG.findAll", query = "SELECT p FROM PRAMercadosMAG p"),
    @NamedQuery(name = "PRAMercadosMAG.findByIDMercado", query = "SELECT p FROM PRAMercadosMAG p WHERE p.iDMercado = :iDMercado"),
    @NamedQuery(name = "PRAMercadosMAG.findByNombreMercado", query = "SELECT p FROM PRAMercadosMAG p WHERE p.nombreMercado = :nombreMercado"),
    @NamedQuery(name = "PRAMercadosMAG.findByNombreMAG", query = "SELECT p FROM PRAMercadosMAG p WHERE p.nombreMAG = :nombreMAG"),
    @NamedQuery(name = "PRAMercadosMAG.findByActivo", query = "SELECT p FROM PRAMercadosMAG p WHERE p.activo = :activo")})
public class PRAMercadosMAG implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_Mercado")
    private Integer iDMercado;
    @Size(max = 150)
    @Column(name = "Nombre_Mercado")
    private String nombreMercado;
    @Size(max = 150)
    @Column(name = "Nombre_MAG")
    private String nombreMAG;
    @Column(name = "Activo")
    private Integer activo;

    public PRAMercadosMAG() {
    }

    public PRAMercadosMAG(Integer iDMercado) {
        this.iDMercado = iDMercado;
    }

    public Integer getIDMercado() {
        return iDMercado;
    }

    public void setIDMercado(Integer iDMercado) {
        this.iDMercado = iDMercado;
    }

    public String getNombreMercado() {
        return nombreMercado;
    }

    public void setNombreMercado(String nombreMercado) {
        this.nombreMercado = nombreMercado;
    }

    public String getNombreMAG() {
        return nombreMAG;
    }

    public void setNombreMAG(String nombreMAG) {
        this.nombreMAG = nombreMAG;
    }

    public Integer getActivo() {
        return activo;
    }

    public void setActivo(Integer activo) {
        this.activo = activo;
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
        if (!(object instanceof PRAMercadosMAG)) {
            return false;
        }
        PRAMercadosMAG other = (PRAMercadosMAG) object;
        if ((this.iDMercado == null && other.iDMercado != null) || (this.iDMercado != null && !this.iDMercado.equals(other.iDMercado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pra.dbcom.PRAMercadosMAG[ iDMercado=" + iDMercado + " ]";
    }
    
}
