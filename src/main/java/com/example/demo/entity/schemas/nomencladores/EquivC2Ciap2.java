package com.example.demo.entity.schemas.nomencladores;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "equivc2_ciap2", schema = "nomencladores")
public class EquivC2Ciap2 {
    @EmbeddedId
    private EquivC2Ciap2PK id;

    public EquivC2Ciap2PK getId() {
        return id;
    }

    public void setId(EquivC2Ciap2PK id) {
        this.id = id;
    }
}
