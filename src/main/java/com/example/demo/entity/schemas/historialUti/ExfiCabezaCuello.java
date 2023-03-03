package com.example.demo.entity.schemas.historialUti;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "exficabezaycuello", schema = "historialuti")
public class ExfiCabezaCuello {
    @Id
    @Column(name = "nrouti")
    private String nroUti;
    private String conjuntivas;
    private String mucosas;
    @Column(name = "pulsocarizq")
    private String pulsoCarIzq;
    @Column(name = "pulsocarder")
    private String pulsoCarDer;
    private String yugulares;
    @Column(name = "pupilaizqtam")
    private String pupilaIzqTam;
    @Column(name = "pupilaizqreactiv")
    private String pupilaIzqReactiv;
    @Column(name = "pupiladertam")
    private String pupilaDerTam;
    @Column(name = "pupiladerreactiv")
    private String pupilaDerReactiv;
    @Column(name = "motilidadocular")
    private String motilidadOcular;
    private String comentarios;

    public String getNroUti() {
        return nroUti;
    }

    public void setNroUti(String nroUti) {
        this.nroUti = nroUti;
    }

    public String getConjuntivas() {
        return conjuntivas;
    }

    public void setConjuntivas(String conjuntivas) {
        this.conjuntivas = conjuntivas;
    }

    public String getMucosas() {
        return mucosas;
    }

    public void setMucosas(String mucosas) {
        this.mucosas = mucosas;
    }

    public String getPulsoCarIzq() {
        return pulsoCarIzq;
    }

    public void setPulsoCarIzq(String pulsoCarIzq) {
        this.pulsoCarIzq = pulsoCarIzq;
    }

    public String getPulsoCarDer() {
        return pulsoCarDer;
    }

    public void setPulsoCarDer(String pulsoCarDer) {
        this.pulsoCarDer = pulsoCarDer;
    }

    public String getYugulares() {
        return yugulares;
    }

    public void setYugulares(String yugulares) {
        this.yugulares = yugulares;
    }

    public String getPupilaIzqTam() {
        return pupilaIzqTam;
    }

    public void setPupilaIzqTam(String pupilaIzqTam) {
        this.pupilaIzqTam = pupilaIzqTam;
    }

    public String getPupilaIzqReactiv() {
        return pupilaIzqReactiv;
    }

    public void setPupilaIzqReactiv(String pupilaIzqReactiv) {
        this.pupilaIzqReactiv = pupilaIzqReactiv;
    }

    public String getPupilaDerTam() {
        return pupilaDerTam;
    }

    public void setPupilaDerTam(String pupilaDerTam) {
        this.pupilaDerTam = pupilaDerTam;
    }

    public String getPupilaDerReactiv() {
        return pupilaDerReactiv;
    }

    public void setPupilaDerReactiv(String pupilaDerReactiv) {
        this.pupilaDerReactiv = pupilaDerReactiv;
    }

    public String getMotilidadOcular() {
        return motilidadOcular;
    }

    public void setMotilidadOcular(String motilidadOcular) {
        this.motilidadOcular = motilidadOcular;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }
}
