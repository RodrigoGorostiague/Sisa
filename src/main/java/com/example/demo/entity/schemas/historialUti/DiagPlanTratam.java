package com.example.demo.entity.schemas.historialUti;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(schema = "historialuti", name = "diagplantratam")
public class DiagPlanTratam {
    @Id
    @Column(name = "nrouti")
    private String nroUti;
    @Column(name = "diagpresprim")
    private String diagPresPrim;
    @Column(name = "diagpresampl")
    private String diagPresAmpl;
    @Column(name = "planestudio")
    private String planEstudio;
    @Column(name = "tratamientourgencia")
    private String tratamientoUrgencia;
    private String comentarios;

    public String getNroUti() {
        return nroUti;
    }

    public void setNroUti(String nroUti) {
        this.nroUti = nroUti;
    }

    public String getDiagPresPrim() {
        return diagPresPrim;
    }

    public void setDiagPresPrim(String diagPresPrim) {
        this.diagPresPrim = diagPresPrim;
    }

    public String getDiagPresAmpl() {
        return diagPresAmpl;
    }

    public void setDiagPresAmpl(String diagPresAmpl) {
        this.diagPresAmpl = diagPresAmpl;
    }

    public String getPlanEstudio() {
        return planEstudio;
    }

    public void setPlanEstudio(String planEstudio) {
        this.planEstudio = planEstudio;
    }

    public String getTratamientoUrgencia() {
        return tratamientoUrgencia;
    }

    public void setTratamientoUrgencia(String tratamientoUrgencia) {
        this.tratamientoUrgencia = tratamientoUrgencia;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }
}
