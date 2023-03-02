package com.example.demo.entity.schemas.admSistema;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "admsistema", name = "maquina")
public class Maquina {
    @EmbeddedId
    private MaquinaPK id;
    @Column(name = "nombremaquina")
    private String nombreMaquina;
    private String observaciones;
    private String descripcion;
    @Column(name = "multipuesto")
    private String multiPuesto;

    public MaquinaPK getId() {
        return id;
    }

    public void setId(MaquinaPK id) {
        this.id = id;
    }

    public String getNombreMaquina() {
        return nombreMaquina;
    }

    public void setNombreMaquina(String nombreMaquina) {
        this.nombreMaquina = nombreMaquina;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMultiPuesto() {
        return multiPuesto;
    }

    public void setMultiPuesto(String multiPuesto) {
        this.multiPuesto = multiPuesto;
    }
}
