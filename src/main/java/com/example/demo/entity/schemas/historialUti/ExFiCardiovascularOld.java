package com.example.demo.entity.schemas.historialUti;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "exficardiovascularold", schema = "historialuti")
public class ExFiCardiovascularOld {
    @Id
    @Column(name = "nrouti")
    private String nroUti;
    private String ritmo;
    @Column(name = "palpac_asucult")
    private String palpacAsucult;
    @Column(name = "monitorecg")
    private String monitorEcg;
    @Column(name = "presionpulso")
    private String presionPulso;
    @Column(name = "tasistolica")
    private Integer taSistolica;
    @Column(name = "tadiastolica")
    private Integer taDiastolica;
    @Column(name = "freccardiaca")
    private Integer freccardiaca;
    @Column(name = "catetercentral")
    private String cateterCentral;
    @Column(name = "valorpvc")
    private Integer valorPvc;

    public String getNroUti() {
        return nroUti;
    }

    public void setNroUti(String nroUti) {
        this.nroUti = nroUti;
    }

    public String getRitmo() {
        return ritmo;
    }

    public void setRitmo(String ritmo) {
        this.ritmo = ritmo;
    }

    public String getPalpacAsucult() {
        return palpacAsucult;
    }

    public void setPalpacAsucult(String palpacAsucult) {
        this.palpacAsucult = palpacAsucult;
    }

    public String getMonitorEcg() {
        return monitorEcg;
    }

    public void setMonitorEcg(String monitorEcg) {
        this.monitorEcg = monitorEcg;
    }

    public String getPresionPulso() {
        return presionPulso;
    }

    public void setPresionPulso(String presionPulso) {
        this.presionPulso = presionPulso;
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

    public Integer getFreccardiaca() {
        return freccardiaca;
    }

    public void setFreccardiaca(Integer freccardiaca) {
        this.freccardiaca = freccardiaca;
    }

    public String getCateterCentral() {
        return cateterCentral;
    }

    public void setCateterCentral(String cateterCentral) {
        this.cateterCentral = cateterCentral;
    }

    public Integer getValorPvc() {
        return valorPvc;
    }

    public void setValorPvc(Integer valorPvc) {
        this.valorPvc = valorPvc;
    }
}
