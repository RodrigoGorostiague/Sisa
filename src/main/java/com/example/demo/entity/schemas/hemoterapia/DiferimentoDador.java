package com.example.demo.entity.schemas.hemoterapia;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table
public class DiferimentoDador {
    @EmbeddedId
    private DiferimentoDadorPK id;
    @Column(name = "fechahasta")
    private Date fechaHasta;
    private String tipo;
    private String causa;

    public DiferimentoDadorPK getId() {
        return id;
    }

    public void setId(DiferimentoDadorPK id) {
        this.id = id;
    }

    public Date getFechaHasta() {
        return fechaHasta;
    }

    public void setFechaHasta(Date fechaHasta) {
        this.fechaHasta = fechaHasta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCausa() {
        return causa;
    }

    public void setCausa(String causa) {
        this.causa = causa;
    }
}
