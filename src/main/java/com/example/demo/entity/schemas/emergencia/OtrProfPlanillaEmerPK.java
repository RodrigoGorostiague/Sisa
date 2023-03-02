package com.example.demo.entity.schemas.emergencia;

import com.example.demo.entity.schemas.personal.Personal;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Embeddable
public class OtrProfPlanillaEmerPK implements Serializable {
    @OneToOne
    @JoinColumns({
            @JoinColumn(name = "uniat", referencedColumnName = "uniat"),
            @JoinColumn(name = "nrocon", referencedColumnName = "nrocon")
    })
    private PlanillaGuardiaEmergencias planillaGuardiaEmergencias;
    @OneToMany
    @JoinColumn(name = "medico", referencedColumnName = "codigopersonal")
    private List<Personal> medico;

    public PlanillaGuardiaEmergencias getPlanillaGuardiaEmergencias() {
        return planillaGuardiaEmergencias;
    }

    public void setPlanillaGuardiaEmergencias(PlanillaGuardiaEmergencias planillaGuardiaEmergencias) {
        this.planillaGuardiaEmergencias = planillaGuardiaEmergencias;
    }

    public List<Personal> getMedico() {
        return medico;
    }

    public void setMedico(List<Personal> medico) {
        this.medico = medico;
    }
}
