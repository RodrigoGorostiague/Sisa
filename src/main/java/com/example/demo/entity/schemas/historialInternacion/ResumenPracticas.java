package com.example.demo.entity.schemas.historialInternacion;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "resumenpracticas", schema = "historialinternacion")
public class ResumenPracticas {
    @EmbeddedId
    private ResumenPracticasPK id;
    @Column(name = "practicasolicitada")
    private String practicaSolicitada;
    private String motivo;

    public ResumenPracticasPK getId() {
        return id;
    }

    public void setId(ResumenPracticasPK id) {
        this.id = id;
    }

    public String getPracticaSolicitada() {
        return practicaSolicitada;
    }

    public void setPracticaSolicitada(String practicaSolicitada) {
        this.practicaSolicitada = practicaSolicitada;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
}
