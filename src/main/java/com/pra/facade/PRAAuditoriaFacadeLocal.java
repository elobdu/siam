/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.pra.facade;

import com.pra.dbcom.PRAAuditoria;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author obper
 */
@Local
public interface PRAAuditoriaFacadeLocal {

    void create(PRAAuditoria pRAAuditoria);

    void edit(PRAAuditoria pRAAuditoria);

    void remove(PRAAuditoria pRAAuditoria);

    PRAAuditoria find(Object id);

    List<PRAAuditoria> findAll();

    List<PRAAuditoria> findRange(int[] range);

    int count();
    
}
