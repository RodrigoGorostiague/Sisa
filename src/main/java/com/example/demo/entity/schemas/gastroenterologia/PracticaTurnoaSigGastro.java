package com.example.demo.entity.schemas.gastroenterologia;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "gastroenterologia", name = "practicaturnoasiggastro")
public class PracticaTurnoaSigGastro {
    @EmbeddedId
    private PracticaTurnoaSigGastroPK id;
    private Integer nroProtocolo;

    public PracticaTurnoaSigGastroPK getId() {
        return id;
    }

    public void setId(PracticaTurnoaSigGastroPK id) {
        this.id = id;
    }

    public Integer getNroProtocolo() {
        return nroProtocolo;
    }

    public void setNroProtocolo(Integer nroProtocolo) {
        this.nroProtocolo = nroProtocolo;
    }
}
