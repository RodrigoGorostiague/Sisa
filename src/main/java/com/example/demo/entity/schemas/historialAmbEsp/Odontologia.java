package com.example.demo.entity.schemas.historialAmbEsp;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "historialambesp", name = "odontologia")
public class Odontologia {
    @EmbeddedId
    private OdontologiaPK id;
    private String caras;
    private String observaciones;
    @Column(name = "tipoconsulta")
    private String tipoConsulta;
    @Column(name = "tipodiagnostico")
    private Integer tipoDiagnostico;
    private String antecedentes;

    public OdontologiaPK getId() {
        return id;
    }

    public void setId(OdontologiaPK id) {
        this.id = id;
    }

    public String getCaras() {
        return caras;
    }

    public void setCaras(String caras) {
        this.caras = caras;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getTipoConsulta() {
        return tipoConsulta;
    }

    public void setTipoConsulta(String tipoConsulta) {
        this.tipoConsulta = tipoConsulta;
    }

    public Integer getTipoDiagnostico() {
        return tipoDiagnostico;
    }

    public void setTipoDiagnostico(Integer tipoDiagnostico) {
        this.tipoDiagnostico = tipoDiagnostico;
    }

    public String getAntecedentes() {
        return antecedentes;
    }

    public void setAntecedentes(String antecedentes) {
        this.antecedentes = antecedentes;
    }
}
