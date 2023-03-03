package com.example.demo.entity.schemas.servicioSocial;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "actividadcomunitariainst", schema = "serviciosocial")
public class ActividadComunitariaInstSCom {
    @EmbeddedId
    private ActividadComunitariaInstSComPK id;

    public ActividadComunitariaInstSComPK getId() {
        return id;
    }

    public void setId(ActividadComunitariaInstSComPK id) {
        this.id = id;
    }
}
