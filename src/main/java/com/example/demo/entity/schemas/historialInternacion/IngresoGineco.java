package com.example.demo.entity.schemas.historialInternacion;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.sql.Date;


@Entity
@Table(schema = "historialinternacion", name = "ingresogineco")
public class IngresoGineco {
    @EmbeddedId
    private IngresoGinecoPK id;
    private Date fum;
    private Integer partos;
    private Integer embarazons;
    private Integer cesareas;
    private Integer abortos;
    private Integer ciclos;
    private Boolean anticoncepcion;
    @Column(name = "anticoncepcion_detalles")
    private String anticoncepcionDetalles;
    @Column(name = "antecedentes_quirurgicos")
    private String antecedentesQuirurgicos;
    @Column(name = "antecendentes_mamarios")
    private String antecendentesMamarios;
    @Column(name = "pap_colpos")
    private String papColpos;

    public IngresoGinecoPK getId() {
        return id;
    }

    public void setId(IngresoGinecoPK id) {
        this.id = id;
    }

    public Date getFum() {
        return fum;
    }

    public void setFum(Date fum) {
        this.fum = fum;
    }

    public Integer getPartos() {
        return partos;
    }

    public void setPartos(Integer partos) {
        this.partos = partos;
    }

    public Integer getEmbarazons() {
        return embarazons;
    }

    public void setEmbarazons(Integer embarazons) {
        this.embarazons = embarazons;
    }

    public Integer getCesareas() {
        return cesareas;
    }

    public void setCesareas(Integer cesareas) {
        this.cesareas = cesareas;
    }

    public Integer getAbortos() {
        return abortos;
    }

    public void setAbortos(Integer abortos) {
        this.abortos = abortos;
    }

    public Integer getCiclos() {
        return ciclos;
    }

    public void setCiclos(Integer ciclos) {
        this.ciclos = ciclos;
    }

    public Boolean getAnticoncepcion() {
        return anticoncepcion;
    }

    public void setAnticoncepcion(Boolean anticoncepcion) {
        this.anticoncepcion = anticoncepcion;
    }

    public String getAnticoncepcionDetalles() {
        return anticoncepcionDetalles;
    }

    public void setAnticoncepcionDetalles(String anticoncepcionDetalles) {
        this.anticoncepcionDetalles = anticoncepcionDetalles;
    }

    public String getAntecedentesQuirurgicos() {
        return antecedentesQuirurgicos;
    }

    public void setAntecedentesQuirurgicos(String antecedentesQuirurgicos) {
        this.antecedentesQuirurgicos = antecedentesQuirurgicos;
    }

    public String getAntecendentesMamarios() {
        return antecendentesMamarios;
    }

    public void setAntecendentesMamarios(String antecendentesMamarios) {
        this.antecendentesMamarios = antecendentesMamarios;
    }

    public String getPapColpos() {
        return papColpos;
    }

    public void setPapColpos(String papColpos) {
        this.papColpos = papColpos;
    }
}
