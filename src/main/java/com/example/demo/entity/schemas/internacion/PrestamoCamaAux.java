package com.example.demo.entity.schemas.internacion;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "prestamo_cama_aux", schema = "internacion")
public class PrestamoCamaAux {
    @EmbeddedId
    private PrestamoCamaAuxPK id;
    @Column(name = "camasqueleprestan")
    private Integer camasQueLePrestan;
    @Column(name = "camasquepresta")
    private Integer camasQuePresta;

    public PrestamoCamaAuxPK getId() {
        return id;
    }

    public void setId(PrestamoCamaAuxPK id) {
        this.id = id;
    }

    public Integer getCamasQueLePrestan() {
        return camasQueLePrestan;
    }

    public void setCamasQueLePrestan(Integer camasQueLePrestan) {
        this.camasQueLePrestan = camasQueLePrestan;
    }

    public Integer getCamasQuePresta() {
        return camasQuePresta;
    }

    public void setCamasQuePresta(Integer camasQuePresta) {
        this.camasQuePresta = camasQuePresta;
    }
}
