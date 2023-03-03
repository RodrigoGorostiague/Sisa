package com.example.demo.entity.schemas.internacion;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "epicrisisantecedentespase", schema = "internacion")
public class EpicrisisAntecedentesPase {
    @EmbeddedId
    private EpicrisisAntecedentesPasePK id;
    private Date fecha;
    private LocalDateTime hora;
    @Column(name = "tipomov")
    private String tipoMov;

    public EpicrisisAntecedentesPasePK getId() {
        return id;
    }

    public void setId(EpicrisisAntecedentesPasePK id) {
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

    public String getTipoMov() {
        return tipoMov;
    }

    public void setTipoMov(String tipoMov) {
        this.tipoMov = tipoMov;
    }
}
