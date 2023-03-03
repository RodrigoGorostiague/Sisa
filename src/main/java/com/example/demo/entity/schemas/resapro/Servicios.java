package com.example.demo.entity.schemas.resapro;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "servicios", schema = "resapro")
public class Servicios {
    @Id
    @Column(name = "id_internacion_local")
    private String idInternacionLocal;
    @Column(name = "cod_estable")
    private String codEstable;
    private String cod_servicio;
    @Column(name = "fecha_ingreso")
    private Date fechaIngreso;
    private Integer orden;
    @Column(name = "dias_estada")
    private Integer diasEstada;

    public String getIdInternacionLocal() {
        return idInternacionLocal;
    }

    public void setIdInternacionLocal(String idInternacionLocal) {
        this.idInternacionLocal = idInternacionLocal;
    }

    public String getCodEstable() {
        return codEstable;
    }

    public void setCodEstable(String codEstable) {
        this.codEstable = codEstable;
    }

    public String getCod_servicio() {
        return cod_servicio;
    }

    public void setCod_servicio(String cod_servicio) {
        this.cod_servicio = cod_servicio;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Integer getOrden() {
        return orden;
    }

    public void setOrden(Integer orden) {
        this.orden = orden;
    }

    public Integer getDiasEstada() {
        return diasEstada;
    }

    public void setDiasEstada(Integer diasEstada) {
        this.diasEstada = diasEstada;
    }
}
