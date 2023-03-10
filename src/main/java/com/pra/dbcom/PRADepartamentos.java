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
@Table(name = "PRA_Departamentos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PRADepartamentos.findAll", query = "SELECT p FROM PRADepartamentos p"),
    @NamedQuery(name = "PRADepartamentos.findByIDDepartamento", query = "SELECT p FROM PRADepartamentos p WHERE p.iDDepartamento = :iDDepartamento"),
    @NamedQuery(name = "PRADepartamentos.findByNombre", query = "SELECT p FROM PRADepartamentos p WHERE p.nombre = :nombre"),
    @NamedQuery(name = "PRADepartamentos.findByIsocode", query = "SELECT p FROM PRADepartamentos p WHERE p.isocode = :isocode"),
    @NamedQuery(name = "PRADepartamentos.findByIDZona", query = "SELECT p FROM PRADepartamentos p WHERE p.iDZona = :iDZona"),
    @NamedQuery(name = "PRADepartamentos.findByIDPais", query = "SELECT p FROM PRADepartamentos p WHERE p.iDPais = :iDPais")})
public class PRADepartamentos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_Departamento")
    private Integer iDDepartamento;
    @Size(max = 50)
    @Column(name = "Nombre")
    private String nombre;
    @Size(max = 50)
    @Column(name = "ISOCODE")
    private String isocode;
    @Column(name = "ID_Zona")
    private Integer iDZona;
    @Column(name = "ID_Pais")
    private Integer iDPais;
    @OneToMany(mappedBy = "iDDepartamento")
    private List<PRAMunicipios> pRAMunicipiosList;

    public PRADepartamentos() {
    }

    public PRADepartamentos(Integer iDDepartamento) {
        this.iDDepartamento = iDDepartamento;
    }

    public Integer getIDDepartamento() {
        return iDDepartamento;
    }

    public void setIDDepartamento(Integer iDDepartamento) {
        this.iDDepartamento = iDDepartamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIsocode() {
        return isocode;
    }

    public void setIsocode(String isocode) {
        this.isocode = isocode;
    }

    public Integer getIDZona() {
        return iDZona;
    }

    public void setIDZona(Integer iDZona) {
        this.iDZona = iDZona;
    }

    public Integer getIDPais() {
        return iDPais;
    }

    public void setIDPais(Integer iDPais) {
        this.iDPais = iDPais;
    }

    @XmlTransient
    public List<PRAMunicipios> getPRAMunicipiosList() {
        return pRAMunicipiosList;
    }

    public void setPRAMunicipiosList(List<PRAMunicipios> pRAMunicipiosList) {
        this.pRAMunicipiosList = pRAMunicipiosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDDepartamento != null ? iDDepartamento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PRADepartamentos)) {
            return false;
        }
        PRADepartamentos other = (PRADepartamentos) object;
        if ((this.iDDepartamento == null && other.iDDepartamento != null) || (this.iDDepartamento != null && !this.iDDepartamento.equals(other.iDDepartamento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pra.dbcom.PRADepartamentos[ iDDepartamento=" + iDDepartamento + " ]";
    }
    
}
