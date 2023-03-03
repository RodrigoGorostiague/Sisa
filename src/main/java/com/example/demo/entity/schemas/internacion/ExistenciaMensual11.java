package com.example.demo.entity.schemas.internacion;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "existenciamensual11", schema = "internacion")
public class ExistenciaMensual11 {
    @EmbeddedId
    private ExistenciaMensual11PK id;
    @Column(name = "existenciafinalpacientes")
    private Integer existenciaFinalPacientes;
    @Column(name = "existenciafinalcamas")
    private Integer existenciaFinalCamas;
    @Column(name = "codigooms")
    private String codigoOms;

    public ExistenciaMensual11PK getId() {
        return id;
    }

    public void setId(ExistenciaMensual11PK id) {
        this.id = id;
    }

    public Integer getExistenciaFinalPacientes() {
        return existenciaFinalPacientes;
    }

    public void setExistenciaFinalPacientes(Integer existenciaFinalPacientes) {
        this.existenciaFinalPacientes = existenciaFinalPacientes;
    }

    public Integer getExistenciaFinalCamas() {
        return existenciaFinalCamas;
    }

    public void setExistenciaFinalCamas(Integer existenciaFinalCamas) {
        this.existenciaFinalCamas = existenciaFinalCamas;
    }

    public String getCodigoOms() {
        return codigoOms;
    }

    public void setCodigoOms(String codigoOms) {
        this.codigoOms = codigoOms;
    }
}
