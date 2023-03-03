package com.example.demo.entity.schemas.saludComunitaria;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "actividadcomunitariainst", schema = "saludcomunitaria")
public class ActividadComunitariaInst {
    @EmbeddedId
    private ActividadComunitariaInstPK id;

    public ActividadComunitariaInstPK getId() {
        return id;
    }

    public void setId(ActividadComunitariaInstPK id) {
        this.id = id;
    }
}
