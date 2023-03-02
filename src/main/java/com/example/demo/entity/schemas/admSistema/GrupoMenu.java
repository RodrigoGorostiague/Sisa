package com.example.demo.entity.schemas.admSistema;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "admsistema", name = "grupomenu")
public class GrupoMenu {
    @EmbeddedId
    private GrupoMenuPK id;

    public GrupoMenuPK getId() {
        return id;
    }

    public void setId(GrupoMenuPK id) {
        this.id = id;
    }
}
