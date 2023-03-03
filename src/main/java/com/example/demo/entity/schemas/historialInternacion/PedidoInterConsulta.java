package com.example.demo.entity.schemas.historialInternacion;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "historialinternacion", name = "pedidointerconsulta")
public class PedidoInterConsulta {
    @EmbeddedId
    private PedidoInterConsultaPK id;
    private String motivo;

    public PedidoInterConsultaPK getId() {
        return id;
    }

    public void setId(PedidoInterConsultaPK id) {
        this.id = id;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
}
