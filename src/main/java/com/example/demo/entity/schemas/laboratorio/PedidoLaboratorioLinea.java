package com.example.demo.entity.schemas.laboratorio;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "pedidolaboratoriolinea", schema = "laboratorio_2009")
public class PedidoLaboratorioLinea {
    @EmbeddedId
    private PedidoLaboratorioLineaPK id;

    public PedidoLaboratorioLineaPK getId() {
        return id;
    }

    public void setId(PedidoLaboratorioLineaPK id) {
        this.id = id;
    }
}
