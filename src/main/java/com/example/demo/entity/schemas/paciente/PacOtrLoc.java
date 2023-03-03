package com.example.demo.entity.schemas.paciente;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "pacotrloc", schema = "paciente")
public class PacOtrLoc {
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
