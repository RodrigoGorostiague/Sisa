package com.example.demo.entity.schemas.vacunacion;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "vacunaclase", schema = "vacunacion")
public class VacunaClase {
    @EmbeddedId
    private VacunaClasePK id;

    public VacunaClasePK getId() {
        return id;
    }

    public void setId(VacunaClasePK id) {
        this.id = id;
    }
}
