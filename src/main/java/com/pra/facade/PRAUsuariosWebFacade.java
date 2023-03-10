/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pra.facade;

import com.pra.dbcom.PRAUsuariosWeb;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author obper
 */
@Stateless
public class PRAUsuariosWebFacade extends AbstractFacade<PRAUsuariosWeb> implements PRAUsuariosWebFacadeLocal {

    @PersistenceContext(unitName = "siam")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PRAUsuariosWebFacade() {
        super(PRAUsuariosWeb.class);
    }

    @Override
    public PRAUsuariosWeb obtenerUsuario(String user, String pass){

        Query q = em.createNamedQuery("PRAUsuariosWeb.findByNombresyPass");
        q.setParameter("usuario", user);
        q.setParameter("clave", pass);



        return (PRAUsuariosWeb) q.getResultList().get(0);
    }

    @Override
    public Integer maxUser() {
        return Integer.parseInt(em.createNamedQuery("PRAUsuariosWeb.maxUser").getSingleResult().toString());
    }
    
}
