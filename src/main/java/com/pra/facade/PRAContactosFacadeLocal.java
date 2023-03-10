/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.pra.facade;

import com.pra.dbcom.PRAContactos;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author obper
 */
@Local
public interface PRAContactosFacadeLocal {

    void create(PRAContactos pRAContactos);

    void edit(PRAContactos pRAContactos);

    void remove(PRAContactos pRAContactos);

    PRAContactos find(Object id);

    List<PRAContactos> findAll();

    List<PRAContactos> findRange(int[] range);

    int count();
    
}
