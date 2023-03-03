package com.example.demo.entity.schemas.gastroenterologia;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "gastroenterologia", name =  "anestesiagastro")
public class AnestesiaGastro {
    @EmbeddedId
    private AnestesiaGastroPK id;

    public AnestesiaGastroPK getId() {
        return id;
    }

    public void setId(AnestesiaGastroPK id) {
        this.id = id;
    }
}
