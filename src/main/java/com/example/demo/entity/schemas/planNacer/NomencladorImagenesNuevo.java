package com.example.demo.entity.schemas.planNacer;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "nomencladorimagenes_nuevo", schema = "plannacer")
public class NomencladorImagenesNuevo {
    @EmbeddedId
    private NomencladorImagenesNuevoPK id;
    @Column(name = "descripcion_estudio")
    private String descripcionEstudio;

    public NomencladorImagenesNuevoPK getId() {
        return id;
    }

    public void setId(NomencladorImagenesNuevoPK id) {
        this.id = id;
    }

    public String getDescripcionEstudio() {
        return descripcionEstudio;
    }

    public void setDescripcionEstudio(String descripcionEstudio) {
        this.descripcionEstudio = descripcionEstudio;
    }
}
