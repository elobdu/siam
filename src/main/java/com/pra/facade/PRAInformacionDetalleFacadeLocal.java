/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.pra.facade;

import com.pra.dbcom.PRAInformacionDetalle;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author obper
 */
@Local
public interface PRAInformacionDetalleFacadeLocal {

    void create(PRAInformacionDetalle pRAInformacionDetalle);

    void edit(PRAInformacionDetalle pRAInformacionDetalle);

    void remove(PRAInformacionDetalle pRAInformacionDetalle);

    PRAInformacionDetalle find(Object id);

    List<PRAInformacionDetalle> findAll();

    List<PRAInformacionDetalle> findRange(int[] range);

    int count();
    
}
