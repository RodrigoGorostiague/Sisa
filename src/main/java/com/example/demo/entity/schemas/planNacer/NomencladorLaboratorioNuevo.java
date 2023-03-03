package com.example.demo.entity.schemas.planNacer;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "nomencladorlaboratorio_nuevo", schema = "plannacer")
public class NomencladorLaboratorioNuevo {
    @EmbeddedId
    private NomencladorLaboratorioNuevoPK id;
    @Column(name = "nombre_plan_sumar")
    private String nombrePlanSumar;

    public NomencladorLaboratorioNuevoPK getId() {
        return id;
    }

    public void setId(NomencladorLaboratorioNuevoPK id) {
        this.id = id;
    }

    public String getNombrePlanSumar() {
        return nombrePlanSumar;
    }

    public void setNombrePlanSumar(String nombrePlanSumar) {
        this.nombrePlanSumar = nombrePlanSumar;
    }
}
