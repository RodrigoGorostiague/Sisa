package com.example.demo.entity.schemas.admSistema;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "admsistema", name = "ultimoacceso")
public class UltimoAcceso {
    @EmbeddedId
    private UltimoAccesoPK id;

    public UltimoAccesoPK getId() {
        return id;
    }

    public void setId(UltimoAccesoPK id) {
        this.id = id;
    }
}
