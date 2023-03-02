package com.example.demo.entity.schemas.domicilio;

import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class PlanNacerZonIfBelenPK implements Serializable {
    private Integer id;
    private String calle;
    private Integer nro;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public Integer getNro() {
        return nro;
    }

    public void setNro(Integer nro) {
        this.nro = nro;
    }
}
