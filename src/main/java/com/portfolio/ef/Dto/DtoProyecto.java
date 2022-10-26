
package com.portfolio.ef.Dto;

import javax.validation.constraints.NotBlank;


public class DtoProyecto {
    @NotBlank
    private String nombreP;
    @NotBlank
    private String descripcionP;


    //Contructor

    public DtoProyecto() {
    }

    public DtoProyecto(String nombreP, String descripcionP) {
        this.nombreP = nombreP;
        this.descripcionP = descripcionP;
    }
    
    //Getters & Setters

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
}
