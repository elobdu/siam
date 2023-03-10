/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pra.facade;

import com.pra.dbcom.PRATipoAlertas;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.Date;

/**
 *
 * @author obper
 */
@Stateless
public class PRATipoAlertasFacade extends AbstractFacade<PRATipoAlertas> implements PRATipoAlertasFacadeLocal {

    @PersistenceContext(unitName = "siam")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PRATipoAlertasFacade() {
        super(PRATipoAlertas.class);
    }

    @Override
    public void crearNuevoTipoAlerta(PRATipoAlertas aler){

        Query q = em.createNativeQuery("insert into PRA_Tipo_Alertas (Nombre_Tipo_Alerta, Activo, Fecha_Creado) values (?,?,?)");
        q.setParameter(1, aler.getNombreTipoAlerta());
        q.setParameter(2, aler.getActivo());
        q.setParameter(3, new Date());
        q.executeUpdate();

    }
    
}
