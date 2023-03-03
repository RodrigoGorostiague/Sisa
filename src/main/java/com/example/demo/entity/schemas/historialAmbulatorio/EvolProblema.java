package com.example.demo.entity.schemas.historialAmbulatorio;

import com.example.demo.entity.schemas.paciente.Paciente;
import jakarta.persistence.*;

@Entity
@Table(schema = "historialambulatorio", name = "evolproblema")
public class EvolProblema {
    @EmbeddedId
    private EvolProblemaPk id;
    private String subjetivo;
    private String objetivo;
    @ManyToOne
    @JoinColumn(name = "idpaciente", referencedColumnName = "idpaciente")
    private Paciente paciente;
    @Column(name = "estadoproblema")
    private String estadoProblema;
    @Column(name = "plantratamiento")
    private String planTratamiento;
    @Column(name = "plandiagnostico")
    private String planDiagnostico;
    @Column(name = "planeducacion")
    private String planEducacion;
    @Column(name = "evolucionunica")
    private String evolucionUnica;

    public EvolProblemaPk getId() {
        return id;
    }

    public void setId(EvolProblemaPk id) {
        this.id = id;
    }

    public String getSubjetivo() {
        return subjetivo;
    }

    public void setSubjetivo(String subjetivo) {
        this.subjetivo = subjetivo;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public String getEstadoProblema() {
        return estadoProblema;
    }

    public void setEstadoProblema(String estadoProblema) {
        this.estadoProblema = estadoProblema;
    }

    public String getPlanTratamiento() {
        return planTratamiento;
    }

    public void setPlanTratamiento(String planTratamiento) {
        this.planTratamiento = planTratamiento;
    }

    public String getPlanDiagnostico() {
        return planDiagnostico;
    }

    public void setPlanDiagnostico(String planDiagnostico) {
        this.planDiagnostico = planDiagnostico;
    }

    public String getPlanEducacion() {
        return planEducacion;
    }

    public void setPlanEducacion(String planEducacion) {
        this.planEducacion = planEducacion;
    }

    public String getEvolucionUnica() {
        return evolucionUnica;
    }

    public void setEvolucionUnica(String evolucionUnica) {
        this.evolucionUnica = evolucionUnica;
    }
}
