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
@Table(name = "PRA_Productos_Lista_Negra")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PRAProductosListaNegra.findAll", query = "SELECT p FROM PRAProductosListaNegra p"),
    @NamedQuery(name = "PRAProductosListaNegra.findByIDProductosListaNegra", query = "SELECT p FROM PRAProductosListaNegra p WHERE p.iDProductosListaNegra = :iDProductosListaNegra"),
    @NamedQuery(name = "PRAProductosListaNegra.findByCorreCorres", query = "SELECT p FROM PRAProductosListaNegra p WHERE p.correCorres = :correCorres"),
    @NamedQuery(name = "PRAProductosListaNegra.findByActivo", query = "SELECT p FROM PRAProductosListaNegra p WHERE p.activo = :activo"),
    @NamedQuery(name = "PRAProductosListaNegra.findByFechaCreado", query = "SELECT p FROM PRAProductosListaNegra p WHERE p.fechaCreado = :fechaCreado")})
public class PRAProductosListaNegra implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_Productos_Lista_Negra")
    private Long iDProductosListaNegra;
    @Size(max = 5)
    @Column(name = "Corre_Corres")
    private String correCorres;
    @Column(name = "Activo")
    private Integer activo;
    @Column(name = "Fecha_Creado")
    @Temporal(TemporalType.DATE)
    private Date fechaCreado;

    public PRAProductosListaNegra() {
    }

    public PRAProductosListaNegra(Long iDProductosListaNegra) {
        this.iDProductosListaNegra = iDProductosListaNegra;
    }

    public Long getIDProductosListaNegra() {
        return iDProductosListaNegra;
    }

    public void setIDProductosListaNegra(Long iDProductosListaNegra) {
        this.iDProductosListaNegra = iDProductosListaNegra;
    }

    public String getCorreCorres() {
        return correCorres;
    }

    public void setCorreCorres(String correCorres) {
        this.correCorres = correCorres;
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
        hash += (iDProductosListaNegra != null ? iDProductosListaNegra.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PRAProductosListaNegra)) {
            return false;
        }
        PRAProductosListaNegra other = (PRAProductosListaNegra) object;
        if ((this.iDProductosListaNegra == null && other.iDProductosListaNegra != null) || (this.iDProductosListaNegra != null && !this.iDProductosListaNegra.equals(other.iDProductosListaNegra))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pra.dbcom.PRAProductosListaNegra[ iDProductosListaNegra=" + iDProductosListaNegra + " ]";
    }
    
}
