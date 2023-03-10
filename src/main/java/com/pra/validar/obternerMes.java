/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pra.validar;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author obper
 */
public class obternerMes {

    public String obtenerMes(int mes) {

        String mesLetras = new String();

        if (mes == 0) {
            mes = mes + 1;
        }

        switch (mes) {

            case 1:
                mesLetras = "ENERO";
                break;
            case 2:
                mesLetras = "FEBRERO";
                break;
            case 3:
                mesLetras = "MARZO";
                break;
            case 4:
                mesLetras = "ABRIL";
                break;
            case 5:
                mesLetras = "MAYO";
                break;
            case 6:
                mesLetras = "JUNIO";
                break;
            case 7:
                mesLetras = "JULIO";
                break;
            case 8:
                mesLetras = "AGOSTO";
                break;
            case 9:
                mesLetras = "SEPTIEMBRE";
                break;
            case 10:
                mesLetras = "OCTUBRE";
                break;
            case 11:
                mesLetras = "NOVIEMBRE";
                break;
            case 12:
                mesLetras = "DICIEMBRE";
                break;
            default:
                break;

        }

        return mesLetras;
    }

    public String obtenerFechaFormateada() {

        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        String requiredDate = df.format(new Date()).toString();
        
        return requiredDate;

    }

    public obternerMes() {
    }

}
