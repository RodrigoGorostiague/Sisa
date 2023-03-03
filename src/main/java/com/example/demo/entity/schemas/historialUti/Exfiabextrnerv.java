package com.example.demo.entity.schemas.historialUti;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "exfiabextrnerv", schema = "historialuti")
public class Exfiabextrnerv {
    @Id
    @Column(name = "nrouti")
    private String nroUti;
    @Column(name = "abd_inspalpausc")
    private String abdInsPalpAusc;
    @Column(name = "extr_inspeccion")
    private String extrInspeccion;
    @Column(name = "extr_movilidad")
    private String extrMovilidad;
    @Column(name = "ssner_motactiva")
    private String ssnerNotActiva;
    @Column(name = "ssner_reflejos")
    private String ssnerReflejos;
    @Column(name = "ssner_comentarios")
    private String ssnerComentarios;
    @Column(name = "senspsiq")
    private String sensPsiq;
    @Column(name = "ssner_glasocular")
    private Integer ssnerGlasOcular;
    @Column(name = "ssner_glasverbal")
    private Integer ssnerGlasVerbal;
    @Column(name = "ssner_glasmotor")
    private Integer ssnerGlasMotor;

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

    public String getSsnerComentarios() {
        return ssnerComentarios;
    }

    public void setSsnerComentarios(String ssnerComentarios) {
        this.ssnerComentarios = ssnerComentarios;
    }

    public String getSensPsiq() {
        return sensPsiq;
    }

    public void setSensPsiq(String sensPsiq) {
        this.sensPsiq = sensPsiq;
    }

    public Integer getSsnerGlasOcular() {
        return ssnerGlasOcular;
    }

    public void setSsnerGlasOcular(Integer ssnerGlasOcular) {
        this.ssnerGlasOcular = ssnerGlasOcular;
    }

    public Integer getSsnerGlasVerbal() {
        return ssnerGlasVerbal;
    }

    public void setSsnerGlasVerbal(Integer ssnerGlasVerbal) {
        this.ssnerGlasVerbal = ssnerGlasVerbal;
    }

    public Integer getSsnerGlasMotor() {
        return ssnerGlasMotor;
    }

    public void setSsnerGlasMotor(Integer ssnerGlasMotor) {
        this.ssnerGlasMotor = ssnerGlasMotor;
    }
}
