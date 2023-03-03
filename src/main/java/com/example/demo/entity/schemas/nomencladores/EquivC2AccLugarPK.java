package com.example.demo.entity.schemas.nomencladores;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class EquivC2AccLugarPK implements Serializable {
    @Column(name = "codigoc2")
    private String codigoC2;
    private String lugar;

    public String getCodigoC2() {
        return codigoC2;
    }

    public void setCodigoC2(String codigoC2) {
        this.codigoC2 = codigoC2;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
}
