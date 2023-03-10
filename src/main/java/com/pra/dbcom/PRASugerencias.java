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
@Table(name = "PRA_Sugerencias")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PRASugerencias.findAll", query = "SELECT p FROM PRASugerencias p"),
    @NamedQuery(name = "PRASugerencias.findByIDSugerencia", query = "SELECT p FROM PRASugerencias p WHERE p.iDSugerencia = :iDSugerencia"),
    @NamedQuery(name = "PRASugerencias.findByCorreoElectronico", query = "SELECT p FROM PRASugerencias p WHERE p.correoElectronico = :correoElectronico"),
    @NamedQuery(name = "PRASugerencias.findByComentario", query = "SELECT p FROM PRASugerencias p WHERE p.comentario = :comentario"),
    @NamedQuery(name = "PRASugerencias.findByFechaCreado", query = "SELECT p FROM PRASugerencias p WHERE p.fechaCreado = :fechaCreado"),
    @NamedQuery(name = "PRASugerencias.findByIDSugerenciaTitulo", query = "SELECT p FROM PRASugerencias p WHERE p.iDSugerenciaTitulo = :iDSugerenciaTitulo")})
public class PRASugerencias implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_Sugerencia")
    private Long iDSugerencia;
    @Size(max = 150)
    @Column(name = "Correo_Electronico")
    private String correoElectronico;
    @Size(max = 500)
    @Column(name = "Comentario")
    private String comentario;
    @Column(name = "Fecha_Creado")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreado;
    @Column(name = "ID_Sugerencia_Titulo")
    private Integer iDSugerenciaTitulo;
    @JoinColumn(name = "Leido", referencedColumnName = "ID_Estado")
    @ManyToOne
    private PRASugerenciasEstados leido;
    @JoinColumn(name = "ID_Usuario", referencedColumnName = "ID_Usuario")
    @ManyToOne
    private PRAUsuariosAPP iDUsuario;

    public PRASugerencias() {
    }

    public PRASugerencias(Long iDSugerencia) {
        this.iDSugerencia = iDSugerencia;
    }

    public Long getIDSugerencia() {
        return iDSugerencia;
    }

    public void setIDSugerencia(Long iDSugerencia) {
        this.iDSugerencia = iDSugerencia;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Date getFechaCreado() {
        return fechaCreado;
    }

    public void setFechaCreado(Date fechaCreado) {
        this.fechaCreado = fechaCreado;
    }

    public Integer getIDSugerenciaTitulo() {
        return iDSugerenciaTitulo;
    }

    public void setIDSugerenciaTitulo(Integer iDSugerenciaTitulo) {
        this.iDSugerenciaTitulo = iDSugerenciaTitulo;
    }

    public PRASugerenciasEstados getLeido() {
        return leido;
    }

    public void setLeido(PRASugerenciasEstados leido) {
        this.leido = leido;
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
        hash += (iDSugerencia != null ? iDSugerencia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PRASugerencias)) {
            return false;
        }
        PRASugerencias other = (PRASugerencias) object;
        if ((this.iDSugerencia == null && other.iDSugerencia != null) || (this.iDSugerencia != null && !this.iDSugerencia.equals(other.iDSugerencia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pra.dbcom.PRASugerencias[ iDSugerencia=" + iDSugerencia + " ]";
    }
    
}
