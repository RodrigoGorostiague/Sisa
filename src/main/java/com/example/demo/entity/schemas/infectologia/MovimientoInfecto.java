package com.example.demo.entity.schemas.infectologia;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "movimientoinfecto", schema = "infectologia")
public class MovimientoInfecto {
    @EmbeddedId
    private MovimientoInfectoPK id;
    private String evolucion;
    private String estadio;
    @Column(name = "codigopersonal")
    private String codigoPersonal;
    @Column(name = "testresistencia")
    private String testResistencia;
    @Column(name = "semanasemb")
    private String semanasEmb;

    public MovimientoInfectoPK getId() {
        return id;
    }

    public void setId(MovimientoInfectoPK id) {
        this.id = id;
    }

    public String getEvolucion() {
        return evolucion;
    }

    public void setEvolucion(String evolucion) {
        this.evolucion = evolucion;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public String getCodigoPersonal() {
        return codigoPersonal;
    }

    public void setCodigoPersonal(String codigoPersonal) {
        this.codigoPersonal = codigoPersonal;
    }

    public String getTestResistencia() {
        return testResistencia;
    }

    public void setTestResistencia(String testResistencia) {
        this.testResistencia = testResistencia;
    }

    public String getSemanasEmb() {
        return semanasEmb;
    }

    public void setSemanasEmb(String semanasEmb) {
        this.semanasEmb = semanasEmb;
    }
}
