/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.pra.facade;

import com.pra.dbcom.PRATipoPrecios;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author obper
 */
@Local
public interface PRATipoPreciosFacadeLocal {

    void create(PRATipoPrecios pRATipoPrecios);

    void edit(PRATipoPrecios pRATipoPrecios);

    void remove(PRATipoPrecios pRATipoPrecios);

    PRATipoPrecios find(Object id);

    List<PRATipoPrecios> findAll();

    List<PRATipoPrecios> findRange(int[] range);

    int count();
    
}
