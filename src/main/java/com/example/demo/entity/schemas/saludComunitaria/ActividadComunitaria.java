package com.example.demo.entity.schemas.saludComunitaria;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "actividadcomunitaria", schema = "saludcomunitaria")
public class ActividadComunitaria {
    @EmbeddedId
    private ActividadComunitariaPK id;
    private String actividad;
    @Column(name = "otraactividad_detalle")
    private String otraActividadDetalle;
    private String localizacion;
    @Column(name = "institucion_detalle")
    private String institucionDetalle;
    private String motivo;
    private String observaciones;
    private String eaps;

    public ActividadComunitariaPK getId() {
        return id;
    }

    public void setId(ActividadComunitariaPK id) {
        this.id = id;
    }

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

    public String getOtraActividadDetalle() {
        return otraActividadDetalle;
    }

    public void setOtraActividadDetalle(String otraActividadDetalle) {
        this.otraActividadDetalle = otraActividadDetalle;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public String getInstitucionDetalle() {
        return institucionDetalle;
    }

    public void setInstitucionDetalle(String institucionDetalle) {
        this.institucionDetalle = institucionDetalle;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getEaps() {
        return eaps;
    }

    public void setEaps(String eaps) {
        this.eaps = eaps;
    }
}
