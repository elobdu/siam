/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pra.facade;

import com.pra.dbcom.PRADepartamentos;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author obper
 */
@Stateless
public class PRADepartamentosFacade extends AbstractFacade<PRADepartamentos> implements PRADepartamentosFacadeLocal {

    @PersistenceContext(unitName = "siam")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PRADepartamentosFacade() {
        super(PRADepartamentos.class);
    }
    
}
