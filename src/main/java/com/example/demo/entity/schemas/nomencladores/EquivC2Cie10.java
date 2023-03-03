package com.example.demo.entity.schemas.nomencladores;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "equivc2_cie10", schema = "nomencladores")
public class EquivC2Cie10 {
    @EmbeddedId
    private EquivC2Cie10PK id;

    public EquivC2Cie10PK getId() {
        return id;
    }

    public void setId(EquivC2Cie10PK id) {
        this.id = id;
    }
}
