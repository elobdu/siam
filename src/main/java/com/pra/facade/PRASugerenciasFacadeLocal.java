/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.pra.facade;

import com.pra.dbcom.PRASugerencias;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author obper
 */
@Local
public interface PRASugerenciasFacadeLocal {

    void create(PRASugerencias pRASugerencias);

    void edit(PRASugerencias pRASugerencias);

    void remove(PRASugerencias pRASugerencias);

    PRASugerencias find(Object id);

    List<PRASugerencias> findAll();

    List<PRASugerencias> findRange(int[] range);

    int count();
    
}
