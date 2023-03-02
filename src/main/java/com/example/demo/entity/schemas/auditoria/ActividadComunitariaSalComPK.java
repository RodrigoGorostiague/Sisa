package com.example.demo.entity.schemas.auditoria;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

@Embeddable
public class ActividadComunitariaSalComPK implements Serializable {
    private Date fecha;
    private LocalDateTime hora;
    @Column(name = "codigouniat")
    private String codigoUniat;
    @Column(name = "fehcaoperacion")
    private LocalDateTime fehcaOperacion;

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

    public String getCodigoUniat() {
        return codigoUniat;
    }

    public void setCodigoUniat(String codigoUniat) {
        this.codigoUniat = codigoUniat;
    }

    public LocalDateTime getFehcaOperacion() {
        return fehcaOperacion;
    }

    public void setFehcaOperacion(LocalDateTime fehcaOperacion) {
        this.fehcaOperacion = fehcaOperacion;
    }
}
