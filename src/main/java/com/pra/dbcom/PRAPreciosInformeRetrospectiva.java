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
import javax.persistence.Lob;
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
@Table(name = "PRA_Precios_Informe_Retrospectiva")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PRAPreciosInformeRetrospectiva.findAll", query = "SELECT p FROM PRAPreciosInformeRetrospectiva p"),
    @NamedQuery(name = "PRAPreciosInformeRetrospectiva.findByIDPrecioInformeRetrospectiva", query = "SELECT p FROM PRAPreciosInformeRetrospectiva p WHERE p.iDPrecioInformeRetrospectiva = :iDPrecioInformeRetrospectiva"),
    @NamedQuery(name = "PRAPreciosInformeRetrospectiva.findByTitulo", query = "SELECT p FROM PRAPreciosInformeRetrospectiva p WHERE p.titulo = :titulo"),
    @NamedQuery(name = "PRAPreciosInformeRetrospectiva.findByDescripcion", query = "SELECT p FROM PRAPreciosInformeRetrospectiva p WHERE p.descripcion = :descripcion"),
    @NamedQuery(name = "PRAPreciosInformeRetrospectiva.findByIDTipoPrecio", query = "SELECT p FROM PRAPreciosInformeRetrospectiva p WHERE p.iDTipoPrecio = :iDTipoPrecio"),
    @NamedQuery(name = "PRAPreciosInformeRetrospectiva.findByActivo", query = "SELECT p FROM PRAPreciosInformeRetrospectiva p WHERE p.activo = :activo"),
    @NamedQuery(name = "PRAPreciosInformeRetrospectiva.findByFechaCreado", query = "SELECT p FROM PRAPreciosInformeRetrospectiva p WHERE p.fechaCreado = :fechaCreado")})
public class PRAPreciosInformeRetrospectiva implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_Precio_Informe_Retrospectiva")
    private Long iDPrecioInformeRetrospectiva;
    @Size(max = 150)
    @Column(name = "Titulo")
    private String titulo;
    @Size(max = 150)
    @Column(name = "Descripcion")
    private String descripcion;
    @Lob
    @Column(name = "Documento")
    private byte[] documento;
    @Column(name = "ID_Tipo_Precio")
    private Integer iDTipoPrecio;
    @Column(name = "Activo")
    private Integer activo;
    @Column(name = "Fecha_Creado")
    @Temporal(TemporalType.DATE)
    private Date fechaCreado;

    public PRAPreciosInformeRetrospectiva() {
    }

    public PRAPreciosInformeRetrospectiva(Long iDPrecioInformeRetrospectiva) {
        this.iDPrecioInformeRetrospectiva = iDPrecioInformeRetrospectiva;
    }

    public Long getIDPrecioInformeRetrospectiva() {
        return iDPrecioInformeRetrospectiva;
    }

    public void setIDPrecioInformeRetrospectiva(Long iDPrecioInformeRetrospectiva) {
        this.iDPrecioInformeRetrospectiva = iDPrecioInformeRetrospectiva;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public byte[] getDocumento() {
        return documento;
    }

    public void setDocumento(byte[] documento) {
        this.documento = documento;
    }

    public Integer getIDTipoPrecio() {
        return iDTipoPrecio;
    }

    public void setIDTipoPrecio(Integer iDTipoPrecio) {
        this.iDTipoPrecio = iDTipoPrecio;
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
        hash += (iDPrecioInformeRetrospectiva != null ? iDPrecioInformeRetrospectiva.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PRAPreciosInformeRetrospectiva)) {
            return false;
        }
        PRAPreciosInformeRetrospectiva other = (PRAPreciosInformeRetrospectiva) object;
        if ((this.iDPrecioInformeRetrospectiva == null && other.iDPrecioInformeRetrospectiva != null) || (this.iDPrecioInformeRetrospectiva != null && !this.iDPrecioInformeRetrospectiva.equals(other.iDPrecioInformeRetrospectiva))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pra.dbcom.PRAPreciosInformeRetrospectiva[ iDPrecioInformeRetrospectiva=" + iDPrecioInformeRetrospectiva + " ]";
    }
    
}
