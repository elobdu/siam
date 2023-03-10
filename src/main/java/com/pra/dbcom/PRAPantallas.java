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
@Table(name = "PRA_Pantallas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PRAPantallas.findAll", query = "SELECT p FROM PRAPantallas p"),
    @NamedQuery(name = "PRAPantallas.findByIDPantalla", query = "SELECT p FROM PRAPantallas p WHERE p.iDPantalla = :iDPantalla"),
    @NamedQuery(name = "PRAPantallas.findByTitulo", query = "SELECT p FROM PRAPantallas p WHERE p.titulo = :titulo")})
public class PRAPantallas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_Pantalla")
    private Integer iDPantalla;

    @Column(name = "Titulo")
    private String titulo;

    @Column(name = "enlaces")
    private String enlaces;

    public PRAPantallas() {
    }

    public PRAPantallas(Integer iDPantalla) {
        this.iDPantalla = iDPantalla;
    }

    public Integer getIDPantalla() {
        return iDPantalla;
    }

    public void setIDPantalla(Integer iDPantalla) {
        this.iDPantalla = iDPantalla;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEnlaces() {
        return enlaces;
    }

    public void setEnlaces(String enlaces) {
        this.enlaces = enlaces;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDPantalla != null ? iDPantalla.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PRAPantallas)) {
            return false;
        }
        PRAPantallas other = (PRAPantallas) object;
        if ((this.iDPantalla == null && other.iDPantalla != null) || (this.iDPantalla != null && !this.iDPantalla.equals(other.iDPantalla))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pra.dbcom.PRAPantallas[ iDPantalla=" + iDPantalla + " ]";
    }
    
}
