/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pra.facade;

import com.pra.dbcom.PRAPantallas;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author obper
 */
@Stateless
public class PRAPantallasFacade extends AbstractFacade<PRAPantallas> implements PRAPantallasFacadeLocal {

    @PersistenceContext(unitName = "siam")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PRAPantallasFacade() {
        super(PRAPantallas.class);
    }

    @Override
    public PRAPantallas pantallaporid(Integer idPantalla){
        Query q = em.createNamedQuery("PRAPantallas.findByIDPantalla");
        q.setParameter("iDPantalla",idPantalla);

        PRAPantallas rs = new PRAPantallas();
        rs = (PRAPantallas) q.getResultList().get(1);
        return rs;

    }

    
}
