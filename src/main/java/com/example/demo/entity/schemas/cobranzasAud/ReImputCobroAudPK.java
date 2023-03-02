package com.example.demo.entity.schemas.cobranzasAud;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

@Embeddable
public class ReImputCobroAudPK implements Serializable {
    @Column(name = "fechahora")
    private LocalDateTime fechaHora;
    private String usuario;
    private Date fecha;
    @Column(name = "sucursal_ori")
    private String sucursalOri;
    @Column(name = "resumen_ori")
    private Integer resumenOri;
    @Column(name = "amb_int_ori")
    private String ambintori;

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

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

    public String getAmbintori() {
        return ambintori;
    }

    public void setAmbintori(String ambintori) {
        this.ambintori = ambintori;
    }
}
