package com.example.demo.entity.schemas.cobranzas;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(schema = "cobranzas", name = "imput_cobro_res")
public class ImputCobroRes {
    @EmbeddedId
    private ImputCobroResPK id;
    private Double cobrado;
    private Double debitado;
    private Double acreditado;
    @Column(name = "cobradoder")
    private Double cobradoDer;
    @Column(name = "cobradohon")
    private Double cobradoHon;
    @Column(name = "liquidadoder")
    private Double liquidadoDer;
    @Column(name = "liquidadohon")
    private Double liquidadoHon;
    private String observaciones;
    @Column(name = "fecha_cobro")
    private Date fechaCobro;
    @Column(name = "pagadopor")
    private String pagadoPor;
    @Column(name = "emitenc")
    private String emitEnc;
    @Column(name = "emitend")
    private String emitEnd;

    public ImputCobroResPK getId() {
        return id;
    }

    public void setId(ImputCobroResPK id) {
        this.id = id;
    }

    public Double getCobrado() {
        return cobrado;
    }

    public void setCobrado(Double cobrado) {
        this.cobrado = cobrado;
    }

    public Double getDebitado() {
        return debitado;
    }

    public void setDebitado(Double debitado) {
        this.debitado = debitado;
    }

    public Double getAcreditado() {
        return acreditado;
    }

    public void setAcreditado(Double acreditado) {
        this.acreditado = acreditado;
    }

    public Double getCobradoDer() {
        return cobradoDer;
    }

    public void setCobradoDer(Double cobradoDer) {
        this.cobradoDer = cobradoDer;
    }

    public Double getCobradoHon() {
        return cobradoHon;
    }

    public void setCobradoHon(Double cobradoHon) {
        this.cobradoHon = cobradoHon;
    }

    public Double getLiquidadoDer() {
        return liquidadoDer;
    }

    public void setLiquidadoDer(Double liquidadoDer) {
        this.liquidadoDer = liquidadoDer;
    }

    public Double getLiquidadoHon() {
        return liquidadoHon;
    }

    public void setLiquidadoHon(Double liquidadoHon) {
        this.liquidadoHon = liquidadoHon;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Date getFechaCobro() {
        return fechaCobro;
    }

    public void setFechaCobro(Date fechaCobro) {
        this.fechaCobro = fechaCobro;
    }

    public String getPagadoPor() {
        return pagadoPor;
    }

    public void setPagadoPor(String pagadoPor) {
        this.pagadoPor = pagadoPor;
    }

    public String getEmitEnc() {
        return emitEnc;
    }

    public void setEmitEnc(String emitEnc) {
        this.emitEnc = emitEnc;
    }

    public String getEmitEnd() {
        return emitEnd;
    }

    public void setEmitEnd(String emitEnd) {
        this.emitEnd = emitEnd;
    }
}
