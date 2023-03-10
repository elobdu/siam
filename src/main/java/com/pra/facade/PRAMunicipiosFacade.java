/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pra.facade;

import com.pra.dbcom.PRAMunicipios;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author obper
 */
@Stateless
public class PRAMunicipiosFacade extends AbstractFacade<PRAMunicipios> implements PRAMunicipiosFacadeLocal {

    @PersistenceContext(unitName = "siam")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PRAMunicipiosFacade() {
        super(PRAMunicipios.class);
    }

    @Override
    public List<PRAMunicipios> obteneMunicipiosPorDepartamento(Integer idDepartamento){

        List<PRAMunicipios> rs = new ArrayList<>();
        Query q = em.createNativeQuery("select * from PRA_Municipios where ID_Departamento = ?", PRAMunicipios.class);
        q.setParameter(1, idDepartamento);
        rs.addAll(q.getResultList());
        return rs ;

    }
    
}
