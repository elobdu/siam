/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pra.usuarios;

import com.pra.dbcom.PRAPantallas;
import com.pra.dbcom.PRARoles;
import com.pra.dbcom.PRARolesPermiso;
import com.pra.facade.PRAPantallasFacadeLocal;
import com.pra.facade.PRARolesFacadeLocal;
import com.pra.facade.PRARolesPermisoFacadeLocal;
import org.primefaces.event.SelectEvent;
import org.primefaces.event.TransferEvent;
import org.primefaces.event.UnselectEvent;
import org.primefaces.model.DualListModel;

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
 * @author obper
 */
@Named
@ManagedBean
@javax.faces.view.ViewScoped
public class broles implements Serializable {

    @EJB
    private PRARolesFacadeLocal wcgfl;
    @EJB
    private PRAPantallasFacadeLocal wcofl;
    @EJB
    private PRARolesPermisoFacadeLocal wcogfl;

    private DualListModel<PRAPantallas> opciones;
    private List<PRARoles> grupos;
    private Boolean nuevoCheck;
    private List<PRAPantallas> opcionesPorGrupoFrom;
    private List<PRAPantallas> opcionesPorGrupoOF;
    private List<PRAPantallas> opcionesPorGrupoTo;
    private PRARoles selectGrupo, nuevoGrupo, selectGrupo2;

    public PRARoles getSelectGrupo2() {
        return selectGrupo2;
    }

    public void setSelectGrupo2(PRARoles selectGrupo2) {
        this.selectGrupo2 = selectGrupo2;
    }

    public Boolean getNuevoCheck() {
        return nuevoCheck;
    }

    public void setNuevoCheck(Boolean nuevoCheck) {
        this.nuevoCheck = nuevoCheck;
    }

    public PRARoles getNuevoGrupo() {
        return nuevoGrupo;
    }

    public void setNuevoGrupo(PRARoles nuevoGrupo) {
        this.nuevoGrupo = nuevoGrupo;
    }

    public List<PRARoles> getGrupos() {
        return grupos;
    }

    public void setGrupos(List<PRARoles> grupos) {
        this.grupos = grupos;
    }

    public DualListModel<PRAPantallas> getOpciones() {
        return opciones;
    }

    public void setOpciones(DualListModel<PRAPantallas> opciones) {
        this.opciones = opciones;
    }

    public PRARoles getSelectGrupo() {
        return selectGrupo;
    }

    public List<PRAPantallas> getOpcionesPorGrupoFrom() {
        return opcionesPorGrupoFrom;
    }

    public void setOpcionesPorGrupoFrom(List<PRAPantallas> opcionesPorGrupoFrom) {
        this.opcionesPorGrupoFrom = opcionesPorGrupoFrom;
    }

    public List<PRAPantallas> getOpcionesPorGrupoTo() {
        return opcionesPorGrupoTo;
    }

    public void setOpcionesPorGrupoTo(List<PRAPantallas> opcionesPorGrupoTo) {
        this.opcionesPorGrupoTo = opcionesPorGrupoTo;
    }

    public List<PRAPantallas> getOpcionesPorGrupoOF() {
        return opcionesPorGrupoOF;
    }

    public void setOpcionesPorGrupoOF(List<PRAPantallas> opcionesPorGrupoOF) {
        this.opcionesPorGrupoOF = opcionesPorGrupoOF;
    }

    public void setSelectGrupo(PRARoles selectGrupo) {
        this.selectGrupo = selectGrupo;

        List<PRAPantallas> pantallasGrups = new ArrayList<>();
        List<PRARolesPermiso> permisosRol = new ArrayList<>();
        permisosRol = wcogfl.permisoRoles(selectGrupo.getIDRol());

        for (PRARolesPermiso rst : permisosRol) {

            pantallasGrups.add(wcofl.find(rst.getIDPantallas()));
        }

        opcionesPorGrupoFrom = new ArrayList<>();
        opcionesPorGrupoTo = new ArrayList<>();
        this.opcionesPorGrupoFrom = wcofl.findAll();
        try {
            for (PRAPantallas opcs : pantallasGrups) {
                opcionesPorGrupoTo.add(opcs);
            }
        } catch (Exception e) {
        }

        for (PRAPantallas opso : opcionesPorGrupoTo) {
            opcionesPorGrupoFrom.remove(opso);
        }
        this.opciones = new DualListModel<>(opcionesPorGrupoFrom, opcionesPorGrupoTo);
    }


