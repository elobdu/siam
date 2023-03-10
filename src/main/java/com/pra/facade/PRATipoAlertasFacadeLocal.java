/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.pra.facade;

import com.pra.dbcom.PRATipoAlertas;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author obper
 */
@Local
public interface PRATipoAlertasFacadeLocal {

    void create(PRATipoAlertas pRATipoAlertas);

    void edit(PRATipoAlertas pRATipoAlertas);

    void remove(PRATipoAlertas pRATipoAlertas);

    PRATipoAlertas find(Object id);

    List<PRATipoAlertas> findAll();

    List<PRATipoAlertas> findRange(int[] range);

    int count();

    public void crearNuevoTipoAlerta(PRATipoAlertas aler);
    
}
