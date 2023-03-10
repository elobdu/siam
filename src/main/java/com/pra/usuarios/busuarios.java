/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pra.usuarios;


import com.pra.dbcom.PRARoles;
import com.pra.dbcom.PRAUsuariosWeb;
import com.pra.facade.PRARolesFacadeLocal;
import com.pra.facade.PRAUsuariosWebFacadeLocal;

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
import java.util.Formatter;
import java.util.List;

/**
 *
 * @author obper
 */
@Named
@ManagedBean
@javax.faces.view.ViewScoped

public class busuarios implements Serializable {

    @EJB
    PRAUsuariosWebFacadeLocal ufon;
    @EJB
    PRARolesFacadeLocal grpfl;

    private List<PRAUsuariosWeb> usuarios;
    @Inject
    private PRAUsuariosWeb usuarioNuevo, usuarioEdit;
    private List<PRARoles> grupos;
    private String nuevaContrasena, ultimoUsuario;
    

    public String getUltimoUsuario() {
        return ultimoUsuario;
    }

    public void setUltimoUsuario(String ultimoUsuario) {
        this.ultimoUsuario = ultimoUsuario;
    }

    public List<PRARoles> getGrupos() {
        return grupos;
    }

    public void setGrupos(List<PRARoles> grupos) {
        this.grupos = grupos;
    }

    public String getNuevaContrasena() {
        return nuevaContrasena;
    }

    public void setNuevaContrasena(String nuevaContrasena) {
        this.nuevaContrasena = nuevaContrasena;
    }

    public List<PRAUsuariosWeb> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<PRAUsuariosWeb> usuarios) {
        this.usuarios = usuarios;
    }

    public PRAUsuariosWeb getUsuarioNuevo() {
        return usuarioNuevo;
    }

    public void setUsuarioNuevo(PRAUsuariosWeb usuarioNuevo) {
        this.usuarioNuevo = usuarioNuevo;
    }

    public PRAUsuariosWeb getUsuarioEdit() {
        return usuarioEdit;
    }

    public void setUsuarioEdit(PRAUsuariosWeb usuarioEdit) {
        this.usuarioEdit = usuarioEdit;
    }

    public void guardarUsuario(PRAUsuariosWeb user) {

        Integer nuevoId = 0;
        nuevoId = ufon.maxUser() + 1;

        //user.setIDUsuario(nuevoId);
        user.setFechaCreado(new Date());
        ufon.create(user);

        FacesContext.getCurrentInstance().addMessage("Nuevo Usuario", new FacesMessage("Usuario Agregado"));
        this.nuevaContrasena = "";
        this.usuarioNuevo = new PRAUsuariosWeb();
        usuarios = ufon.findAll();
    }

    public void cambiarContrasenia(PRAUsuariosWeb user) {
        user.setClave(nuevaContrasena);
        ufon.edit(getUsuarioEdit());
        FacesContext.getCurrentInstance().addMessage("Contraseña", new FacesMessage("Contraseña modificada"));
        this.nuevaContrasena = "";
        this.usuarioEdit = new PRAUsuariosWeb();
    }

    public void editarUsuario(PRAUsuariosWeb user) {
        ufon.edit(user);
        FacesContext.getCurrentInstance().addMessage("Contraseña", new FacesMessage("Contraseña modificada"));
        this.usuarioEdit = new PRAUsuariosWeb();
    }

    @PostConstruct
    public void init() {
        usuarios = new ArrayList<>();
        usuarios = ufon.findAll();
        grupos = grpfl.findAll();


    }

    public String nombreRol(Integer idRol){
        String rs  = "NINGUNO";

        if (idRol > 0){
            rs = grpfl.find(idRol).getNombre();
        }
        return rs;
    }

    public busuarios() {
    }

    public String validaActivo(boolean estado){

        String rs = estado ? "ACTIVO" : "INACTIVO";

        return rs;

    }

    public String validaActivoColor(boolean estado){

        String rs = estado ? "#3e7f5b" : "#ff5555";

        return rs;

    }

}
