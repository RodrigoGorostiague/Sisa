package com.example.demo.entity.schemas.hemoterapia;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "hemoterapia", name = "serologiapositiva")
public class SerologiaPositiva {
    @EmbeddedId
    private SerologiaPositivaPK id;

    public SerologiaPositivaPK getId() {
        return id;
    }

    public void setId(SerologiaPositivaPK id) {
        this.id = id;
    }
}
