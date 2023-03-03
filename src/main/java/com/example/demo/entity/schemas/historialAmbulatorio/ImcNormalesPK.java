package com.example.demo.entity.schemas.historialAmbulatorio;

import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class ImcNormalesPK implements Serializable {
    private Integer imcd;
    private Integer inch;

    public Integer getImcd() {
        return imcd;
    }

    public void setImcd(Integer imcd) {
        this.imcd = imcd;
    }

    public Integer getInch() {
        return inch;
    }

    public void setInch(Integer inch) {
        this.inch = inch;
    }
}
