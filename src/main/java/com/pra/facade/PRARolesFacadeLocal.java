/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.pra.facade;

import com.pra.dbcom.PRARoles;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author obper
 */
@Local
public interface PRARolesFacadeLocal {

    void create(PRARoles pRARoles);

    void edit(PRARoles pRARoles);

    void remove(PRARoles pRARoles);

    PRARoles find(Object id);

    List<PRARoles> findAll();

    List<PRARoles> findRange(int[] range);

    int count();

    public PRARoles rolporid(Integer idRol);

    public Integer maxIdRol();

    public void crearNuevoRol (PRARoles rol);
    
}
