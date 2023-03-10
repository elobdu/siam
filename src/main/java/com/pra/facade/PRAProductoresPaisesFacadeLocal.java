/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.pra.facade;

import com.pra.dbcom.PRAProductoresPaises;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author obper
 */
@Local
public interface PRAProductoresPaisesFacadeLocal {

    void create(PRAProductoresPaises pRAProductoresPaises);

    void edit(PRAProductoresPaises pRAProductoresPaises);

    void remove(PRAProductoresPaises pRAProductoresPaises);

    PRAProductoresPaises find(Object id);

    List<PRAProductoresPaises> findAll();

    List<PRAProductoresPaises> findRange(int[] range);

    int count();
    
}
