package com.example.demo.entity.schemas.servicioSocial;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "serviciosocial", name = "atencioneslineas")
public class AtencionesLineas {
    @EmbeddedId
    private AtencionesLineasPK id;

    public AtencionesLineasPK getId() {
        return id;
    }

    public void setId(AtencionesLineasPK id) {
        this.id = id;
    }
}
