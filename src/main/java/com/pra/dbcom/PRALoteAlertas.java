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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author obper
 */
@Entity
@Table(name = "PRA_Lote_Alertas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PRALoteAlertas.findAll", query = "SELECT p FROM PRALoteAlertas p"),
    @NamedQuery(name = "PRALoteAlertas.findByIDLoteAlerta", query = "SELECT p FROM PRALoteAlertas p WHERE p.iDLoteAlerta = :iDLoteAlerta"),
    @NamedQuery(name = "PRALoteAlertas.findByFechaCreado", query = "SELECT p FROM PRALoteAlertas p WHERE p.fechaCreado = :fechaCreado")})
public class PRALoteAlertas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_Lote_Alerta")
    private Long iDLoteAlerta;
    @Column(name = "Fecha_Creado")
    @Temporal(TemporalType.DATE)
    private Date fechaCreado;
    @OneToMany(mappedBy = "iDLoteAlerta")
    private List<PRANotificacionesPush> pRANotificacionesPushList;

    public PRALoteAlertas() {
    }

    public PRALoteAlertas(Long iDLoteAlerta) {
        this.iDLoteAlerta = iDLoteAlerta;
    }

    public Long getIDLoteAlerta() {
        return iDLoteAlerta;
    }

    public void setIDLoteAlerta(Long iDLoteAlerta) {
        this.iDLoteAlerta = iDLoteAlerta;
    }

    public Date getFechaCreado() {
        return fechaCreado;
    }

    public void setFechaCreado(Date fechaCreado) {
        this.fechaCreado = fechaCreado;
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
        hash += (iDLoteAlerta != null ? iDLoteAlerta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PRALoteAlertas)) {
            return false;
        }
        PRALoteAlertas other = (PRALoteAlertas) object;
        if ((this.iDLoteAlerta == null && other.iDLoteAlerta != null) || (this.iDLoteAlerta != null && !this.iDLoteAlerta.equals(other.iDLoteAlerta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pra.dbcom.PRALoteAlertas[ iDLoteAlerta=" + iDLoteAlerta + " ]";
    }
    
}
