package com.example.demo.entity.schemas.asistencia;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "Uniatespecialidad", schema = "asistencia")
public class UniatEspecialidad {
    @EmbeddedId
    private UniatEspecialidadPK id;
    @Column(name = "codigoagrupamientoesp")
    private Integer codigoAgrupamientoEsp;
    @Column(name = "hcoblig")
    private String hcOblig;

    public UniatEspecialidadPK getId() {
        return id;
    }

    public void setId(UniatEspecialidadPK id) {
        this.id = id;
    }

    public Integer getCodigoAgrupamientoEsp() {
        return codigoAgrupamientoEsp;
    }

    public void setCodigoAgrupamientoEsp(Integer codigoAgrupamientoEsp) {
        this.codigoAgrupamientoEsp = codigoAgrupamientoEsp;
    }

    public String getHcOblig() {
        return hcOblig;
    }

    public void setHcOblig(String hcOblig) {
        this.hcOblig = hcOblig;
    }
}
