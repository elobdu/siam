/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.pra.facade;

import com.pra.dbcom.PRAPreciosInformeRetrospectiva;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author obper
 */
@Local
public interface PRAPreciosInformeRetrospectivaFacadeLocal {

    void create(PRAPreciosInformeRetrospectiva pRAPreciosInformeRetrospectiva);

    void edit(PRAPreciosInformeRetrospectiva pRAPreciosInformeRetrospectiva);

    void remove(PRAPreciosInformeRetrospectiva pRAPreciosInformeRetrospectiva);

    PRAPreciosInformeRetrospectiva find(Object id);

    List<PRAPreciosInformeRetrospectiva> findAll();

    List<PRAPreciosInformeRetrospectiva> findRange(int[] range);

    int count();
    
}
