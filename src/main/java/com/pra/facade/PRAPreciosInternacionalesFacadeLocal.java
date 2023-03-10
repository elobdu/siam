/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.pra.facade;

import com.pra.dbcom.PRAPreciosInternacionales;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author obper
 */
@Local
public interface PRAPreciosInternacionalesFacadeLocal {

    void create(PRAPreciosInternacionales pRAPreciosInternacionales);

    void edit(PRAPreciosInternacionales pRAPreciosInternacionales);

    void remove(PRAPreciosInternacionales pRAPreciosInternacionales);

    PRAPreciosInternacionales find(Object id);

    List<PRAPreciosInternacionales> findAll();

    List<PRAPreciosInternacionales> findRange(int[] range);

    int count();
    
}
