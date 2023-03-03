package com.example.demo.entity.schemas.laboratorio;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "composicionanalisis", schema = "laboratorio")
public class ComposicionAnalisis {
    @EmbeddedId
    private ComposicionAnalisisPK id;
    private Integer padre;
    @Column(name = "controlsubanalisis")
    private Integer controlSubAnalisis;
    @Column(name = "controlreferencia")
    private Integer controlReferencia;
    @Column(name = "controlsexo")
    private String controlSexo;
    @Column(name = "controlrangounidad")
    private String controlRangoUnidad;

    public ComposicionAnalisisPK getId() {
        return id;
    }

    public void setId(ComposicionAnalisisPK id) {
        this.id = id;
    }

    public Integer getPadre() {
        return padre;
    }

    public void setPadre(Integer padre) {
        this.padre = padre;
    }

    public Integer getControlSubAnalisis() {
        return controlSubAnalisis;
    }

    public void setControlSubAnalisis(Integer controlSubAnalisis) {
        this.controlSubAnalisis = controlSubAnalisis;
    }

    public Integer getControlReferencia() {
        return controlReferencia;
    }

    public void setControlReferencia(Integer controlReferencia) {
        this.controlReferencia = controlReferencia;
    }

    public String getControlSexo() {
        return controlSexo;
    }

    public void setControlSexo(String controlSexo) {
        this.controlSexo = controlSexo;
    }

    public String getControlRangoUnidad() {
        return controlRangoUnidad;
    }

    public void setControlRangoUnidad(String controlRangoUnidad) {
        this.controlRangoUnidad = controlRangoUnidad;
    }
}
