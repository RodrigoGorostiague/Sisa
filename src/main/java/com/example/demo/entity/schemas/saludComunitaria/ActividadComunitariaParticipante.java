package com.example.demo.entity.schemas.saludComunitaria;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "actividadcomunitariaparticipante", schema = "saludcomunitaria")
public class ActividadComunitariaParticipante {
    @EmbeddedId
    private ActividadComunitariaParticipantePK id;

    public ActividadComunitariaParticipantePK getId() {
        return id;
    }

    public void setId(ActividadComunitariaParticipantePK id) {
        this.id = id;
    }
}
