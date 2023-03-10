/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pra.facade;

import com.pra.dbcom.PRARolesPermiso;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

/**
 * @author obper
 */
@Stateless
public class PRARolesPermisoFacade extends AbstractFacade<PRARolesPermiso> implements PRARolesPermisoFacadeLocal {

    @PersistenceContext(unitName = "siam")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PRARolesPermisoFacade() {
        super(PRARolesPermiso.class);
    }

    @Override
    public List<PRARolesPermiso> permisoRoles(Integer idRol) {
        Query q = em.createNamedQuery("PRARolesPermiso.findByIDRol");
        q.setParameter("iDRol", idRol);

        List<PRARolesPermiso> rs = new ArrayList<>();
        rs = q.getResultList();

        return rs;

    }

    @Override
    public Integer maxIdRolPermiso() {

        Query q = em.createNamedQuery("PRARolesPermiso.MaxIdPermisoRol");

        return (Integer) q.getResultList().get(0);

    }

    @Override
    public PRARolesPermiso permioRolIn(Integer idRol, Integer idPantalla) {

        Query q = em.createNamedQuery("PRARolesPermiso.findByRol&Pantalla");
        q.setParameter("iDRol", idRol);
        q.setParameter("iDPantallas", idPantalla);
        List<PRARolesPermiso> rsl = new ArrayList<>();
        rsl.addAll(q.getResultList());

        return rsl.get(0);

    }

    @Override
    public void crearRolPermiso(PRARolesPermiso rolper) {

        Query q = em.createNativeQuery("insert into PRA_Roles_Permiso (ID_Rol, ID_Pantallas) values (?, ?)");
        q.setParameter(1, rolper.getIDRol());
        q.setParameter(2, rolper.getIDPantallas());
        q.executeUpdate();


    }

}
