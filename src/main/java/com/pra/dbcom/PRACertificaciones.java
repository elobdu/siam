/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pra.dbcom;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author obper
 */
@Entity
@Table(name = "PRA_Certificaciones")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PRACertificaciones.findAll", query = "SELECT p FROM PRACertificaciones p"),
    @NamedQuery(name = "PRACertificaciones.findByIDCertificado", query = "SELECT p FROM PRACertificaciones p WHERE p.iDCertificado = :iDCertificado"),
    @NamedQuery(name = "PRACertificaciones.findByNombre", query = "SELECT p FROM PRACertificaciones p WHERE p.nombre = :nombre"),
    @NamedQuery(name = "PRACertificaciones.findByActivo", query = "SELECT p FROM PRACertificaciones p WHERE p.activo = :activo"),
    @NamedQuery(name = "PRACertificaciones.findByFechaCreado", query = "SELECT p FROM PRACertificaciones p WHERE p.fechaCreado = :fechaCreado")})
public class PRACertificaciones implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_Certificado")
    private Long iDCertificado;
    @Size(max = 200)
    @Column(name = "Nombre")
    private String nombre;
    @Column(name = "Activo")
    private Integer activo;
    @Column(name = "Fecha_Creado")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreado;
    @OneToMany(mappedBy = "iDCertificado")
    private List<PRAProductoresDetalleCertificados> pRAProductoresDetalleCertificadosList;

    public PRACertificaciones() {
    }

    public PRACertificaciones(Long iDCertificado) {
        this.iDCertificado = iDCertificado;
    }

    public Long getIDCertificado() {
        return iDCertificado;
    }

    public void setIDCertificado(Long iDCertificado) {
        this.iDCertificado = iDCertificado;
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

    @XmlTransient
    public List<PRAProductoresDetalleCertificados> getPRAProductoresDetalleCertificadosList() {
        return pRAProductoresDetalleCertificadosList;
    }

    public void setPRAProductoresDetalleCertificadosList(List<PRAProductoresDetalleCertificados> pRAProductoresDetalleCertificadosList) {
        this.pRAProductoresDetalleCertificadosList = pRAProductoresDetalleCertificadosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDCertificado != null ? iDCertificado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PRACertificaciones)) {
            return false;
        }
        PRACertificaciones other = (PRACertificaciones) object;
        if ((this.iDCertificado == null && other.iDCertificado != null) || (this.iDCertificado != null && !this.iDCertificado.equals(other.iDCertificado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pra.dbcom.PRACertificaciones[ iDCertificado=" + iDCertificado + " ]";
    }
    
}
