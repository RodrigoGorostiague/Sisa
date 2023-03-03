package com.example.demo.entity.schemas.historialInternacion;

import jakarta.persistence.*;

@Entity
@Table(schema = "historialinternacion", name = "antecedentes")
public class AntecedentesInter {
    @Id
    @ManyToOne
    @JoinColumn(name = "nrointernacion", referencedColumnName = "nrointernacion")
    private CabeceraEnfermeria cabeceraEnfermeria;
    @Column(name = "antpsiquiatricos")
    private String antPsiquiatricos;
    @Column(name = "detalletratamiento")
    private String detalleTratamiento;
    @Column(name = "medicacionhabitual")
    private String medicacionHabitual;
    private String hta;
    private String diabetes;
    private  String epoc;
    private String cardiopatia;
    private String alergias;
    @Column(name = "intervquirurgica")
    private String intervQuirurgica;
    private String antecedentes;
    @Column(name = "tratycuidados")
    private String tratCuidados;
    @Column(name = "consumotabaco")
    private String consumoTabaco;
    @Column(name = "canttabaco")
    private String cantTabco;
    @Column(name = "consumoalcohol")
    private String consumoAlcohol;
    @Column(name = "cantalcohol")
    private String cantAlcohol;
    @Column(name = "consumootros")
    private String consumoOtros;
    @Column(name = "detalleotros")
    private String detalleOtros;

    public CabeceraEnfermeria getCabeceraEnfermeria() {
        return cabeceraEnfermeria;
    }

    public void setCabeceraEnfermeria(CabeceraEnfermeria cabeceraEnfermeria) {
        this.cabeceraEnfermeria = cabeceraEnfermeria;
    }

    public String getAntPsiquiatricos() {
        return antPsiquiatricos;
    }

    public void setAntPsiquiatricos(String antPsiquiatricos) {
        this.antPsiquiatricos = antPsiquiatricos;
    }

    public String getDetalleTratamiento() {
        return detalleTratamiento;
    }

    public void setDetalleTratamiento(String detalleTratamiento) {
        this.detalleTratamiento = detalleTratamiento;
    }

    public String getMedicacionHabitual() {
        return medicacionHabitual;
    }

    public void setMedicacionHabitual(String medicacionHabitual) {
        this.medicacionHabitual = medicacionHabitual;
    }

    public String getHta() {
        return hta;
    }

    public void setHta(String hta) {
        this.hta = hta;
    }

    public String getDiabetes() {
        return diabetes;
    }

    public void setDiabetes(String diabetes) {
        this.diabetes = diabetes;
    }

    public String getEpoc() {
        return epoc;
    }

    public void setEpoc(String epoc) {
        this.epoc = epoc;
    }

    public String getCardiopatia() {
        return cardiopatia;
    }

    public void setCardiopatia(String cardiopatia) {
        this.cardiopatia = cardiopatia;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public String getIntervQuirurgica() {
        return intervQuirurgica;
    }

    public void setIntervQuirurgica(String intervQuirurgica) {
        this.intervQuirurgica = intervQuirurgica;
    }

    public String getAntecedentes() {
        return antecedentes;
    }

    public void setAntecedentes(String antecedentes) {
        this.antecedentes = antecedentes;
    }

    public String getTratCuidados() {
        return tratCuidados;
    }

    public void setTratCuidados(String tratCuidados) {
        this.tratCuidados = tratCuidados;
    }

    public String getConsumoTabaco() {
        return consumoTabaco;
    }

    public void setConsumoTabaco(String consumoTabaco) {
        this.consumoTabaco = consumoTabaco;
    }

    public String getCantTabco() {
        return cantTabco;
    }

    public void setCantTabco(String cantTabco) {
        this.cantTabco = cantTabco;
    }

    public String getConsumoAlcohol() {
        return consumoAlcohol;
    }

    public void setConsumoAlcohol(String consumoAlcohol) {
        this.consumoAlcohol = consumoAlcohol;
    }

    public String getCantAlcohol() {
        return cantAlcohol;
    }

    public void setCantAlcohol(String cantAlcohol) {
        this.cantAlcohol = cantAlcohol;
    }

    public String getConsumoOtros() {
        return consumoOtros;
    }

    public void setConsumoOtros(String consumoOtros) {
        this.consumoOtros = consumoOtros;
    }

    public String getDetalleOtros() {
        return detalleOtros;
    }

    public void setDetalleOtros(String detalleOtros) {
        this.detalleOtros = detalleOtros;
    }
}
