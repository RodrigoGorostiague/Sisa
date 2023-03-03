package com.example.demo.entity.schemas.historialInternacion;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "historialinternacion", name = "horarioinfusion")
public class HorarioInfusion {
    @EmbeddedId
    private HorarioInfusionPK id;

    public HorarioInfusionPK getId() {
        return id;
    }

    public void setId(HorarioInfusionPK id) {
        this.id = id;
    }
}
