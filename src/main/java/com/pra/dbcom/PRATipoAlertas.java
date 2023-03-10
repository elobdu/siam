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
@Table(name = "PRA_Tipo_Alertas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PRATipoAlertas.findAll", query = "SELECT p FROM PRATipoAlertas p"),
    @NamedQuery(name = "PRATipoAlertas.findByIDTipoAlerta", query = "SELECT p FROM PRATipoAlertas p WHERE p.iDTipoAlerta = :iDTipoAlerta"),
    @NamedQuery(name = "PRATipoAlertas.findByNombreTipoAlerta", query = "SELECT p FROM PRATipoAlertas p WHERE p.nombreTipoAlerta = :nombreTipoAlerta"),
    @NamedQuery(name = "PRATipoAlertas.findByActivo", query = "SELECT p FROM PRATipoAlertas p WHERE p.activo = :activo"),
    @NamedQuery(name = "PRATipoAlertas.findByFechaCreado", query = "SELECT p FROM PRATipoAlertas p WHERE p.fechaCreado = :fechaCreado")})
public class PRATipoAlertas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_Tipo_Alerta")
    private Long iDTipoAlerta;
    @Size(max = 50)
    @Column(name = "Nombre_Tipo_Alerta")
    private String nombreTipoAlerta;
    @Column(name = "Activo")
    private Boolean activo;
    @Column(name = "Fecha_Creado")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreado;
    @OneToMany(mappedBy = "iDTipoAlerta")
    private List<PRAInformacionDetalle> pRAInformacionDetalleList;

    public PRATipoAlertas() {
    }

    public PRATipoAlertas(Long iDTipoAlerta) {
        this.iDTipoAlerta = iDTipoAlerta;
    }

    public Long getIDTipoAlerta() {
        return iDTipoAlerta;
    }

    public void setIDTipoAlerta(Long iDTipoAlerta) {
        this.iDTipoAlerta = iDTipoAlerta;
    }

    public String getNombreTipoAlerta() {
        return nombreTipoAlerta;
    }

    public void setNombreTipoAlerta(String nombreTipoAlerta) {
        this.nombreTipoAlerta = nombreTipoAlerta;
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
        hash += (iDTipoAlerta != null ? iDTipoAlerta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PRATipoAlertas)) {
            return false;
        }
        PRATipoAlertas other = (PRATipoAlertas) object;
        if ((this.iDTipoAlerta == null && other.iDTipoAlerta != null) || (this.iDTipoAlerta != null && !this.iDTipoAlerta.equals(other.iDTipoAlerta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pra.dbcom.PRATipoAlertas[ iDTipoAlerta=" + iDTipoAlerta + " ]";
    }
    
}
