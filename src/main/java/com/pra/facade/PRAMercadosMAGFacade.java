/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pra.facade;

import com.pra.dbcom.PRAMercadosMAG;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author obper
 */
@Stateless
public class PRAMercadosMAGFacade extends AbstractFacade<PRAMercadosMAG> implements PRAMercadosMAGFacadeLocal {

    @PersistenceContext(unitName = "siam")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PRAMercadosMAGFacade() {
        super(PRAMercadosMAG.class);
    }
    
}
