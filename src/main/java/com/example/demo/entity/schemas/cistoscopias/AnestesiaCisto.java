package com.example.demo.entity.schemas.cistoscopias;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "cistoscopia", name = "anestesiacisto")
public class AnestesiaCisto {
    @EmbeddedId
    private AnestesiaCistoPK id;

    public AnestesiaCistoPK getId() {
        return id;
    }

    public void setId(AnestesiaCistoPK id) {
        this.id = id;
    }
}
