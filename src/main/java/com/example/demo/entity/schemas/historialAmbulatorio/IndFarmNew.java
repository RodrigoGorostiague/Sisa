package com.example.demo.entity.schemas.historialAmbulatorio;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "indfarmnew", schema = "historialambulatorio")
public class IndFarmNew {
    @EmbeddedId
    private IndFarmNewPK id;
    private String dosis;
    private String intervalo;
    private Double cantidad;
    @Column(name = "fechainicio")
    private Date fechaInicio;
    @Column(name = "fechafin")
    private Date fechaFin;
    @Column(name = "cantintervalo")
    private Integer cantIntervalo;
    private Integer diasTrat;
    private String cronico;
    @Column(name = "fechasuspension")
    private Date fechaSuspension;
    @Column(name = "cantidadsolicitadareceta")
    private Integer cantidadSolicitadaReceta;
    private String entregado;

    public IndFarmNewPK getId() {
        return id;
    }

    public void setId(IndFarmNewPK id) {
        this.id = id;
    }

    public String getDosis() {
        return dosis;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }

    public String getIntervalo() {
        return intervalo;
    }

    public void setIntervalo(String intervalo) {
        this.intervalo = intervalo;
    }

    public Double getCantidad() {
        return cantidad;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Integer getCantIntervalo() {
        return cantIntervalo;
    }

    public void setCantIntervalo(Integer cantIntervalo) {
        this.cantIntervalo = cantIntervalo;
    }

    public Integer getDiasTrat() {
        return diasTrat;
    }

    public void setDiasTrat(Integer diasTrat) {
        this.diasTrat = diasTrat;
    }

    public String getCronico() {
        return cronico;
    }

    public void setCronico(String cronico) {
        this.cronico = cronico;
    }

    public Date getFechaSuspension() {
        return fechaSuspension;
    }

    public void setFechaSuspension(Date fechaSuspension) {
        this.fechaSuspension = fechaSuspension;
    }

    public Integer getCantidadSolicitadaReceta() {
        return cantidadSolicitadaReceta;
    }

    public void setCantidadSolicitadaReceta(Integer cantidadSolicitadaReceta) {
        this.cantidadSolicitadaReceta = cantidadSolicitadaReceta;
    }

    public String getEntregado() {
        return entregado;
    }

    public void setEntregado(String entregado) {
        this.entregado = entregado;
    }
}
