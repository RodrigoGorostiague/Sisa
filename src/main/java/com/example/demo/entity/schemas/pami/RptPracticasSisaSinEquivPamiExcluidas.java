package com.example.demo.entity.schemas.pami;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "rpt_practicas_sisa_sin_equiv_pami_excluidas", schema = "pami_nuevo")
public class RptPracticasSisaSinEquivPamiExcluidas {
    @EmbeddedId
    private RptPracticasSisaSinEquivPamiExcluidasPK id;

    public RptPracticasSisaSinEquivPamiExcluidasPK getId() {
        return id;
    }

    public void setId(RptPracticasSisaSinEquivPamiExcluidasPK id) {
        this.id = id;
    }
}
