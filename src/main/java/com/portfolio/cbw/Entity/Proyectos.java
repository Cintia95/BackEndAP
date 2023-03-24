package com.portfolio.cbw.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Proyectos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @NotNull
    private String nombreP;
    
    @NotNull
    private String descripcionP;
    
    private String imgP;
    
    @NotNull
    private String enlaceP;
    
    //Constructores

    public Proyectos() {
    }

    public Proyectos(String nombreP, String descripcionP, String imgP, String enlaceP) {
        this.nombreP = nombreP;
        this.descripcionP = descripcionP;
        this.imgP = imgP;
        this.enlaceP = enlaceP;
    }
    
    //Getter y setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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