/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.pra.facade;

import com.pra.dbcom.PRANotificacionesPush;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author obper
 */
@Local
public interface PRANotificacionesPushFacadeLocal {

    void create(PRANotificacionesPush pRANotificacionesPush);

    void edit(PRANotificacionesPush pRANotificacionesPush);

    void remove(PRANotificacionesPush pRANotificacionesPush);

    PRANotificacionesPush find(Object id);

    List<PRANotificacionesPush> findAll();

    List<PRANotificacionesPush> findRange(int[] range);

    int count();
    
}
