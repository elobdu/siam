/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.pra.facade;

import com.pra.dbcom.PRATiposContactos;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author obper
 */
@Local
public interface PRATiposContactosFacadeLocal {

    void create(PRATiposContactos pRATiposContactos);

    void edit(PRATiposContactos pRATiposContactos);

    void remove(PRATiposContactos pRATiposContactos);

    PRATiposContactos find(Object id);

    List<PRATiposContactos> findAll();

    List<PRATiposContactos> findRange(int[] range);

    int count();
    
}
