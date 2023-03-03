package com.example.demo.entity.schemas.sipa;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "adicciones", schema = "sipa")
public class Adicciones {
    @EmbeddedId
    private AdiccionesPK id;
    @Column(name = "fumaactpritrim")
    private String fumaActPriTrim;
    @Column(name = "fumaactsegtrim")
    private String fumaActSegTrim;
    @Column(name = "fumaacttertrim")
    private String fumaActTerTrim;
    @Column(name = "fumapaspritrim")
    private String fumaPasPriTrim;
    @Column(name = "fumapassegtrim")
    private String fumaPasSegTrim;
    @Column(name = "fumapastertrim")
    private String fumaPasTerTrim;
    @Column(name = "drogaspritrim")
    private String drogasPriTrim;
    @Column(name = "drogassegtrim")
    private String drogasSegTrim;
    @Column(name = "drogastertrim")
    private String drogasTerTrim;
    @Column(name = "alcoholpritrim")
    private String alcoholPriTrim;
    @Column(name = "alcoholsegtrim")
    private String alcoholSegTrim;
    @Column(name = "alcoholtertrim")
    private String alcoholTerTrim;
    @Column(name = "violenciapritrim")
    private String violenciaPriTrim;
    @Column(name = "violenciasegtrim")
    private String violenciaSegTrim;
    @Column(name = "violenciatertrim")
    private String violenciaTerTrim;

    public AdiccionesPK getId() {
        return id;
    }

    public void setId(AdiccionesPK id) {
        this.id = id;
    }

    public String getFumaActPriTrim() {
        return fumaActPriTrim;
    }

    public void setFumaActPriTrim(String fumaActPriTrim) {
        this.fumaActPriTrim = fumaActPriTrim;
    }

    public String getFumaActSegTrim() {
        return fumaActSegTrim;
    }

    public void setFumaActSegTrim(String fumaActSegTrim) {
        this.fumaActSegTrim = fumaActSegTrim;
    }

    public String getFumaActTerTrim() {
        return fumaActTerTrim;
    }

    public void setFumaActTerTrim(String fumaActTerTrim) {
        this.fumaActTerTrim = fumaActTerTrim;
    }

    public String getFumaPasPriTrim() {
        return fumaPasPriTrim;
    }

    public void setFumaPasPriTrim(String fumaPasPriTrim) {
        this.fumaPasPriTrim = fumaPasPriTrim;
    }

    public String getFumaPasSegTrim() {
        return fumaPasSegTrim;
    }

    public void setFumaPasSegTrim(String fumaPasSegTrim) {
        this.fumaPasSegTrim = fumaPasSegTrim;
    }

    public String getFumaPasTerTrim() {
        return fumaPasTerTrim;
    }

    public void setFumaPasTerTrim(String fumaPasTerTrim) {
        this.fumaPasTerTrim = fumaPasTerTrim;
    }

    public String getDrogasPriTrim() {
        return drogasPriTrim;
    }

    public void setDrogasPriTrim(String drogasPriTrim) {
        this.drogasPriTrim = drogasPriTrim;
    }

    public String getDrogasSegTrim() {
        return drogasSegTrim;
    }

    public void setDrogasSegTrim(String drogasSegTrim) {
        this.drogasSegTrim = drogasSegTrim;
    }

    public String getDrogasTerTrim() {
        return drogasTerTrim;
    }

    public void setDrogasTerTrim(String drogasTerTrim) {
        this.drogasTerTrim = drogasTerTrim;
    }

    public String getAlcoholPriTrim() {
        return alcoholPriTrim;
    }

    public void setAlcoholPriTrim(String alcoholPriTrim) {
        this.alcoholPriTrim = alcoholPriTrim;
    }

    public String getAlcoholSegTrim() {
        return alcoholSegTrim;
    }

    public void setAlcoholSegTrim(String alcoholSegTrim) {
        this.alcoholSegTrim = alcoholSegTrim;
    }

    public String getAlcoholTerTrim() {
        return alcoholTerTrim;
    }

    public void setAlcoholTerTrim(String alcoholTerTrim) {
        this.alcoholTerTrim = alcoholTerTrim;
    }

    public String getViolenciaPriTrim() {
        return violenciaPriTrim;
    }

    public void setViolenciaPriTrim(String violenciaPriTrim) {
        this.violenciaPriTrim = violenciaPriTrim;
    }

    public String getViolenciaSegTrim() {
        return violenciaSegTrim;
    }

    public void setViolenciaSegTrim(String violenciaSegTrim) {
        this.violenciaSegTrim = violenciaSegTrim;
    }

    public String getViolenciaTerTrim() {
        return violenciaTerTrim;
    }

    public void setViolenciaTerTrim(String violenciaTerTrim) {
        this.violenciaTerTrim = violenciaTerTrim;
    }
}
