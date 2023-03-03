package com.example.demo.entity.schemas.historialUti;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "evolucionrehab", schema = "historialuti")
public class EvolucionRehabUti {
    @EmbeddedId
    private EvolucionRehabUtiPK id;
    private Integer profesion;
    @Column(name = "codigopractica")
    private String codigoPractica;
    private String observaciones;

    public EvolucionRehabUtiPK getId() {
        return id;
    }

    public void setId(EvolucionRehabUtiPK id) {
        this.id = id;
    }

    public Integer getProfesion() {
        return profesion;
    }

    public void setProfesion(Integer profesion) {
        this.profesion = profesion;
    }

    public String getCodigoPractica() {
        return codigoPractica;
    }

    public void setCodigoPractica(String codigoPractica) {
        this.codigoPractica = codigoPractica;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
}
