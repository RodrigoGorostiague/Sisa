package com.example.demo.entity.schemas.internacion;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

@Embeddable
public class CronogramaDerivLineaPK implements Serializable {
    @Column(name = "nrotramitacion")
    private Integer nroTramitacion;
    private Date fecha;
    private LocalDateTime hora;
    private String usuario;

    public Integer getNroTramitacion() {
        return nroTramitacion;
    }

    public void setNroTramitacion(Integer nroTramitacion) {
        this.nroTramitacion = nroTramitacion;
    }

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

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
}
