package com.example.demo.entity.schemas.paciente;

import jakarta.persistence.*;

@Entity
@Table(name = "riesgocardiovascular", schema = "paciente")
public class RiesgoCardiovascular {
    @Id
    @ManyToOne
    @JoinColumn(name = "idpaciente", referencedColumnName = "idpaciente")
    private Paciente paciente;
    private String localidad;
    private String sexo;
    private Integer edad;
    private Integer peso;
    private Integer talla;
    @Column(name = "tasistolica")
    private Integer taSistolica;
    @Column(name = "tadiastolica")
    private Integer taDiastolica;
    @Column(name = "perimetroabdominal")
    private Integer perimetroAbdominal;
    private String diabetes;
    private Integer colesterol;
    private String tabaquismo;
    @Column(name = "actfisicadiaria")
    private String actFisicaDiaria;
    @Column(name = "antecheredofamiliares")
    private String antecHeredoFamiliares;
    @Column(name = "nivelinstruccion")
    private String nivelInstruccion;
    private String trabajo;
    private String vivienda;
    @Column(name = "alimcarnesblancas")
    private Integer alimCarnesBlancas;
    @Column(name = "alimcarnesrojas")
    private Integer alimCarnesRojas;
    @Column(name = "alimlegumbres")
    private Integer alimLegumbres;
    @Column(name = "alimlacteos")
    private Integer alimLacteos;
    @Column(name = "alimfrutasverduras")
    private Integer alimFrutasVerduras;
    @Column(name = "alimharinas")
    private Integer alimHarinas;
    @Column(name = "alimaceite")
    private Integer alimAceite;
    @Column(name = "alimtipoaceite")
    private String alimTipoAceite;
    @Column(name = "alimagua")
    private Integer alimAgua;
    private String riesgo;
    private String color;

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public Integer getTalla() {
        return talla;
    }

    public void setTalla(Integer talla) {
        this.talla = talla;
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

    public Integer getPerimetroAbdominal() {
        return perimetroAbdominal;
    }

    public void setPerimetroAbdominal(Integer perimetroAbdominal) {
        this.perimetroAbdominal = perimetroAbdominal;
    }

    public String getDiabetes() {
        return diabetes;
    }

    public void setDiabetes(String diabetes) {
        this.diabetes = diabetes;
    }

    public Integer getColesterol() {
        return colesterol;
    }

    public void setColesterol(Integer colesterol) {
        this.colesterol = colesterol;
    }

    public String getTabaquismo() {
        return tabaquismo;
    }

    public void setTabaquismo(String tabaquismo) {
        this.tabaquismo = tabaquismo;
    }

    public String getActFisicaDiaria() {
        return actFisicaDiaria;
    }

    public void setActFisicaDiaria(String actFisicaDiaria) {
        this.actFisicaDiaria = actFisicaDiaria;
    }

    public String getAntecHeredoFamiliares() {
        return antecHeredoFamiliares;
    }

    public void setAntecHeredoFamiliares(String antecHeredoFamiliares) {
        this.antecHeredoFamiliares = antecHeredoFamiliares;
    }

    public String getNivelInstruccion() {
        return nivelInstruccion;
    }

    public void setNivelInstruccion(String nivelInstruccion) {
        this.nivelInstruccion = nivelInstruccion;
    }

    public String getTrabajo() {
        return trabajo;
    }

    public void setTrabajo(String trabajo) {
        this.trabajo = trabajo;
    }

    public String getVivienda() {
        return vivienda;
    }

    public void setVivienda(String vivienda) {
        this.vivienda = vivienda;
    }

    public Integer getAlimCarnesBlancas() {
        return alimCarnesBlancas;
    }

    public void setAlimCarnesBlancas(Integer alimCarnesBlancas) {
        this.alimCarnesBlancas = alimCarnesBlancas;
    }

    public Integer getAlimCarnesRojas() {
        return alimCarnesRojas;
    }

    public void setAlimCarnesRojas(Integer alimCarnesRojas) {
        this.alimCarnesRojas = alimCarnesRojas;
    }

    public Integer getAlimLegumbres() {
        return alimLegumbres;
    }

    public void setAlimLegumbres(Integer alimLegumbres) {
        this.alimLegumbres = alimLegumbres;
    }

    public Integer getAlimLacteos() {
        return alimLacteos;
    }

    public void setAlimLacteos(Integer alimLacteos) {
        this.alimLacteos = alimLacteos;
    }

    public Integer getAlimFrutasVerduras() {
        return alimFrutasVerduras;
    }

    public void setAlimFrutasVerduras(Integer alimFrutasVerduras) {
        this.alimFrutasVerduras = alimFrutasVerduras;
    }

    public Integer getAlimHarinas() {
        return alimHarinas;
    }

    public void setAlimHarinas(Integer alimHarinas) {
        this.alimHarinas = alimHarinas;
    }

    public Integer getAlimAceite() {
        return alimAceite;
    }

    public void setAlimAceite(Integer alimAceite) {
        this.alimAceite = alimAceite;
    }

    public String getAlimTipoAceite() {
        return alimTipoAceite;
    }

    public void setAlimTipoAceite(String alimTipoAceite) {
        this.alimTipoAceite = alimTipoAceite;
    }

    public Integer getAlimAgua() {
        return alimAgua;
    }

    public void setAlimAgua(Integer alimAgua) {
        this.alimAgua = alimAgua;
    }

    public String getRiesgo() {
        return riesgo;
    }

    public void setRiesgo(String riesgo) {
        this.riesgo = riesgo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
