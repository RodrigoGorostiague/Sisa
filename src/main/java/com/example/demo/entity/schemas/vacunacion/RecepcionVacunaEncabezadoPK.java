package com.example.demo.entity.schemas.vacunacion;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;


import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDateTime;

@Embeddable
public class RecepcionVacunaEncabezadoPK implements Serializable{
    @Column(name = "fecharemito")
    private Date fechaRemito;
    @Column(name = "horaremito")
    private LocalDateTime horaRemito;
    @Column(name = "uniatreceptora")
    private String uniatReceptora;

    public Date getFechaRemito() {
        return fechaRemito;
    }

    public void setFechaRemito(Date fechaRemito) {
        this.fechaRemito = fechaRemito;
    }

    public LocalDateTime getHoraRemito() {
        return horaRemito;
    }

    public void setHoraRemito(LocalDateTime horaRemito) {
        this.horaRemito = horaRemito;
    }

    public String getUniatReceptora() {
        return uniatReceptora;
    }

    public void setUniatReceptora(String uniatReceptora) {
        this.uniatReceptora = uniatReceptora;
    }
}
