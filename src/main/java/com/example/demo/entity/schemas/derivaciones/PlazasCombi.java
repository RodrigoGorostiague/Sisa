package com.example.demo.entity.schemas.derivaciones;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

@Entity
@Table(schema = "derivaciones", name = "plazascombi")
public class PlazasCombi {
    @Id
    private String destino;
    private Integer desiponibles;
    @Column(name = "nombredestino")
    private String nombreDestino;
    @Column(name = "horasalida")
    private LocalDateTime horaSalida;

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Integer getDesiponibles() {
        return desiponibles;
    }

    public void setDesiponibles(Integer desiponibles) {
        this.desiponibles = desiponibles;
    }

    public String getNombreDestino() {
        return nombreDestino;
    }

    public void setNombreDestino(String nombreDestino) {
        this.nombreDestino = nombreDestino;
    }

    public LocalDateTime getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(LocalDateTime horaSalida) {
        this.horaSalida = horaSalida;
    }
}
