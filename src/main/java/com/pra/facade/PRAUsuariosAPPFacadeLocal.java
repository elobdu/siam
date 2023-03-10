/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.pra.facade;

import com.pra.dbcom.PRAUsuariosAPP;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author obper
 */
@Local
public interface PRAUsuariosAPPFacadeLocal {

    void create(PRAUsuariosAPP pRAUsuariosAPP);

    void edit(PRAUsuariosAPP pRAUsuariosAPP);

    void remove(PRAUsuariosAPP pRAUsuariosAPP);

    PRAUsuariosAPP find(Object id);

    List<PRAUsuariosAPP> findAll();

    List<PRAUsuariosAPP> findRange(int[] range);

    int count();
    
}
