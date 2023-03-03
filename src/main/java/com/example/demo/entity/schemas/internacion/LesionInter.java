package com.example.demo.entity.schemas.internacion;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(schema = "internacion", name = "lesion")
public class LesionInter {
    @EmbeddedId
    private LesionInterPK id;
    private Date fecha;
    private LocalDateTime hora;
    @Column(name = "producidapor")
    private String producidaPor;
    @Column(name = "producidaen")
    private String producidaEn;
    private String importancia;

    public LesionInterPK getId() {
        return id;
    }

    public void setId(LesionInterPK id) {
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

    public String getProducidaPor() {
        return producidaPor;
    }

    public void setProducidaPor(String producidaPor) {
        this.producidaPor = producidaPor;
    }

    public String getProducidaEn() {
        return producidaEn;
    }

    public void setProducidaEn(String producidaEn) {
        this.producidaEn = producidaEn;
    }

    public String getImportancia() {
        return importancia;
    }

    public void setImportancia(String importancia) {
        this.importancia = importancia;
    }
}
