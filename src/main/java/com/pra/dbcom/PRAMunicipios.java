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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "PRA_Municipios")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PRAMunicipios.findAll", query = "SELECT p FROM PRAMunicipios p"),
    @NamedQuery(name = "PRAMunicipios.findByIDMunicipio", query = "SELECT p FROM PRAMunicipios p WHERE p.iDMunicipio = :iDMunicipio"),
    @NamedQuery(name = "PRAMunicipios.findByNombre", query = "SELECT p FROM PRAMunicipios p WHERE p.nombre = :nombre"),
    @NamedQuery(name = "PRAMunicipios.findByIDPais", query = "SELECT p FROM PRAMunicipios p WHERE p.iDPais = :iDPais")})
public class PRAMunicipios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_Municipio")
    private Integer iDMunicipio;
    @Size(max = 50)
    @Column(name = "Nombre")
    private String nombre;
    @Column(name = "ID_Pais")
    private Integer iDPais;
    @OneToMany(mappedBy = "iDMunicipios")
    private List<PRAAlertasTempranasUbicacion> pRAAlertasTempranasUbicacionList;
    @JoinColumn(name = "ID_Departamento", referencedColumnName = "ID_Departamento")
    @ManyToOne
    private PRADepartamentos iDDepartamento;

    public PRAMunicipios() {
    }

    public PRAMunicipios(Integer iDMunicipio) {
        this.iDMunicipio = iDMunicipio;
    }

    public Integer getIDMunicipio() {
        return iDMunicipio;
    }

    public void setIDMunicipio(Integer iDMunicipio) {
        this.iDMunicipio = iDMunicipio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getIDPais() {
        return iDPais;
    }

    public void setIDPais(Integer iDPais) {
        this.iDPais = iDPais;
    }

    @XmlTransient
    public List<PRAAlertasTempranasUbicacion> getPRAAlertasTempranasUbicacionList() {
        return pRAAlertasTempranasUbicacionList;
    }

    public void setPRAAlertasTempranasUbicacionList(List<PRAAlertasTempranasUbicacion> pRAAlertasTempranasUbicacionList) {
        this.pRAAlertasTempranasUbicacionList = pRAAlertasTempranasUbicacionList;
    }

    public PRADepartamentos getIDDepartamento() {
        return iDDepartamento;
    }

    public void setIDDepartamento(PRADepartamentos iDDepartamento) {
        this.iDDepartamento = iDDepartamento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDMunicipio != null ? iDMunicipio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PRAMunicipios)) {
            return false;
        }
        PRAMunicipios other = (PRAMunicipios) object;
        if ((this.iDMunicipio == null && other.iDMunicipio != null) || (this.iDMunicipio != null && !this.iDMunicipio.equals(other.iDMunicipio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pra.dbcom.PRAMunicipios[ iDMunicipio=" + iDMunicipio + " ]";
    }
    
}
