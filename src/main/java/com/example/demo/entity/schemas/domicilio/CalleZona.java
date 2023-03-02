package com.example.demo.entity.schemas.domicilio;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "domicilio", name = "callezona")
public class CalleZona {
    @EmbeddedId
    private CalleZonaPK id;

    public CalleZonaPK getId() {
        return id;
    }

    public void setId(CalleZonaPK id) {
        this.id = id;
    }
}
