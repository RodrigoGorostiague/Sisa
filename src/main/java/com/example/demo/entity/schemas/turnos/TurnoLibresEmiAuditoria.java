package com.example.demo.entity.schemas.turnos;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.sql.Date;
import java.time.LocalDateTime;

@Entity
@Table(name = "turnolibresemiauditoria", schema = "turnos")
public class TurnoLibresEmiAuditoria {
    @EmbeddedId
    private TurnoLibresEmiAuditoriaPK id;
    @Column(name = "codigouniat")
    private String codigoUniat;
    @Column(name = "codigoespecialidad")
    private Integer codigoEspecialidad;
    @Column(name = "codigopersonal")
    private String codigoPersonal;
    @Column(name = "fechadesde")
    private Date fechaDesde;
    @Column(name = "fechahasta")
    private Date fechaHasta;
    @Column(name = "horadesde")
    private LocalDateTime horaDesde;
    @Column(name = "horahasta")
    private LocalDateTime horaHasta;
    private String operacion;
    @Column(name = "cantidadturnos")
    private Integer cantidadTurnos;

    public TurnoLibresEmiAuditoriaPK getId() {
        return id;
    }

    public void setId(TurnoLibresEmiAuditoriaPK id) {
        this.id = id;
    }

    public String getCodigoUniat() {
        return codigoUniat;
    }

    public void setCodigoUniat(String codigoUniat) {
        this.codigoUniat = codigoUniat;
    }

    public Integer getCodigoEspecialidad() {
        return codigoEspecialidad;
    }

    public void setCodigoEspecialidad(Integer codigoEspecialidad) {
        this.codigoEspecialidad = codigoEspecialidad;
    }

    public String getCodigoPersonal() {
        return codigoPersonal;
    }

    public void setCodigoPersonal(String codigoPersonal) {
        this.codigoPersonal = codigoPersonal;
    }

    public Date getFechaDesde() {
        return fechaDesde;
    }

    public void setFechaDesde(Date fechaDesde) {
        this.fechaDesde = fechaDesde;
    }

    public Date getFechaHasta() {
        return fechaHasta;
    }

    public void setFechaHasta(Date fechaHasta) {
        this.fechaHasta = fechaHasta;
    }

    public LocalDateTime getHoraDesde() {
        return horaDesde;
    }

    public void setHoraDesde(LocalDateTime horaDesde) {
        this.horaDesde = horaDesde;
    }

    public LocalDateTime getHoraHasta() {
        return horaHasta;
    }

    public void setHoraHasta(LocalDateTime horaHasta) {
        this.horaHasta = horaHasta;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public Integer getCantidadTurnos() {
        return cantidadTurnos;
    }

    public void setCantidadTurnos(Integer cantidadTurnos) {
        this.cantidadTurnos = cantidadTurnos;
    }
}
