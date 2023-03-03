package com.example.demo.entity.schemas.internacion;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "excepintindefinida", schema = "internacion")
public class ExcepintinDefinida {
    @EmbeddedId
    private ExcepintinDefinidaPK id;
    private String motivo;

    public ExcepintinDefinidaPK getId() {
        return id;
    }

    public void setId(ExcepintinDefinidaPK id) {
        this.id = id;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
}
