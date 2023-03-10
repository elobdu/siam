/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.pra.facade;

import com.pra.dbcom.PRACategoriasProductosProductores;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author obper
 */
@Local
public interface PRACategoriasProductosProductoresFacadeLocal {

    void create(PRACategoriasProductosProductores pRACategoriasProductosProductores);

    void edit(PRACategoriasProductosProductores pRACategoriasProductosProductores);

    void remove(PRACategoriasProductosProductores pRACategoriasProductosProductores);

    PRACategoriasProductosProductores find(Object id);

    List<PRACategoriasProductosProductores> findAll();

    List<PRACategoriasProductosProductores> findRange(int[] range);

    int count();
    
}
