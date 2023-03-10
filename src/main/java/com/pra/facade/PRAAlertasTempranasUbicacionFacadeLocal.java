/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.pra.facade;

import com.pra.dbcom.PRAAlertasTempranasUbicacion;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author obper
 */
@Local
public interface PRAAlertasTempranasUbicacionFacadeLocal {

    void create(PRAAlertasTempranasUbicacion pRAAlertasTempranasUbicacion);

    void edit(PRAAlertasTempranasUbicacion pRAAlertasTempranasUbicacion);

    void remove(PRAAlertasTempranasUbicacion pRAAlertasTempranasUbicacion);

    PRAAlertasTempranasUbicacion find(Object id);

    List<PRAAlertasTempranasUbicacion> findAll();

    List<PRAAlertasTempranasUbicacion> findRange(int[] range);

    int count();
    
}
