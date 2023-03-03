package com.example.demo.entity.schemas.planNacer;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "nomencladorderivaciones", schema = "plannacer")
public class NomencladorDerivaciones {
    @EmbeddedId
    private NomencladorDerivacionesPK id;
    @Column(name = "descripcion_estudio")
    private String descripcionEstudio;

    public NomencladorDerivacionesPK getId() {
        return id;
    }

    public void setId(NomencladorDerivacionesPK id) {
        this.id = id;
    }

    public String getDescripcionEstudio() {
        return descripcionEstudio;
    }

    public void setDescripcionEstudio(String descripcionEstudio) {
        this.descripcionEstudio = descripcionEstudio;
    }
}
