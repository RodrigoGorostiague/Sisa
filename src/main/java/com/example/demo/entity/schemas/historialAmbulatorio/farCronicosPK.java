package com.example.demo.entity.schemas.historialAmbulatorio;

import com.example.demo.entity.schemas.paciente.Paciente;
import com.example.demo.entity.schemas.nomencladores.Medicamentos;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.io.Serializable;

@Embeddable
public class farCronicosPK implements Serializable {
    @ManyToOne
    @JoinColumn(name = "idpaciente", referencedColumnName = "idpaciente")
    private Paciente paciente;
    @ManyToOne
    @JoinColumn(name = "codigomedicamento", referencedColumnName = "codigo")
    private Medicamentos medicamentos;

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medicamentos getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(Medicamentos medicamentos) {
        this.medicamentos = medicamentos;
    }
}
