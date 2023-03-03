package com.example.demo.entity.schemas.internacion;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "prestacion",schema = "internacion")
public class PrestacionInter {
    @EmbeddedId
    private PrestacionInterPK id;
    private String importancia;

    public PrestacionInterPK getId() {
        return id;
    }

    public void setId(PrestacionInterPK id) {
        this.id = id;
    }

    public String getImportancia() {
        return importancia;
    }

    public void setImportancia(String importancia) {
        this.importancia = importancia;
    }
}
