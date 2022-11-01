
package com.portfolio.ef.Dto;

import javax.validation.constraints.NotBlank;


public class DtoSobreMi {
    @NotBlank
    private String descripcionSM;

    public DtoSobreMi() {
    }

    public DtoSobreMi(String descripcionSM) {
        this.descripcionSM = descripcionSM;
    }

    public String getDescripcionSM() {
        return descripcionSM;
    }

    public void setDescripcionSM(String descripcionSM) {
        this.descripcionSM = descripcionSM;
    }


    
}
