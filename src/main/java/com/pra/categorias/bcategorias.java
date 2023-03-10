package com.pra.categorias;

import com.pra.dbcom.PRARoles;
import com.pra.dbcom.PRATipoAlertas;
import com.pra.facade.PRATipoAlertasFacadeLocal;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Named
@ManagedBean
@javax.faces.view.ViewScoped
public class bcategorias implements Serializable {

    @EJB
    private PRATipoAlertasFacadeLocal tafl;


    private PRATipoAlertas categorias;
    private List<PRATipoAlertas> categoriasLista;
    private PRATipoAlertas categoriasSelect;

    public PRATipoAlertas getCategorias() {
        return categorias;
    }

    public void setCategorias(PRATipoAlertas categorias) {
        this.categorias = categorias;
    }

    public List<PRATipoAlertas> getCategoriasLista() {
        return categoriasLista;
    }

    public void setCategoriasLista(List<PRATipoAlertas> categoriasLista) {
        this.categoriasLista = categoriasLista;
    }

    public PRATipoAlertas getCategoriasSelect() {
        return categoriasSelect;
    }

    public void setCategoriasSelect(PRATipoAlertas categoriasSelect) {
        this.categoriasSelect = categoriasSelect;
    }

    public String validaActivo(boolean estado) {

        String rs = estado ? "ACTIVO" : "INACTIVO";

        return rs;

    }

    public String validaActivoColor(boolean estado) {

        String rs = estado ? "#3e7f5b" : "#ff5555";

        return rs;

    }

    @PostConstruct
    public void init(){

        this.categorias = new PRATipoAlertas();
        this.categoriasLista = new ArrayList<>();
        this.categoriasSelect = new PRATipoAlertas();
        categoriasLista = tafl.findAll();

    }

    public void guardarCategoria(PRATipoAlertas io){

        try {

            tafl.crearNuevoTipoAlerta(io);

            mensaje(FacesMessage.SEVERITY_INFO,"Nuevo Tipo de Alerta", io.getNombreTipoAlerta());

        } catch (Exception e) {
            mensaje(FacesMessage.SEVERITY_ERROR,"Error de Creado", io.getNombreTipoAlerta());
            System.out.println("error " + e);
        }
        categorias = new PRATipoAlertas();
        categoriasLista = tafl.findAll();

    }

    public void editarCatergoria(PRATipoAlertas io){
        try {

            tafl.edit(io);

            mensaje(FacesMessage.SEVERITY_INFO,"Editar Tipo de Alerta", io.getNombreTipoAlerta());

        } catch (Exception e) {
            mensaje(FacesMessage.SEVERITY_ERROR,"Error de Creado", io.getNombreTipoAlerta());
            System.out.println("error " + e);
        }
        categorias = new PRATipoAlertas();
        categoriasLista = tafl.findAll();
    }

    public void mensaje(FacesMessage.Severity severity, String titulo, String detalle) {
        FacesContext.getCurrentInstance().
                addMessage(null, new FacesMessage(severity, titulo, detalle));
    }

    public bcategorias() {
    }
}
