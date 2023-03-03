package com.example.demo.entity.schemas.turnos;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "grupoetareovigente", schema = "turnos")
public class GrupoEtareoVigente {
    @EmbeddedId
    private GrupoEtareoVigentePK id;
    @Column(name = "aniofin")
    private Integer anioFin;
    @Column(name = "mesfin")
    private Integer mesFin;

    public GrupoEtareoVigentePK getId() {
        return id;
    }

    public void setId(GrupoEtareoVigentePK id) {
        this.id = id;
    }

    public Integer getAnioFin() {
        return anioFin;
    }

    public void setAnioFin(Integer anioFin) {
        this.anioFin = anioFin;
    }

    public Integer getMesFin() {
        return mesFin;
    }

    public void setMesFin(Integer mesFin) {
        this.mesFin = mesFin;
    }
}
