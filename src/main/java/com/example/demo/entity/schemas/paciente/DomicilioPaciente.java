package com.example.demo.entity.schemas.paciente;

import com.example.demo.entity.schemas.domicilio.*;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "domiciliopaciente", schema = "paciente")
public class DomicilioPaciente {
    @Id
    @OneToOne
    @JoinColumn(name = "idpaciente", referencedColumnName = "idpaciente")
    private Paciente paciente;
    @Column(name = "fecharegdomicilio")
    private LocalDateTime fechaRegDomicilio;
    @ManyToOne
    @JoinColumn(name = "tipodomicilio", referencedColumnName = "idtipodomicilio")
    private TipoDomicilio tipoDomicilio;
    private String calle;
    private String numero;
    private String piso;
    private String depto;
    private String telefono;
    @Column(name = "localidadtexto")
    private String localidadTexto;
    private String observaciones;
    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "codigolocalidad", referencedColumnName = "codigolocalidad"),
            @JoinColumn(name = "codigopartido", referencedColumnName = "codigopartido")})
    private Localidad localidad;
    @ManyToOne
    @JoinColumn(name = "codigoprovincia", referencedColumnName = "codigoprovincia")
    private ProvinciaArgentina provinciaArgentina;
    @ManyToOne
    @JoinColumn(name = "codigopais", referencedColumnName = "codigopais")
    private Pais pais;
    @ManyToOne
    @JoinColumn(name = "zonatandil", referencedColumnName = "codigozona")
    private ZonasTandil zonasTandil;
    @ManyToOne
    @JoinColumn(name = "callebarrioparajezona", referencedColumnName = "nombre")
    private CalleBarrioParajeZona calleBarrioParajeZona;
    @Column(name = "calletextolibre")
    private String calleTextoLibre;
    @Column(name = "celular_old")
    private Integer celularOld;
    private Integer celular;
    @Column(name = "domicilioeme")
    private String domicilioEme;
    @ManyToOne
    @JoinColumn(name = "codarea_celular", referencedColumnName = "codarea")
    private CodigoArea codigoArea;

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public LocalDateTime getFechaRegDomicilio() {
        return fechaRegDomicilio;
    }

    public void setFechaRegDomicilio(LocalDateTime fechaRegDomicilio) {
        this.fechaRegDomicilio = fechaRegDomicilio;
    }

    public TipoDomicilio getTipoDomicilio() {
        return tipoDomicilio;
    }

    public void setTipoDomicilio(TipoDomicilio tipoDomicilio) {
        this.tipoDomicilio = tipoDomicilio;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public String getDepto() {
        return depto;
    }

    public void setDepto(String depto) {
        this.depto = depto;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getLocalidadTexto() {
        return localidadTexto;
    }

    public void setLocalidadTexto(String localidadTexto) {
        this.localidadTexto = localidadTexto;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Localidad getLocalidad() {
        return localidad;
    }

    public void setLocalidad(Localidad localidad) {
        this.localidad = localidad;
    }

    public ProvinciaArgentina getProvinciaArgentina() {
        return provinciaArgentina;
    }

    public void setProvinciaArgentina(ProvinciaArgentina provinciaArgentina) {
        this.provinciaArgentina = provinciaArgentina;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public ZonasTandil getZonasTandil() {
        return zonasTandil;
    }

    public void setZonasTandil(ZonasTandil zonasTandil) {
        this.zonasTandil = zonasTandil;
    }

    public CalleBarrioParajeZona getCalleBarrioParajeZona() {
        return calleBarrioParajeZona;
    }

    public void setCalleBarrioParajeZona(CalleBarrioParajeZona calleBarrioParajeZona) {
        this.calleBarrioParajeZona = calleBarrioParajeZona;
    }

    public String getCalleTextoLibre() {
        return calleTextoLibre;
    }

    public void setCalleTextoLibre(String calleTextoLibre) {
        this.calleTextoLibre = calleTextoLibre;
    }

    public Integer getCelularOld() {
        return celularOld;
    }

    public void setCelularOld(Integer celularOld) {
        this.celularOld = celularOld;
    }

    public Integer getCelular() {
        return celular;
    }

    public void setCelular(Integer celular) {
        this.celular = celular;
    }

    public String getDomicilioEme() {
        return domicilioEme;
    }

    public void setDomicilioEme(String domicilioEme) {
        this.domicilioEme = domicilioEme;
    }

    public CodigoArea getCodigoArea() {
        return codigoArea;
    }

    public void setCodigoArea(CodigoArea codigoArea) {
        this.codigoArea = codigoArea;
    }
}
