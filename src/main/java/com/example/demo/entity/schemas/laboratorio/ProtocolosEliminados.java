package com.example.demo.entity.schemas.laboratorio;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "protocolos_eliminados", schema = "laboratorio_2009")
public class ProtocolosEliminados {
    @EmbeddedId
    private ProtocolosEliminadosPK id;

    public ProtocolosEliminadosPK getId() {
        return id;
    }

    public void setId(ProtocolosEliminadosPK id) {
        this.id = id;
    }
}
