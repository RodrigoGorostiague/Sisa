package com.example.demo.entity.schemas.internacion;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.sql.Date;
import java.time.LocalDateTime;

@Entity
@Table(name = "cama", schema = "internacion")
public class Cama {
    @EmbeddedId
    private CamaPK id;
    private String sala;
    @Column(name = "servicioorigen")
    private Integer servicioOrigen;
    @Column(name = "servicioactual")
    private Integer servicioActual;
    @Column(name = "nrointernacion")
    private Integer nroInternacion;
    @Column(name = "fechabaja")
    private Date fechaBaja;
    @Column(name = "horabaja")
    private LocalDateTime horaBaja;
    private String auxiliar;

    public CamaPK getId() {
        return id;
    }

    public void setId(CamaPK id) {
        this.id = id;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public Integer getServicioOrigen() {
        return servicioOrigen;
    }

    public void setServicioOrigen(Integer servicioOrigen) {
        this.servicioOrigen = servicioOrigen;
    }

    public Integer getServicioActual() {
        return servicioActual;
    }

    public void setServicioActual(Integer servicioActual) {
        this.servicioActual = servicioActual;
    }

    public Integer getNroInternacion() {
        return nroInternacion;
    }

    public void setNroInternacion(Integer nroInternacion) {
        this.nroInternacion = nroInternacion;
    }

    public Date getFechaBaja() {
        return fechaBaja;
    }

    public void setFechaBaja(Date fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    public LocalDateTime getHoraBaja() {
        return horaBaja;
    }

    public void setHoraBaja(LocalDateTime horaBaja) {
        this.horaBaja = horaBaja;
    }

    public String getAuxiliar() {
        return auxiliar;
    }

    public void setAuxiliar(String auxiliar) {
        this.auxiliar = auxiliar;
    }
}
