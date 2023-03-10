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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "PRA_Productores_Detalle_Productos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PRAProductoresDetalleProductos.findAll", query = "SELECT p FROM PRAProductoresDetalleProductos p"),
    @NamedQuery(name = "PRAProductoresDetalleProductos.findByIDProductoresDetalleProductos", query = "SELECT p FROM PRAProductoresDetalleProductos p WHERE p.iDProductoresDetalleProductos = :iDProductoresDetalleProductos"),
    @NamedQuery(name = "PRAProductoresDetalleProductos.findByIDProducto", query = "SELECT p FROM PRAProductoresDetalleProductos p WHERE p.iDProducto = :iDProducto"),
    @NamedQuery(name = "PRAProductoresDetalleProductos.findByProduccionCantidad", query = "SELECT p FROM PRAProductoresDetalleProductos p WHERE p.produccionCantidad = :produccionCantidad"),
    @NamedQuery(name = "PRAProductoresDetalleProductos.findByProduccionPeso", query = "SELECT p FROM PRAProductoresDetalleProductos p WHERE p.produccionPeso = :produccionPeso"),
    @NamedQuery(name = "PRAProductoresDetalleProductos.findByActivo", query = "SELECT p FROM PRAProductoresDetalleProductos p WHERE p.activo = :activo"),
    @NamedQuery(name = "PRAProductoresDetalleProductos.findByFechaCreado", query = "SELECT p FROM PRAProductoresDetalleProductos p WHERE p.fechaCreado = :fechaCreado"),
    @NamedQuery(name = "PRAProductoresDetalleProductos.findByCategoria", query = "SELECT p FROM PRAProductoresDetalleProductos p WHERE p.categoria = :categoria")})
public class PRAProductoresDetalleProductos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_Productores_Detalle_Productos")
    private Long iDProductoresDetalleProductos;
    @Column(name = "ID_Producto")
    private Long iDProducto;
    @Column(name = "Produccion_Cantidad")
    private Integer produccionCantidad;
    @Size(max = 50)
    @Column(name = "Produccion_Peso")
    private String produccionPeso;
    @Column(name = "Activo")
    private Integer activo;
    @Column(name = "Fecha_Creado")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreado;
    @Size(max = 50)
    @Column(name = "Categoria")
    private String categoria;
    @JoinColumn(name = "ID_Productores", referencedColumnName = "ID_Productores")
    @ManyToOne
    private PRAProductores iDProductores;

    public PRAProductoresDetalleProductos() {
    }

    public PRAProductoresDetalleProductos(Long iDProductoresDetalleProductos) {
        this.iDProductoresDetalleProductos = iDProductoresDetalleProductos;
    }

    public Long getIDProductoresDetalleProductos() {
        return iDProductoresDetalleProductos;
    }

    public void setIDProductoresDetalleProductos(Long iDProductoresDetalleProductos) {
        this.iDProductoresDetalleProductos = iDProductoresDetalleProductos;
    }

    public Long getIDProducto() {
        return iDProducto;
    }

    public void setIDProducto(Long iDProducto) {
        this.iDProducto = iDProducto;
    }

    public Integer getProduccionCantidad() {
        return produccionCantidad;
    }

    public void setProduccionCantidad(Integer produccionCantidad) {
        this.produccionCantidad = produccionCantidad;
    }

    public String getProduccionPeso() {
        return produccionPeso;
    }

    public void setProduccionPeso(String produccionPeso) {
        this.produccionPeso = produccionPeso;
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

    public PRAProductores getIDProductores() {
        return iDProductores;
    }

    public void setIDProductores(PRAProductores iDProductores) {
        this.iDProductores = iDProductores;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDProductoresDetalleProductos != null ? iDProductoresDetalleProductos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PRAProductoresDetalleProductos)) {
            return false;
        }
        PRAProductoresDetalleProductos other = (PRAProductoresDetalleProductos) object;
        if ((this.iDProductoresDetalleProductos == null && other.iDProductoresDetalleProductos != null) || (this.iDProductoresDetalleProductos != null && !this.iDProductoresDetalleProductos.equals(other.iDProductoresDetalleProductos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pra.dbcom.PRAProductoresDetalleProductos[ iDProductoresDetalleProductos=" + iDProductoresDetalleProductos + " ]";
    }
    
}
