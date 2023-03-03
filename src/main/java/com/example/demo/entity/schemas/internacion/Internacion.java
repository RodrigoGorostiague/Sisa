package com.example.demo.entity.schemas.internacion;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "internacion", schema = "internacion")
public class Internacion {
    @Id
    @Column(name = "nroInternacion")
    private Integer nrointernacion;
    @Column(name = "idpaciente")
    private Integer idPaciente;
    @Column(name = "codigouniat")
    private String codigoUniat;
    private Boolean breve;
    private String orden;
    @Column(name = "tipoingreso")
    private String tipoIngreso;
    @Column(name = "tipoegreso")
    private String tipoEgreso;
    @Column(name = "establecimientotraslado")
    private String establecimientoTraslado;
    private Boolean autopsia;
    @Column(name = "motivoegreso")
    private String motivoEgreso;
    @Column(name = "codigoobrasocial")
    private Integer codigoObraSocial;
    @Column(name = "numeroafiliadoos")
    private String numeroAfiliadoOs;
    @Column(name = "codigoseguro")
    private Integer codigoSeguro;
    @Column(name = "codigoart")
    private Integer codigoArt;
    @Column(name = "hoja10generada")
    private String hoja10generada;
    @Column(name = "fechapasefacturacion")
    private Date fechaPaseFacturacion;
    private String observaciones;
    @Column(name = "procedenciaingreso")
    private String procedenciaIngreso;
    @Column(name = "diagnosticoingr")
    private String diagnosticoIngr;
    private String profesional;
    @Column(name = "numeropoliza")
    private String numeroPoliza;
    @Column(name = "fechapaseoye")
    private Date fechaPaseOye;
    @Column(name = "pscpadres")
    private String pscPadres;
    @Column(name = "trajorecibo")
    private Boolean trajoRecibo;
    @Column(name = "trajocarne")
    private Boolean trajoCarne;
    @Column(name = "trajodni")
    private Boolean trajoDni;
    @Column(name = "trajootr")
    private Boolean trajoOtr;
    @Column(name = "deotralocalidad")
    private Boolean deOtraLocalidad;
    private Date denuncia;
    @Column(name = "entregaordenes")
    private Date entregaordenes;
    @Column(name = "codigoprestadora")
    private String codigoPrestadora;
    @Column(name = "profactextser")
    private Boolean profActExtSer;
    @Column(name = "fechadevolobsoc")
    private Date fechaDevolObSoc;
    @Column(name = "fechapaseobsoc2")
    private Date fechaPaseObSoc2;
    @Column(name = "fechapaseart")
    private Date fechaPaseArt;
    @Column(name = "fechadevolart")
    private Date fechadEvolArt;
    @Column(name = "fechapaseart2")
    private Date fechaPaseArt2;
    @Column(name = "informadosss")
    private String informaDosss;

    public Integer getNrointernacion() {
        return nrointernacion;
    }

    public void setNrointernacion(Integer nrointernacion) {
        this.nrointernacion = nrointernacion;
    }

    public Integer getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getCodigoUniat() {
        return codigoUniat;
    }

    public void setCodigoUniat(String codigoUniat) {
        this.codigoUniat = codigoUniat;
    }

    public Boolean getBreve() {
        return breve;
    }

    public void setBreve(Boolean breve) {
        this.breve = breve;
    }

    public String getOrden() {
        return orden;
    }

    public void setOrden(String orden) {
        this.orden = orden;
    }

    public String getTipoIngreso() {
        return tipoIngreso;
    }

    public void setTipoIngreso(String tipoIngreso) {
        this.tipoIngreso = tipoIngreso;
    }

    public String getTipoEgreso() {
        return tipoEgreso;
    }

    public void setTipoEgreso(String tipoEgreso) {
        this.tipoEgreso = tipoEgreso;
    }

    public String getEstablecimientoTraslado() {
        return establecimientoTraslado;
    }

    public void setEstablecimientoTraslado(String establecimientoTraslado) {
        this.establecimientoTraslado = establecimientoTraslado;
    }

    public Boolean getAutopsia() {
        return autopsia;
    }

    public void setAutopsia(Boolean autopsia) {
        this.autopsia = autopsia;
    }

    public String getMotivoEgreso() {
        return motivoEgreso;
    }

    public void setMotivoEgreso(String motivoEgreso) {
        this.motivoEgreso = motivoEgreso;
    }

    public Integer getCodigoObraSocial() {
        return codigoObraSocial;
    }

    public void setCodigoObraSocial(Integer codigoObraSocial) {
        this.codigoObraSocial = codigoObraSocial;
    }

    public String getNumeroAfiliadoOs() {
        return numeroAfiliadoOs;
    }

    public void setNumeroAfiliadoOs(String numeroAfiliadoOs) {
        this.numeroAfiliadoOs = numeroAfiliadoOs;
    }

    public Integer getCodigoSeguro() {
        return codigoSeguro;
    }

