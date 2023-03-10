package com.pra.alertas;

import com.pra.dbcom.PRAAlertasTempranas;
import com.pra.dbcom.PRATipoAlertas;
import com.pra.facade.PRAAlertasTempranasFacadeLocal;
import com.pra.facade.PRATipoAlertasFacadeLocal;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named
@ManagedBean
@javax.faces.view.ViewScoped
public class balertastempranas implements Serializable {

    @EJB
    private PRAAlertasTempranasFacadeLocal atfl;
    @EJB
    private PRATipoAlertasFacadeLocal tafl;

    private PRAAlertasTempranas alertasTempranaNueva;
    private PRAAlertasTempranas alertasTempranaSelect;
    private List<PRAAlertasTempranas> alertasTempranaLista;
    private List<PRATipoAlertas> tiposAlerta;

    public PRAAlertasTempranas getAlertasTempranaNueva() {
        return alertasTempranaNueva;
    }

    public void setAlertasTempranaNueva(PRAAlertasTempranas alertasTempranaNueva) {
        this.alertasTempranaNueva = alertasTempranaNueva;
    }

    public PRAAlertasTempranas getAlertasTempranaSelect() {
        return alertasTempranaSelect;
    }

    public void setAlertasTempranaSelect(PRAAlertasTempranas alertasTempranaSelect) {
        this.alertasTempranaSelect = alertasTempranaSelect;
    }

    public List<PRAAlertasTempranas> getAlertasTempranaLista() {
        return alertasTempranaLista;
    }

    public void setAlertasTempranaLista(List<PRAAlertasTempranas> alertasTempranaLista) {
        this.alertasTempranaLista = alertasTempranaLista;
    }

    public List<PRATipoAlertas> getTiposAlerta() {
        return tiposAlerta;
    }

    public void setTiposAlerta(List<PRATipoAlertas> tiposAlerta) {
        this.tiposAlerta = tiposAlerta;
    }

    @PostConstruct
    public void init() {
        this.alertasTempranaLista = new ArrayList<>();
        this.tiposAlerta = new ArrayList<>();
        this.alertasTempranaNueva = new PRAAlertasTempranas();
        this.alertasTempranaSelect = new PRAAlertasTempranas();
        tiposAlerta = tafl.findAll();
        alertasTempranaLista = atfl.obtenerAlertasOrdenUltimoIngreso();
    }


    public void guardarAlerta(PRAAlertasTempranas io) {



        try {

            atfl.crearAlertaTemprana(io);

            mensaje(FacesMessage.SEVERITY_INFO, "Nuevo Alerta", io.getTextoAlerta());

        } catch (Exception e) {
            mensaje(FacesMessage.SEVERITY_ERROR, "Error Alerta", io.getTextoAlerta());
            System.out.println("error " + e);
        }
        alertasTempranaNueva = new PRAAlertasTempranas();
        alertasTempranaLista = atfl.obtenerAlertasOrdenUltimoIngreso();



    }

    public void editarAlerta(PRAAlertasTempranas io) {
        try {

            atfl.edit(io);

            mensaje(FacesMessage.SEVERITY_INFO, "Editar Alerta", io.getTextoAlerta());

        } catch (Exception e) {
            mensaje(FacesMessage.SEVERITY_ERROR, "Error Alerta", io.getTextoAlerta());
            System.out.println("error " + e);
        }
        alertasTempranaSelect = new PRAAlertasTempranas();
        alertasTempranaLista = atfl.obtenerAlertasOrdenUltimoIngreso();
    }

    public String validaActivo(boolean estado) {

        String rs = estado ? "ACTIVO" : "INACTIVO";

        return rs;

    }

    public String validaActivoColor(boolean estado) {

        String rs = estado ? "#3e7f5b" : "#ff5555";

        return rs;
    }

    public void mensaje(FacesMessage.Severity severity, String titulo, String detalle) {
        FacesContext.getCurrentInstance().
                addMessage(null, new FacesMessage(severity, titulo, detalle));
    }

    public balertastempranas() {
    }
}
