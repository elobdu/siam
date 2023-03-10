/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.pra.facade;

import com.pra.dbcom.PRACategoriasListaNegra;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author obper
 */
@Local
public interface PRACategoriasListaNegraFacadeLocal {

    void create(PRACategoriasListaNegra pRACategoriasListaNegra);

    void edit(PRACategoriasListaNegra pRACategoriasListaNegra);

    void remove(PRACategoriasListaNegra pRACategoriasListaNegra);

    PRACategoriasListaNegra find(Object id);

    List<PRACategoriasListaNegra> findAll();

    List<PRACategoriasListaNegra> findRange(int[] range);

    int count();
    
}
