
package com.portfolio.ef.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

   @Entity
public class SobreMi  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String descripcionSM;

    public SobreMi() {
    }

    public SobreMi(String descripcionSM) {
        this.descripcionSM = descripcionSM;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcionSM() {
        return descripcionSM;
    }

    public void setDescripcionSM(String descripcionSM) {
        this.descripcionSM = descripcionSM;
    }
    
    
    
}
