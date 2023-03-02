package com.example.demo.entity.schemas.emergencia;

import com.example.demo.entity.schemas.personal.Personal;
import jakarta.persistence.*;

import java.io.Serializable;

@Embeddable
public class ConsumoFarCabeceraPK implements Serializable {
    @OneToOne
    @JoinColumns({
            @JoinColumn(name = "uniat", referencedColumnName = "uniat"),
            @JoinColumn(name = "nrocon", referencedColumnName = "nrocon")
    })
    private PlanillaGuardiaEmergencias planillaGuardiaEmergencias;
    @ManyToOne
    @JoinColumn(name = "profesional", referencedColumnName = "codigopersonal")
    private Personal personal;

    public PlanillaGuardiaEmergencias getPlanillaGuardiaEmergencias() {
        return planillaGuardiaEmergencias;
    }

    public void setPlanillaGuardiaEmergencias(PlanillaGuardiaEmergencias planillaGuardiaEmergencias) {
        this.planillaGuardiaEmergencias = planillaGuardiaEmergencias;
    }

    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }
}
