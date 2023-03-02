package com.example.demo.entity.schemas.emergencia;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(schema = "emergencia", name = "otrenfplanillaemer")
public class OtrEnfPlanillaEmer {
    @EmbeddedId
    private OtrEnfPlanillaEmerPK id;
    @Column(name = "accionesenfermeria")
    private String accionesEnfermeria;
    @Column(name = "fechaatencion")
    private Date fechaAtencion;
    @Column(name = "horaatencion")
    private LocalDateTime horaAtencion;

    public OtrEnfPlanillaEmerPK getId() {
        return id;
    }

    public void setId(OtrEnfPlanillaEmerPK id) {
        this.id = id;
    }

    public String getAccionesEnfermeria() {
        return accionesEnfermeria;
    }

    public void setAccionesEnfermeria(String accionesEnfermeria) {
        this.accionesEnfermeria = accionesEnfermeria;
    }

    public Date getFechaAtencion() {
        return fechaAtencion;
    }

    public void setFechaAtencion(Date fechaAtencion) {
        this.fechaAtencion = fechaAtencion;
    }

    public LocalDateTime getHoraAtencion() {
        return horaAtencion;
    }

    public void setHoraAtencion(LocalDateTime horaAtencion) {
        this.horaAtencion = horaAtencion;
    }
}
