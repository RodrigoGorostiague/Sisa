package com.example.demo.entity.schemas.facturacion;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "formatonroafiliado", schema = "facturacion")
public class FormatoNroAfiliado {
    @EmbeddedId
    private FormatoNroAfiliadoPK id;

    public FormatoNroAfiliadoPK getId() {
        return id;
    }

    public void setId(FormatoNroAfiliadoPK id) {
        this.id = id;
    }
}
