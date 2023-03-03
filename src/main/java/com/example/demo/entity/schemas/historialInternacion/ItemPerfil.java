package com.example.demo.entity.schemas.historialInternacion;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "historialinternacion", name = "itemperfil")
public class ItemPerfil {
    @EmbeddedId
    private ItemPerfilPK id;

    public ItemPerfilPK getId() {
        return id;
    }

    public void setId(ItemPerfilPK id) {
        this.id = id;
    }
}
