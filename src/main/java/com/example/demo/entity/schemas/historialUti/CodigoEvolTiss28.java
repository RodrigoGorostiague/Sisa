package com.example.demo.entity.schemas.historialUti;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "codigoevoltiss28", schema = "historialuti")
public class CodigoEvolTiss28 {
    @EmbeddedId
    private CodigoEvolTiss28PK id;

    public CodigoEvolTiss28PK getId() {
        return id;
    }

    public void setId(CodigoEvolTiss28PK id) {
        this.id = id;
    }
}
