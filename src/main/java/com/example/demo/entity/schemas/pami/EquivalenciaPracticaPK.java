package com.example.demo.entity.schemas.pami;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
@Embeddable
public class EquivalenciaPracticaPK {
    @Column(name = "id_practica_pami")
    private String idPracticaPami;
    @Column(name = "id_practica_sisa")
    private String idPracticaSisa;

    public String getIdPracticaPami() {
        return idPracticaPami;
    }

    public void setIdPracticaPami(String idPracticaPami) {
        this.idPracticaPami = idPracticaPami;
    }

    public String getIdPracticaSisa() {
        return idPracticaSisa;
    }

    public void setIdPracticaSisa(String idPracticaSisa) {
        this.idPracticaSisa = idPracticaSisa;
    }
}
