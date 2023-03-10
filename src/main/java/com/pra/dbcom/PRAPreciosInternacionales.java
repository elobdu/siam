/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pra.dbcom;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "PRA_Precios_Internacionales")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PRAPreciosInternacionales.findAll", query = "SELECT p FROM PRAPreciosInternacionales p"),
    @NamedQuery(name = "PRAPreciosInternacionales.findByIDPrecioInternacional", query = "SELECT p FROM PRAPreciosInternacionales p WHERE p.iDPrecioInternacional = :iDPrecioInternacional"),
    @NamedQuery(name = "PRAPreciosInternacionales.findByProducto", query = "SELECT p FROM PRAPreciosInternacionales p WHERE p.producto = :producto"),
    @NamedQuery(name = "PRAPreciosInternacionales.findByUnidad", query = "SELECT p FROM PRAPreciosInternacionales p WHERE p.unidad = :unidad"),
    @NamedQuery(name = "PRAPreciosInternacionales.findByPrecio", query = "SELECT p FROM PRAPreciosInternacionales p WHERE p.precio = :precio"),
    @NamedQuery(name = "PRAPreciosInternacionales.findByHastaLaFecha", query = "SELECT p FROM PRAPreciosInternacionales p WHERE p.hastaLaFecha = :hastaLaFecha"),
    @NamedQuery(name = "PRAPreciosInternacionales.findByActivo", query = "SELECT p FROM PRAPreciosInternacionales p WHERE p.activo = :activo"),
    @NamedQuery(name = "PRAPreciosInternacionales.findByFechaCreado", query = "SELECT p FROM PRAPreciosInternacionales p WHERE p.fechaCreado = :fechaCreado")})
public class PRAPreciosInternacionales implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_Precio_Internacional")
    private Long iDPrecioInternacional;
    @Size(max = 150)
    @Column(name = "Producto")
    private String producto;
    @Size(max = 150)
    @Column(name = "Unidad")
    private String unidad;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "Precio")
    private BigDecimal precio;
    @Column(name = "Hasta_La_Fecha")
    @Temporal(TemporalType.DATE)
    private Date hastaLaFecha;
    @Column(name = "Activo")
    private Integer activo;
    @Column(name = "Fecha_Creado")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreado;

    public PRAPreciosInternacionales() {
    }

    public PRAPreciosInternacionales(Long iDPrecioInternacional) {
        this.iDPrecioInternacional = iDPrecioInternacional;
    }

    public Long getIDPrecioInternacional() {
        return iDPrecioInternacional;
    }

    public void setIDPrecioInternacional(Long iDPrecioInternacional) {
        this.iDPrecioInternacional = iDPrecioInternacional;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public Date getHastaLaFecha() {
        return hastaLaFecha;
    }

    public void setHastaLaFecha(Date hastaLaFecha) {
        this.hastaLaFecha = hastaLaFecha;
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
        hash += (iDPrecioInternacional != null ? iDPrecioInternacional.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PRAPreciosInternacionales)) {
            return false;
        }
        PRAPreciosInternacionales other = (PRAPreciosInternacionales) object;
        if ((this.iDPrecioInternacional == null && other.iDPrecioInternacional != null) || (this.iDPrecioInternacional != null && !this.iDPrecioInternacional.equals(other.iDPrecioInternacional))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pra.dbcom.PRAPreciosInternacionales[ iDPrecioInternacional=" + iDPrecioInternacional + " ]";
    }
    
}
