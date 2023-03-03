package com.example.demo.entity.schemas.internacion;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "diagnosticocie10", schema = "internacion")
public class DiagnosticoCie10 {
    @EmbeddedId
    private DiagnosticoCie10PK id;
    private Date fecha;
    private LocalDateTime hora;
    private String importancia;

    public DiagnosticoCie10PK getId() {
        return id;
    }

    public void setId(DiagnosticoCie10PK id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public LocalDateTime getHora() {
        return hora;
    }

    public void setHora(LocalDateTime hora) {
        this.hora = hora;
    }

    public String getImportancia() {
        return importancia;
    }

    public void setImportancia(String importancia) {
        this.importancia = importancia;
    }
}
