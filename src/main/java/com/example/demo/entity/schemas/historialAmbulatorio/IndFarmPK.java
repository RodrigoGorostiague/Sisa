package com.example.demo.entity.schemas.historialAmbulatorio;

import com.example.demo.entity.schemas.nomencladores.Medicamentos;
import jakarta.persistence.*;

import java.io.Serializable;

@Embeddable
public class IndFarmPK implements Serializable {
    @ManyToOne
    @JoinColumn(name = "nroconsulta", referencedColumnName = "nroconsulta")
    private ConsultaTurno consultaTurno;
    @ManyToOne
    @JoinColumn(name = "codigomedicamento", referencedColumnName = "codigo")
    private Medicamentos medicamentos;

    public ConsultaTurno getConsultaTurno() {
        return consultaTurno;
    }

    public void setConsultaTurno(ConsultaTurno consultaTurno) {
        this.consultaTurno = consultaTurno;
    }

    public Medicamentos getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(Medicamentos medicamentos) {
        this.medicamentos = medicamentos;
    }
}
