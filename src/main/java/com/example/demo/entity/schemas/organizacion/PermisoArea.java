package com.example.demo.entity.schemas.organizacion;

import jakarta.persistence.EmbeddedId;

public class PermisoArea {
    @EmbeddedId
    private PermisoAreaPK id;

    public PermisoAreaPK getId() {
        return id;
    }

    public void setId(PermisoAreaPK id) {
        this.id = id;
    }
}
