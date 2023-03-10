/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pra.facade;

import com.pra.dbcom.PRARoles;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 * @author obper
 */
@Stateless
public class PRARolesFacade extends AbstractFacade<PRARoles> implements PRARolesFacadeLocal {

    @PersistenceContext(unitName = "siam")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PRARolesFacade() {
        super(PRARoles.class);
    }

    @Override
    public PRARoles rolporid(Integer idRol) {
        Query q = em.createNamedQuery("PRARoles.findByIDRol");
        q.setParameter("iDRol", idRol);

        PRARoles rs = new PRARoles();
        try {
            rs = (PRARoles) q.getResultList().get(1);
        } catch (Exception i) {
            System.err.println("ERROR ROL = " + i.toString());
        }
        rs = (PRARoles) q.getResultList().get(1);

        return rs;
    }

    @Override
    public Integer maxIdRol(){

        Query q = em.createNamedQuery("PRARoles.MaxIdRol");

        return (Integer) q.getResultList().get(0);

    }

    @Override
    public void crearNuevoRol (PRARoles rol){

        Query  q = em.createNativeQuery("insert into PRA_Roles (Nombre) values (?)", PRARoles.class);
        q.setParameter(1, rol.getNombre());

        q.executeUpdate();

    }

}
