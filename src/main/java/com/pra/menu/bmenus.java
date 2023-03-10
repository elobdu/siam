/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pra.menu;

import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;

import com.pra.dbcom.PRAPantallas;
import com.pra.dbcom.PRARoles;
import com.pra.dbcom.PRARolesPermiso;
import com.pra.dbcom.PRAUsuariosWeb;
import com.pra.facade.PRAPantallasFacadeLocal;
import com.pra.facade.PRARolesPermisoFacadeLocal;
import org.primefaces.model.menu.DefaultMenuItem;
import org.primefaces.model.menu.DefaultMenuModel;
import org.primefaces.model.menu.DefaultSubMenu;
import org.primefaces.model.menu.MenuModel;

/**
 * @author obper
 */
@Named(value = "bmenus")
@ViewScoped
public class bmenus implements Serializable {

    @EJB
    PRARolesPermisoFacadeLocal rfl;
    @EJB
    PRAPantallasFacadeLocal pfl;

    private List<PRAPantallas> opcionesMenus;
    private PRAUsuariosWeb user;
    private MenuModel model;

    public List<PRAPantallas> getOpcionesMenus() {
        return opcionesMenus;
    }

    public void setOpcionesMenus(List<PRAPantallas> opcionesMenus) {
        this.opcionesMenus = opcionesMenus;
    }

    public PRAUsuariosWeb getUser() {
        return user;
    }

    public void setUser(PRAUsuariosWeb user) {
        this.user = user;
    }

    public MenuModel getModel() {
        return model;
    }

    public void setModel(MenuModel model) {
        this.model = model;
    }

    @PostConstruct
    public void init() {

        this.user = (PRAUsuariosWeb) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("usuario");
        model = new DefaultMenuModel();
        opcionesMenus = new ArrayList<>();
        List<PRARolesPermiso> roles = new ArrayList<>();
        roles.addAll(rfl.permisoRoles(user.getIDRol()));

        for (PRARolesPermiso rlo : roles) {
            opcionesMenus.add(pfl.find(rlo.getIDPantallas()));
        }


        establecerMenus();

    }


    public void establecerMenus() {
   //     DefaultSubMenu submenu = new DefaultSubMenu("SIAM");

        for (PRAPantallas m : opcionesMenus) {
            // submenu.setIcon(m.getIcono());
            DefaultMenuItem item = new DefaultMenuItem(m.getTitulo());
            item.setUrl(m.getEnlaces());
          //  submenu.addElement(item);
            model.addElement(item);


        }


    }

    public bmenus() {
    }

}
