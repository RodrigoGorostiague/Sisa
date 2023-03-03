package com.example.demo.entity.schemas.planNacer;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "zpesoedadmenores2", schema = "plannacer")
public class zPesoEdadMenores2 {
    @Id
    private Integer codigo;
    private Double zmin;
    private Double zmax;
    @Column(name = "diag_antropometrico")
    private String diagAntropometrico;
    @Column(name = "diag_abreviado")
    private String diagAbreviado;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Double getZmin() {
        return zmin;
    }

    public void setZmin(Double zmin) {
        this.zmin = zmin;
    }

    public Double getZmax() {
        return zmax;
    }

    public void setZmax(Double zmax) {
        this.zmax = zmax;
    }

    public String getDiagAntropometrico() {
        return diagAntropometrico;
    }

    public void setDiagAntropometrico(String diagAntropometrico) {
        this.diagAntropometrico = diagAntropometrico;
    }

    public String getDiagAbreviado() {
        return diagAbreviado;
    }

    public void setDiagAbreviado(String diagAbreviado) {
        this.diagAbreviado = diagAbreviado;
    }
}
