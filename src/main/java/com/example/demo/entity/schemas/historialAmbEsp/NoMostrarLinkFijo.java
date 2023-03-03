package com.example.demo.entity.schemas.historialAmbEsp;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "historialambesp", name = "nomostrarlinkfijo")
public class NoMostrarLinkFijo {
    @EmbeddedId
    private NoMostrarLinkFijoPK id;

    public NoMostrarLinkFijoPK getId() {
        return id;
    }

    public void setId(NoMostrarLinkFijoPK id) {
        this.id = id;
    }
}
