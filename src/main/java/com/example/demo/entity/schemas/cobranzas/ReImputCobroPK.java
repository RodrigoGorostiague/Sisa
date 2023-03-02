package com.example.demo.entity.schemas.cobranzas;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Date;

@Embeddable
public class ReImputCobroPK implements Serializable {
    private Date fecha;
    @Column(name = "sucursal_ori")
    private String sucursalOri;
    @Column(name = "resumen_ori")
    private Integer resumenOri;
    @Column(name = "amb_int_ori")
    private String ambIntOri;
    @Column(name = "sucursal_dest")
    private String sucursalDest;
    @Column(name = "resumen_dest")
    private Integer resumenDest;
    @Column(name = "amb_int_dest")
    private String ambIntDest;

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getSucursalOri() {
        return sucursalOri;
    }

    public void setSucursalOri(String sucursalOri) {
        this.sucursalOri = sucursalOri;
    }

    public Integer getResumenOri() {
        return resumenOri;
    }

    public void setResumenOri(Integer resumenOri) {
        this.resumenOri = resumenOri;
    }

    public String getAmbIntOri() {
        return ambIntOri;
    }

    public void setAmbIntOri(String ambIntOri) {
        this.ambIntOri = ambIntOri;
    }

    public String getSucursalDest() {
        return sucursalDest;
    }

    public void setSucursalDest(String sucursalDest) {
        this.sucursalDest = sucursalDest;
    }

    public Integer getResumenDest() {
        return resumenDest;
    }

    public void setResumenDest(Integer resumenDest) {
        this.resumenDest = resumenDest;
    }

    public String getAmbIntDest() {
        return ambIntDest;
    }

    public void setAmbIntDest(String ambIntDest) {
        this.ambIntDest = ambIntDest;
    }
}
