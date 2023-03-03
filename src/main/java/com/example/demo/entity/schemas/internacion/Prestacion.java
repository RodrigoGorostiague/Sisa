package com.example.demo.entity.schemas.internacion;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "prestacion",schema = "internacion")
public class Prestacion {
    @EmbeddedId
    private PrestacionPK id;
    private String importancia;

    public PrestacionPK getId() {
        return id;
    }

    public void setId(PrestacionPK id) {
        this.id = id;
    }

    public String getImportancia() {
        return importancia;
    }

    public void setImportancia(String importancia) {
        this.importancia = importancia;
    }
}
