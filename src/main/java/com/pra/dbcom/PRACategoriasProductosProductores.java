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
@Table(name = "PRA_Categorias_Productos_Productores")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PRACategoriasProductosProductores.findAll", query = "SELECT p FROM PRACategoriasProductosProductores p"),
    @NamedQuery(name = "PRACategoriasProductosProductores.findByIDCategoria", query = "SELECT p FROM PRACategoriasProductosProductores p WHERE p.iDCategoria = :iDCategoria"),
    @NamedQuery(name = "PRACategoriasProductosProductores.findByNombre", query = "SELECT p FROM PRACategoriasProductosProductores p WHERE p.nombre = :nombre")})
public class PRACategoriasProductosProductores implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_Categoria")
    private Integer iDCategoria;
    @Size(max = 150)
    @Column(name = "Nombre")
    private String nombre;

    public PRACategoriasProductosProductores() {
    }

    public PRACategoriasProductosProductores(Integer iDCategoria) {
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDCategoria != null ? iDCategoria.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PRACategoriasProductosProductores)) {
            return false;
        }
        PRACategoriasProductosProductores other = (PRACategoriasProductosProductores) object;
        if ((this.iDCategoria == null && other.iDCategoria != null) || (this.iDCategoria != null && !this.iDCategoria.equals(other.iDCategoria))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pra.dbcom.PRACategoriasProductosProductores[ iDCategoria=" + iDCategoria + " ]";
    }
    
}
