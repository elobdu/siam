/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.pra.facade;

import com.pra.dbcom.PRAMercadosMAG;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author obper
 */
@Local
public interface PRAMercadosMAGFacadeLocal {

    void create(PRAMercadosMAG pRAMercadosMAG);

    void edit(PRAMercadosMAG pRAMercadosMAG);

    void remove(PRAMercadosMAG pRAMercadosMAG);

    PRAMercadosMAG find(Object id);

    List<PRAMercadosMAG> findAll();

    List<PRAMercadosMAG> findRange(int[] range);

    int count();
    
}
