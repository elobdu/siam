/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.pra.facade;

import com.pra.dbcom.PRAAlertasTempranas;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author obper
 */
@Local
public interface PRAAlertasTempranasFacadeLocal {

    void create(PRAAlertasTempranas pRAAlertasTempranas);

    void edit(PRAAlertasTempranas pRAAlertasTempranas);

    void remove(PRAAlertasTempranas pRAAlertasTempranas);

    PRAAlertasTempranas find(Object id);

    List<PRAAlertasTempranas> findAll();

    List<PRAAlertasTempranas> findRange(int[] range);

    int count();

    public void crearAlertaTemprana(PRAAlertasTempranas alerm);

    public List<PRAAlertasTempranas> obtenerAlertasOrdenUltimoIngreso();
    
}
