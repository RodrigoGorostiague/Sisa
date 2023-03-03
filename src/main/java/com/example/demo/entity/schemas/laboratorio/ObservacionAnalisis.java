package com.example.demo.entity.schemas.laboratorio;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "observacionanalisis", schema = "laboratorio")
public class ObservacionAnalisis {
    @EmbeddedId
    private ObservacionAnalisisPK id;
    private String texto;

    public ObservacionAnalisisPK getId() {
        return id;
    }

    public void setId(ObservacionAnalisisPK id) {
        this.id = id;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}
