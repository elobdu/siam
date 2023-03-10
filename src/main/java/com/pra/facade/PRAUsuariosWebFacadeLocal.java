/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.pra.facade;

import com.pra.dbcom.PRAUsuariosWeb;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author obper
 */
@Local
public interface PRAUsuariosWebFacadeLocal {

    void create(PRAUsuariosWeb pRAUsuariosWeb);

    void edit(PRAUsuariosWeb pRAUsuariosWeb);

    void remove(PRAUsuariosWeb pRAUsuariosWeb);

    PRAUsuariosWeb find(Object id);

    List<PRAUsuariosWeb> findAll();

    List<PRAUsuariosWeb> findRange(int[] range);

    int count();

    public PRAUsuariosWeb obtenerUsuario(String user, String pass);

    Integer maxUser();
    
}
