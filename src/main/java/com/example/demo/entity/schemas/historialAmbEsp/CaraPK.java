package com.example.demo.entity.schemas.historialAmbEsp;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class CaraPK implements Serializable {
    private String codigo;
    @Column(name = "desdepieza")
    private Integer desdePieza;
    @Column(name = "hastapieza")
    private Integer hastaPieza;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Integer getDesdePieza() {
        return desdePieza;
    }

    public void setDesdePieza(Integer desdePieza) {
        this.desdePieza = desdePieza;
    }

    public Integer getHastaPieza() {
        return hastaPieza;
    }

    public void setHastaPieza(Integer hastaPieza) {
        this.hastaPieza = hastaPieza;
    }
}
