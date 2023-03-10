/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.pra.facade;

import com.pra.dbcom.PRAMunicipios;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author obper
 */
@Local
public interface PRAMunicipiosFacadeLocal {

    void create(PRAMunicipios pRAMunicipios);

    void edit(PRAMunicipios pRAMunicipios);

    void remove(PRAMunicipios pRAMunicipios);

    PRAMunicipios find(Object id);

    List<PRAMunicipios> findAll();

    List<PRAMunicipios> findRange(int[] range);

    int count();

    public List<PRAMunicipios> obteneMunicipiosPorDepartamento(Integer idDepartamento);
    
}
