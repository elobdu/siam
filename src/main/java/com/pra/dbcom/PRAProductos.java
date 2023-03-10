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
@Table(name = "PRA_Productos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PRAProductos.findAll", query = "SELECT p FROM PRAProductos p"),
    @NamedQuery(name = "PRAProductos.findByIDProducto", query = "SELECT p FROM PRAProductos p WHERE p.iDProducto = :iDProducto"),
    @NamedQuery(name = "PRAProductos.findByNombre", query = "SELECT p FROM PRAProductos p WHERE p.nombre = :nombre"),
    @NamedQuery(name = "PRAProductos.findByActivo", query = "SELECT p FROM PRAProductos p WHERE p.activo = :activo"),
    @NamedQuery(name = "PRAProductos.findByFechaCreado", query = "SELECT p FROM PRAProductos p WHERE p.fechaCreado = :fechaCreado"),
    @NamedQuery(name = "PRAProductos.findByCategoria", query = "SELECT p FROM PRAProductos p WHERE p.categoria = :categoria"),
    @NamedQuery(name = "PRAProductos.findByIDCategoria", query = "SELECT p FROM PRAProductos p WHERE p.iDCategoria = :iDCategoria")})
public class PRAProductos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_Producto")
    private Long iDProducto;
    @Size(max = 50)
    @Column(name = "Nombre")
    private String nombre;
    @Column(name = "Activo")
    private Integer activo;
    @Column(name = "Fecha_Creado")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreado;
    @Size(max = 50)
    @Column(name = "Categoria")
    private String categoria;
    @Column(name = "ID_Categoria")
    private Integer iDCategoria;

    public PRAProductos() {
    }

    public PRAProductos(Long iDProducto) {
        this.iDProducto = iDProducto;
    }

    public Long getIDProducto() {
        return iDProducto;
    }

    public void setIDProducto(Long iDProducto) {
        this.iDProducto = iDProducto;
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

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Integer getIDCategoria() {
        return iDCategoria;
    }

    public void setIDCategoria(Integer iDCategoria) {
        this.iDCategoria = iDCategoria;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDProducto != null ? iDProducto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PRAProductos)) {
            return false;
        }
        PRAProductos other = (PRAProductos) object;
        if ((this.iDProducto == null && other.iDProducto != null) || (this.iDProducto != null && !this.iDProducto.equals(other.iDProducto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pra.dbcom.PRAProductos[ iDProducto=" + iDProducto + " ]";
    }
    
}
