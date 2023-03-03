package com.example.demo.entity.schemas.quirofano;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "anestesiaintervencion", schema = "quirofano")
public class AnestesiaIntervencion {
    @EmbeddedId
    private AnestesiaIntervencionPK id;

    public AnestesiaIntervencionPK getId() {
        return id;
    }

    public void setId(AnestesiaIntervencionPK id) {
        this.id = id;
    }
}
