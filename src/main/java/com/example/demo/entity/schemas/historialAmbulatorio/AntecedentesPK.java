package com.example.demo.entity.schemas.historialAmbulatorio;

import com.example.demo.entity.schemas.nomencladores.NomencladorCiap2;
import com.example.demo.entity.schemas.paciente.Paciente;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

import java.io.Serializable;
import java.util.List;

@Embeddable
public class AntecedentesPK implements Serializable {
    @ManyToOne
    @JoinColumn(name = "codigociap2", referencedColumnName = "codigo")
    private NomencladorCiap2 codigociap2;
    @ManyToOne
    @JoinColumn(name = "idpaciente", referencedColumnName = "idpaciente")
    private Paciente paciente;

    public NomencladorCiap2 getCodigociap2() {
        return codigociap2;
    }

    public void setCodigociap2(NomencladorCiap2 codigociap2) {
        this.codigociap2 = codigociap2;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
}
