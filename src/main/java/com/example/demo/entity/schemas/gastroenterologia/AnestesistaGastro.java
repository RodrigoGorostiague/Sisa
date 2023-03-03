package com.example.demo.entity.schemas.gastroenterologia;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "gastroenterologia", name = "anestesistagastro")
public class AnestesistaGastro {
    @EmbeddedId
    private AnestesistaGastroPK id;

    public AnestesistaGastroPK getId() {
        return id;
    }

    public void setId(AnestesistaGastroPK id) {
        this.id = id;
    }
}
