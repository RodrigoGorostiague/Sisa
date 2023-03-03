package com.example.demo.entity.schemas.turnos;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "grupoetareo", schema = "turnos")
public class GrupoEtareo {
    @EmbeddedId
    private GrupoEtareoPK id;

    public GrupoEtareoPK getId() {
        return id;
    }

    public void setId(GrupoEtareoPK id) {
        this.id = id;
    }
}
