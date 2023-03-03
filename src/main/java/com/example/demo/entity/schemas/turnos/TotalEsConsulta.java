package com.example.demo.entity.schemas.turnos;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "totalesconsulta", schema = "turnos")
public class TotalEsConsulta {
    @EmbeddedId
    private TotalEsConsultaPK id;
    @Column(name = "cantidadporobrasocial")
    private Integer cantidadPorObraSocial;
    @Column(name = "cantidadsinobrasocial")
    private Integer cantidadSinObraSocial;

    public TotalEsConsultaPK getId() {
        return id;
    }

    public void setId(TotalEsConsultaPK id) {
        this.id = id;
    }

    public Integer getCantidadPorObraSocial() {
        return cantidadPorObraSocial;
    }

    public void setCantidadPorObraSocial(Integer cantidadPorObraSocial) {
        this.cantidadPorObraSocial = cantidadPorObraSocial;
    }

    public Integer getCantidadSinObraSocial() {
        return cantidadSinObraSocial;
    }

    public void setCantidadSinObraSocial(Integer cantidadSinObraSocial) {
        this.cantidadSinObraSocial = cantidadSinObraSocial;
    }
}
