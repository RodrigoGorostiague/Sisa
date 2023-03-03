package com.example.demo.entity.schemas.nomencladores;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "relacionciap2cie10", schema = "nomencladores")
public class RelacionCiap2Cie10 {
    @EmbeddedId
    private RelacionCiap2Cie10PK id;

    public RelacionCiap2Cie10PK getId() {
        return id;
    }

    public void setId(RelacionCiap2Cie10PK id) {
        this.id = id;
    }
}
