package com.example.demo.entity.schemas.emergencia;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "emergencia", name = "accidentado_emergencias_delete")
public class AccidentadoEmergenciasDelete {
    @EmbeddedId
    private AccidentadoEmergenciasDeletePK id;
    private String lugar;
    private String causa;
    private String efecto;
    private String observaciones;

    public AccidentadoEmergenciasDeletePK getId() {
        return id;
    }

    public void setId(AccidentadoEmergenciasDeletePK id) {
        this.id = id;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getCausa() {
        return causa;
    }

    public void setCausa(String causa) {
        this.causa = causa;
    }

    public String getEfecto() {
        return efecto;
    }

    public void setEfecto(String efecto) {
        this.efecto = efecto;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
}
