package com.example.demo.entity.schemas.anatomiaPatologica;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "anatomiapatologica", name = "limcalmuestrainfpap")
public class LimCalMuestraInfPap {
    @EmbeddedId
    private LimCalMuestraInfPapPK id;

    public LimCalMuestraInfPapPK getId() {
        return id;
    }

    public void setId(LimCalMuestraInfPapPK id) {
        this.id = id;
    }
}
