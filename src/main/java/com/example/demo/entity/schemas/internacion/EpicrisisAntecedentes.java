package com.example.demo.entity.schemas.internacion;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "epicrisisantecedentes", schema = "internacion")
public class EpicrisisAntecedentes {
    @EmbeddedId
    private EpicrisisAntecedentesPK id;

    public EpicrisisAntecedentesPK getId() {
        return id;
    }

    public void setId(EpicrisisAntecedentesPK id) {
        this.id = id;
    }
}
