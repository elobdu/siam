/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pra.dbcom;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author obper
 */
@Entity
@Table(name = "PRA_Sugerencias_Estados")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PRASugerenciasEstados.findAll", query = "SELECT p FROM PRASugerenciasEstados p"),
    @NamedQuery(name = "PRASugerenciasEstados.findByIDEstado", query = "SELECT p FROM PRASugerenciasEstados p WHERE p.iDEstado = :iDEstado"),
    @NamedQuery(name = "PRASugerenciasEstados.findByNombre", query = "SELECT p FROM PRASugerenciasEstados p WHERE p.nombre = :nombre")})
public class PRASugerenciasEstados implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_Estado")
    private Integer iDEstado;
    @Size(max = 50)
    @Column(name = "Nombre")
    private String nombre;
    @OneToMany(mappedBy = "leido")
    private List<PRASugerencias> pRASugerenciasList;

    public PRASugerenciasEstados() {
    }

    public PRASugerenciasEstados(Integer iDEstado) {
        this.iDEstado = iDEstado;
    }

    public Integer getIDEstado() {
        return iDEstado;
    }

    public void setIDEstado(Integer iDEstado) {
        this.iDEstado = iDEstado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @XmlTransient
    public List<PRASugerencias> getPRASugerenciasList() {
        return pRASugerenciasList;
    }

    public void setPRASugerenciasList(List<PRASugerencias> pRASugerenciasList) {
        this.pRASugerenciasList = pRASugerenciasList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDEstado != null ? iDEstado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PRASugerenciasEstados)) {
            return false;
        }
        PRASugerenciasEstados other = (PRASugerenciasEstados) object;
        if ((this.iDEstado == null && other.iDEstado != null) || (this.iDEstado != null && !this.iDEstado.equals(other.iDEstado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pra.dbcom.PRASugerenciasEstados[ iDEstado=" + iDEstado + " ]";
    }
    
}
