package com.example.demo.entity.schemas.auditoria;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

@Embeddable
public class AgendaImgPK implements Serializable {
    private LocalDateTime fecha;
    private String usuario;
    private String uniat;
    private String sector;
    private String medicoradiologo;
    @Column(name = "fechainiciovigencia")
    private Date fechaInicioVigencia;
    @Column(name = "diasemana")
    private Integer diaSemana;
    @Column(name = "horacomienzo")
    private  LocalDateTime horaComienzo;

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getUniat() {
        return uniat;
    }

    public void setUniat(String uniat) {
        this.uniat = uniat;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getMedicoradiologo() {
        return medicoradiologo;
    }

    public void setMedicoradiologo(String medicoradiologo) {
        this.medicoradiologo = medicoradiologo;
    }

    public Date getFechaInicioVigencia() {
        return fechaInicioVigencia;
    }

    public void setFechaInicioVigencia(Date fechaInicioVigencia) {
        this.fechaInicioVigencia = fechaInicioVigencia;
    }

    public Integer getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(Integer diaSemana) {
        this.diaSemana = diaSemana;
    }

    public LocalDateTime getHoraComienzo() {
        return horaComienzo;
    }

    public void setHoraComienzo(LocalDateTime horaComienzo) {
        this.horaComienzo = horaComienzo;
    }
}
