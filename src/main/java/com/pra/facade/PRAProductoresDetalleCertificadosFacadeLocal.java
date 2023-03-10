/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.pra.facade;

import com.pra.dbcom.PRAProductoresDetalleCertificados;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author obper
 */
@Local
public interface PRAProductoresDetalleCertificadosFacadeLocal {

    void create(PRAProductoresDetalleCertificados pRAProductoresDetalleCertificados);

    void edit(PRAProductoresDetalleCertificados pRAProductoresDetalleCertificados);

    void remove(PRAProductoresDetalleCertificados pRAProductoresDetalleCertificados);

    PRAProductoresDetalleCertificados find(Object id);

    List<PRAProductoresDetalleCertificados> findAll();

    List<PRAProductoresDetalleCertificados> findRange(int[] range);

    int count();
    
}
