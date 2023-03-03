package com.example.demo.entity.schemas.historialInternacion;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

@Entity
@Table(name = "partograma", schema = "historialinternacion;")
public class Partograma {
    @Id
    @Column(name = "nrointernacion")
    private Integer nroInternacion;
    @Column(name = "hora_fin")
    private LocalDateTime hora_Fin;
    @Column(name = "tipo_fin")
    private String tipoFin;
    @Column(name = "observaciones_fin")
    private String observacionesFin;

    public Integer getNroInternacion() {
        return nroInternacion;
    }

    public void setNroInternacion(Integer nroInternacion) {
        this.nroInternacion = nroInternacion;
    }

    public LocalDateTime getHora_Fin() {
        return hora_Fin;
    }

    public void setHora_Fin(LocalDateTime hora_Fin) {
        this.hora_Fin = hora_Fin;
    }

    public String getTipoFin() {
        return tipoFin;
    }

    public void setTipoFin(String tipoFin) {
        this.tipoFin = tipoFin;
    }

    public String getObservacionesFin() {
        return observacionesFin;
    }

    public void setObservacionesFin(String observacionesFin) {
        this.observacionesFin = observacionesFin;
    }
}
