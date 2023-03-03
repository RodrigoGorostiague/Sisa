package com.example.demo.entity.schemas.paciente;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.time.LocalDateTime;

@Embeddable
public class MovimientosCambiadosPK implements Serializable {
    @Column(name = "pkmov")
    private String pkMov;
    @Column(name = "fechamov")
    private LocalDateTime fechaMov;
    private String tabla;

    public String getPkMov() {
        return pkMov;
    }

    public void setPkMov(String pkMov) {
        this.pkMov = pkMov;
    }

    public LocalDateTime getFechaMov() {
        return fechaMov;
    }

    public void setFechaMov(LocalDateTime fechaMov) {
        this.fechaMov = fechaMov;
    }

    public String getTabla() {
        return tabla;
    }

    public void setTabla(String tabla) {
        this.tabla = tabla;
    }
}
