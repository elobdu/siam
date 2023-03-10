/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pra.dbcom;

import java.io.Serializable;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author obper
 */
@Entity
@Table(name = "PRA_Usuarios_Web")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = "PRAUsuariosWeb.findAll", query = "SELECT p FROM PRAUsuariosWeb p"),
        @NamedQuery(name = "PRAUsuariosWeb.findByIDUsuario", query = "SELECT p FROM PRAUsuariosWeb p WHERE p.iDUsuario = :iDUsuario"),
        @NamedQuery(name = "PRAUsuariosWeb.findByNombres", query = "SELECT p FROM PRAUsuariosWeb p WHERE p.nombres = :nombres"),
        @NamedQuery(name = "PRAUsuariosWeb.findByApellidos", query = "SELECT p FROM PRAUsuariosWeb p WHERE p.apellidos = :apellidos"),
        @NamedQuery(name = "PRAUsuariosWeb.findByUsuario", query = "SELECT p FROM PRAUsuariosWeb p WHERE p.usuario = :usuario"),
        @NamedQuery(name = "PRAUsuariosWeb.findByClave", query = "SELECT p FROM PRAUsuariosWeb p WHERE p.clave = :clave"),
        @NamedQuery(name = "PRAUsuariosWeb.findByActivo", query = "SELECT p FROM PRAUsuariosWeb p WHERE p.activo = :activo"),
        @NamedQuery(name = "PRAUsuariosWeb.findByFechaCreado", query = "SELECT p FROM PRAUsuariosWeb p WHERE p.fechaCreado = :fechaCreado"),
        @NamedQuery(name = "PRAUsuariosWeb.findByIDRol", query = "SELECT p FROM PRAUsuariosWeb p WHERE p.iDRol = :iDRol"),
        @NamedQuery(name = "PRAUsuariosWeb.maxUser", query = "SELECT MAX(p.iDUsuario) FROM PRAUsuariosWeb p"),
        @NamedQuery(name = "PRAUsuariosWeb.findByNombresyPass", query = "SELECT p FROM PRAUsuariosWeb p WHERE p.usuario = :usuario and p.clave = :clave")})

public class PRAUsuariosWeb implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_Usuario" , unique=true, nullable = false)
    private Integer iDUsuario;
    @Column(name = "Nombres")
    private String nombres;
    @Column(name = "Apellidos")
    private String apellidos;
    @Column(name = "Usuario")
    private String usuario;
    @Column(name = "Clave")
    private String clave;
    @Column(name = "Activo")
    private Boolean activo;
    @Column(name = "Fecha_Creado")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreado;
    @Column(name = "ID_Rol")
    private Integer iDRol;

    public PRAUsuariosWeb() {
    }

    public PRAUsuariosWeb(Integer iDUsuario) {
        this.iDUsuario = iDUsuario;
    }

    public Integer getIDUsuario() {
        return iDUsuario;
    }

    public void setIDUsuario(Integer iDUsuario) {
        this.iDUsuario = iDUsuario;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public Date getFechaCreado() {
        return fechaCreado;
    }

    public void setFechaCreado(Date fechaCreado) {
        this.fechaCreado = fechaCreado;
    }

    public Integer getIDRol() {
        return iDRol;
    }

    public void setIDRol(Integer iDRol) {
        this.iDRol = iDRol;
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
        if (!(object instanceof PRAUsuariosWeb)) {
            return false;
        }
        PRAUsuariosWeb other = (PRAUsuariosWeb) object;
        if ((this.iDUsuario == null && other.iDUsuario != null) || (this.iDUsuario != null && !this.iDUsuario.equals(other.iDUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pra.dbcom.PRAUsuariosWeb[ iDUsuario=" + iDUsuario + " ]";
    }

}
