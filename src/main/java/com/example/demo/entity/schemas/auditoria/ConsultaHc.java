package com.example.demo.entity.schemas.auditoria;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "auditoria", name = "conultahc")
public class ConsultaHc {
    @EmbeddedId
    private ConsultaHcPK id;

    public ConsultaHcPK getId() {
        return id;
    }

    public void setId(ConsultaHcPK id) {
        this.id = id;
    }
}
