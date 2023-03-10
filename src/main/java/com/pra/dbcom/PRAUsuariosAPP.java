/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pra.dbcom;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "PRA_Usuarios_APP")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PRAUsuariosAPP.findAll", query = "SELECT p FROM PRAUsuariosAPP p"),
    @NamedQuery(name = "PRAUsuariosAPP.findByIDUsuario", query = "SELECT p FROM PRAUsuariosAPP p WHERE p.iDUsuario = :iDUsuario"),
    @NamedQuery(name = "PRAUsuariosAPP.findByPrimerNombre", query = "SELECT p FROM PRAUsuariosAPP p WHERE p.primerNombre = :primerNombre"),
    @NamedQuery(name = "PRAUsuariosAPP.findBySegundoNombre", query = "SELECT p FROM PRAUsuariosAPP p WHERE p.segundoNombre = :segundoNombre"),
    @NamedQuery(name = "PRAUsuariosAPP.findByPrimerApellido", query = "SELECT p FROM PRAUsuariosAPP p WHERE p.primerApellido = :primerApellido"),
    @NamedQuery(name = "PRAUsuariosAPP.findBySegundoApellido", query = "SELECT p FROM PRAUsuariosAPP p WHERE p.segundoApellido = :segundoApellido"),
    @NamedQuery(name = "PRAUsuariosAPP.findByDui", query = "SELECT p FROM PRAUsuariosAPP p WHERE p.dui = :dui"),
    @NamedQuery(name = "PRAUsuariosAPP.findByNit", query = "SELECT p FROM PRAUsuariosAPP p WHERE p.nit = :nit"),
    @NamedQuery(name = "PRAUsuariosAPP.findByDireccion", query = "SELECT p FROM PRAUsuariosAPP p WHERE p.direccion = :direccion"),
    @NamedQuery(name = "PRAUsuariosAPP.findByDepartamento", query = "SELECT p FROM PRAUsuariosAPP p WHERE p.departamento = :departamento"),
    @NamedQuery(name = "PRAUsuariosAPP.findByMunicipio", query = "SELECT p FROM PRAUsuariosAPP p WHERE p.municipio = :municipio"),
    @NamedQuery(name = "PRAUsuariosAPP.findByTipoPersona", query = "SELECT p FROM PRAUsuariosAPP p WHERE p.tipoPersona = :tipoPersona"),
    @NamedQuery(name = "PRAUsuariosAPP.findByRazonSocial", query = "SELECT p FROM PRAUsuariosAPP p WHERE p.razonSocial = :razonSocial"),
    @NamedQuery(name = "PRAUsuariosAPP.findByCorreoElectronico", query = "SELECT p FROM PRAUsuariosAPP p WHERE p.correoElectronico = :correoElectronico"),
    @NamedQuery(name = "PRAUsuariosAPP.findByClave", query = "SELECT p FROM PRAUsuariosAPP p WHERE p.clave = :clave"),
    @NamedQuery(name = "PRAUsuariosAPP.findByCelular", query = "SELECT p FROM PRAUsuariosAPP p WHERE p.celular = :celular"),
    @NamedQuery(name = "PRAUsuariosAPP.findByLatitud", query = "SELECT p FROM PRAUsuariosAPP p WHERE p.latitud = :latitud"),
    @NamedQuery(name = "PRAUsuariosAPP.findByLongitud", query = "SELECT p FROM PRAUsuariosAPP p WHERE p.longitud = :longitud"),
    @NamedQuery(name = "PRAUsuariosAPP.findByTipoDispositivo", query = "SELECT p FROM PRAUsuariosAPP p WHERE p.tipoDispositivo = :tipoDispositivo"),
    @NamedQuery(name = "PRAUsuariosAPP.findByVersionApp", query = "SELECT p FROM PRAUsuariosAPP p WHERE p.versionApp = :versionApp"),
    @NamedQuery(name = "PRAUsuariosAPP.findByTokenNotificaciones", query = "SELECT p FROM PRAUsuariosAPP p WHERE p.tokenNotificaciones = :tokenNotificaciones"),
    @NamedQuery(name = "PRAUsuariosAPP.findByFechaRegistro", query = "SELECT p FROM PRAUsuariosAPP p WHERE p.fechaRegistro = :fechaRegistro"),
    @NamedQuery(name = "PRAUsuariosAPP.findByAprovado", query = "SELECT p FROM PRAUsuariosAPP p WHERE p.aprovado = :aprovado"),
    @NamedQuery(name = "PRAUsuariosAPP.findByActivo", query = "SELECT p FROM PRAUsuariosAPP p WHERE p.activo = :activo"),
    @NamedQuery(name = "PRAUsuariosAPP.findByNacionalExtranjero", query = "SELECT p FROM PRAUsuariosAPP p WHERE p.nacionalExtranjero = :nacionalExtranjero"),
    @NamedQuery(name = "PRAUsuariosAPP.findByCodPais", query = "SELECT p FROM PRAUsuariosAPP p WHERE p.codPais = :codPais")})
