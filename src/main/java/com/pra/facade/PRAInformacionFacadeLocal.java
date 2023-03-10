/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.pra.facade;

import com.pra.dbcom.PRAInformacion;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author obper
 */
@Local
public interface PRAInformacionFacadeLocal {

    void create(PRAInformacion pRAInformacion);

    void edit(PRAInformacion pRAInformacion);

    void remove(PRAInformacion pRAInformacion);

    PRAInformacion find(Object id);

    List<PRAInformacion> findAll();

    List<PRAInformacion> findRange(int[] range);

    int count();
    
}
