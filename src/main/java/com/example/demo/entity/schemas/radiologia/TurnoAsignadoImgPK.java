package com.example.demo.entity.schemas.radiologia;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

@Embeddable
public class TurnoAsignadoImgPK implements Serializable {
    private String uniat;
    private String sector;
    @Column(name = "medicoradiologo")
    private String medicoRadiologo;
    private Date fecha;
    @Column(name = "horaconsultorio")
    private LocalDateTime horaConsultorio;
    @Column(name = "nroturno")
    private Integer nroTurno;

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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public LocalDateTime getHoraConsultorio() {
        return horaConsultorio;
    }

    public void setHoraConsultorio(LocalDateTime horaConsultorio) {
        this.horaConsultorio = horaConsultorio;
    }

    public Integer getNroTurno() {
        return nroTurno;
    }

    public void setNroTurno(Integer nroTurno) {
        this.nroTurno = nroTurno;
    }
}
