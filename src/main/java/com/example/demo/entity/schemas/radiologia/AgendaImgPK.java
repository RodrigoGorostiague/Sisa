package com.example.demo.entity.schemas.radiologia;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

@Embeddable
public class AgendaImgPK implements Serializable {
    private String uniat;
    private String sector;
    @Column(name = "medicoradiologo")
    private String medicoRadiologo;
    @Column(name = "fechainiciovigencia")
    private Date fechaInicioVigencia;
    @Column(name = "diasemana")
    private Integer diaSemana;
    @Column(name = "horacomienz")
    private LocalDateTime horaComienz;

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

    public String getMedicoRadiologo() {
        return medicoRadiologo;
    }

    public void setMedicoRadiologo(String medicoRadiologo) {
        this.medicoRadiologo = medicoRadiologo;
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

    public LocalDateTime getHoraComienz() {
        return horaComienz;
    }

    public void setHoraComienz(LocalDateTime horaComienz) {
        this.horaComienz = horaComienz;
    }
}
