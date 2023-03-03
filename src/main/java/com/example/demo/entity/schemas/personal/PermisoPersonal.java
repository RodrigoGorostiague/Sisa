package com.example.demo.entity.schemas.personal;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "permisopersonal", schema = "personal")
public class PermisoPersonal {
    @EmbeddedId
    private PermisoPersonalPK id;

    public PermisoPersonalPK getId() {
        return id;
    }

    public void setId(PermisoPersonalPK id) {
        this.id = id;
    }
}
