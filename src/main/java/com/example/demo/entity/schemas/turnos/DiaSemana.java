package com.example.demo.entity.schemas.turnos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "diasemana", schema = "turnos")
public class DiaSemana {
    @Id
    @Column(name = "numerodia")
    private Integer numeroDia;
    @Column(name = "nombredia")
    private String nombreDia;
    @Column(name = "nombreabreviadodia")
    private String nombreAbreviadoDia;
    @Column(name = "nombreingles")
    private String nombreIngles;
    @Column(name = "nombreabreviado2")
    private String nombreAbreviado2;

    public Integer getNumeroDia() {
        return numeroDia;
    }

    public void setNumeroDia(Integer numeroDia) {
        this.numeroDia = numeroDia;
    }

    public String getNombreDia() {
        return nombreDia;
    }

    public void setNombreDia(String nombreDia) {
        this.nombreDia = nombreDia;
    }

    public String getNombreAbreviadoDia() {
        return nombreAbreviadoDia;
    }

    public void setNombreAbreviadoDia(String nombreAbreviadoDia) {
        this.nombreAbreviadoDia = nombreAbreviadoDia;
    }

    public String getNombreIngles() {
        return nombreIngles;
    }

    public void setNombreIngles(String nombreIngles) {
        this.nombreIngles = nombreIngles;
    }

    public String getNombreAbreviado2() {
        return nombreAbreviado2;
    }

    public void setNombreAbreviado2(String nombreAbreviado2) {
        this.nombreAbreviado2 = nombreAbreviado2;
    }
}
