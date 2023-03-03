package com.example.demo.entity.schemas.historialUti;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "exficardiovascular", schema = "historialuti")
public class ExFiCardiovascular {
    @Id
    @Column(name = "nrouti")
    private String nroUti;
    private String ritmo;
    @Column(name = "palpac_asucult")
    private String palpacAsucult;
    @Column(name = "monitorecg")
    private String monitorEcg;
    @Column(name = "tasistolica")
    private Integer taSistolica;
    @Column(name = "tadiastolica")
    private Integer taDiastolica;
    @Column(name = "freccardiaca")
    private Integer frecCardiaca;
    @Column(name = "catetercentral")
    private String cateterCentral;
    private String comentarios;

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

    public Integer getFrecCardiaca() {
        return frecCardiaca;
    }

    public void setFrecCardiaca(Integer frecCardiaca) {
        this.frecCardiaca = frecCardiaca;
    }

    public String getCateterCentral() {
        return cateterCentral;
    }

    public void setCateterCentral(String cateterCentral) {
        this.cateterCentral = cateterCentral;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }
}
