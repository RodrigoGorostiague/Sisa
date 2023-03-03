package com.example.demo.entity.schemas.historialInternacion;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "evolucionrehab", schema = "historialinternacion")
public class EvolucionRehab {
    @EmbeddedId
    private EvolucionRehabPK id;
    private Integer profesion;
    @Column(name = "codigopractica")
    private String codigoPractica;
    private String observaciones;

    public EvolucionRehabPK getId() {
        return id;
    }

    public void setId(EvolucionRehabPK id) {
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
