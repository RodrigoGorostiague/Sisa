package com.example.demo.entity.schemas.emergencia;

import com.example.demo.entity.schemas.paciente.Paciente;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(schema = "emergencia", name = "intervenfermeriacabecera")
public class IntervEnfermeriaCabecera {
    @EmbeddedId
    private IntervEnfermeriaCabeceraPK id;
    @Column(name = "idpaciente")
    private Integer idPaciente;
    @ManyToOne
    @JoinColumn(name = "idpaciente", referencedColumnName = "idpaciente")
    private Paciente paciente;
    private String observaciones;
    @Column(name = "niveltriage")
    private String nivelTriage;
    @Column(name = "accionesenf")
    private String accionesEnf;
    private String apariencia;
    private String respiratorio;
    private String cardiovascular;
    @Column(name = "edadmayor3meses")
    private String edadMayorTresMeses;
    @Column(name = "fiebremayor38")
    private String fiebreMayorTreitayOcho;
    private String dolor;
    private String afectacion;
    @ManyToOne
    @JoinColumn(name = "sintoma_triage", referencedColumnName = "id")
    private TriageSintomas triageSintomas;
    @Column(name = "triage_dudoso")
    private Boolean triageDudoso;
    private String shockroom;

    public IntervEnfermeriaCabeceraPK getId() {
        return id;
    }

    public void setId(IntervEnfermeriaCabeceraPK id) {
        this.id = id;
    }

    public Integer getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getNivelTriage() {
        return nivelTriage;
    }

    public void setNivelTriage(String nivelTriage) {
        this.nivelTriage = nivelTriage;
    }

    public String getAccionesEnf() {
        return accionesEnf;
    }

    public void setAccionesEnf(String accionesEnf) {
        this.accionesEnf = accionesEnf;
    }

    public String getApariencia() {
        return apariencia;
    }

    public void setApariencia(String apariencia) {
        this.apariencia = apariencia;
    }

    public String getRespiratorio() {
        return respiratorio;
    }

    public void setRespiratorio(String respiratorio) {
        this.respiratorio = respiratorio;
    }

    public String getCardiovascular() {
        return cardiovascular;
    }

    public void setCardiovascular(String cardiovascular) {
        this.cardiovascular = cardiovascular;
    }

    public String getEdadMayorTresMeses() {
        return edadMayorTresMeses;
    }

    public void setEdadMayorTresMeses(String edadMayorTresMeses) {
        this.edadMayorTresMeses = edadMayorTresMeses;
    }

    public String getFiebreMayorTreitayOcho() {
        return fiebreMayorTreitayOcho;
    }

    public void setFiebreMayorTreitayOcho(String fiebreMayorTreitayOcho) {
        this.fiebreMayorTreitayOcho = fiebreMayorTreitayOcho;
    }

    public String getDolor() {
        return dolor;
    }

    public void setDolor(String dolor) {
        this.dolor = dolor;
    }

    public String getAfectacion() {
        return afectacion;
    }

    public void setAfectacion(String afectacion) {
        this.afectacion = afectacion;
    }

    public TriageSintomas getTriageSintomas() {
        return triageSintomas;
    }

    public void setTriageSintomas(TriageSintomas triageSintomas) {
        this.triageSintomas = triageSintomas;
    }

    public Boolean getTriageDudoso() {
        return triageDudoso;
    }

    public void setTriageDudoso(Boolean triageDudoso) {
        this.triageDudoso = triageDudoso;
    }

    public String getShockroom() {
        return shockroom;
    }

    public void setShockroom(String shockroom) {
        this.shockroom = shockroom;
    }
}
