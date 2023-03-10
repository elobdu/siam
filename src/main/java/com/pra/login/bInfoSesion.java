/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pra.login;

import com.pra.dbcom.PRAPantallas;
import com.pra.dbcom.PRARoles;
import com.pra.dbcom.PRARolesPermiso;
import com.pra.dbcom.PRAUsuariosWeb;
import com.pra.facade.PRAPantallasFacadeLocal;
import com.pra.facade.PRARolesFacadeLocal;
import com.pra.facade.PRARolesPermisoFacadeLocal;

import java.io.IOException;
import javax.ejb.EJB;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author obper
 */
@Named
@ViewScoped
public class bInfoSesion implements Serializable {

    @EJB
    PRARolesPermisoFacadeLocal prrfl;
    @EJB
    PRAPantallasFacadeLocal pfl;
    @EJB
    PRARolesFacadeLocal rfl;

    @Inject
    private PRAUsuariosWeb user;
    private ExternalContext exc;
    @Inject
    private PRARoles rolUsuario;

    @PostConstruct
    public void init() {
        this.exc = FacesContext.getCurrentInstance().getExternalContext();
        this.user = (PRAUsuariosWeb) exc.getSessionMap().get("usuario");
        try{
            this.rolUsuario = rfl.find(user.getIDRol());
        }catch (Exception i){
            this.rolUsuario = new PRARoles();
            System.err.println(i.toString());
        }


    }

    public PRARoles getRolUsuario() {
        return rolUsuario;
    }

    public void setRolUsuario(PRARoles rolUsuario) {
        this.rolUsuario = rolUsuario;
    }

    public PRAUsuariosWeb getUser() {
        return user;
    }

    public void setUser(PRAUsuariosWeb user) {
        this.user = user;
    }

    public bInfoSesion() {
    }

    public void cerrarSesion() {
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();

    }

    public void verificaSesion() throws IOException {
        FacesContext ctx = FacesContext.getCurrentInstance();
        try {
            this.user = (PRAUsuariosWeb) ctx.getExternalContext().getSessionMap().get("usuario");
            if (user == null) {
                ctx.getExternalContext().redirect("./../access-denied.jsf");
            } else {
                HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
                String uri = request.getRequestURI().replaceAll("/siam/apps/", "");
                List<PRARolesPermiso> lisOps = prrfl.permisoRoles(user.getIDRol());
                boolean tienePermisos = false;

                for (PRARolesPermiso lisOp : lisOps) {

                    String urlBase = pfl.find(lisOp.getIDPantallas()).getEnlaces();
                    if (urlBase.equals(uri)) {
                        tienePermisos = true;
                    }
                }

                if (!tienePermisos) {
                    ctx.getExternalContext().redirect("404.jsf");
                }

            }
        } catch (Exception e) {

            System.err.println(e.toString());

            ctx.getExternalContext().redirect("./../access-denied.jsf");

        }

        HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
        String uri = request.getRequestURI().replaceAll("/suizapp/apps/", "");

    }

    public void verificaSesionIndex() throws IOException {
      FacesContext ctx = FacesContext.getCurrentInstance();
        try {         this.user = (PRAUsuariosWeb) ctx.getExternalContext().getSessionMap().get("usuario");
           if (user != null) {

                ctx.getExternalContext().redirect("/siam/apps/" + home() + ".jsf");
            }
        } catch (Exception e) {
            ctx.getExternalContext().redirect("/siam/login.jsf");
     }
    }

    public String home() {
        String direccion = "menus";

        return direccion;
    }

}
