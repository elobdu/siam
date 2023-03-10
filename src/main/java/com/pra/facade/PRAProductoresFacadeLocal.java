/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.pra.facade;

import com.pra.dbcom.PRAProductores;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author obper
 */
@Local
public interface PRAProductoresFacadeLocal {

    void create(PRAProductores pRAProductores);

    void edit(PRAProductores pRAProductores);

    void remove(PRAProductores pRAProductores);

    PRAProductores find(Object id);

    List<PRAProductores> findAll();

    List<PRAProductores> findRange(int[] range);

    int count();
    
}
