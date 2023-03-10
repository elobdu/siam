/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pra.login;

import com.pra.dbcom.PRARoles;
import com.pra.dbcom.PRAUsuariosWeb;
import com.pra.facade.PRAUsuariosWebFacadeLocal;
import com.pra.validar.StringMD;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author obper
 */
@Named
@ViewScoped
public class IngresoLogin implements Serializable {

    @EJB
    PRAUsuariosWebFacadeLocal wcufl;

    private static final long serialVersionUID = -2152389656664659476L;
    private String nombre;
    private String clave;
    private PRAUsuariosWeb user;
    private PRARoles grupo;

    public PRARoles getGrupo() {
        return grupo;
    }

    public void setGrupo(PRARoles grupo) {
        this.grupo = grupo;
    }

    public PRAUsuariosWeb getUser() {
        return user;
    }

    public void setUser(PRAUsuariosWeb user) {
        this.user = user;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    @PostConstruct
    public void init() {
        this.user = new PRAUsuariosWeb();

    }

    public String iniciarSesion() {
        String direccion = "access-denied?faces-redirect=true";
        PRAUsuariosWeb us = null;
        ExternalContext exc = FacesContext.getCurrentInstance().getExternalContext();
        boolean activo = false;

        try {
            us = wcufl.obtenerUsuario(nombre, clave);
            activo =us.getActivo();
        } catch (Exception e) {
        }

        if (us != null||activo) {
            //usuario session
            exc.getSessionMap().put("usuario", us);

                direccion = "/apps/menus?faces-redirect=true";


        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "AVISO", "Los datos proporcionados son incorrectos"));
        }

        return direccion;
    }

    /**
     * Creates a new instance of IngresoLogin
     */
    public IngresoLogin() {
    }

}
