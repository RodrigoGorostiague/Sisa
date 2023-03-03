package com.example.demo.entity.schemas.historialUti;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "exfiabextrnervold1", schema = "historialuti")
public class ExfiabextrnervOld1 {
    @Id
    @Column(name = "nrouti")
    private String nroUti;
    @Column(name = "abd_inspalpausc")
    private String abdInsPalpAusc;
    @Column(name = "extr_inspeccion")
    private String extrInspeccion;
    @Column(name = "extr_pulsos")
    private String extrPulsos;
    @Column(name = "extr_movilidad")
    private String extrMovilidad;
    @Column(name = "ssner_motactiva")
    private String ssnerNotActiva;
    @Column(name = "ssner_reflejos")
    private String ssnerReflejos;
    @Column(name = "ssner_taccercolvert")
    private String ssnerTacCerColVert;
    @Column(name = "ssner_otros")
    private String ssnerOtros;
    @Column(name = "ssner_glasgow")
    private Integer ssnerGlasgow;
    @Column(name = "senspsiq")
    private String sensPsiq;

    public String getNroUti() {
        return nroUti;
    }

    public void setNroUti(String nroUti) {
        this.nroUti = nroUti;
    }

    public String getAbdInsPalpAusc() {
        return abdInsPalpAusc;
    }

    public void setAbdInsPalpAusc(String abdInsPalpAusc) {
        this.abdInsPalpAusc = abdInsPalpAusc;
    }

    public String getExtrInspeccion() {
        return extrInspeccion;
    }

    public void setExtrInspeccion(String extrInspeccion) {
        this.extrInspeccion = extrInspeccion;
    }

    public String getExtrPulsos() {
        return extrPulsos;
    }

    public void setExtrPulsos(String extrPulsos) {
        this.extrPulsos = extrPulsos;
    }

    public String getExtrMovilidad() {
        return extrMovilidad;
    }

    public void setExtrMovilidad(String extrMovilidad) {
        this.extrMovilidad = extrMovilidad;
    }

    public String getSsnerNotActiva() {
        return ssnerNotActiva;
    }

    public void setSsnerNotActiva(String ssnerNotActiva) {
        this.ssnerNotActiva = ssnerNotActiva;
    }

    public String getSsnerReflejos() {
        return ssnerReflejos;
    }

    public void setSsnerReflejos(String ssnerReflejos) {
        this.ssnerReflejos = ssnerReflejos;
    }

    public String getSsnerTacCerColVert() {
        return ssnerTacCerColVert;
    }

    public void setSsnerTacCerColVert(String ssnerTacCerColVert) {
        this.ssnerTacCerColVert = ssnerTacCerColVert;
    }

    public String getSsnerOtros() {
        return ssnerOtros;
    }

    public void setSsnerOtros(String ssnerOtros) {
        this.ssnerOtros = ssnerOtros;
    }

    public Integer getSsnerGlasgow() {
        return ssnerGlasgow;
    }

    public void setSsnerGlasgow(Integer ssnerGlasgow) {
        this.ssnerGlasgow = ssnerGlasgow;
    }

    public String getSensPsiq() {
        return sensPsiq;
    }

    public void setSensPsiq(String sensPsiq) {
        this.sensPsiq = sensPsiq;
    }
}
