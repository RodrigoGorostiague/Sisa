package com.example.demo.entity.schemas.emergencia;

import jakarta.persistence.*;

@Entity
@Table(schema = "emergencia", name = "triage_hallazgo_nivel")
public class TriageHallazgoNivel {
    @EmbeddedId
    private TriageHallazgoNivelPK id;
    @OneToOne
    @JoinColumn(name = "codigonivel", referencedColumnName = "codigo")
    private NivelTriage nivelTriage;

    public TriageHallazgoNivelPK getId() {
        return id;
    }

    public void setId(TriageHallazgoNivelPK id) {
        this.id = id;
    }

    public NivelTriage getNivelTriage() {
        return nivelTriage;
    }

    public void setNivelTriage(NivelTriage nivelTriage) {
        this.nivelTriage = nivelTriage;
    }
}
