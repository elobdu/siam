/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pra.dbcom;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
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
@Table(name = "PRA_Productores")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PRAProductores.findAll", query = "SELECT p FROM PRAProductores p"),
    @NamedQuery(name = "PRAProductores.findByIDProductores", query = "SELECT p FROM PRAProductores p WHERE p.iDProductores = :iDProductores"),
    @NamedQuery(name = "PRAProductores.findByNombre", query = "SELECT p FROM PRAProductores p WHERE p.nombre = :nombre"),
    @NamedQuery(name = "PRAProductores.findByTelefono", query = "SELECT p FROM PRAProductores p WHERE p.telefono = :telefono"),
    @NamedQuery(name = "PRAProductores.findByDireccion", query = "SELECT p FROM PRAProductores p WHERE p.direccion = :direccion"),
    @NamedQuery(name = "PRAProductores.findByWhatsapp", query = "SELECT p FROM PRAProductores p WHERE p.whatsapp = :whatsapp"),
    @NamedQuery(name = "PRAProductores.findByFacebook", query = "SELECT p FROM PRAProductores p WHERE p.facebook = :facebook"),
    @NamedQuery(name = "PRAProductores.findByInstagram", query = "SELECT p FROM PRAProductores p WHERE p.instagram = :instagram"),
    @NamedQuery(name = "PRAProductores.findByActivo", query = "SELECT p FROM PRAProductores p WHERE p.activo = :activo"),
    @NamedQuery(name = "PRAProductores.findByFechaCreado", query = "SELECT p FROM PRAProductores p WHERE p.fechaCreado = :fechaCreado"),
    @NamedQuery(name = "PRAProductores.findByExportador", query = "SELECT p FROM PRAProductores p WHERE p.exportador = :exportador")})
public class PRAProductores implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_Productores")
    private Long iDProductores;
    @Size(max = 400)
    @Column(name = "Nombre")
    private String nombre;
    @Size(max = 15)
    @Column(name = "telefono")
    private String telefono;
    @Size(max = 600)
    @Column(name = "direccion")
    private String direccion;
    @Size(max = 15)
    @Column(name = "whatsapp")
    private String whatsapp;
    @Size(max = 200)
    @Column(name = "facebook")
    private String facebook;
    @Size(max = 200)
    @Column(name = "instagram")
    private String instagram;
    @Column(name = "Activo")
    private Integer activo;
    @Column(name = "Fecha_Creado")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreado;
    @Lob
    @Column(name = "Imagen")
    private byte[] imagen;
    @Column(name = "Exportador")
    private Integer exportador;
    @OneToMany(mappedBy = "iDProductores")
    private List<PRAProductoresDetalleCertificados> pRAProductoresDetalleCertificadosList;
    @OneToMany(mappedBy = "iDProductores")
    private List<PRAProductoresDetalleProductos> pRAProductoresDetalleProductosList;

    public PRAProductores() {
    }

    public PRAProductores(Long iDProductores) {
        this.iDProductores = iDProductores;
    }

    public Long getIDProductores() {
        return iDProductores;
    }

    public void setIDProductores(Long iDProductores) {
        this.iDProductores = iDProductores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getWhatsapp() {
        return whatsapp;
    }

    public void setWhatsapp(String whatsapp) {
        this.whatsapp = whatsapp;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getInstagram() {
        return instagram;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
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

    public byte[] getImagen() {
        return imagen;
    }

    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }

    public Integer getExportador() {
        return exportador;
    }

    public void setExportador(Integer exportador) {
        this.exportador = exportador;
    }

    @XmlTransient
    public List<PRAProductoresDetalleCertificados> getPRAProductoresDetalleCertificadosList() {
        return pRAProductoresDetalleCertificadosList;
    }

    public void setPRAProductoresDetalleCertificadosList(List<PRAProductoresDetalleCertificados> pRAProductoresDetalleCertificadosList) {
        this.pRAProductoresDetalleCertificadosList = pRAProductoresDetalleCertificadosList;
    }

    @XmlTransient
    public List<PRAProductoresDetalleProductos> getPRAProductoresDetalleProductosList() {
        return pRAProductoresDetalleProductosList;
    }

    public void setPRAProductoresDetalleProductosList(List<PRAProductoresDetalleProductos> pRAProductoresDetalleProductosList) {
        this.pRAProductoresDetalleProductosList = pRAProductoresDetalleProductosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDProductores != null ? iDProductores.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PRAProductores)) {
            return false;
        }
        PRAProductores other = (PRAProductores) object;
        if ((this.iDProductores == null && other.iDProductores != null) || (this.iDProductores != null && !this.iDProductores.equals(other.iDProductores))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pra.dbcom.PRAProductores[ iDProductores=" + iDProductores + " ]";
    }
    
}
