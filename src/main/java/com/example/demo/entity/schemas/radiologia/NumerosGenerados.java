package com.example.demo.entity.schemas.radiologia;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "numerosgenerados", schema = "radiologia")
public class NumerosGenerados {
    @EmbeddedId
    private NumerosGeneradosPK id;
    private String bloqueado;

    public NumerosGeneradosPK getId() {
        return id;
    }

    public void setId(NumerosGeneradosPK id) {
        this.id = id;
    }

    public String getBloqueado() {
        return bloqueado;
    }

    public void setBloqueado(String bloqueado) {
        this.bloqueado = bloqueado;
    }
}
