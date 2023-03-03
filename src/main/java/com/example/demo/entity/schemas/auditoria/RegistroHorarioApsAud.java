package com.example.demo.entity.schemas.auditoria;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(schema = "auditoria", name = "registrohorarioaps")
public class RegistroHorarioApsAud {
    @EmbeddedId
    private RegistroHorarioApsAudPK id;
    private String legajo;
    private Date fecha;
    private LocalDateTime hora;
    @Column(name = "entrada_salida")
    private String entradaSalida;
    private String operacion;

    public RegistroHorarioApsAudPK getId() {
        return id;
    }

    public void setId(RegistroHorarioApsAudPK id) {
        this.id = id;
    }

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
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

    public String getEntradaSalida() {
        return entradaSalida;
    }

    public void setEntradaSalida(String entradaSalida) {
        this.entradaSalida = entradaSalida;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }
}
