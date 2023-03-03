package com.example.demo.entity.schemas.nomencladores;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "equivc2_acclugar", schema = "nomencladores")
public class EquivC2AccLugar {
    @EmbeddedId
    private EquivC2AccLugarPK id;

    public EquivC2AccLugarPK getId() {
        return id;
    }

    public void setId(EquivC2AccLugarPK id) {
        this.id = id;
    }
}
