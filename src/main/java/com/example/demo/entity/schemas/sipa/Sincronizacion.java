package com.example.demo.entity.schemas.sipa;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

@Entity
@Table(name = "sincronizacion", schema = "sipa")
public class Sincronizacion {
    @Id
    @Column(name = "fechainiciosincronizacion")
    private LocalDateTime fechaInicioSincronizacion;

    public LocalDateTime getFechaInicioSincronizacion() {
        return fechaInicioSincronizacion;
    }

    public void setFechaInicioSincronizacion(LocalDateTime fechaInicioSincronizacion) {
        this.fechaInicioSincronizacion = fechaInicioSincronizacion;
    }
}
