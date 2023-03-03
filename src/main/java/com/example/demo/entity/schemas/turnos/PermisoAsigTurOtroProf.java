package com.example.demo.entity.schemas.turnos;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "permisoasigturotroprof", schema = "turno")
public class PermisoAsigTurOtroProf {
    @EmbeddedId
    private PermisoAsigTurOtroProfPK id;

    public PermisoAsigTurOtroProfPK getId() {
        return id;
    }

    public void setId(PermisoAsigTurOtroProfPK id) {
        this.id = id;
    }
}
