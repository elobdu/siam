/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.pra.facade;

import com.pra.dbcom.PRACategoriasProductosMAG;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author obper
 */
@Local
public interface PRACategoriasProductosMAGFacadeLocal {

    void create(PRACategoriasProductosMAG pRACategoriasProductosMAG);

    void edit(PRACategoriasProductosMAG pRACategoriasProductosMAG);

    void remove(PRACategoriasProductosMAG pRACategoriasProductosMAG);

    PRACategoriasProductosMAG find(Object id);

    List<PRACategoriasProductosMAG> findAll();

    List<PRACategoriasProductosMAG> findRange(int[] range);

    int count();
    
}
