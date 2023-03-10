package com.pra.informacion;

import com.pra.dbcom.PRAInformacion;
import com.pra.facade.PRAInformacionFacadeLocal;
import com.pra.utilitarios.ConversorArchivosSO;
import org.omnifaces.cdi.GraphicImageBean;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.ByteArrayContent;
import org.primefaces.model.CroppedImage;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import java.io.ByteArrayInputStream;


import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.event.PhaseId;
import javax.inject.Named;
import javax.servlet.ServletContext;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

@Named
@ManagedBean
@ViewScoped
@GraphicImageBean
public class bcadenasProductivas implements Serializable {

    private String imageTemp;
    private CroppedImage croppeFoto;
    private StreamedContent imagenSistema;
    private String realPaht;

@EJB
private PRAInformacionFacadeLocal iflo;
private List<PRAInformacion> listCadenas;
private PRAInformacion cadenaSelect;
private PRAInformacion cadenaNew;

    public List<PRAInformacion> getListCadenas() {
        return listCadenas;
    }

    public void setListCadenas(List<PRAInformacion> listCadenas) {
        this.listCadenas = listCadenas;
    }

    public PRAInformacion getCadenaSelect() {
        return cadenaSelect;
    }

    public void setCadenaSelect(PRAInformacion cadenaSelect) {
        this.cadenaSelect = cadenaSelect;
    }

    public PRAInformacion getCadenaNew() {
        return cadenaNew;
    }

    public void setCadenaNew(PRAInformacion cadenaNew) {
        this.cadenaNew = cadenaNew;
    }

    public String getImageTemp() {
        return imageTemp;
    }

    public void setImageTemp(String imageTemp) {
        this.imageTemp = imageTemp;
    }

    public CroppedImage getCroppeFoto() {
        return croppeFoto;
    }

    public void setCroppeFoto(CroppedImage croppeFoto) {
        this.croppeFoto = croppeFoto;
    }

    public StreamedContent getImagenSistema() {
        return imagenSistema;
    }

    public void setImagenSistema(StreamedContent imagenSistema) {
        this.imagenSistema = imagenSistema;
    }

    public String getRealPaht() {
        return realPaht;
    }

    public void setRealPaht(String realPaht) {
        this.realPaht = realPaht;
    }

    @PostConstruct
    public void init(){
        this.listCadenas = new ArrayList<>();
        this.cadenaSelect = new PRAInformacion();
        this.cadenaNew = new PRAInformacion();
        ConversorArchivosSO co = new ConversorArchivosSO();
      //  this.imagenSistema = co.datosPersonal("default.jpg");
        listCadenas = iflo.findAll();
    }

    public String validaActivo(boolean estado) {

        String rs = estado ? "ACTIVO" : "INACTIVO";

        return rs;

    }

    public String validaActivoColor(boolean estado) {

        String rs = estado ? "#3e7f5b" : "#ff5555";

        return rs;

    }

    public void uploadFile(FileUploadEvent event) {
        try {

            ServletContext ctx = (ServletContext) FacesContext.getCurrentInstance()
                    .getExternalContext().getContext();
            String realPath = ctx.getRealPath("/");
            String path = realPath + "image/temp/";

            File f = new File(path);

            if (f.mkdirs()) {
                System.out.println("Directory is created");
            } else {
                System.out.println("Directory cannot be created");
            }

            String archivo = path + File.separator + event.getFile().getFileName();

            FileOutputStream fileOutputStream = new FileOutputStream(archivo);
            byte[] buffer = new byte[6124];
            int bulk;
            InputStream inputStream = event.getFile().getInputstream();
            while (true) {
                bulk = inputStream.read(buffer);
                if (bulk < 0) {
                    break;
                }
                fileOutputStream.write(buffer, 0, bulk);
                fileOutputStream.flush();
            }
            fileOutputStream.close();
            inputStream.close();

            this.setImageTemp(event.getFile().getFileName());

        } catch (IOException e) {
            e.printStackTrace();
            FacesContext.getCurrentInstance().addMessage("", new FacesMessage(FacesMessage.SEVERITY_ERROR, "", "Error al subir el archivo"));
        }
    }


    public StreamedContent validaImagen(byte[] imageData) {
        if (FacesContext.getCurrentInstance().getCurrentPhaseId() == PhaseId.RENDER_RESPONSE) {
            return new DefaultStreamedContent();
        } else {
            return new ByteArrayContent(imageData);
        }
      //  return rs;
    }


    public bcadenasProductivas() {
    }
    public DefaultStreamedContent getMyImage(byte[] imageIn)    {
        byte[] buffer;
        FacesContext fc = FacesContext.getCurrentInstance();
        DefaultStreamedContent stream = new DefaultStreamedContent();
        if (!fc.getRenderResponse())        {
            try{
                ByteArrayInputStream input = new ByteArrayInputStream(imageIn);
                stream  = new DefaultStreamedContent(input,"image/png");

            }catch (Exception e){

                System.err.println(e.toString() + " <-- Error imagen");
            }

        }
        return stream;
    }
}
