package com.example.demo.entity.schemas.emergencia;

import jakarta.persistence.*;

import java.io.Serializable;

@Embeddable
public class AccidentadoInvolucraPlanillaPK implements Serializable {
    @OneToOne
    @JoinColumns({
            @JoinColumn(name = "uniat", referencedColumnName = "uniat"),
            @JoinColumn(name = "nrocon", referencedColumnName = "nrocon")
    })
    private PlanillaGuardiaEmergencias planillaGuardiaEmergencias;
    @ManyToOne
    @JoinColumn(name = "codigoinvolucra", referencedColumnName = "codigo")
    private AccidentadoInvolucra accidentadoInvolucra;

    public PlanillaGuardiaEmergencias getPlanillaGuardiaEmergencias() {
        return planillaGuardiaEmergencias;
    }

    public void setPlanillaGuardiaEmergencias(PlanillaGuardiaEmergencias planillaGuardiaEmergencias) {
        this.planillaGuardiaEmergencias = planillaGuardiaEmergencias;
    }

    public AccidentadoInvolucra getAccidentadoInvolucra() {
        return accidentadoInvolucra;
    }

    public void setAccidentadoInvolucra(AccidentadoInvolucra accidentadoInvolucra) {
        this.accidentadoInvolucra = accidentadoInvolucra;
    }
}