    @PostConstruct
    public void init() {
        this.nuevoCheck = false;
        this.selectGrupo = new PRARoles();
        this.nuevoGrupo = new PRARoles();
        this.selectGrupo2 = new PRARoles();
        this.grupos = wcgfl.findAll();
        this.opcionesPorGrupoFrom = wcofl.findAll();
        this.opcionesPorGrupoOF = wcofl.findAll();
        this.opcionesPorGrupoTo = new ArrayList<>();
        this.opciones = new DualListModel<>(opcionesPorGrupoFrom, opcionesPorGrupoTo);
    }

    public String validaTipoGrupo(boolean tipogrupo) {
        String rs = "";
        try {
            rs = tipogrupo ? "administrador" : "normal";
        } catch (Exception e) {
        }

        return rs;
    }



    public broles() {
    }

    public void onTransfer(TransferEvent event) {
        PRARolesPermiso rolPer = new PRARolesPermiso();

        String tipoGestion = "";
        StringBuilder builder = new StringBuilder();
        PRAPantallas ojeto = new PRAPantallas();
        for (Object item : event.getItems()) {
            ojeto = (PRAPantallas) item;

            rolPer.setIDRolePersmiso(wcogfl.maxIdRolPermiso() + 1);
            rolPer.setIDRol(selectGrupo.getIDRol());
            rolPer.setIDPantallas(ojeto.getIDPantalla());


            if (event.isAdd()) {
                wcogfl.crearRolPermiso(rolPer);
                tipoGestion = "Opcion Agregada ";
            } else if (event.isRemove()) {
                wcogfl.remove(wcogfl.permioRolIn(selectGrupo.getIDRol(), ojeto.getIDPantalla()));
                tipoGestion = "Opcion Eliminada ";
            }
            builder.append(((PRAPantallas) item).getTitulo()).append("<br />");
            ;
        }

        FacesMessage msg = new FacesMessage();
        msg.setSeverity(FacesMessage.SEVERITY_INFO);
        msg.setSummary(tipoGestion);
        msg.setDetail(builder.toString());

        FacesContext.getCurrentInstance().addMessage(null, msg);
    }


    public void guardarNuevoGrupo(PRARoles io) {
        try {

           io.setIDRol(wcgfl.maxIdRol() + 1);
            io.setFechaCreado(new Date());
            wcgfl.crearNuevoRol(io);

            mensaje(FacesMessage.SEVERITY_INFO,"Nuevo Rol", nuevoGrupo.getNombre());

        } catch (Exception e) {
            mensaje(FacesMessage.SEVERITY_ERROR,"Error de Creado", nuevoGrupo.getNombre());
            System.out.println("error " + e);
        }
        nuevoGrupo = new PRARoles();
        grupos = wcgfl.findAll();
    }

    public void editarNuevoGrupo(PRARoles io) {
        try {

            // io.setTipoGruposUsuarios(nuevoCheck);
            wcgfl.edit(io);

            mensaje(FacesMessage.SEVERITY_INFO,"Editado Rol", nuevoGrupo.getNombre());
        } catch (Exception e) {
            mensaje(FacesMessage.SEVERITY_ERROR,"Error de Editado", nuevoGrupo.getNombre());
            System.out.println("error " + e);
        }

        selectGrupo = new PRARoles();
    }

    public Integer opcionesRol(Integer idRol) {

        Integer rs = 0;
        List<PRARolesPermiso> pe = new ArrayList<>();
        pe.addAll(wcogfl.permisoRoles(idRol));

        if (pe.size() > 0) {
            rs = pe.size();
        }

        return rs;
    }

    public void mensaje(FacesMessage.Severity severity, String titulo, String detalle) {
        FacesContext.getCurrentInstance().
                addMessage(null, new FacesMessage(severity, titulo, detalle));
    }


}
