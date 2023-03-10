/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.pra.facade;

import com.pra.dbcom.PRAProductosListaNegra;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author obper
 */
@Local
public interface PRAProductosListaNegraFacadeLocal {

    void create(PRAProductosListaNegra pRAProductosListaNegra);

    void edit(PRAProductosListaNegra pRAProductosListaNegra);

    void remove(PRAProductosListaNegra pRAProductosListaNegra);

    PRAProductosListaNegra find(Object id);

    List<PRAProductosListaNegra> findAll();

    List<PRAProductosListaNegra> findRange(int[] range);

    int count();
    
}
