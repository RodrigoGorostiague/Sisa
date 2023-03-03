package com.example.demo.entity.schemas.paciente;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "barriopopular", schema = "paciente")
public class BarrioPopular {
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
