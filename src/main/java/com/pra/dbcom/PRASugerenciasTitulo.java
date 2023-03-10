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
@Table(name = "PRA_Sugerencias_Titulo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PRASugerenciasTitulo.findAll", query = "SELECT p FROM PRASugerenciasTitulo p"),
    @NamedQuery(name = "PRASugerenciasTitulo.findByIDSugerencia", query = "SELECT p FROM PRASugerenciasTitulo p WHERE p.iDSugerencia = :iDSugerencia"),
    @NamedQuery(name = "PRASugerenciasTitulo.findByTitulo", query = "SELECT p FROM PRASugerenciasTitulo p WHERE p.titulo = :titulo"),
    @NamedQuery(name = "PRASugerenciasTitulo.findByActivo", query = "SELECT p FROM PRASugerenciasTitulo p WHERE p.activo = :activo"),
    @NamedQuery(name = "PRASugerenciasTitulo.findByFechaCreado", query = "SELECT p FROM PRASugerenciasTitulo p WHERE p.fechaCreado = :fechaCreado")})
public class PRASugerenciasTitulo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_Sugerencia")
    private Integer iDSugerencia;
    @Size(max = 50)
    @Column(name = "Titulo")
    private String titulo;
    @Column(name = "Activo")
    private Integer activo;
    @Column(name = "Fecha_Creado")
    @Temporal(TemporalType.DATE)
    private Date fechaCreado;

    public PRASugerenciasTitulo() {
    }

    public PRASugerenciasTitulo(Integer iDSugerencia) {
        this.iDSugerencia = iDSugerencia;
    }

    public Integer getIDSugerencia() {
        return iDSugerencia;
    }

    public void setIDSugerencia(Integer iDSugerencia) {
        this.iDSugerencia = iDSugerencia;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDSugerencia != null ? iDSugerencia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PRASugerenciasTitulo)) {
            return false;
        }
        PRASugerenciasTitulo other = (PRASugerenciasTitulo) object;
        if ((this.iDSugerencia == null && other.iDSugerencia != null) || (this.iDSugerencia != null && !this.iDSugerencia.equals(other.iDSugerencia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pra.dbcom.PRASugerenciasTitulo[ iDSugerencia=" + iDSugerencia + " ]";
    }
    
}
