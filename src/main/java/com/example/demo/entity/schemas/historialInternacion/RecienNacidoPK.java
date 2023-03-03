package com.example.demo.entity.schemas.historialInternacion;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class RecienNacidoPK implements Serializable {
    @Column(name = "nrointernacion")
    private Integer nroInternacion;
    @Column(name = "idpaciente_rn")
    private Integer idPacienteRn;

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
