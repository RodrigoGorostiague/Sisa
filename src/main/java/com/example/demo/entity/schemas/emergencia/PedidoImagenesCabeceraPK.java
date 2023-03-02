package com.example.demo.entity.schemas.emergencia;

import com.example.demo.entity.schemas.personal.Personal;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Embeddable
public class PedidoImagenesCabeceraPK implements Serializable {
    @OneToOne
    @JoinColumns({
            @JoinColumn(name = "uniat", referencedColumnName = "uniat"),
            @JoinColumn(name = "nrocon", referencedColumnName = "nrocon")
    })
    private PlanillaGuardiaEmergencias planillaGuardiaEmergencias;
    @ManyToOne
    @JoinColumn(name = "profesional", referencedColumnName = "codigopersonal")
    private Personal profesional;

    public PlanillaGuardiaEmergencias getPlanillaGuardiaEmergencias() {
        return planillaGuardiaEmergencias;
    }

    public void setPlanillaGuardiaEmergencias(PlanillaGuardiaEmergencias planillaGuardiaEmergencias) {
        this.planillaGuardiaEmergencias = planillaGuardiaEmergencias;
    }

    public Personal getProfesional() {
        return profesional;
    }

    public void setProfesional(Personal profesional) {
        this.profesional = profesional;
    }
}
