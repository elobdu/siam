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
import javax.persistence.Lob;
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
@Table(name = "PRA_Informacion_Detalle")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PRAInformacionDetalle.findAll", query = "SELECT p FROM PRAInformacionDetalle p"),
    @NamedQuery(name = "PRAInformacionDetalle.findByIDInformacionDetalle", query = "SELECT p FROM PRAInformacionDetalle p WHERE p.iDInformacionDetalle = :iDInformacionDetalle"),
    @NamedQuery(name = "PRAInformacionDetalle.findByNombreInformacionDetalle", query = "SELECT p FROM PRAInformacionDetalle p WHERE p.nombreInformacionDetalle = :nombreInformacionDetalle"),
    @NamedQuery(name = "PRAInformacionDetalle.findByDescripcion", query = "SELECT p FROM PRAInformacionDetalle p WHERE p.descripcion = :descripcion"),
    @NamedQuery(name = "PRAInformacionDetalle.findByLink", query = "SELECT p FROM PRAInformacionDetalle p WHERE p.link = :link"),
    @NamedQuery(name = "PRAInformacionDetalle.findByActivo", query = "SELECT p FROM PRAInformacionDetalle p WHERE p.activo = :activo"),
    @NamedQuery(name = "PRAInformacionDetalle.findByFechaCreado", query = "SELECT p FROM PRAInformacionDetalle p WHERE p.fechaCreado = :fechaCreado"),
    @NamedQuery(name = "PRAInformacionDetalle.findByNombreImagen", query = "SELECT p FROM PRAInformacionDetalle p WHERE p.nombreImagen = :nombreImagen"),
    @NamedQuery(name = "PRAInformacionDetalle.findByNombreDocumento1", query = "SELECT p FROM PRAInformacionDetalle p WHERE p.nombreDocumento1 = :nombreDocumento1"),
    @NamedQuery(name = "PRAInformacionDetalle.findByNombreDocumento2", query = "SELECT p FROM PRAInformacionDetalle p WHERE p.nombreDocumento2 = :nombreDocumento2")})
public class PRAInformacionDetalle implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_Informacion_Detalle")
    private Long iDInformacionDetalle;
    @Size(max = 300)
    @Column(name = "Nombre_Informacion_Detalle")
    private String nombreInformacionDetalle;
    @Size(max = 1000)
    @Column(name = "Descripcion")
    private String descripcion;
    @Lob
    @Column(name = "Imagen")
    private byte[] imagen;
    @Lob
    @Column(name = "Documento1")
    private byte[] documento1;
    @Lob
    @Column(name = "Documento2")
    private byte[] documento2;
    @Size(max = 2147483647)
    @Column(name = "Link")
    private String link;
    @Column(name = "Activo")
    private Integer activo;
    @Column(name = "Fecha_Creado")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreado;
    @Size(max = 500)
    @Column(name = "Nombre_Imagen")
    private String nombreImagen;
    @Size(max = 500)
    @Column(name = "Nombre_Documento1")
    private String nombreDocumento1;
    @Size(max = 500)
    @Column(name = "Nombre_Documento2")
    private String nombreDocumento2;
    @JoinColumn(name = "ID_Informacion", referencedColumnName = "ID_Informacion")
    @ManyToOne
    private PRAInformacion iDInformacion;
    @JoinColumn(name = "ID_Tipo_Alerta", referencedColumnName = "ID_Tipo_Alerta")
    @ManyToOne
    private PRATipoAlertas iDTipoAlerta;

    public PRAInformacionDetalle() {
    }

    public PRAInformacionDetalle(Long iDInformacionDetalle) {
        this.iDInformacionDetalle = iDInformacionDetalle;
    }

    public Long getIDInformacionDetalle() {
        return iDInformacionDetalle;
    }

    public void setIDInformacionDetalle(Long iDInformacionDetalle) {
        this.iDInformacionDetalle = iDInformacionDetalle;
    }

    public String getNombreInformacionDetalle() {
        return nombreInformacionDetalle;
    }

    public void setNombreInformacionDetalle(String nombreInformacionDetalle) {
        this.nombreInformacionDetalle = nombreInformacionDetalle;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public byte[] getImagen() {
        return imagen;
    }

    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }

    public byte[] getDocumento1() {
        return documento1;
    }

    public void setDocumento1(byte[] documento1) {
        this.documento1 = documento1;
    }

    public byte[] getDocumento2() {
        return documento2;
    }

    public void setDocumento2(byte[] documento2) {
        this.documento2 = documento2;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
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

    public String getNombreDocumento1() {
        return nombreDocumento1;
    }

    public void setNombreDocumento1(String nombreDocumento1) {
        this.nombreDocumento1 = nombreDocumento1;
    }

    public String getNombreDocumento2() {
        return nombreDocumento2;
    }

    public void setNombreDocumento2(String nombreDocumento2) {
        this.nombreDocumento2 = nombreDocumento2;
    }

    public PRAInformacion getIDInformacion() {
        return iDInformacion;
    }

    public void setIDInformacion(PRAInformacion iDInformacion) {
        this.iDInformacion = iDInformacion;
    }

    public PRATipoAlertas getIDTipoAlerta() {
        return iDTipoAlerta;
    }

    public void setIDTipoAlerta(PRATipoAlertas iDTipoAlerta) {
        this.iDTipoAlerta = iDTipoAlerta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDInformacionDetalle != null ? iDInformacionDetalle.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PRAInformacionDetalle)) {
            return false;
        }
        PRAInformacionDetalle other = (PRAInformacionDetalle) object;
        if ((this.iDInformacionDetalle == null && other.iDInformacionDetalle != null) || (this.iDInformacionDetalle != null && !this.iDInformacionDetalle.equals(other.iDInformacionDetalle))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pra.dbcom.PRAInformacionDetalle[ iDInformacionDetalle=" + iDInformacionDetalle + " ]";
    }
    
}
