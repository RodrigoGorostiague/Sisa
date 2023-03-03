package com.example.demo.entity.schemas.pami;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "old_practicas_ignoradas", schema = "pami_nuevo")
public class OldPracticasIgnoradas {
    @EmbeddedId
    private OldPracticasIgnoradasPK id;
    private String sector;

    public OldPracticasIgnoradasPK getId() {
        return id;
    }

    public void setId(OldPracticasIgnoradasPK id) {
        this.id = id;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }
}
