package com.example.demo.entity.schemas.historialAmbulatorio;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

@Entity
@Table(name = "ipconsultorio", schema = "historialambulatorio")
public class IpConsultorio {
    @Id
    private String id;
    @Column(name = "nroconsultorio")
    private Integer nroConsultorio;
    @Column(name = "idpaciente")
    private Integer idPaciente;
    @Column(name = "horallamado")
    private LocalDateTime horaLlamado;
    @Column(name = "tiempodellamado")
    private Integer tiempodeLlamado;
    @Column(name = "codigouniat")
    private String codigoUniat;
    @Column(name = "nombremaquina")
    private String nombreMaquina;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getNroConsultorio() {
        return nroConsultorio;
    }

    public void setNroConsultorio(Integer nroConsultorio) {
        this.nroConsultorio = nroConsultorio;
    }

    public Integer getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
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

    public String getCodigoUniat() {
        return codigoUniat;
    }

    public void setCodigoUniat(String codigoUniat) {
        this.codigoUniat = codigoUniat;
    }

    public String getNombreMaquina() {
        return nombreMaquina;
    }

    public void setNombreMaquina(String nombreMaquina) {
        this.nombreMaquina = nombreMaquina;
    }
}
