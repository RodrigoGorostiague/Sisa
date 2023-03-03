package com.example.demo.entity.schemas.historialAmbulatorio;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "historialambulatorio", name = "atenfermerialineas")
public class AtEnfermeriaLineas {
    @EmbeddedId
    private AtEnfermeriaLineasPK id;

    public AtEnfermeriaLineasPK getId() {
        return id;
    }

    public void setId(AtEnfermeriaLineasPK id) {
        this.id = id;
    }
}
