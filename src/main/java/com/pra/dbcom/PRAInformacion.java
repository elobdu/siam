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
import javax.persistence.Lob;
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
@Table(name = "PRA_Informacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PRAInformacion.findAll", query = "SELECT p FROM PRAInformacion p"),
    @NamedQuery(name = "PRAInformacion.findByIDInformacion", query = "SELECT p FROM PRAInformacion p WHERE p.iDInformacion = :iDInformacion"),
    @NamedQuery(name = "PRAInformacion.findByNombre", query = "SELECT p FROM PRAInformacion p WHERE p.nombre = :nombre"),
    @NamedQuery(name = "PRAInformacion.findByActivo", query = "SELECT p FROM PRAInformacion p WHERE p.activo = :activo"),
    @NamedQuery(name = "PRAInformacion.findByFechaCreado", query = "SELECT p FROM PRAInformacion p WHERE p.fechaCreado = :fechaCreado"),
    @NamedQuery(name = "PRAInformacion.findByNombreImagen", query = "SELECT p FROM PRAInformacion p WHERE p.nombreImagen = :nombreImagen")})
public class PRAInformacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_Informacion")
    private Long iDInformacion;
    @Size(max = 50)
    @Column(name = "Nombre")
    private String nombre;
    @Lob
    @Column(name = "Imagen")
    private byte[] imagen;
    @Column(name = "Activo")
    private Integer activo;
    @Column(name = "Fecha_Creado")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreado;
    @Size(max = 500)
    @Column(name = "Nombre_Imagen")
    private String nombreImagen;
    @OneToMany(mappedBy = "iDInformacion")
    private List<PRAInformacionDetalle> pRAInformacionDetalleList;

    public PRAInformacion() {
    }

    public PRAInformacion(Long iDInformacion) {
        this.iDInformacion = iDInformacion;
    }

    public Long getIDInformacion() {
        return iDInformacion;
    }

    public void setIDInformacion(Long iDInformacion) {
        this.iDInformacion = iDInformacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public byte[] getImagen() {
        return imagen;
    }

    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
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

    public String getNombreImagen() {
        return nombreImagen;
    }

    public void setNombreImagen(String nombreImagen) {
        this.nombreImagen = nombreImagen;
    }

    @XmlTransient
    public List<PRAInformacionDetalle> getPRAInformacionDetalleList() {
        return pRAInformacionDetalleList;
    }

    public void setPRAInformacionDetalleList(List<PRAInformacionDetalle> pRAInformacionDetalleList) {
        this.pRAInformacionDetalleList = pRAInformacionDetalleList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDInformacion != null ? iDInformacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PRAInformacion)) {
            return false;
        }
        PRAInformacion other = (PRAInformacion) object;
        if ((this.iDInformacion == null && other.iDInformacion != null) || (this.iDInformacion != null && !this.iDInformacion.equals(other.iDInformacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pra.dbcom.PRAInformacion[ iDInformacion=" + iDInformacion + " ]";
    }
    
}
