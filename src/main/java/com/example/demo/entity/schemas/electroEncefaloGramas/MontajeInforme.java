package com.example.demo.entity.schemas.electroEncefaloGramas;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "electroencefalograma", name = "montajeinforme")
public class MontajeInforme {
    @EmbeddedId
    private MontajeInformePK id;

    public MontajeInformePK getId() {
        return id;
    }

    public void setId(MontajeInformePK id) {
        this.id = id;
    }
}
