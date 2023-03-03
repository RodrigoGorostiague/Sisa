package com.example.demo.entity.schemas.vacunacion;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;


import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDateTime;

@Embeddable
public class EnvioVacunaLineaPK implements Serializable {
    private Date fecha;
    private LocalDateTime hora;
    @Column(name = "uniatemisora")
    private String uniatEmisora;
    @Column(name = "uniatreceptora")
    private String uniatReceptora;
    @Column(name = "numlinea")
    private Integer numLinea;

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public LocalDateTime getHora() {
        return hora;
    }

    public void setHora(LocalDateTime hora) {
        this.hora = hora;
    }

    public String getUniatEmisora() {
        return uniatEmisora;
    }

    public void setUniatEmisora(String uniatEmisora) {
        this.uniatEmisora = uniatEmisora;
    }

    public String getUniatReceptora() {
        return uniatReceptora;
    }

    public void setUniatReceptora(String uniatReceptora) {
        this.uniatReceptora = uniatReceptora;
    }

    public Integer getNumLinea() {
        return numLinea;
    }

    public void setNumLinea(Integer numLinea) {
        this.numLinea = numLinea;
    }
}
