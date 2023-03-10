/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pra.facade;

import com.pra.dbcom.PRAAlertasTempranas;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author obper
 */
@Stateless
public class PRAAlertasTempranasFacade extends AbstractFacade<PRAAlertasTempranas> implements PRAAlertasTempranasFacadeLocal {

    @PersistenceContext(unitName = "siam")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PRAAlertasTempranasFacade() {
        super(PRAAlertasTempranas.class);
    }

    @Override
    public void crearAlertaTemprana(PRAAlertasTempranas alerm) {

        Query q = em.createNativeQuery("insert into PRA_Alertas_Tempranas (Texto_Alerta, Descripcion,  Activo, Fecha_Creado, ID_Tipo_Alerta,  Nivel) values (?,?,?,?,?,?)");
        q.setParameter(1, alerm.getTextoAlerta());
        q.setParameter(2, alerm.getDescripcion());
        q.setParameter(3, true);
        q.setParameter(4, new Date());
        q.setParameter(5, alerm.getIDTipoAlerta());
        q.setParameter(6, 1);
        q.executeUpdate();

    }

    @Override
    public List<PRAAlertasTempranas> obtenerAlertasOrdenUltimoIngreso() {

        List<PRAAlertasTempranas> rs = new ArrayList<>();
        Query q = em.createNativeQuery("select * from PRA_Alertas_Tempranas order by  Fecha_Creado desc", PRAAlertasTempranas.class);

        rs.addAll(q.getResultList());
        return rs;
    }

}
