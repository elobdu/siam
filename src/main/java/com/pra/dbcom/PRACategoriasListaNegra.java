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
@Table(name = "PRA_Categorias_Lista_Negra")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PRACategoriasListaNegra.findAll", query = "SELECT p FROM PRACategoriasListaNegra p"),
    @NamedQuery(name = "PRACategoriasListaNegra.findByIDCategoriasListaNegra", query = "SELECT p FROM PRACategoriasListaNegra p WHERE p.iDCategoriasListaNegra = :iDCategoriasListaNegra"),
    @NamedQuery(name = "PRACategoriasListaNegra.findByCategoria", query = "SELECT p FROM PRACategoriasListaNegra p WHERE p.categoria = :categoria"),
    @NamedQuery(name = "PRACategoriasListaNegra.findByActivo", query = "SELECT p FROM PRACategoriasListaNegra p WHERE p.activo = :activo"),
    @NamedQuery(name = "PRACategoriasListaNegra.findByFechaCreado", query = "SELECT p FROM PRACategoriasListaNegra p WHERE p.fechaCreado = :fechaCreado")})
public class PRACategoriasListaNegra implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_Categorias_Lista_Negra")
    private Long iDCategoriasListaNegra;
    @Size(max = 100)
    @Column(name = "Categoria")
    private String categoria;
    @Column(name = "Activo")
    private Integer activo;
    @Column(name = "Fecha_Creado")
    @Temporal(TemporalType.DATE)
    private Date fechaCreado;

    public PRACategoriasListaNegra() {
    }

    public PRACategoriasListaNegra(Long iDCategoriasListaNegra) {
        this.iDCategoriasListaNegra = iDCategoriasListaNegra;
    }

    public Long getIDCategoriasListaNegra() {
        return iDCategoriasListaNegra;
    }

    public void setIDCategoriasListaNegra(Long iDCategoriasListaNegra) {
        this.iDCategoriasListaNegra = iDCategoriasListaNegra;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
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
        hash += (iDCategoriasListaNegra != null ? iDCategoriasListaNegra.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PRACategoriasListaNegra)) {
            return false;
        }
        PRACategoriasListaNegra other = (PRACategoriasListaNegra) object;
        if ((this.iDCategoriasListaNegra == null && other.iDCategoriasListaNegra != null) || (this.iDCategoriasListaNegra != null && !this.iDCategoriasListaNegra.equals(other.iDCategoriasListaNegra))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pra.dbcom.PRACategoriasListaNegra[ iDCategoriasListaNegra=" + iDCategoriasListaNegra + " ]";
    }
    
}
