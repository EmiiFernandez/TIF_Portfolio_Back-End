
package com.portfolio.ef.Dto;

import javax.validation.constraints.NotBlank;


public class DtoSkills {
    @NotBlank
    private String nombreS;
    @NotBlank
    private int porcentajeS;
    
     //Constructores

    public DtoSkills() {
    }

    public DtoSkills(String nombreS, int porcentajeS) {
        this.nombreS = nombreS;
        this.porcentajeS = porcentajeS;
    }
    
     //Getters & Setters

    public String getNombreS() {
        return nombreS;
    }

    public void setNombreS(String nombreS) {
        this.nombreS = nombreS;
    }

    public int getPorcentajeS() {
        return porcentajeS;
    }

    public void setPorcentajeS(int porcentajeS) {
        this.porcentajeS = porcentajeS;
    }

   
}
