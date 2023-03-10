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
@Table(name = "PRA_Auditoria")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PRAAuditoria.findAll", query = "SELECT p FROM PRAAuditoria p"),
    @NamedQuery(name = "PRAAuditoria.findByIDAuditoria", query = "SELECT p FROM PRAAuditoria p WHERE p.iDAuditoria = :iDAuditoria"),
    @NamedQuery(name = "PRAAuditoria.findByIDUsuario", query = "SELECT p FROM PRAAuditoria p WHERE p.iDUsuario = :iDUsuario"),
    @NamedQuery(name = "PRAAuditoria.findBySeccion", query = "SELECT p FROM PRAAuditoria p WHERE p.seccion = :seccion"),
    @NamedQuery(name = "PRAAuditoria.findByFecha", query = "SELECT p FROM PRAAuditoria p WHERE p.fecha = :fecha"),
    @NamedQuery(name = "PRAAuditoria.findByFechaHora", query = "SELECT p FROM PRAAuditoria p WHERE p.fechaHora = :fechaHora"),
    @NamedQuery(name = "PRAAuditoria.findByIDRegistroModificado", query = "SELECT p FROM PRAAuditoria p WHERE p.iDRegistroModificado = :iDRegistroModificado")})
public class PRAAuditoria implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_Auditoria")
    private Long iDAuditoria;
    @Column(name = "ID_Usuario")
    private Long iDUsuario;
    @Size(max = 150)
    @Column(name = "Seccion")
    private String seccion;
    @Column(name = "Fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Column(name = "Fecha_Hora")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaHora;
    @Column(name = "ID_Registro_Modificado")
    private Long iDRegistroModificado;

    public PRAAuditoria() {
    }

    public PRAAuditoria(Long iDAuditoria) {
        this.iDAuditoria = iDAuditoria;
    }

    public Long getIDAuditoria() {
        return iDAuditoria;
    }

    public void setIDAuditoria(Long iDAuditoria) {
        this.iDAuditoria = iDAuditoria;
    }

    public Long getIDUsuario() {
        return iDUsuario;
    }

    public void setIDUsuario(Long iDUsuario) {
        this.iDUsuario = iDUsuario;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    public Long getIDRegistroModificado() {
        return iDRegistroModificado;
    }

    public void setIDRegistroModificado(Long iDRegistroModificado) {
        this.iDRegistroModificado = iDRegistroModificado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDAuditoria != null ? iDAuditoria.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PRAAuditoria)) {
            return false;
        }
        PRAAuditoria other = (PRAAuditoria) object;
        if ((this.iDAuditoria == null && other.iDAuditoria != null) || (this.iDAuditoria != null && !this.iDAuditoria.equals(other.iDAuditoria))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pra.dbcom.PRAAuditoria[ iDAuditoria=" + iDAuditoria + " ]";
    }
    
}
