package com.example.demo.entity.schemas.emergencia;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

@Entity
@Table(schema = "emergencia", name = "ipboxes_dbv")
public class IpBoxesDbv {
    @EmbeddedId
    private IpBoxesDbvPK id;
    @Column(name = "idpaciente")
    private Integer idPaciente;
    @Column(name = "horallamado")
    private LocalDateTime horaLlamado;
    @Column(name = "tiempollamado")
    private Integer tiempollamado;

    public IpBoxesDbvPK getId() {
        return id;
    }

    public void setId(IpBoxesDbvPK id) {
        this.id = id;
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

    public Integer getTiempollamado() {
        return tiempollamado;
    }

    public void setTiempollamado(Integer tiempollamado) {
        this.tiempollamado = tiempollamado;
    }
}
