package com.example.demo.entity.schemas.emergencia;

import com.example.demo.entity.schemas.personal.Personal;
import jakarta.persistence.*;

import java.io.Serializable;

@Embeddable
public class OtrEnfPlanillaEmerPK implements Serializable {
    @OneToOne
    @JoinColumns({
            @JoinColumn(name = "uniat", referencedColumnName = "uniat"),
            @JoinColumn(name = "nrocon", referencedColumnName = "nrocon")
    })
    private PlanillaGuardiaEmergencias planillaGuardiaEmergencias;
    @ManyToOne
    @JoinColumn(name = "enfermero", referencedColumnName = "codigopersonal")
    private Personal enfermero;

    public PlanillaGuardiaEmergencias getPlanillaGuardiaEmergencias() {
        return planillaGuardiaEmergencias;
    }

    public void setPlanillaGuardiaEmergencias(PlanillaGuardiaEmergencias planillaGuardiaEmergencias) {
        this.planillaGuardiaEmergencias = planillaGuardiaEmergencias;
    }

    public Personal getEnfermero() {
        return enfermero;
    }

    public void setEnfermero(Personal enfermero) {
        this.enfermero = enfermero;
    }
}
