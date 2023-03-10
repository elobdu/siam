/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.pra.facade;

import com.pra.dbcom.PRAProductoresDetalleProductos;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author obper
 */
@Local
public interface PRAProductoresDetalleProductosFacadeLocal {

    void create(PRAProductoresDetalleProductos pRAProductoresDetalleProductos);

    void edit(PRAProductoresDetalleProductos pRAProductoresDetalleProductos);

    void remove(PRAProductoresDetalleProductos pRAProductoresDetalleProductos);

    PRAProductoresDetalleProductos find(Object id);

    List<PRAProductoresDetalleProductos> findAll();

    List<PRAProductoresDetalleProductos> findRange(int[] range);

    int count();
    
}
