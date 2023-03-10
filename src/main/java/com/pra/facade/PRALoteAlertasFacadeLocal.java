/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.pra.facade;

import com.pra.dbcom.PRALoteAlertas;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author obper
 */
@Local
public interface PRALoteAlertasFacadeLocal {

    void create(PRALoteAlertas pRALoteAlertas);

    void edit(PRALoteAlertas pRALoteAlertas);

    void remove(PRALoteAlertas pRALoteAlertas);

    PRALoteAlertas find(Object id);

    List<PRALoteAlertas> findAll();

    List<PRALoteAlertas> findRange(int[] range);

    int count();
    
}
