package com.example.demo.entity.schemas.resapro;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "internaciones", schema = "resapro")
public class Internaciones {
    @Id
    @Column(name = "id_internacion_local")
    private String idInternacionLocal;
    @Column(name = "id_paciente_local")
    private String idPacienteLocal;
    @Column(name = "nro_historia_clinica")
    private String nroHistoriaClinica;
    @Column(name = "nro_informe")
    private Integer nroInforme;
    @Column(name = "fecha_ingreso")
    private Date fechaIngreso;
    @Column(name = "fecha_egreso")
    private Date fechaEgreso;
    @Column(name = "tipo_egreso")
    private Integer tipoEgreso;
    @Column(name = "dias_estada")
    private Integer diasEstada;
    @Column(name = "lesion_producido_por")
    private Integer lesionProducidoPor;
    @Column(name = "lesion_lugar")
    private Integer lesionLugar;
    @Column(name = "dias_otrascircunstancias")
    private Integer diasOtrasCircunstancias;
    @Column(name = "peso_nacer")
    private Integer pesoNacer;
    @Column(name = "dias_cpap")
    private Integer diasCpap;
    @Column(name = "dias_arm")
    private Integer diasArm;
    @Column(name = "dias_incubadora")
    private Integer diasIncubadora;
    @Column(name = "fecha_parto")
    private Date fechaParto;
    @Column(name = "edad_gestacional")
    private Integer edadGestacional;
    private Integer paridad;
    @Column(name = "tipo_parto")
    private Integer tipoParto;

    public String getIdInternacionLocal() {
        return idInternacionLocal;
    }

    public void setIdInternacionLocal(String idInternacionLocal) {
        this.idInternacionLocal = idInternacionLocal;
    }

    public String getIdPacienteLocal() {
        return idPacienteLocal;
    }

    public void setIdPacienteLocal(String idPacienteLocal) {
        this.idPacienteLocal = idPacienteLocal;
    }

    public String getNroHistoriaClinica() {
        return nroHistoriaClinica;
    }

    public void setNroHistoriaClinica(String nroHistoriaClinica) {
        this.nroHistoriaClinica = nroHistoriaClinica;
    }

    public Integer getNroInforme() {
        return nroInforme;
    }

    public void setNroInforme(Integer nroInforme) {
        this.nroInforme = nroInforme;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Date getFechaEgreso() {
        return fechaEgreso;
    }

    public void setFechaEgreso(Date fechaEgreso) {
        this.fechaEgreso = fechaEgreso;
    }

    public Integer getTipoEgreso() {
        return tipoEgreso;
    }

    public void setTipoEgreso(Integer tipoEgreso) {
        this.tipoEgreso = tipoEgreso;
    }

    public Integer getDiasEstada() {
        return diasEstada;
    }

    public void setDiasEstada(Integer diasEstada) {
        this.diasEstada = diasEstada;
    }

    public Integer getLesionProducidoPor() {
        return lesionProducidoPor;
    }

    public void setLesionProducidoPor(Integer lesionProducidoPor) {
        this.lesionProducidoPor = lesionProducidoPor;
    }

    public Integer getLesionLugar() {
        return lesionLugar;
    }

    public void setLesionLugar(Integer lesionLugar) {
        this.lesionLugar = lesionLugar;
    }

    public Integer getDiasOtrasCircunstancias() {
        return diasOtrasCircunstancias;
    }

    public void setDiasOtrasCircunstancias(Integer diasOtrasCircunstancias) {
        this.diasOtrasCircunstancias = diasOtrasCircunstancias;
    }

    public Integer getPesoNacer() {
        return pesoNacer;
    }

    public void setPesoNacer(Integer pesoNacer) {
        this.pesoNacer = pesoNacer;
    }

    public Integer getDiasCpap() {
        return diasCpap;
    }

    public void setDiasCpap(Integer diasCpap) {
        this.diasCpap = diasCpap;
    }

    public Integer getDiasArm() {
        return diasArm;
    }

    public void setDiasArm(Integer diasArm) {
        this.diasArm = diasArm;
    }

    public Integer getDiasIncubadora() {
        return diasIncubadora;
    }

    public void setDiasIncubadora(Integer diasIncubadora) {
        this.diasIncubadora = diasIncubadora;
    }

    public Date getFechaParto() {
        return fechaParto;
    }

    public void setFechaParto(Date fechaParto) {
        this.fechaParto = fechaParto;
    }

    public Integer getEdadGestacional() {
        return edadGestacional;
    }

    public void setEdadGestacional(Integer edadGestacional) {
        this.edadGestacional = edadGestacional;
    }

    public Integer getParidad() {
        return paridad;
    }

    public void setParidad(Integer paridad) {
        this.paridad = paridad;
    }

    public Integer getTipoParto() {
        return tipoParto;
    }

    public void setTipoParto(Integer tipoParto) {
        this.tipoParto = tipoParto;
    }
}
