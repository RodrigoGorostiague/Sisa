package com.example.demo.entity.schemas.resapro;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "exclusion_practicas", schema = "resapro")
public class ExclusionPracticas {
    @EmbeddedId
    private ExclusionPracticasPK id;

    public ExclusionPracticasPK getId() {
        return id;
    }

    public void setId(ExclusionPracticasPK id) {
        this.id = id;
    }
}
