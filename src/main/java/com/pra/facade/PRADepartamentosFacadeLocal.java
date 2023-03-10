/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.pra.facade;

import com.pra.dbcom.PRADepartamentos;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author obper
 */
@Local
public interface PRADepartamentosFacadeLocal {

    void create(PRADepartamentos pRADepartamentos);

    void edit(PRADepartamentos pRADepartamentos);

    void remove(PRADepartamentos pRADepartamentos);

    PRADepartamentos find(Object id);

    List<PRADepartamentos> findAll();

    List<PRADepartamentos> findRange(int[] range);

    int count();
    
}
