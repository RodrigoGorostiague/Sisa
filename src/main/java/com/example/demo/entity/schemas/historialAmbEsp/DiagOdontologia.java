package com.example.demo.entity.schemas.historialAmbEsp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "diagodontologia", schema = "historialambesp")
public class DiagOdontologia {
    @Id
    @Column(name = "tipodiagnostico")
    private Integer tipoDiagnostico;
    private String descripcion;

    public Integer getTipoDiagnostico() {
        return tipoDiagnostico;
    }

    public void setTipoDiagnostico(Integer tipoDiagnostico) {
        this.tipoDiagnostico = tipoDiagnostico;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
