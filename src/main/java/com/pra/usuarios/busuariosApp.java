/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pra.usuarios;


import com.pra.dbcom.*;
import com.pra.facade.*;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author obper
 */
@Named
@ManagedBean
@javax.faces.view.ViewScoped

public class busuariosApp implements Serializable {

    @EJB
    PRAUsuariosAPPFacadeLocal ufon;
    @EJB
    PRAMunicipiosFacadeLocal mfl;
    @EJB
    PRADepartamentosFacadeLocal dfl;


    private List<PRAUsuariosAPP> usuarios;
    @Inject
    private PRAUsuariosAPP usuarioEdit;
    private String nuevaContrasena, ultimoUsuario;

    private List<PRAMunicipios> municipios;
    private List<PRADepartamentos> departamentos;

    public String getUltimoUsuario() {
        return ultimoUsuario;
    }

    public void setUltimoUsuario(String ultimoUsuario) {
        this.ultimoUsuario = ultimoUsuario;
    }

    public List<PRAMunicipios> getMunicipios() {
        return municipios;
    }

    public void setMunicipios(List<PRAMunicipios> municipios) {
        this.municipios = municipios;
    }

    public List<PRADepartamentos> getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(List<PRADepartamentos> departamentos) {
        this.departamentos = departamentos;
    }

    public String getNuevaContrasena() {
        return nuevaContrasena;
    }

    public void setNuevaContrasena(String nuevaContrasena) {
        this.nuevaContrasena = nuevaContrasena;
    }

    public List<PRAUsuariosAPP> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<PRAUsuariosAPP> usuarios) {
        this.usuarios = usuarios;
    }


    public PRAUsuariosAPP getUsuarioEdit() {
        return usuarioEdit;
    }

    public void setUsuarioEdit(PRAUsuariosAPP usuarioEdit) {
        this.usuarioEdit = usuarioEdit;
    }

    public void guardarUsuario(PRAUsuariosAPP user) {


        //user.setIDUsuario(nuevoId);
      //  user.setFechaCreado(new Date());
        ufon.create(user);

        FacesContext.getCurrentInstance().addMessage("Nuevo Usuario", new FacesMessage("Usuario Agregado"));
        this.nuevaContrasena = "";
      //  this.usuarioNuevo = new PRAUsuariosAPP();
    }

    public void cambiarContrasenia(PRAUsuariosWeb user) {
        user.setClave(nuevaContrasena);
       // ufon.edit(getUsuarioEdit());
        FacesContext.getCurrentInstance().addMessage("Contraseña", new FacesMessage("Contraseña modificada"));
        this.nuevaContrasena = "";
        this.usuarioEdit = new PRAUsuariosAPP();
    }

    public void editarUsuario(PRAUsuariosAPP user) {
        ufon.edit(user);
        FacesContext.getCurrentInstance().addMessage("Contraseña", new FacesMessage("Contraseña modificada"));
        this.usuarioEdit = new PRAUsuariosAPP();
    }

    @PostConstruct
    public void init() {
        usuarios = new ArrayList<>();
        usuarios = ufon.findAll();
        municipios = new ArrayList<>();
        departamentos = new ArrayList<>();
        departamentos.addAll(dfl.findAll());
        municipios.addAll(mfl.findAll());

    }


    public void obtenerMuniciposDepa(int depart){

        municipios = new ArrayList<>();
        municipios.addAll(mfl.obteneMunicipiosPorDepartamento(depart));

    }

    public String validaAprobado(boolean estado){

        String rs = estado ? "SI" : "NO";

        return rs;

    }

    public String validaAprobadoColor(boolean estado){

        String rs = estado ? "#3e7f5b" : "#ff5555";

        return rs;

    }

    public busuariosApp() {
    }

}
