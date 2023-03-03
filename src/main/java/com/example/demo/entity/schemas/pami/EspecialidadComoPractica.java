package com.example.demo.entity.schemas.pami;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "especialidad_como_practica", schema = "pami_nuevo")
public class EspecialidadComoPractica {
    @EmbeddedId
    private EspecialidadComoPracticaPK id;
    private String sector;
    @Column(name = "profesional_default")
    private String profesionalDefault;
    private Boolean exportable;

    public EspecialidadComoPracticaPK getId() {
        return id;
    }

    public void setId(EspecialidadComoPracticaPK id) {
        this.id = id;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getProfesionalDefault() {
        return profesionalDefault;
    }

    public void setProfesionalDefault(String profesionalDefault) {
        this.profesionalDefault = profesionalDefault;
    }

    public Boolean getExportable() {
        return exportable;
    }

    public void setExportable(Boolean exportable) {
        this.exportable = exportable;
    }
}
