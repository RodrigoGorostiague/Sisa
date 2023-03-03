package com.example.demo.entity.schemas.historialUti;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "exfirespiratorioold", schema = "historialuti")
public class ExFiRespiratorioOld {
    @Id
    @Column(name = "nrouti")
    private String nroUti;
    private String inspeccion;
    @Column(name = "pulmonder")
    private String pulmonDer;
    @Column(name = "pulmonizq")
    private String pulmonIzq;
    @Column(name = "rxtoraxingr")
    private String rxToraxIngr;
    @Column(name = "gassgre_ph")
    private Integer gassgrePh;
    @Column(name = "gassgre_fio2")
    private Integer gassgreFio2;
    @Column(name = "gassgre_ado2")
    private Integer gassgreAdo2;
    @Column(name = "gassgre_pao2")
    private Integer gassgrePaO2;
    @Column(name = "gassgre_paco2")
    private Integer gassgrePaCo2;
    @Column(name = "gassgre_co3h")
    private Integer gassgreCo3h;
    @Column(name = "gassgre_sao2")
    private Integer gassgreSaO2;
    @Column(name = "gassgre_otros")
    private Integer gassgreOtros;
    @Column(name = "gassgre_arm")
    private String gassgreArm;
    @Column(name = "arm_modo")
    private String armModo;
    @Column(name = "arm_pplateau")
    private Integer armPresPlateau;
    @Column(name = "arm_ppico")
    private Integer armPresPico;
    @Column(name = "arm_complacencia")
    private Integer armComplacencia;

    public String getNroUti() {
        return nroUti;
    }

    public void setNroUti(String nroUti) {
        this.nroUti = nroUti;
    }

    public String getInspeccion() {
        return inspeccion;
    }

    public void setInspeccion(String inspeccion) {
        this.inspeccion = inspeccion;
    }

    public String getPulmonDer() {
        return pulmonDer;
    }

    public void setPulmonDer(String pulmonDer) {
        this.pulmonDer = pulmonDer;
    }

    public String getPulmonIzq() {
        return pulmonIzq;
    }

    public void setPulmonIzq(String pulmonIzq) {
        this.pulmonIzq = pulmonIzq;
    }

    public String getRxToraxIngr() {
        return rxToraxIngr;
    }

    public void setRxToraxIngr(String rxToraxIngr) {
        this.rxToraxIngr = rxToraxIngr;
    }

    public Integer getGassgrePh() {
        return gassgrePh;
    }

    public void setGassgrePh(Integer gassgrePh) {
        this.gassgrePh = gassgrePh;
    }

    public Integer getGassgreFio2() {
        return gassgreFio2;
    }

    public void setGassgreFio2(Integer gassgreFio2) {
        this.gassgreFio2 = gassgreFio2;
    }

    public Integer getGassgreAdo2() {
        return gassgreAdo2;
    }

    public void setGassgreAdo2(Integer gassgreAdo2) {
        this.gassgreAdo2 = gassgreAdo2;
    }

    public Integer getGassgrePaO2() {
        return gassgrePaO2;
    }

    public void setGassgrePaO2(Integer gassgrePaO2) {
        this.gassgrePaO2 = gassgrePaO2;
    }

    public Integer getGassgrePaCo2() {
        return gassgrePaCo2;
    }

    public void setGassgrePaCo2(Integer gassgrePaCo2) {
        this.gassgrePaCo2 = gassgrePaCo2;
    }

    public Integer getGassgreCo3h() {
        return gassgreCo3h;
    }

    public void setGassgreCo3h(Integer gassgreCo3h) {
        this.gassgreCo3h = gassgreCo3h;
    }

    public Integer getGassgreSaO2() {
        return gassgreSaO2;
    }

    public void setGassgreSaO2(Integer gassgreSaO2) {
        this.gassgreSaO2 = gassgreSaO2;
    }

    public Integer getGassgreOtros() {
        return gassgreOtros;
    }

    public void setGassgreOtros(Integer gassgreOtros) {
        this.gassgreOtros = gassgreOtros;
    }

    public String getGassgreArm() {
        return gassgreArm;
    }

    public void setGassgreArm(String gassgreArm) {
        this.gassgreArm = gassgreArm;
    }

    public String getArmModo() {
        return armModo;
    }

    public void setArmModo(String armModo) {
        this.armModo = armModo;
    }

    public Integer getArmPresPlateau() {
        return armPresPlateau;
    }

    public void setArmPresPlateau(Integer armPresPlateau) {
        this.armPresPlateau = armPresPlateau;
    }

    public Integer getArmPresPico() {
        return armPresPico;
    }

    public void setArmPresPico(Integer armPresPico) {
        this.armPresPico = armPresPico;
    }

    public Integer getArmComplacencia() {
        return armComplacencia;
    }

    public void setArmComplacencia(Integer armComplacencia) {
        this.armComplacencia = armComplacencia;
    }
}
