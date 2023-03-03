package com.example.demo.entity.schemas.internacion;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "parto", schema = "internacion")
public class PartoInter {
    @Id
    @Column(name = "nrointernacion")
    private Integer nroInternacion;
    @Column(name = "fechaparto")
    private Date fechaParto;
    private LocalDateTime hora;
    @Column(name = "semgestacion")
    private Integer semGestacion;
    private Integer paridad;
    private String tipo;
    private String vdrl;
    private String att;
    @Column(name = "cantdeffetal")
    private Integer cantDefFetal;

    public Integer getNroInternacion() {
        return nroInternacion;
    }

    public void setNroInternacion(Integer nroInternacion) {
        this.nroInternacion = nroInternacion;
    }

    public Date getFechaParto() {
        return fechaParto;
    }

    public void setFechaParto(Date fechaParto) {
        this.fechaParto = fechaParto;
    }

    public LocalDateTime getHora() {
        return hora;
    }

    public void setHora(LocalDateTime hora) {
        this.hora = hora;
    }

    public Integer getSemGestacion() {
        return semGestacion;
    }

    public void setSemGestacion(Integer semGestacion) {
        this.semGestacion = semGestacion;
    }

    public Integer getParidad() {
        return paridad;
    }

    public void setParidad(Integer paridad) {
        this.paridad = paridad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getVdrl() {
        return vdrl;
    }

    public void setVdrl(String vdrl) {
        this.vdrl = vdrl;
    }

    public String getAtt() {
        return att;
    }

    public void setAtt(String att) {
        this.att = att;
    }

    public Integer getCantDefFetal() {
        return cantDefFetal;
    }

    public void setCantDefFetal(Integer cantDefFetal) {
        this.cantDefFetal = cantDefFetal;
    }
}
