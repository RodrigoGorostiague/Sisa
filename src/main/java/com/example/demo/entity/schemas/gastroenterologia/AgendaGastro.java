package com.example.demo.entity.schemas.gastroenterologia;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(schema = "gastroenterologia", name = "agendagastro")
public class AgendaGastro {
    @EmbeddedId
    private AgendaGastroPK id;
    @Column(name = "fechafinvigencia")
    private Date fechaFinVigencia;
    private Integer cantidadTurnos;

    public AgendaGastroPK getId() {
        return id;
    }

    public void setId(AgendaGastroPK id) {
        this.id = id;
    }

    public Date getFechaFinVigencia() {
        return fechaFinVigencia;
    }

    public void setFechaFinVigencia(Date fechaFinVigencia) {
        this.fechaFinVigencia = fechaFinVigencia;
    }

    public Integer getCantidadTurnos() {
        return cantidadTurnos;
    }

    public void setCantidadTurnos(Integer cantidadTurnos) {
        this.cantidadTurnos = cantidadTurnos;
    }
}
