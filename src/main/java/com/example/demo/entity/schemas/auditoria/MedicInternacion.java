package com.example.demo.entity.schemas.auditoria;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

@Entity
@Table(name = "DocumentoAdjuntoInternacionPK", schema = "auditoria")
public class MedicInternacion {
    @EmbeddedId
    private MedicInternacionPK id;
    @Column(name = "nrointernacion")
    private Integer nroInternacion;
    private String usuario;
    private String operacion;
    @Column(name = "codigoclase")
    private Integer codigoClase;
    private Integer item;
    private String frecuencia;
    @Column(name = "viaadmin")
    private String viaAdmin;
    private String observaciones;
    private String dosis;
    @Column(name = "fecha_fin")
    private LocalDateTime fechaFin;

    public MedicInternacionPK getId() {
        return id;
    }

    public void setId(MedicInternacionPK id) {
        this.id = id;
    }

    public Integer getNroInternacion() {
        return nroInternacion;
    }

    public void setNroInternacion(Integer nroInternacion) {
        this.nroInternacion = nroInternacion;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public Integer getCodigoClase() {
        return codigoClase;
    }

    public void setCodigoClase(Integer codigoClase) {
        this.codigoClase = codigoClase;
    }

    public Integer getItem() {
        return item;
    }

    public void setItem(Integer item) {
        this.item = item;
    }

    public String getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(String frecuencia) {
        this.frecuencia = frecuencia;
    }

    public String getViaAdmin() {
        return viaAdmin;
    }

    public void setViaAdmin(String viaAdmin) {
        this.viaAdmin = viaAdmin;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getDosis() {
        return dosis;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }

    public LocalDateTime getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDateTime fechaFin) {
        this.fechaFin = fechaFin;
    }
}
