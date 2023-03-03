package com.example.demo.entity.schemas.historialInternacion;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

@Entity
@Table(schema = "historialinternacion", name = "validacioningreso")
public class ValidacionIngreso {
    @EmbeddedId
    private ValidacionIngresoPK id;
    @Column(name = "fechahoravalida")
    private LocalDateTime fechaHoraValida;

    public ValidacionIngresoPK getId() {
        return id;
    }

    public void setId(ValidacionIngresoPK id) {
        this.id = id;
    }

    public LocalDateTime getFechaHoraValida() {
        return fechaHoraValida;
    }

    public void setFechaHoraValida(LocalDateTime fechaHoraValida) {
        this.fechaHoraValida = fechaHoraValida;
    }
}
