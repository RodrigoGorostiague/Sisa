package com.example.demo.entity.schemas.historialAmbEsp;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "evalpreanes_itemsclase", schema = "historialambesp")
public class EvalPreanesItemsClase {
    @EmbeddedId
    private EvalPreanesItemsClasePK id;

    public EvalPreanesItemsClasePK getId() {
        return id;
    }

    public void setId(EvalPreanesItemsClasePK id) {
        this.id = id;
    }
}
