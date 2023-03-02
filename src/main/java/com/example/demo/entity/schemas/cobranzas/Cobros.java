package com.example.demo.entity.schemas.cobranzas;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(schema = "cobranzas", name = "cobros")
public class Cobros {
    @Id
    @Column(name = "nro_cobro")
    private Integer nroCobro;
    private String sucursal;
    @Column(name = "t_comprob")
    private String TComprob;
    @Column(name = "n_comprob")
    private Integer NComprob;
    private Double importe;
    @Column(name = "fecha_cobro")
    private Date fechaCobro;
    @Column(name = "fecha_liq_derhon")
    private Date fechaLiqDerhon;
    @Column(name = "desc_cobro")
    private String descCobro;
    @Column(name = "estado_imp_res")
    private String estadoImpRes;
    @Column(name = "imput_res_fac")
    private String imputResFac;
    private Integer cobertura;
    @Column(name = "ctaanio")
    private Integer ctaAnio;
    @Column(name = "ctatipo")
    private Integer ctaTipo;
    @Column(name = "ctaclase")
    private Integer ctaClase;
    @Column(name = "ctaconcepto")
    private Integer ctaConcepto;
    @Column(name = "ctasubconcepto")
    private Integer ctaSubConcepto;
    private String anulado;
    @Column(name = "recibidode")
    private String recibidoDe;

    public Integer getNroCobro() {
        return nroCobro;
    }

    public void setNroCobro(Integer nroCobro) {
        this.nroCobro = nroCobro;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public String getTComproB() {
        return TComprob;
    }

    public void setTComproB(String TComprob) {
        this.TComprob = TComprob;
    }

    public Integer getNComprob() {
        return NComprob;
    }

    public void setNComprob(Integer NComprob) {
        this.NComprob = NComprob;
    }

    public Double getImporte() {
        return importe;
    }

    public void setImporte(Double importe) {
        this.importe = importe;
    }

    public Date getFechaCobro() {
        return fechaCobro;
    }

    public void setFechaCobro(Date fechaCobro) {
        this.fechaCobro = fechaCobro;
    }

    public Date getFechaLiqDerhon() {
        return fechaLiqDerhon;
    }

    public void setFechaLiqDerhon(Date fechaLiqDerhon) {
        this.fechaLiqDerhon = fechaLiqDerhon;
    }

    public String getDescCobro() {
        return descCobro;
    }

    public void setDescCobro(String descCobro) {
        this.descCobro = descCobro;
    }

    public String getEstadoImpRes() {
        return estadoImpRes;
    }

    public void setEstadoImpRes(String estadoImpRes) {
        this.estadoImpRes = estadoImpRes;
    }

    public String getImputResFac() {
        return imputResFac;
    }

    public void setImputResFac(String imputResFac) {
        this.imputResFac = imputResFac;
    }

    public Integer getCobertura() {
        return cobertura;
    }

    public void setCobertura(Integer cobertura) {
        this.cobertura = cobertura;
    }

    public Integer getCtaAnio() {
        return ctaAnio;
    }

    public void setCtaAnio(Integer ctaAnio) {
        this.ctaAnio = ctaAnio;
    }

    public Integer getCtaTipo() {
        return ctaTipo;
    }

    public void setCtaTipo(Integer ctaTipo) {
        this.ctaTipo = ctaTipo;
    }

    public Integer getCtaClase() {
        return ctaClase;
    }

    public void setCtaClase(Integer ctaClase) {
        this.ctaClase = ctaClase;
    }

    public Integer getCtaConcepto() {
        return ctaConcepto;
    }

    public void setCtaConcepto(Integer ctaConcepto) {
        this.ctaConcepto = ctaConcepto;
    }

    public Integer getCtaSubConcepto() {
        return ctaSubConcepto;
    }

    public void setCtaSubConcepto(Integer ctaSubConcepto) {
        this.ctaSubConcepto = ctaSubConcepto;
    }

    public String getAnulado() {
        return anulado;
    }

    public void setAnulado(String anulado) {
        this.anulado = anulado;
    }

    public String getRecibidoDe() {
        return recibidoDe;
    }

    public void setRecibidoDe(String recibidoDe) {
        this.recibidoDe = recibidoDe;
    }
}
