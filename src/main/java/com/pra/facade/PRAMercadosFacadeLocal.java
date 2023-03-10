/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.pra.facade;

import com.pra.dbcom.PRAMercados;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author obper
 */
@Local
public interface PRAMercadosFacadeLocal {

    void create(PRAMercados pRAMercados);

    void edit(PRAMercados pRAMercados);

    void remove(PRAMercados pRAMercados);

    PRAMercados find(Object id);

    List<PRAMercados> findAll();

    List<PRAMercados> findRange(int[] range);

    int count();
    
}
