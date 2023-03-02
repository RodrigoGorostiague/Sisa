package com.example.demo.entity.schemas.auditoria;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.time.LocalDateTime;

@Embeddable
public class RnInternacionPK implements Serializable {
    private LocalDateTime fecha;
    @Column(name = "nrointernacion")
    private Integer nroInternacion;
    @Column(name = "idpaciente_rn")
    private Integer idPacienteRn;

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public Integer getNroInternacion() {
        return nroInternacion;
    }

    public void setNroInternacion(Integer nroInternacion) {
        this.nroInternacion = nroInternacion;
    }

    public Integer getIdPacienteRn() {
        return idPacienteRn;
    }

    public void setIdPacienteRn(Integer idPacienteRn) {
        this.idPacienteRn = idPacienteRn;
    }
}
