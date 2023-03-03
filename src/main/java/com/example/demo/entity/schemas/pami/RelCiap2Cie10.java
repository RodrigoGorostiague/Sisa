package com.example.demo.entity.schemas.pami;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "relciap2cie10", schema = "pami")
public class RelCiap2Cie10 {
    @EmbeddedId
    private RelCiap2Cie10PK id;

    public RelCiap2Cie10PK getId() {
        return id;
    }

    public void setId(RelCiap2Cie10PK id) {
        this.id = id;
    }
}
