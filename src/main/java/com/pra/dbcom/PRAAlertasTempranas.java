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
@Table(name = "PRA_Alertas_Tempranas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PRAAlertasTempranas.findAll", query = "SELECT p FROM PRAAlertasTempranas p"),
    @NamedQuery(name = "PRAAlertasTempranas.findByIDAlertasTempranas", query = "SELECT p FROM PRAAlertasTempranas p WHERE p.iDAlertasTempranas = :iDAlertasTempranas"),
    @NamedQuery(name = "PRAAlertasTempranas.findByTextoAlerta", query = "SELECT p FROM PRAAlertasTempranas p WHERE p.textoAlerta = :textoAlerta"),
    @NamedQuery(name = "PRAAlertasTempranas.findByDescripcion", query = "SELECT p FROM PRAAlertasTempranas p WHERE p.descripcion = :descripcion"),
    @NamedQuery(name = "PRAAlertasTempranas.findByDepartamento", query = "SELECT p FROM PRAAlertasTempranas p WHERE p.departamento = :departamento"),
    @NamedQuery(name = "PRAAlertasTempranas.findByMunicipio", query = "SELECT p FROM PRAAlertasTempranas p WHERE p.municipio = :municipio"),
    @NamedQuery(name = "PRAAlertasTempranas.findByActivo", query = "SELECT p FROM PRAAlertasTempranas p WHERE p.activo = :activo"),
    @NamedQuery(name = "PRAAlertasTempranas.findByFechaCreado", query = "SELECT p FROM PRAAlertasTempranas p WHERE p.fechaCreado = :fechaCreado"),
    @NamedQuery(name = "PRAAlertasTempranas.findByIDTipoAlerta", query = "SELECT p FROM PRAAlertasTempranas p WHERE p.iDTipoAlerta = :iDTipoAlerta"),
    @NamedQuery(name = "PRAAlertasTempranas.findByFechaExpiracion", query = "SELECT p FROM PRAAlertasTempranas p WHERE p.fechaExpiracion = :fechaExpiracion"),
    @NamedQuery(name = "PRAAlertasTempranas.findByNivel", query = "SELECT p FROM PRAAlertasTempranas p WHERE p.nivel = :nivel")})
public class PRAAlertasTempranas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_Alertas_Tempranas")
    private Long iDAlertasTempranas;
    @Size(max = 150)
    @Column(name = "Texto_Alerta")
    private String textoAlerta;
    @Size(max = 300)
    @Column(name = "Descripcion")
    private String descripcion;
    @Column(name = "Departamento")
    private Integer departamento;
    @Column(name = "Municipio")
    private Integer municipio;
    @Column(name = "Activo")
    private Boolean activo;
    @Column(name = "Fecha_Creado")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreado;
    @Column(name = "ID_Tipo_Alerta")
    private Integer iDTipoAlerta;
    @Column(name = "Fecha_Expiracion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaExpiracion;
    @Column(name = "Nivel")
    private Integer nivel;
    @OneToMany(mappedBy = "iDAlertaTemprana")
    private List<PRAAlertasTempranasUbicacion> pRAAlertasTempranasUbicacionList;
    @OneToMany(mappedBy = "iDAlertaTemprana")
    private List<PRANotificacionesPush> pRANotificacionesPushList;

    public PRAAlertasTempranas() {
    }

    public PRAAlertasTempranas(Long iDAlertasTempranas) {
        this.iDAlertasTempranas = iDAlertasTempranas;
    }

    public Long getIDAlertasTempranas() {
        return iDAlertasTempranas;
    }

    public void setIDAlertasTempranas(Long iDAlertasTempranas) {
        this.iDAlertasTempranas = iDAlertasTempranas;
    }

    public String getTextoAlerta() {
        return textoAlerta;
    }

    public void setTextoAlerta(String textoAlerta) {
        this.textoAlerta = textoAlerta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Integer departamento) {
        this.departamento = departamento;
    }

    public Integer getMunicipio() {
        return municipio;
    }

    public void setMunicipio(Integer municipio) {
        this.municipio = municipio;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public Date getFechaCreado() {
        return fechaCreado;
    }

    public void setFechaCreado(Date fechaCreado) {
        this.fechaCreado = fechaCreado;
    }

    public Integer getIDTipoAlerta() {
        return iDTipoAlerta;
    }

    public void setIDTipoAlerta(Integer iDTipoAlerta) {
        this.iDTipoAlerta = iDTipoAlerta;
    }

    public Date getFechaExpiracion() {
        return fechaExpiracion;
    }

    public void setFechaExpiracion(Date fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    @XmlTransient
    public List<PRAAlertasTempranasUbicacion> getPRAAlertasTempranasUbicacionList() {
        return pRAAlertasTempranasUbicacionList;
    }

    public void setPRAAlertasTempranasUbicacionList(List<PRAAlertasTempranasUbicacion> pRAAlertasTempranasUbicacionList) {
        this.pRAAlertasTempranasUbicacionList = pRAAlertasTempranasUbicacionList;
    }

    @XmlTransient
    public List<PRANotificacionesPush> getPRANotificacionesPushList() {
        return pRANotificacionesPushList;
    }

    public void setPRANotificacionesPushList(List<PRANotificacionesPush> pRANotificacionesPushList) {
        this.pRANotificacionesPushList = pRANotificacionesPushList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDAlertasTempranas != null ? iDAlertasTempranas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PRAAlertasTempranas)) {
            return false;
        }
        PRAAlertasTempranas other = (PRAAlertasTempranas) object;
        if ((this.iDAlertasTempranas == null && other.iDAlertasTempranas != null) || (this.iDAlertasTempranas != null && !this.iDAlertasTempranas.equals(other.iDAlertasTempranas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pra.dbcom.PRAAlertasTempranas[ iDAlertasTempranas=" + iDAlertasTempranas + " ]";
    }
    
}
