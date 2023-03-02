package com.example.demo.entity.schemas.emergencia;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class PacienteGuardiaPK implements Serializable{
    @Column(name = "nropaciente")
    private Integer nroPaciente;
    private String uniat;

    public Integer getNroPaciente() {
        return nroPaciente;
    }

    public void setNroPaciente(Integer nroPaciente) {
        this.nroPaciente = nroPaciente;
    }

    public String getUniat() {
        return uniat;
    }

    public void setUniat(String uniat) {
        this.uniat = uniat;
    }
}
