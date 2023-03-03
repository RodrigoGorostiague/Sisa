package com.example.demo.entity.schemas.historialInternacion;

import jakarta.persistence.*;

import java.io.Serializable;

@Embeddable
public class DiagIngresoPK implements Serializable {
    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "nroInternacion",referencedColumnName = "nroInternacion"),
            @JoinColumn(name = "fechaing",referencedColumnName = "fechaing"),
            @JoinColumn(name = "horaing",referencedColumnName = "horaing")
    })
    private DiagPlanTrat diagPlanTrat;
    @Column(name = "codigodiagnostico")
    private String codigoDiagnostico;

    public DiagPlanTrat getDiagPlanTrat() {
        return diagPlanTrat;
    }

    public void setDiagPlanTrat(DiagPlanTrat diagPlanTrat) {
        this.diagPlanTrat = diagPlanTrat;
    }

    public String getCodigoDiagnostico() {
        return codigoDiagnostico;
    }

    public void setCodigoDiagnostico(String codigoDiagnostico) {
        this.codigoDiagnostico = codigoDiagnostico;
    }
}
