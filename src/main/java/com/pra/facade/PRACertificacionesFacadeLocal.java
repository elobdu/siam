/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.pra.facade;

import com.pra.dbcom.PRACertificaciones;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author obper
 */
@Local
public interface PRACertificacionesFacadeLocal {

    void create(PRACertificaciones pRACertificaciones);

    void edit(PRACertificaciones pRACertificaciones);

    void remove(PRACertificaciones pRACertificaciones);

    PRACertificaciones find(Object id);

    List<PRACertificaciones> findAll();

    List<PRACertificaciones> findRange(int[] range);

    int count();
    
}
