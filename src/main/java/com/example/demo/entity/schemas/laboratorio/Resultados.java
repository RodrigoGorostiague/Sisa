package com.example.demo.entity.schemas.laboratorio;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "resultados", schema = "laboratorio_2009")
public class Resultados {
    @EmbeddedId
    private ResultadosPK id;
    @Column(name = "nombredeterminacion")
    private String nombreDeTerminacion;
    private String valor;
    private String observacion;
    @Column(name = "valorreferencia")
    private String valorReferencia;
    private String unidad;
    @Column(name = "dentrorango")
    private String dentroRango;

    public ResultadosPK getId() {
        return id;
    }

    public void setId(ResultadosPK id) {
        this.id = id;
    }

    public String getNombreDeTerminacion() {
        return nombreDeTerminacion;
    }

    public void setNombreDeTerminacion(String nombreDeTerminacion) {
        this.nombreDeTerminacion = nombreDeTerminacion;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getValorReferencia() {
        return valorReferencia;
    }

    public void setValorReferencia(String valorReferencia) {
        this.valorReferencia = valorReferencia;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public String getDentroRango() {
        return dentroRango;
    }

    public void setDentroRango(String dentroRango) {
        this.dentroRango = dentroRango;
    }
}
