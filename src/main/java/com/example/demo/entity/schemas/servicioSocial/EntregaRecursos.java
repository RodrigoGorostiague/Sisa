package com.example.demo.entity.schemas.servicioSocial;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "entregarecursos", schema = "serviciosocial")
public class EntregaRecursos {
    @EmbeddedId
    private EntregaRecursosPK id;

    public EntregaRecursosPK getId() {
        return id;
    }

    public void setId(EntregaRecursosPK id) {
        this.id = id;
    }
}
