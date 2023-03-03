package com.example.demo.entity.schemas.radiologia;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "restriccionescoberturasector", schema = "radiologia")
public class RestriccionesCoberturaSector {
    @EmbeddedId
    private RestriccionesCoberturaSectorPK id;

    public RestriccionesCoberturaSectorPK getId() {
        return id;
    }

    public void setId(RestriccionesCoberturaSectorPK id) {
        this.id = id;
    }
}
