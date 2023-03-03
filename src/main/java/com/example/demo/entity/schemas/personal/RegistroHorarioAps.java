package com.example.demo.entity.schemas.personal;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "registrohorarioaps", schema = "personal")
public class RegistroHorarioAps {
    @EmbeddedId
    private RegistroHorarioApsPK id;
    private String observaciones;

    public RegistroHorarioApsPK getId() {
        return id;
    }

    public void setId(RegistroHorarioApsPK id) {
        this.id = id;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
}
