/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.pra.facade;

import com.pra.dbcom.PRAProductos;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author obper
 */
@Local
public interface PRAProductosFacadeLocal {

    void create(PRAProductos pRAProductos);

    void edit(PRAProductos pRAProductos);

    void remove(PRAProductos pRAProductos);

    PRAProductos find(Object id);

    List<PRAProductos> findAll();

    List<PRAProductos> findRange(int[] range);

    int count();
    
}
