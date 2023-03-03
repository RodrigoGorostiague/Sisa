package com.example.demo.entity.schemas.historialAmbulatorio;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "historialambulatorio", name = "informeimgconsulta")
public class InformeImgConsulta {
    @EmbeddedId
    private InformeImgConsultaPK id;

    public InformeImgConsultaPK getId() {
        return id;
    }

    public void setId(InformeImgConsultaPK id) {
        this.id = id;
    }
}
