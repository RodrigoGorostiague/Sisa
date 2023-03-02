package com.example.demo.entity.schemas.emergencia;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

@Entity
@Table(schema = "emergencia", name = "ipboxes")
public class IpBoxes {
    @Id
    @Column(name = "nrobox")
    private Integer nroBox;
    @Column(name = "idpaciente")
    private Integer idPaciente;
    @Column(name = "codigouniat")
    private String codigoUniat;
    @Column(name = "horallamado")
    private LocalDateTime horaLlamado;
    @Column(name = "tiempodellamado")
    private Integer tiempodeLlamado;

    public Integer getNroBox() {
        return nroBox;
    }

    public void setNroBox(Integer nroBox) {
        this.nroBox = nroBox;
    }

    public Integer getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getCodigoUniat() {
        return codigoUniat;
    }

    public void setCodigoUniat(String codigoUniat) {
        this.codigoUniat = codigoUniat;
    }

    public LocalDateTime getHoraLlamado() {
        return horaLlamado;
    }

    public void setHoraLlamado(LocalDateTime horaLlamado) {
        this.horaLlamado = horaLlamado;
    }

    public Integer getTiempodeLlamado() {
        return tiempodeLlamado;
    }

    public void setTiempodeLlamado(Integer tiempodeLlamado) {
        this.tiempodeLlamado = tiempodeLlamado;
    }
}
