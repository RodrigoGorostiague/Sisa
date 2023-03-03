package com.example.demo.entity.schemas.historialAmbEsp;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "altaneonatal", schema = "historialambesp")
public class AltaNeonatal {
    @EmbeddedId
    private AltaNeonatalPK id;
    @Column(name = "serologiamaternaneg")
    private String serologiaMaternaNeg;
    @Column(name = "resulotoemisacust")
    private String resulotoEmisAcust;
    private String fei;
    @Column(name = "esqvacunasaldia")
    private String esqVacunasalDia;
    private String ror;
    @Column(name = "ortolani")
    private String ortolani;
    @Column(name = "turnootoemisacust")
    private Date turnoOtoEmisAcust;

    public AltaNeonatalPK getId() {
        return id;
    }

    public void setId(AltaNeonatalPK id) {
        this.id = id;
    }

    public String getSerologiaMaternaNeg() {
        return serologiaMaternaNeg;
    }

    public void setSerologiaMaternaNeg(String serologiaMaternaNeg) {
        this.serologiaMaternaNeg = serologiaMaternaNeg;
    }

    public String getResulotoEmisAcust() {
        return resulotoEmisAcust;
    }

    public void setResulotoEmisAcust(String resulotoEmisAcust) {
        this.resulotoEmisAcust = resulotoEmisAcust;
    }

    public String getFei() {
        return fei;
    }

    public void setFei(String fei) {
        this.fei = fei;
    }

    public String getEsqVacunasalDia() {
        return esqVacunasalDia;
    }

    public void setEsqVacunasalDia(String esqVacunasalDia) {
        this.esqVacunasalDia = esqVacunasalDia;
    }

    public String getRor() {
        return ror;
    }

    public void setRor(String ror) {
        this.ror = ror;
    }

    public String getOrtolani() {
        return ortolani;
    }

    public void setOrtolani(String ortolani) {
        this.ortolani = ortolani;
    }

    public Date getTurnoOtoEmisAcust() {
        return turnoOtoEmisAcust;
    }

    public void setTurnoOtoEmisAcust(Date turnoOtoEmisAcust) {
        this.turnoOtoEmisAcust = turnoOtoEmisAcust;
    }
}
