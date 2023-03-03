package com.example.demo.entity.schemas.personal;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

@Embeddable
public class RegistroHorarioApsPK implements Serializable {
    private String lehajo;
    private Date fecha;
    private LocalDateTime hora;
    @Column(name = "entrada_salida")
    private String entradaSalida;

    public String getLehajo() {
        return lehajo;
    }

    public void setLehajo(String lehajo) {
        this.lehajo = lehajo;
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

    public String getEntradaSalida() {
        return entradaSalida;
    }

    public void setEntradaSalida(String entradaSalida) {
        this.entradaSalida = entradaSalida;
    }
}
