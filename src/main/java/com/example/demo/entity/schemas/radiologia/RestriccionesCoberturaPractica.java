package com.example.demo.entity.schemas.radiologia;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "restriccionescoberturapractica", schema = "radiologia")
public class RestriccionesCoberturaPractica {
    @EmbeddedId
    private RestriccionesCoberturaPracticaPK id;

    public RestriccionesCoberturaPracticaPK getId() {
        return id;
    }

    public void setId(RestriccionesCoberturaPracticaPK id) {
        this.id = id;
    }
}
