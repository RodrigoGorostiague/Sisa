package com.example.demo.entity.schemas.historialInternacion;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

@Entity
@Table(name = "validacionevoluciondiaria", schema = "historialinternacion")
public class ValidacionEvolucionDiaria {
    @EmbeddedId
    private ValidacionEvolucionDiariaPK id;
    @Column(name = "fechahoravalida")
    private LocalDateTime fechaHoraValida;

    public ValidacionEvolucionDiariaPK getId() {
        return id;
    }

    public void setId(ValidacionEvolucionDiariaPK id) {
        this.id = id;
    }

    public LocalDateTime getFechaHoraValida() {
        return fechaHoraValida;
    }

    public void setFechaHoraValida(LocalDateTime fechaHoraValida) {
        this.fechaHoraValida = fechaHoraValida;
    }
}
