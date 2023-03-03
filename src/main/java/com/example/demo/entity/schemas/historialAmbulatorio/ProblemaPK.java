package com.example.demo.entity.schemas.historialAmbulatorio;

import com.example.demo.entity.schemas.nomencladores.NomencladorCiap2;
import com.example.demo.entity.schemas.paciente.Paciente;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Embeddable
public class ProblemaPK implements Serializable {
    @ManyToOne
    @JoinColumn(name = "idpaciente", referencedColumnName = "idpaciente")
    private Paciente pacientes;
    @ManyToOne
    @JoinColumn(name = "codigociap2", referencedColumnName = "codigo")
    private NomencladorCiap2 nomencladorCiap2;

    public Paciente getPacientes() {
        return pacientes;
    }

    public void setPacientes(Paciente pacientes) {
        this.pacientes = pacientes;
    }

    public NomencladorCiap2 getNomencladorCiap2() {
        return nomencladorCiap2;
    }

    public void setNomencladorCiap2(NomencladorCiap2 nomencladorCiap2) {
        this.nomencladorCiap2 = nomencladorCiap2;
    }
}
