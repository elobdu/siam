/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.pra.facade;

import com.pra.dbcom.PRASugerenciasTitulo;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author obper
 */
@Local
public interface PRASugerenciasTituloFacadeLocal {

    void create(PRASugerenciasTitulo pRASugerenciasTitulo);

    void edit(PRASugerenciasTitulo pRASugerenciasTitulo);

    void remove(PRASugerenciasTitulo pRASugerenciasTitulo);

    PRASugerenciasTitulo find(Object id);

    List<PRASugerenciasTitulo> findAll();

    List<PRASugerenciasTitulo> findRange(int[] range);

    int count();
    
}
