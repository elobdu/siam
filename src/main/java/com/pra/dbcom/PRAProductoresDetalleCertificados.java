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
@Table(name = "PRA_Productores_Detalle_Certificados")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PRAProductoresDetalleCertificados.findAll", query = "SELECT p FROM PRAProductoresDetalleCertificados p"),
    @NamedQuery(name = "PRAProductoresDetalleCertificados.findByIDProductoresDetalleCertificados", query = "SELECT p FROM PRAProductoresDetalleCertificados p WHERE p.iDProductoresDetalleCertificados = :iDProductoresDetalleCertificados"),
    @NamedQuery(name = "PRAProductoresDetalleCertificados.findByDescripcionCertificado", query = "SELECT p FROM PRAProductoresDetalleCertificados p WHERE p.descripcionCertificado = :descripcionCertificado"),
    @NamedQuery(name = "PRAProductoresDetalleCertificados.findByActivo", query = "SELECT p FROM PRAProductoresDetalleCertificados p WHERE p.activo = :activo"),
    @NamedQuery(name = "PRAProductoresDetalleCertificados.findByFechaCreado", query = "SELECT p FROM PRAProductoresDetalleCertificados p WHERE p.fechaCreado = :fechaCreado")})
public class PRAProductoresDetalleCertificados implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_Productores_Detalle_Certificados")
    private Long iDProductoresDetalleCertificados;
    @Size(max = 150)
    @Column(name = "Descripcion_Certificado")
    private String descripcionCertificado;
    @Column(name = "Activo")
    private Integer activo;
    @Column(name = "Fecha_Creado")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreado;
    @JoinColumn(name = "ID_Certificado", referencedColumnName = "ID_Certificado")
    @ManyToOne
    private PRACertificaciones iDCertificado;
    @JoinColumn(name = "ID_Productores", referencedColumnName = "ID_Productores")
    @ManyToOne
    private PRAProductores iDProductores;

    public PRAProductoresDetalleCertificados() {
    }

    public PRAProductoresDetalleCertificados(Long iDProductoresDetalleCertificados) {
        this.iDProductoresDetalleCertificados = iDProductoresDetalleCertificados;
    }

    public Long getIDProductoresDetalleCertificados() {
        return iDProductoresDetalleCertificados;
    }

    public void setIDProductoresDetalleCertificados(Long iDProductoresDetalleCertificados) {
        this.iDProductoresDetalleCertificados = iDProductoresDetalleCertificados;
    }

    public String getDescripcionCertificado() {
        return descripcionCertificado;
    }

    public void setDescripcionCertificado(String descripcionCertificado) {
        this.descripcionCertificado = descripcionCertificado;
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

    public PRACertificaciones getIDCertificado() {
        return iDCertificado;
    }

    public void setIDCertificado(PRACertificaciones iDCertificado) {
        this.iDCertificado = iDCertificado;
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
        hash += (iDProductoresDetalleCertificados != null ? iDProductoresDetalleCertificados.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PRAProductoresDetalleCertificados)) {
            return false;
        }
        PRAProductoresDetalleCertificados other = (PRAProductoresDetalleCertificados) object;
        if ((this.iDProductoresDetalleCertificados == null && other.iDProductoresDetalleCertificados != null) || (this.iDProductoresDetalleCertificados != null && !this.iDProductoresDetalleCertificados.equals(other.iDProductoresDetalleCertificados))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pra.dbcom.PRAProductoresDetalleCertificados[ iDProductoresDetalleCertificados=" + iDProductoresDetalleCertificados + " ]";
    }
    
}
