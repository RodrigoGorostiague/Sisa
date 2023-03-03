package com.example.demo.entity.schemas.internacion;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "movimiento", schema = "internacion")
public class Movimiento {
    @EmbeddedId
    private MovimientoPK id;
    @Column(name = "codigouniat")
    private String codigoUniat;
    @Column(name = "codigoservicio")
    private Integer codigoServicio;
    private String cama;
    @Column(name = "servicioorigen")
    private Integer servicioOrigen;
    @Column(name = "camaorigen")
    private String camaOrigen;
    private String observaciones;

    public MovimientoPK getId() {
        return id;
    }

    public void setId(MovimientoPK id) {
        this.id = id;
    }

    public String getCodigoUniat() {
        return codigoUniat;
    }

    public void setCodigoUniat(String codigoUniat) {
        this.codigoUniat = codigoUniat;
    }

    public Integer getCodigoServicio() {
        return codigoServicio;
    }

    public void setCodigoServicio(Integer codigoServicio) {
        this.codigoServicio = codigoServicio;
    }

    public String getCama() {
        return cama;
    }

    public void setCama(String cama) {
        this.cama = cama;
    }

    public Integer getServicioOrigen() {
        return servicioOrigen;
    }

    public void setServicioOrigen(Integer servicioOrigen) {
        this.servicioOrigen = servicioOrigen;
    }

    public String getCamaOrigen() {
        return camaOrigen;
    }

    public void setCamaOrigen(String camaOrigen) {
        this.camaOrigen = camaOrigen;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
}
