package com.example.demo.entity.schemas.quirofano;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "anestesistaintervencion", schema = "quirofano")
public class AnestesistaIntervencion {
    @EmbeddedId
    private AnestesistaIntervencionPK id;

    public AnestesistaIntervencionPK getId() {
        return id;
    }

    public void setId(AnestesistaIntervencionPK id) {
        this.id = id;
    }
}
