package com.portfolio.cbw.Dto;

import javax.validation.constraints.NotBlank;

public class DtoProyectos {
    @NotBlank
    private String nombreP;
    @NotBlank
    private String descripcionP;
    @NotBlank
    private String imgP;
    @NotBlank
    private String enlaceP;
    
    //Constructores

    public DtoProyectos() {
    }

    public DtoProyectos(String nombreP, String descripcionP, String imgP, String enlaceP) {
        this.nombreP = nombreP;
        this.descripcionP = descripcionP;
        this.imgP = imgP;
        this.enlaceP = enlaceP;
    }

    //Getter y Setter

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public String getDescripcionP() {
        return descripcionP;
    }

    public void setDescripcionP(String descripcionP) {
        this.descripcionP = descripcionP;
    }

    public String getImgP() {
        return imgP;
    }

    public void setImgP(String imgP) {
        this.imgP = imgP;
    }

    public String getEnlaceP() {
        return enlaceP;
    }

    public void setEnlaceP(String enlaceP) {
        this.enlaceP = enlaceP;
    }

    
}
