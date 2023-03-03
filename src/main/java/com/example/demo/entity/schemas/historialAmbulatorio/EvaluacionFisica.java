package com.example.demo.entity.schemas.historialAmbulatorio;

import jakarta.persistence.*;

@Entity
@Table(schema = "historialambulatorio", name = "evaluacionfisica")
public class EvaluacionFisica {
    @Id
    @ManyToOne
    @JoinColumn(name = "nroconsulta", referencedColumnName = "nroconsulta")
    private ConsultaTurno consultaTurno;
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
    @Column(name = "examenfisico")
    private String examenFisico;
    @Column(name = "indimc")
    private String indImc;

    public ConsultaTurno getConsultaTurno() {
        return consultaTurno;
    }

    public void setConsultaTurno(ConsultaTurno consultaTurno) {
        this.consultaTurno = consultaTurno;
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

    public String getExamenFisico() {
        return examenFisico;
    }

    public void setExamenFisico(String examenFisico) {
        this.examenFisico = examenFisico;
    }

    public String getIndImc() {
        return indImc;
    }

    public void setIndImc(String indImc) {
        this.indImc = indImc;
    }
}
