package com.example.demo.entity.schemas.cobranzas;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Date;

@Embeddable
public class ImputCredResPK implements Serializable {
    private Date fecha;
    private String sucursal;
    private Integer resumenç;
    @Column(name = "amb_int")
    private String ambInt;

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public Integer getResumenç() {
        return resumenç;
    }

    public void setResumenç(Integer resumenç) {
        this.resumenç = resumenç;
    }

    public String getAmbInt() {
        return ambInt;
    }

    public void setAmbInt(String ambInt) {
        this.ambInt = ambInt;
    }
}
