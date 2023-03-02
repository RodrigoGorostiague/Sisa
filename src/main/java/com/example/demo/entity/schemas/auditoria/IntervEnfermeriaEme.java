package com.example.demo.entity.schemas.auditoria;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "auditoria", name = "intervenfermeriaeme")
public class IntervEnfermeriaEme {
    @EmbeddedId
    private IntervEnfermeriaEmePK id;
    private String operacion;
    private String estado;

    public IntervEnfermeriaEmePK getId() {
        return id;
    }

    public void setId(IntervEnfermeriaEmePK id) {
        this.id = id;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
