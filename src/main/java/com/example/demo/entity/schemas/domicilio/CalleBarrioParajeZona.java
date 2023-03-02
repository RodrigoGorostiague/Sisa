package com.example.demo.entity.schemas.domicilio;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(schema = "domicilio", name = "callebarrioparajezona")
public class CalleBarrioParajeZona {
    @Id
    private String nombre;
    @Column(name = "escalle")
    private String esCalle;
    private String observaciones;
    private Integer inicio;
    private Integer fin;
    @OneToMany(mappedBy = "id.calleBarrioParajeZona")
    private List<CalleZona> calleZonas;

    public List<CalleZona> getCalleZonas() {
        return calleZonas;
    }

    public void setCalleZonas(List<CalleZona> calleZonas) {
        this.calleZonas = calleZonas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEsCalle() {
        return esCalle;
    }

    public void setEsCalle(String esCalle) {
        this.esCalle = esCalle;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Integer getInicio() {
        return inicio;
    }

    public void setInicio(Integer inicio) {
        this.inicio = inicio;
    }

    public Integer getFin() {
        return fin;
    }

    public void setFin(Integer fin) {
        this.fin = fin;
    }
}
