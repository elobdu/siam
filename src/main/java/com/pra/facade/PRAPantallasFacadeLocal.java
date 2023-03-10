/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.pra.facade;

import com.pra.dbcom.PRAPantallas;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author obper
 */
@Local
public interface PRAPantallasFacadeLocal {

    void create(PRAPantallas pRAPantallas);

    void edit(PRAPantallas pRAPantallas);

    void remove(PRAPantallas pRAPantallas);

    PRAPantallas find(Object id);

    List<PRAPantallas> findAll();

    List<PRAPantallas> findRange(int[] range);

    int count();

    public PRAPantallas pantallaporid(Integer idPantalla);
}
