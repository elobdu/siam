/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.pra.facade;

import com.pra.dbcom.PRASugerenciasEstados;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author obper
 */
@Local
public interface PRASugerenciasEstadosFacadeLocal {

    void create(PRASugerenciasEstados pRASugerenciasEstados);

    void edit(PRASugerenciasEstados pRASugerenciasEstados);

    void remove(PRASugerenciasEstados pRASugerenciasEstados);

    PRASugerenciasEstados find(Object id);

    List<PRASugerenciasEstados> findAll();

    List<PRASugerenciasEstados> findRange(int[] range);

    int count();
    
}
