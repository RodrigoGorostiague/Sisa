package com.example.demo.entity.schemas.paciente;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "pacientecolonizado", schema = "paciente")
public class PacienteColonizado {
    @Id
    @ManyToOne
    @JoinColumn(name = "idpaciente", referencedColumnName = "idpaciente")
    private Paciente paciente;

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
}
