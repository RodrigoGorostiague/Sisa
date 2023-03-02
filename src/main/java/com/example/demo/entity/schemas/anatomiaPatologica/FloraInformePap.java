package com.example.demo.entity.schemas.anatomiaPatologica;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "anatomiapatologica", name = "florainformepap")
public class FloraInformePap {
    @EmbeddedId
    private FloraInformePapPK id;

    public FloraInformePapPK getId() {
        return id;
    }

    public void setId(FloraInformePapPK id) {
        this.id = id;
    }
}
