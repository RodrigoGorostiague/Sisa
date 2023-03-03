package com.example.demo.entity.schemas.historialInternacion;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Embeddable
public class HorarioInfusionPK implements Serializable {
    @ManyToOne
    @JoinColumn(name = "idprescripcioninfusion",referencedColumnName = "id")
    private Infusion infusion;
    @Column(name = "horaindicada")
    private LocalDateTime horaIndicada;

    public Infusion getInfusion() {
        return infusion;
    }

    public void setInfusion(Infusion infusion) {
        this.infusion = infusion;
    }

    public LocalDateTime getHoraIndicada() {
        return horaIndicada;
    }

    public void setHoraIndicada(LocalDateTime horaIndicada) {
        this.horaIndicada = horaIndicada;
    }
}
