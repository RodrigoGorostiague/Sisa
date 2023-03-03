package com.example.demo.entity.schemas.servicioSocial;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "actividadcomunitaria", schema = "serviciosocial")
public class ActividadComunitariaSCom {
    @EmbeddedId
    private ActividadComunitariaSComPK id;
    private String actividad;
    @Column(name = "cantparticip")
    private Integer cantParticIp;
    private String motivo;
    private String observaciones;

    public ActividadComunitariaSComPK getId() {
        return id;
    }

    public void setId(ActividadComunitariaSComPK id) {
        this.id = id;
    }

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

    public Integer getCantParticIp() {
        return cantParticIp;
    }

    public void setCantParticIp(Integer cantParticIp) {
        this.cantParticIp = cantParticIp;
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
}
