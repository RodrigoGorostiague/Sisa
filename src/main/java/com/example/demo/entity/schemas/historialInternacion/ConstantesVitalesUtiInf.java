package com.example.demo.entity.schemas.historialInternacion;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "constantesvitalesutiinf", schema = "historialinternacion")
public class ConstantesVitalesUtiInf {
    @EmbeddedId
    private ConstantesVitalesUtiInfPK id;
    @Column(name = "presionintracraneal")
    private Integer presionIntracraneal;
    @Column(name = "ntubo")
    private Integer nroTubo;
    private Integer centimetro;
    @Column(name = "frecrespiratoria_arm")
    private Integer frecRespiratoriaArm;
    @Column(name = "asistresp_lts")
    private Integer asistRespLts;
    private Boolean balon;
    @Column(name = "controladorpor")
    private String controladorPor;
    private String tubo;

    public ConstantesVitalesUtiInfPK getId() {
        return id;
    }

    public void setId(ConstantesVitalesUtiInfPK id) {
        this.id = id;
    }

    public Integer getPresionIntracraneal() {
        return presionIntracraneal;
    }

    public void setPresionIntracraneal(Integer presionIntracraneal) {
        this.presionIntracraneal = presionIntracraneal;
    }

    public Integer getNroTubo() {
        return nroTubo;
    }

    public void setNroTubo(Integer nroTubo) {
        this.nroTubo = nroTubo;
    }

    public Integer getCentimetro() {
        return centimetro;
    }

    public void setCentimetro(Integer centimetro) {
        this.centimetro = centimetro;
    }

    public Integer getFrecRespiratoriaArm() {
        return frecRespiratoriaArm;
    }

    public void setFrecRespiratoriaArm(Integer frecRespiratoriaArm) {
        this.frecRespiratoriaArm = frecRespiratoriaArm;
    }

    public Integer getAsistRespLts() {
        return asistRespLts;
    }

    public void setAsistRespLts(Integer asistRespLts) {
        this.asistRespLts = asistRespLts;
    }

    public Boolean getBalon() {
        return balon;
    }

    public void setBalon(Boolean balon) {
        this.balon = balon;
    }

    public String getControladorPor() {
        return controladorPor;
    }

    public void setControladorPor(String controladorPor) {
        this.controladorPor = controladorPor;
    }

    public String getTubo() {
        return tubo;
    }

    public void setTubo(String tubo) {
        this.tubo = tubo;
    }
}
