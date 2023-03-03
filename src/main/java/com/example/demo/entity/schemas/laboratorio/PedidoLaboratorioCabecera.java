package com.example.demo.entity.schemas.laboratorio;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "pedidolaboratoriocabecera", schema = "laboratorio_2009")
public class PedidoLaboratorioCabecera {
    @EmbeddedId
    private PedidoLaboratorioCabeceraPK id;
    private String observaciones;
    @Column(name = "otraspracticas")
    private String otrasPracticas;
    private String modulo;
    private String embarazada;
    private String prematuro;
    private Integer semanas;
    @Column(name = "nroorden")
    private String nroOrden;
    @Column(name = "errorplexus")
    private String errorPlexus;
    @Column(name = "fechaextr")
    private Date fechaExtr;
    private LocalDateTime enviado;

    public PedidoLaboratorioCabeceraPK getId() {
        return id;
    }

    public void setId(PedidoLaboratorioCabeceraPK id) {
        this.id = id;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getOtrasPracticas() {
        return otrasPracticas;
    }

    public void setOtrasPracticas(String otrasPracticas) {
        this.otrasPracticas = otrasPracticas;
    }

    public String getModulo() {
        return modulo;
    }

    public void setModulo(String modulo) {
        this.modulo = modulo;
    }

    public String getEmbarazada() {
        return embarazada;
    }

    public void setEmbarazada(String embarazada) {
        this.embarazada = embarazada;
    }

    public String getPrematuro() {
        return prematuro;
    }

    public void setPrematuro(String prematuro) {
        this.prematuro = prematuro;
    }

    public Integer getSemanas() {
        return semanas;
    }

    public void setSemanas(Integer semanas) {
        this.semanas = semanas;
    }

    public String getNroOrden() {
        return nroOrden;
    }

    public void setNroOrden(String nroOrden) {
        this.nroOrden = nroOrden;
    }

    public String getErrorPlexus() {
        return errorPlexus;
    }

    public void setErrorPlexus(String errorPlexus) {
        this.errorPlexus = errorPlexus;
    }

    public Date getFechaExtr() {
        return fechaExtr;
    }

    public void setFechaExtr(Date fechaExtr) {
        this.fechaExtr = fechaExtr;
    }

    public LocalDateTime getEnviado() {
        return enviado;
    }

    public void setEnviado(LocalDateTime enviado) {
        this.enviado = enviado;
    }
}
