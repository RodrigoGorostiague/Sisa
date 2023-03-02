package com.example.demo.entity.schemas.emergencia;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.ManyToOne;

import java.io.Serializable;

@Embeddable
public class InternacionTransitoriaPK implements Serializable {
    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "uniat", referencedColumnName = "uniat"),
            @JoinColumn(name = "nrocon", referencedColumnName = "nrocon")
    })
    private PlanillaGuardiaEmergencias planillaGuardiaEmergencias;

    public PlanillaGuardiaEmergencias getPlanillaGuardiaEmergencias() {
        return planillaGuardiaEmergencias;
    }

    public void setPlanillaGuardiaEmergencias(PlanillaGuardiaEmergencias planillaGuardiaEmergencias) {
        this.planillaGuardiaEmergencias = planillaGuardiaEmergencias;
    }
}
