package com.example.demo.entity.schemas.paciente;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "pacsegsalmen", schema = "paciente")
public class PacSegSalMen {
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
