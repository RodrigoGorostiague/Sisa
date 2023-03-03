package com.example.demo.entity.schemas.historialInternacion;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "historialinternacion", name = "diagplantrat")
public class DiagPlanTrat {
    @EmbeddedId
    private DiagPlanTratPK id;
    @Column(name = "diagpresuntivo")
    private String diagPresuntivo;
    @Column(name = "plandiagnostico")
    private String planDiagnostico;
    @Column(name = "planterapeutico")
    private String planTerapeutico;

    public DiagPlanTratPK getId() {
        return id;
    }

    public void setId(DiagPlanTratPK id) {
        this.id = id;
    }

    public String getDiagPresuntivo() {
        return diagPresuntivo;
    }

    public void setDiagPresuntivo(String diagPresuntivo) {
        this.diagPresuntivo = diagPresuntivo;
    }

    public String getPlanDiagnostico() {
        return planDiagnostico;
    }

    public void setPlanDiagnostico(String planDiagnostico) {
        this.planDiagnostico = planDiagnostico;
    }

    public String getPlanTerapeutico() {
        return planTerapeutico;
    }

    public void setPlanTerapeutico(String planTerapeutico) {
        this.planTerapeutico = planTerapeutico;
    }
}
