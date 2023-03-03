package com.example.demo.entity.schemas.quirofano;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

@Embeddable
public class AnestesistaIntervencionPK implements Serializable {
    private Date fecha;
    @Column(name = "uniatquirofano")
    private String uniatQuirofano;
    private LocalDateTime hora;
    @Column(name = "idpaciente")
    private Integer idPaciente;
    private String anestesista;

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getUniatQuirofano() {
        return uniatQuirofano;
    }

    public void setUniatQuirofano(String uniatQuirofano) {
        this.uniatQuirofano = uniatQuirofano;
    }

    public LocalDateTime getHora() {
        return hora;
    }

    public void setHora(LocalDateTime hora) {
        this.hora = hora;
    }

    public Integer getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getAnestesista() {
        return anestesista;
    }

    public void setAnestesista(String anestesista) {
        this.anestesista = anestesista;
    }
}
