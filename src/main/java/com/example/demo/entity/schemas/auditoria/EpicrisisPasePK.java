package com.example.demo.entity.schemas.auditoria;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

@Embeddable
public class EpicrisisPasePK implements Serializable {
    private LocalDateTime fecha;
    private String usuario;
    @Column(name = "nrointernacion")
    private Integer nroInternacion;
    @Column(name = "fehcamov")
    private Date fehcaMov;
    @Column(name = "horamov")
    private LocalDateTime horaMov;

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Integer getNroInternacion() {
        return nroInternacion;
    }

    public void setNroInternacion(Integer nroInternacion) {
        this.nroInternacion = nroInternacion;
    }

    public Date getFehcaMov() {
        return fehcaMov;
    }

    public void setFehcaMov(Date fehcaMov) {
        this.fehcaMov = fehcaMov;
    }

    public LocalDateTime getHoraMov() {
        return horaMov;
    }

    public void setHoraMov(LocalDateTime horaMov) {
        this.horaMov = horaMov;
    }
}
