package com.example.demo.entity.schemas.radiologia;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "restriccionesprestadorasector", schema = "radiologia")
public class RestriccionesPrestadoraSector {
    @EmbeddedId
    private RestriccionesPrestadoraSectorPK id;

    public RestriccionesPrestadoraSectorPK getId() {
        return id;
    }

    public void setId(RestriccionesPrestadoraSectorPK id) {
        this.id = id;
    }
}
