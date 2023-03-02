package com.example.demo.entity.schemas.derivaciones;

import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class DestinoCombiLugarDerivPK implements Serializable {
    private String destinoç;
    private String localidad;

    public String getDestinoç() {
        return destinoç;
    }

    public void setDestinoç(String destinoç) {
        this.destinoç = destinoç;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }
}
