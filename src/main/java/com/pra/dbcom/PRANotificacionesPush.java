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
@Table(name = "PRA_Notificaciones_Push")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PRANotificacionesPush.findAll", query = "SELECT p FROM PRANotificacionesPush p"),
    @NamedQuery(name = "PRANotificacionesPush.findByIDNotificacionPush", query = "SELECT p FROM PRANotificacionesPush p WHERE p.iDNotificacionPush = :iDNotificacionPush"),
    @NamedQuery(name = "PRANotificacionesPush.findByRecibido", query = "SELECT p FROM PRANotificacionesPush p WHERE p.recibido = :recibido"),
    @NamedQuery(name = "PRANotificacionesPush.findByFechaCreado", query = "SELECT p FROM PRANotificacionesPush p WHERE p.fechaCreado = :fechaCreado")})
public class PRANotificacionesPush implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_Notificacion_Push")
    private Long iDNotificacionPush;
    @Size(max = 2)
    @Column(name = "Recibido")
    private String recibido;
    @Column(name = "Fecha_Creado")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreado;
    @JoinColumn(name = "ID_Alerta_Temprana", referencedColumnName = "ID_Alertas_Tempranas")
    @ManyToOne
    private PRAAlertasTempranas iDAlertaTemprana;
    @JoinColumn(name = "ID_Lote_Alerta", referencedColumnName = "ID_Lote_Alerta")
    @ManyToOne
    private PRALoteAlertas iDLoteAlerta;
    @JoinColumn(name = "ID_Usuario", referencedColumnName = "ID_Usuario")
    @ManyToOne
    private PRAUsuariosAPP iDUsuario;

    public PRANotificacionesPush() {
    }

    public PRANotificacionesPush(Long iDNotificacionPush) {
        this.iDNotificacionPush = iDNotificacionPush;
    }

    public Long getIDNotificacionPush() {
        return iDNotificacionPush;
    }

    public void setIDNotificacionPush(Long iDNotificacionPush) {
        this.iDNotificacionPush = iDNotificacionPush;
    }

    public String getRecibido() {
        return recibido;
    }

    public void setRecibido(String recibido) {
        this.recibido = recibido;
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

    public PRALoteAlertas getIDLoteAlerta() {
        return iDLoteAlerta;
    }

    public void setIDLoteAlerta(PRALoteAlertas iDLoteAlerta) {
        this.iDLoteAlerta = iDLoteAlerta;
    }

    public PRAUsuariosAPP getIDUsuario() {
        return iDUsuario;
    }

    public void setIDUsuario(PRAUsuariosAPP iDUsuario) {
        this.iDUsuario = iDUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDNotificacionPush != null ? iDNotificacionPush.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PRANotificacionesPush)) {
            return false;
        }
        PRANotificacionesPush other = (PRANotificacionesPush) object;
        if ((this.iDNotificacionPush == null && other.iDNotificacionPush != null) || (this.iDNotificacionPush != null && !this.iDNotificacionPush.equals(other.iDNotificacionPush))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pra.dbcom.PRANotificacionesPush[ iDNotificacionPush=" + iDNotificacionPush + " ]";
    }
    
}
