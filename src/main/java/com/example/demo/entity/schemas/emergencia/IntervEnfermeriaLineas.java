package com.example.demo.entity.schemas.emergencia;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "emergencia", name = "intervenfermerialineas")
public class IntervEnfermeriaLineas {
    @EmbeddedId
    private IntervEnfermeriaLineasPK id;

    public IntervEnfermeriaLineasPK getId() {
        return id;
    }

    public void setId(IntervEnfermeriaLineasPK id) {
        this.id = id;
    }
}
