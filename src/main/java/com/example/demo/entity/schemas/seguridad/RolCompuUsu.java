package com.example.demo.entity.schemas.seguridad;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "rol_compu_usu", schema = "seguridad")
public class RolCompuUsu {
    @EmbeddedId
    private RolCompuUsuPK id;

    public RolCompuUsuPK getId() {
        return id;
    }

    public void setId(RolCompuUsuPK id) {
        this.id = id;
    }
}
