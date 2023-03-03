package com.example.demo.entity.schemas.pami;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "relciap2cie10", schema = "pami_nuevo")
public class RelcCap2Cie10 {
    @EmbeddedId
    private RelcCap2Cie10PK id;

    public RelcCap2Cie10PK getId() {
        return id;
    }

    public void setId(RelcCap2Cie10PK id) {
        this.id = id;
    }
}
