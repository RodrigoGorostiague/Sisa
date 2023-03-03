package com.example.demo.entity.schemas.historialInternacion;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "historialinternacion", name = "constantesvitalesdiabetes")
public class ConstantesVitalesDiabetes {
    @EmbeddedId
    private ConstantesVitalesDiabetesPK id;
    @Column(name = "orina_glucosa")
    private Integer orinaGlucosa;
    @Column(name = "orina_cetonas")
    private Integer orina_Petonas;
    @Column(name = "glucemia_tira")
    private Integer glucemiaTira;
    @Column(name = "glucemia_lab")
    private Integer glucemia_lab;
    @Column(name = "insulina_corriente")
    private Integer insulinaCorriente;
    @Column(name = "insulina_nph")
    private Integer insulinaNph;
    private Integer ph;
    private Integer bicarbonato;
    private Integer eb;
    private Integer na;
    private Integer k;

    public ConstantesVitalesDiabetesPK getId() {
        return id;
    }

    public void setId(ConstantesVitalesDiabetesPK id) {
        this.id = id;
    }

    public Integer getOrinaGlucosa() {
        return orinaGlucosa;
    }

    public void setOrinaGlucosa(Integer orinaGlucosa) {
        this.orinaGlucosa = orinaGlucosa;
    }

    public Integer getOrina_Petonas() {
        return orina_Petonas;
    }

    public void setOrina_Petonas(Integer orina_Petonas) {
        this.orina_Petonas = orina_Petonas;
    }

    public Integer getGlucemiaTira() {
        return glucemiaTira;
    }

    public void setGlucemiaTira(Integer glucemiaTira) {
        this.glucemiaTira = glucemiaTira;
    }

    public Integer getGlucemia_lab() {
        return glucemia_lab;
    }

    public void setGlucemia_lab(Integer glucemia_lab) {
        this.glucemia_lab = glucemia_lab;
    }

    public Integer getInsulinaCorriente() {
        return insulinaCorriente;
    }

    public void setInsulinaCorriente(Integer insulinaCorriente) {
        this.insulinaCorriente = insulinaCorriente;
    }

    public Integer getInsulinaNph() {
        return insulinaNph;
    }

    public void setInsulinaNph(Integer insulinaNph) {
        this.insulinaNph = insulinaNph;
    }

    public Integer getPh() {
        return ph;
    }

    public void setPh(Integer ph) {
        this.ph = ph;
    }

    public Integer getBicarbonato() {
        return bicarbonato;
    }

    public void setBicarbonato(Integer bicarbonato) {
        this.bicarbonato = bicarbonato;
    }

    public Integer getEb() {
        return eb;
    }

    public void setEb(Integer eb) {
        this.eb = eb;
    }

    public Integer getNa() {
        return na;
    }

    public void setNa(Integer na) {
        this.na = na;
    }

    public Integer getK() {
        return k;
    }

    public void setK(Integer k) {
        this.k = k;
    }
}
