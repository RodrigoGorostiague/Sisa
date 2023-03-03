package com.example.demo.entity.schemas.paciente;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "inhibiciones",schema = "paciente")
public class Inhibiciones {
    @EmbeddedId
    private InhibicionesPK id;

    public InhibicionesPK getId() {
        return id;
    }

    public void setId(InhibicionesPK id) {
        this.id = id;
    }
}
