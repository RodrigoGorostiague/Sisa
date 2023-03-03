package com.example.demo.entity.schemas.servicioSocial;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

@Embeddable
public class AtencionesLineasPK implements Serializable {
    @Column(name = "idpaciente")
    private Integer idPaciente;
    private Date fecha;
    private LocalDateTime hora;
    @Column(name = "codigointervencion")
    private String codigoIntervencion;

    public Integer getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
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

    public String getCodigoIntervencion() {
        return codigoIntervencion;
    }

    public void setCodigoIntervencion(String codigoIntervencion) {
        this.codigoIntervencion = codigoIntervencion;
    }
}
