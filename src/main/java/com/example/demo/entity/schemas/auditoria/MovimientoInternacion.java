package com.example.demo.entity.schemas.auditoria;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "auditoria", name = "movimientointernacion")
public class MovimientoInternacion {
    @EmbeddedId
    private MovimientoInternacionPK id;
    private String usuario;
    @Column(name = "tiempomov")
    private String tiempoMov;

    public MovimientoInternacionPK getId() {
        return id;
    }

    public void setId(MovimientoInternacionPK id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getTiempoMov() {
        return tiempoMov;
    }

    public void setTiempoMov(String tiempoMov) {
        this.tiempoMov = tiempoMov;
    }
}
