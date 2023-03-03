package com.example.demo.entity.schemas.historialInternacion;


import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "examenfisicogral", schema = "historialinternacion")
public class ExamenFisicoGral {
    @EmbeddedId
    private ExamenFisicoGralPK id;
    private String peso;
    private String talla;
    @Column(name = "tasistolica")
    private String taSistolica;
    @Column(name = "tadiastolica")
    private String taDiastolica;
    @Column(name = "tempaxilar")
    private String tempAxilar;
    @Column(name = "frecrespiratoria")
    private String frecRespiratoria;
    @Column(name = "freccardiaca")
    private String frecCardiaca;
    private String satrurometria;
    private String diuresis;
    private String catarsis;
    private String piel;
    @Column(name = "cabezaycuello")
    private String cabezaCuello;
    private String respiratorio;
    private String cardiovascular;
    private String abdomen;
    private String locomotor;
    @Column(name = "sistemanervioso")
    private String sistemaNervioso;
    private String urinario;
    @Column(name = "exlaboratorio")
    private String exLaboratorio;
    @Column(name = "eximagenes")
    private String exImagenes;
    @Column(name = "exotros")
    private String exOtros;
    @Column(name = "tiposaturacion")
    private String tipoSaturacion;
    @Column(name = "saturacioncon_o2")
    private Integer saturacionConO2;
    @Column(name = "aspecto_gral")
    private String aspectoGral;

    public ExamenFisicoGralPK getId() {
        return id;
    }

    public void setId(ExamenFisicoGralPK id) {
        this.id = id;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getTaSistolica() {
        return taSistolica;
    }

    public void setTaSistolica(String taSistolica) {
        this.taSistolica = taSistolica;
    }

    public String getTaDiastolica() {
        return taDiastolica;
    }

    public void setTaDiastolica(String taDiastolica) {
        this.taDiastolica = taDiastolica;
    }

    public String getTempAxilar() {
        return tempAxilar;
    }

    public void setTempAxilar(String tempAxilar) {
        this.tempAxilar = tempAxilar;
    }

    public String getFrecRespiratoria() {
        return frecRespiratoria;
    }

    public void setFrecRespiratoria(String frecRespiratoria) {
        this.frecRespiratoria = frecRespiratoria;
    }

    public String getFrecCardiaca() {
        return frecCardiaca;
    }

    public void setFrecCardiaca(String frecCardiaca) {
        this.frecCardiaca = frecCardiaca;
    }

    public String getSatrurometria() {
        return satrurometria;
    }

    public void setSatrurometria(String satrurometria) {
        this.satrurometria = satrurometria;
    }

    public String getDiuresis() {
        return diuresis;
    }

    public void setDiuresis(String diuresis) {
        this.diuresis = diuresis;
    }

    public String getCatarsis() {
        return catarsis;
    }

    public void setCatarsis(String catarsis) {
        this.catarsis = catarsis;
    }

    public String getPiel() {
        return piel;
    }

    public void setPiel(String piel) {
        this.piel = piel;
    }

    public String getCabezaCuello() {
        return cabezaCuello;
    }

    public void setCabezaCuello(String cabezaCuello) {
        this.cabezaCuello = cabezaCuello;
    }

    public String getRespiratorio() {
        return respiratorio;
    }

    public void setRespiratorio(String respiratorio) {
        this.respiratorio = respiratorio;
    }

    public String getCardiovascular() {
        return cardiovascular;
    }

    public void setCardiovascular(String cardiovascular) {
        this.cardiovascular = cardiovascular;
    }

    public String getAbdomen() {
        return abdomen;
    }

    public void setAbdomen(String abdomen) {
        this.abdomen = abdomen;
    }

    public String getLocomotor() {
        return locomotor;
    }

    public void setLocomotor(String locomotor) {
        this.locomotor = locomotor;
    }

    public String getSistemaNervioso() {
        return sistemaNervioso;
    }

    public void setSistemaNervioso(String sistemaNervioso) {
        this.sistemaNervioso = sistemaNervioso;
    }

    public String getUrinario() {
        return urinario;
    }

    public void setUrinario(String urinario) {
        this.urinario = urinario;
    }

    public String getExLaboratorio() {
        return exLaboratorio;
    }

    public void setExLaboratorio(String exLaboratorio) {
        this.exLaboratorio = exLaboratorio;
    }

    public String getExImagenes() {
        return exImagenes;
    }

    public void setExImagenes(String exImagenes) {
        this.exImagenes = exImagenes;
    }

    public String getExOtros() {
        return exOtros;
    }

    public void setExOtros(String exOtros) {
        this.exOtros = exOtros;
    }

    public String getTipoSaturacion() {
        return tipoSaturacion;
    }

    public void setTipoSaturacion(String tipoSaturacion) {
        this.tipoSaturacion = tipoSaturacion;
    }

    public Integer getSaturacionConO2() {
        return saturacionConO2;
    }

    public void setSaturacionConO2(Integer saturacionConO2) {
        this.saturacionConO2 = saturacionConO2;
    }

    public String getAspectoGral() {
        return aspectoGral;
    }

    public void setAspectoGral(String aspectoGral) {
        this.aspectoGral = aspectoGral;
    }
}
