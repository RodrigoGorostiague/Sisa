package com.example.demo.entity.schemas.historialInternacion;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "historialinternacion", name = "evoluciondiaria")
public class EvolucionDiaria {
    @EmbeddedId
    private EvolucionDiariaPK id;
    private String evolucion;
    @Column(name = "indicacionesyestudios")
    private String  indicacionesEstudios;
    @Column(name = "codigoespecialidad")
    private Integer codigoEspecialidad;
    private String situacion;
    @Column(name = "nuevodiagnostio")
    private String nuevoDiagnostio;

    public EvolucionDiariaPK getId() {
        return id;
    }

    public void setId(EvolucionDiariaPK id) {
        this.id = id;
    }

    public String getEvolucion() {
        return evolucion;
    }

    public void setEvolucion(String evolucion) {
        this.evolucion = evolucion;
    }

    public String getIndicacionesEstudios() {
        return indicacionesEstudios;
    }

    public void setIndicacionesEstudios(String indicacionesEstudios) {
        this.indicacionesEstudios = indicacionesEstudios;
    }

    public Integer getCodigoEspecialidad() {
        return codigoEspecialidad;
    }

    public void setCodigoEspecialidad(Integer codigoEspecialidad) {
        this.codigoEspecialidad = codigoEspecialidad;
    }

    public String getSituacion() {
        return situacion;
    }

    public void setSituacion(String situacion) {
        this.situacion = situacion;
    }

    public String getNuevoDiagnostio() {
        return nuevoDiagnostio;
    }

    public void setNuevoDiagnostio(String nuevoDiagnostio) {
        this.nuevoDiagnostio = nuevoDiagnostio;
    }
}
