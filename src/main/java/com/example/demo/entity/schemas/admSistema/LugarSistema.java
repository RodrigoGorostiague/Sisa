package com.example.demo.entity.schemas.admSistema;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "admsistema", name = "lugarsistema")
public class LugarSistema {
    @EmbeddedId
    private LugarSistemaPK id;

    public LugarSistemaPK getId() {
        return id;
    }

    public void setId(LugarSistemaPK id) {
        this.id = id;
    }
}