    public void setCodigoSeguro(Integer codigoSeguro) {
        this.codigoSeguro = codigoSeguro;
    }

    public Integer getCodigoArt() {
        return codigoArt;
    }

    public void setCodigoArt(Integer codigoArt) {
        this.codigoArt = codigoArt;
    }

    public String getHoja10generada() {
        return hoja10generada;
    }

    public void setHoja10generada(String hoja10generada) {
        this.hoja10generada = hoja10generada;
    }

    public Date getFechaPaseFacturacion() {
        return fechaPaseFacturacion;
    }

    public void setFechaPaseFacturacion(Date fechaPaseFacturacion) {
        this.fechaPaseFacturacion = fechaPaseFacturacion;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getProcedenciaIngreso() {
        return procedenciaIngreso;
    }

    public void setProcedenciaIngreso(String procedenciaIngreso) {
        this.procedenciaIngreso = procedenciaIngreso;
    }

    public String getDiagnosticoIngr() {
        return diagnosticoIngr;
    }

    public void setDiagnosticoIngr(String diagnosticoIngr) {
        this.diagnosticoIngr = diagnosticoIngr;
    }

    public String getProfesional() {
        return profesional;
    }

    public void setProfesional(String profesional) {
        this.profesional = profesional;
    }

    public String getNumeroPoliza() {
        return numeroPoliza;
    }

    public void setNumeroPoliza(String numeroPoliza) {
        this.numeroPoliza = numeroPoliza;
    }

    public Date getFechaPaseOye() {
        return fechaPaseOye;
    }

    public void setFechaPaseOye(Date fechaPaseOye) {
        this.fechaPaseOye = fechaPaseOye;
    }

    public String getPscPadres() {
        return pscPadres;
    }

    public void setPscPadres(String pscPadres) {
        this.pscPadres = pscPadres;
    }

    public Boolean getTrajoRecibo() {
        return trajoRecibo;
    }

    public void setTrajoRecibo(Boolean trajoRecibo) {
        this.trajoRecibo = trajoRecibo;
    }

    public Boolean getTrajoCarne() {
        return trajoCarne;
    }

    public void setTrajoCarne(Boolean trajoCarne) {
        this.trajoCarne = trajoCarne;
    }

    public Boolean getTrajoDni() {
        return trajoDni;
    }

    public void setTrajoDni(Boolean trajoDni) {
        this.trajoDni = trajoDni;
    }

    public Boolean getTrajoOtr() {
        return trajoOtr;
    }

    public void setTrajoOtr(Boolean trajoOtr) {
        this.trajoOtr = trajoOtr;
    }

    public Boolean getDeOtraLocalidad() {
        return deOtraLocalidad;
    }

    public void setDeOtraLocalidad(Boolean deOtraLocalidad) {
        this.deOtraLocalidad = deOtraLocalidad;
    }

    public Date getDenuncia() {
        return denuncia;
    }

    public void setDenuncia(Date denuncia) {
        this.denuncia = denuncia;
    }

    public Date getEntregaordenes() {
        return entregaordenes;
    }

    public void setEntregaordenes(Date entregaordenes) {
        this.entregaordenes = entregaordenes;
    }

    public String getCodigoPrestadora() {
        return codigoPrestadora;
    }

    public void setCodigoPrestadora(String codigoPrestadora) {
        this.codigoPrestadora = codigoPrestadora;
    }

    public Boolean getProfActExtSer() {
        return profActExtSer;
    }

    public void setProfActExtSer(Boolean profActExtSer) {
        this.profActExtSer = profActExtSer;
    }

    public Date getFechaDevolObSoc() {
        return fechaDevolObSoc;
    }

    public void setFechaDevolObSoc(Date fechaDevolObSoc) {
        this.fechaDevolObSoc = fechaDevolObSoc;
    }

    public Date getFechaPaseObSoc2() {
        return fechaPaseObSoc2;
    }

    public void setFechaPaseObSoc2(Date fechaPaseObSoc2) {
        this.fechaPaseObSoc2 = fechaPaseObSoc2;
    }

    public Date getFechaPaseArt() {
        return fechaPaseArt;
    }

    public void setFechaPaseArt(Date fechaPaseArt) {
        this.fechaPaseArt = fechaPaseArt;
    }

    public Date getFechadEvolArt() {
        return fechadEvolArt;
    }

    public void setFechadEvolArt(Date fechadEvolArt) {
        this.fechadEvolArt = fechadEvolArt;
    }

    public Date getFechaPaseArt2() {
        return fechaPaseArt2;
    }

    public void setFechaPaseArt2(Date fechaPaseArt2) {
        this.fechaPaseArt2 = fechaPaseArt2;
    }

    public String getInformaDosss() {
        return informaDosss;
    }

    public void setInformaDosss(String informaDosss) {
        this.informaDosss = informaDosss;
    }
}
