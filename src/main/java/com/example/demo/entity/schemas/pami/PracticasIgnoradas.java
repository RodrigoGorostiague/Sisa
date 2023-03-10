package com.example.demo.entity.schemas.pami;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "practicas_ignoradas", schema = "pami_nuevo")
public class PracticasIgnoradas {
    @EmbeddedId
    private PracticasIgnoradasPK id;
    private String sector;

    public PracticasIgnoradasPK getId() {
        return id;
    }

    public void setId(PracticasIgnoradasPK id) {
        this.id = id;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }
}