public class PRAUsuariosAPP implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_Usuario")
    private Long iDUsuario;
    @Size(max = 50)
    @Column(name = "Primer_Nombre")
    private String primerNombre;
    @Size(max = 50)
    @Column(name = "Segundo_Nombre")
    private String segundoNombre;
    @Size(max = 50)
    @Column(name = "Primer_Apellido")
    private String primerApellido;
    @Size(max = 50)
    @Column(name = "Segundo_Apellido")
    private String segundoApellido;
    @Size(max = 50)
    @Column(name = "DUI")
    private String dui;
    @Size(max = 50)
    @Column(name = "NIT")
    private String nit;
    @Size(max = 200)
    @Column(name = "Direccion")
    private String direccion;
    @Column(name = "Departamento")
    private Integer departamento;
    @Column(name = "Municipio")
    private Integer municipio;
    @Size(max = 50)
    @Column(name = "Tipo_Persona")
    private String tipoPersona;
    @Size(max = 150)
    @Column(name = "Razon_Social")
    private String razonSocial;
    @Size(max = 150)
    @Column(name = "Correo_Electronico")
    private String correoElectronico;
    @Size(max = 50)
    @Column(name = "Clave")
    private String clave;
    @Size(max = 15)
    @Column(name = "Celular")
    private String celular;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "Latitud")
    private BigDecimal latitud;
    @Column(name = "Longitud")
    private BigDecimal longitud;
    @Size(max = 50)
    @Column(name = "Tipo_Dispositivo")
    private String tipoDispositivo;
    @Size(max = 20)
    @Column(name = "Version_App")
    private String versionApp;
    @Size(max = 500)
    @Column(name = "Token_Notificaciones")
    private String tokenNotificaciones;
    @Column(name = "Fecha_Registro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRegistro;
    @Column(name = "Aprovado")
    private Boolean aprovado;
    @Column(name = "Activo")
    private Boolean activo;
    @Size(max = 50)
    @Column(name = "Nacional_Extranjero")
    private String nacionalExtranjero;
    @Size(max = 10)
    @Column(name = "COD_PAIS")
    private String codPais;
    @OneToMany(mappedBy = "iDUsuario")
    private List<PRASugerencias> pRASugerenciasList;
    @OneToMany(mappedBy = "iDUsuario")
    private List<PRANotificacionesPush> pRANotificacionesPushList;

    public PRAUsuariosAPP() {
    }

    public PRAUsuariosAPP(Long iDUsuario) {
        this.iDUsuario = iDUsuario;
    }

    public Long getIDUsuario() {
        return iDUsuario;
    }

    public void setIDUsuario(Long iDUsuario) {
        this.iDUsuario = iDUsuario;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getDui() {
        return dui;
    }

    public void setDui(String dui) {
        this.dui = dui;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Integer departamento) {
        this.departamento = departamento;
    }

    public Integer getMunicipio() {
        return municipio;
    }

    public void setMunicipio(Integer municipio) {
        this.municipio = municipio;
    }

    public String getTipoPersona() {
        return tipoPersona;
    }

    public void setTipoPersona(String tipoPersona) {
        this.tipoPersona = tipoPersona;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public BigDecimal getLatitud() {
        return latitud;
    }

    public void setLatitud(BigDecimal latitud) {
        this.latitud = latitud;
    }

    public BigDecimal getLongitud() {
        return longitud;
    }

    public void setLongitud(BigDecimal longitud) {
        this.longitud = longitud;
    }

    public String getTipoDispositivo() {
        return tipoDispositivo;
    }

    public void setTipoDispositivo(String tipoDispositivo) {
        this.tipoDispositivo = tipoDispositivo;
    }

    public String getVersionApp() {
        return versionApp;
    }

    public void setVersionApp(String versionApp) {
        this.versionApp = versionApp;
    }

    public String getTokenNotificaciones() {
        return tokenNotificaciones;
    }

    public void setTokenNotificaciones(String tokenNotificaciones) {
        this.tokenNotificaciones = tokenNotificaciones;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Boolean getAprovado() {
        return aprovado;
    }

    public void setAprovado(Boolean aprovado) {
        this.aprovado = aprovado;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public String getNacionalExtranjero() {
        return nacionalExtranjero;
    }

    public void setNacionalExtranjero(String nacionalExtranjero) {
        this.nacionalExtranjero = nacionalExtranjero;
    }

    public String getCodPais() {
        return codPais;
    }

    public void setCodPais(String codPais) {
        this.codPais = codPais;
    }

    @XmlTransient
    public List<PRASugerencias> getPRASugerenciasList() {
        return pRASugerenciasList;
    }

    public void setPRASugerenciasList(List<PRASugerencias> pRASugerenciasList) {
        this.pRASugerenciasList = pRASugerenciasList;
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
        hash += (iDUsuario != null ? iDUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PRAUsuariosAPP)) {
            return false;
        }
        PRAUsuariosAPP other = (PRAUsuariosAPP) object;
        if ((this.iDUsuario == null && other.iDUsuario != null) || (this.iDUsuario != null && !this.iDUsuario.equals(other.iDUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pra.dbcom.PRAUsuariosAPP[ iDUsuario=" + iDUsuario + " ]";
    }
    
}
