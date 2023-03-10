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
@Table(name = "PRA_Categorias_Productos_MAG")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PRACategoriasProductosMAG.findAll", query = "SELECT p FROM PRACategoriasProductosMAG p"),
    @NamedQuery(name = "PRACategoriasProductosMAG.findByIDCategoria", query = "SELECT p FROM PRACategoriasProductosMAG p WHERE p.iDCategoria = :iDCategoria"),
    @NamedQuery(name = "PRACategoriasProductosMAG.findByNombre", query = "SELECT p FROM PRACategoriasProductosMAG p WHERE p.nombre = :nombre"),
    @NamedQuery(name = "PRACategoriasProductosMAG.findByIdMag", query = "SELECT p FROM PRACategoriasProductosMAG p WHERE p.idMag = :idMag"),
    @NamedQuery(name = "PRACategoriasProductosMAG.findByCodDivision", query = "SELECT p FROM PRACategoriasProductosMAG p WHERE p.codDivision = :codDivision")})
public class PRACategoriasProductosMAG implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_Categoria")
    private Integer iDCategoria;
    @Size(max = 50)
    @Column(name = "Nombre")
    private String nombre;
    @Size(max = 50)
    @Column(name = "ID_MAG")
    private String idMag;
    @Column(name = "Cod_Division")
    private Integer codDivision;

    public PRACategoriasProductosMAG() {
    }

    public PRACategoriasProductosMAG(Integer iDCategoria) {
        this.iDCategoria = iDCategoria;
    }

    public Integer getIDCategoria() {
        return iDCategoria;
    }

    public void setIDCategoria(Integer iDCategoria) {
        this.iDCategoria = iDCategoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdMag() {
        return idMag;
    }

    public void setIdMag(String idMag) {
        this.idMag = idMag;
    }

    public Integer getCodDivision() {
        return codDivision;
    }

    public void setCodDivision(Integer codDivision) {
        this.codDivision = codDivision;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDCategoria != null ? iDCategoria.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PRACategoriasProductosMAG)) {
            return false;
        }
        PRACategoriasProductosMAG other = (PRACategoriasProductosMAG) object;
        if ((this.iDCategoria == null && other.iDCategoria != null) || (this.iDCategoria != null && !this.iDCategoria.equals(other.iDCategoria))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pra.dbcom.PRACategoriasProductosMAG[ iDCategoria=" + iDCategoria + " ]";
    }
    
}
