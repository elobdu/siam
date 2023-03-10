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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author obper
 */
@Entity
@Table(name = "PRA_Alertas_Tempranas_Ubicacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PRAAlertasTempranasUbicacion.findAll", query = "SELECT p FROM PRAAlertasTempranasUbicacion p"),
    @NamedQuery(name = "PRAAlertasTempranasUbicacion.findByIDAlertaTempranaUbicacion", query = "SELECT p FROM PRAAlertasTempranasUbicacion p WHERE p.iDAlertaTempranaUbicacion = :iDAlertaTempranaUbicacion"),
    @NamedQuery(name = "PRAAlertasTempranasUbicacion.findByIDUbicacion", query = "SELECT p FROM PRAAlertasTempranasUbicacion p WHERE p.iDUbicacion = :iDUbicacion"),
    @NamedQuery(name = "PRAAlertasTempranasUbicacion.findByFechaCreado", query = "SELECT p FROM PRAAlertasTempranasUbicacion p WHERE p.fechaCreado = :fechaCreado")})
public class PRAAlertasTempranasUbicacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_Alerta_Temprana_Ubicacion")
    private Long iDAlertaTempranaUbicacion;
    @Column(name = "ID_Ubicacion")
    private Integer iDUbicacion;
    @Column(name = "Fecha_Creado")
    @Temporal(TemporalType.DATE)
    private Date fechaCreado;
    @JoinColumn(name = "ID_Alerta_Temprana", referencedColumnName = "ID_Alertas_Tempranas")
    @ManyToOne
    private PRAAlertasTempranas iDAlertaTemprana;
    @JoinColumn(name = "ID_Municipios", referencedColumnName = "ID_Municipio")
    @ManyToOne
    private PRAMunicipios iDMunicipios;

    public PRAAlertasTempranasUbicacion() {
    }

    public PRAAlertasTempranasUbicacion(Long iDAlertaTempranaUbicacion) {
        this.iDAlertaTempranaUbicacion = iDAlertaTempranaUbicacion;
    }

    public Long getIDAlertaTempranaUbicacion() {
        return iDAlertaTempranaUbicacion;
    }

    public void setIDAlertaTempranaUbicacion(Long iDAlertaTempranaUbicacion) {
        this.iDAlertaTempranaUbicacion = iDAlertaTempranaUbicacion;
    }

    public Integer getIDUbicacion() {
        return iDUbicacion;
    }

    public void setIDUbicacion(Integer iDUbicacion) {
        this.iDUbicacion = iDUbicacion;
    }

    public Date getFechaCreado() {
        return fechaCreado;
    }

    public void setFechaCreado(Date fechaCreado) {
        this.fechaCreado = fechaCreado;
    }

    public PRAAlertasTempranas getIDAlertaTemprana() {
        return iDAlertaTemprana;
    }

    public void setIDAlertaTemprana(PRAAlertasTempranas iDAlertaTemprana) {
        this.iDAlertaTemprana = iDAlertaTemprana;
    }

    public PRAMunicipios getIDMunicipios() {
        return iDMunicipios;
    }

    public void setIDMunicipios(PRAMunicipios iDMunicipios) {
        this.iDMunicipios = iDMunicipios;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDAlertaTempranaUbicacion != null ? iDAlertaTempranaUbicacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PRAAlertasTempranasUbicacion)) {
            return false;
        }
        PRAAlertasTempranasUbicacion other = (PRAAlertasTempranasUbicacion) object;
        if ((this.iDAlertaTempranaUbicacion == null && other.iDAlertaTempranaUbicacion != null) || (this.iDAlertaTempranaUbicacion != null && !this.iDAlertaTempranaUbicacion.equals(other.iDAlertaTempranaUbicacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pra.dbcom.PRAAlertasTempranasUbicacion[ iDAlertaTempranaUbicacion=" + iDAlertaTempranaUbicacion + " ]";
    }
    
}
