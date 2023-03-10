/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pra.utilitarios;

import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;

import java.io.*;


/**
 *
 * @author root
 */
public class ConversorArchivosSO implements Serializable {

    public StreamedContent datosPersonal(String nombreArchivo){

        ByteArrayOutputStream out = null;

        if (nombreArchivo == null) {
            out = traerArchivo("/opt/personal/", "default.jpg");
            InputStream myInputStream2 = new ByteArrayInputStream(out.toByteArray());
            return new DefaultStreamedContent(myInputStream2);
        }
        if (nombreArchivo.length() > 2) {
            out = traerArchivo("/opt/personal/", nombreArchivo);
            InputStream myInputStream2 = new ByteArrayInputStream(out.toByteArray());
            return new DefaultStreamedContent(myInputStream2);

        } else {
            out = traerArchivo("/opt/personal/", "default.jpg");
            InputStream myInputStream2 = new ByteArrayInputStream(out.toByteArray());
            return new DefaultStreamedContent(myInputStream2);
        }

    }




    public ByteArrayOutputStream traerArchivo(String ruta, String nombre_archivo) {

        ByteArrayOutputStream out = null;
        String path = ruta + nombre_archivo;
        InputStream in = null;

        try {
            File remoteFile = new File(path);
            in = new BufferedInputStream(new FileInputStream(remoteFile));
            out = new ByteArrayOutputStream((int) remoteFile.length());
            byte[] buffer = new byte[4096];
            int len = 0; //Read length
            while ((len = in.read(buffer, 0, buffer.length)) != -1) {
                out.write(buffer, 0, len);
            }
            out.flush();
        } catch (Exception e) {
            String msg = "ERROR DESCARGANDO ARCHIVO " + e.getMessage();
            System.out.println(msg);
        } finally {
            try {
                if (out != null) {
                    out.close();
                }
                if (in != null) {
                    in.close();
                }
            } catch (Exception e) {
            }
        }

        return out;
    }

    public ConversorArchivosSO() {
    }
}
