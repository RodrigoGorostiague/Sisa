package com.example.demo.entity.schemas.historialAmbulatorio;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "evalfisicaenf", schema = "historialambulatorio")
public class EvalFisicaEnf {
    @EmbeddedId
    private EvalFisicaEnfPK id;
    private Integer peso;
    private Integer talle;
    @Column(name = "freccardiaca")
    private Integer frecuenciaCardiaca;
    @Column(name = "tasistolica")
    private Integer taSistolica;
    @Column(name = "tadiastolica")
    private Integer taDiastolica;
    @Column(name = "percefalico")
    private Integer periCefalico;
    @Column(name = "percintura")
    private Integer periCintura;
    private Integer imc;

    public EvalFisicaEnfPK getId() {
        return id;
    }

    public void setId(EvalFisicaEnfPK id) {
        this.id = id;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public Integer getTalle() {
        return talle;
    }

    public void setTalle(Integer talle) {
        this.talle = talle;
    }

    public Integer getFrecuenciaCardiaca() {
        return frecuenciaCardiaca;
    }

    public void setFrecuenciaCardiaca(Integer frecuenciaCardiaca) {
        this.frecuenciaCardiaca = frecuenciaCardiaca;
    }

    public Integer getTaSistolica() {
        return taSistolica;
    }

    public void setTaSistolica(Integer taSistolica) {
        this.taSistolica = taSistolica;
    }

    public Integer getTaDiastolica() {
        return taDiastolica;
    }

    public void setTaDiastolica(Integer taDiastolica) {
        this.taDiastolica = taDiastolica;
    }

    public Integer getPeriCefalico() {
        return periCefalico;
    }

    public void setPeriCefalico(Integer periCefalico) {
        this.periCefalico = periCefalico;
    }

    public Integer getPeriCintura() {
        return periCintura;
    }

    public void setPeriCintura(Integer periCintura) {
        this.periCintura = periCintura;
    }

    public Integer getImc() {
        return imc;
    }

    public void setImc(Integer imc) {
        this.imc = imc;
    }
}
