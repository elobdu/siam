/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.pra.facade;

import com.pra.dbcom.PRARolesPermiso;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author obper
 */
@Local
public interface PRARolesPermisoFacadeLocal {

    void create(PRARolesPermiso pRARolesPermiso);

    void edit(PRARolesPermiso pRARolesPermiso);

    void remove(PRARolesPermiso pRARolesPermiso);

    PRARolesPermiso find(Object id);

    List<PRARolesPermiso> findAll();

    List<PRARolesPermiso> findRange(int[] range);

    int count();

    List<PRARolesPermiso> permisoRoles (Integer idRol);


    public Integer maxIdRolPermiso();

    public PRARolesPermiso permioRolIn(Integer idRol, Integer idPantalla);
    public void crearRolPermiso(PRARolesPermiso rolper);

}
