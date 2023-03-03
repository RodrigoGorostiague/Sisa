package com.example.demo.entity.schemas.pami;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "especialidad_practica", schema = "pami_nuevo")
public class EspecialidadPractica {
    @EmbeddedId
    private EspecialidadPracticaPK id;
    private Integer modulo;
    private Boolean exportable;

    public EspecialidadPracticaPK getId() {
        return id;
    }

    public void setId(EspecialidadPracticaPK id) {
        this.id = id;
    }

    public Integer getModulo() {
        return modulo;
    }

    public void setModulo(Integer modulo) {
        this.modulo = modulo;
    }

    public Boolean getExportable() {
        return exportable;
    }

    public void setExportable(Boolean exportable) {
        this.exportable = exportable;
    }
}
