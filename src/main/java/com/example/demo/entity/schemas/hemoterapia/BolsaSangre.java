package com.example.demo.entity.schemas.hemoterapia;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(schema = "hemoterapia", name = "bolsasangre")
public class BolsaSangre {
    @EmbeddedId
    private BolsaSangrePK id;
    @Column(name = "codigoproducto")
    private String codigoProducto;
    private Integer volumen;
    private String abo;
    private String rh;
    @Column(name = "fechaextraccion")
    private Date fechaExtraccion;
    @Column(name = "fechacaducidad")
    private Date fechaCaducidad;
    private String estado;
    @Column(name = "fechabaja")
    private Date fechaBaja;
    private String observacion;
    @Column(name = "volumenrestante")
    private Integer volumenRestante;
    private String unidad;

    public BolsaSangrePK getId() {
        return id;
    }

    public void setId(BolsaSangrePK id) {
        this.id = id;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public Integer getVolumen() {
        return volumen;
    }

    public void setVolumen(Integer volumen) {
        this.volumen = volumen;
    }

    public String getAbo() {
        return abo;
    }

    public void setAbo(String abo) {
        this.abo = abo;
    }

    public String getRh() {
        return rh;
    }

    public void setRh(String rh) {
        this.rh = rh;
    }

    public Date getFechaExtraccion() {
        return fechaExtraccion;
    }

    public void setFechaExtraccion(Date fechaExtraccion) {
        this.fechaExtraccion = fechaExtraccion;
    }

    public Date getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(Date fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFechaBaja() {
        return fechaBaja;
    }

    public void setFechaBaja(Date fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Integer getVolumenRestante() {
        return volumenRestante;
    }

    public void setVolumenRestante(Integer volumenRestante) {
        this.volumenRestante = volumenRestante;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }
}
