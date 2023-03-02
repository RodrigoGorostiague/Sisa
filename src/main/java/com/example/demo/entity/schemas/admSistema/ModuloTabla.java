package com.example.demo.entity.schemas.admSistema;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "admsistema", name = "modulotabla")
public class ModuloTabla {
    @EmbeddedId
    private ModuloTablaPK id;

    public ModuloTablaPK getId() {
        return id;
    }

    public void setId(ModuloTablaPK id) {
        this.id = id;
    }
}
