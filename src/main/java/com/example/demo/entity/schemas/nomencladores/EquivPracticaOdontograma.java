package com.example.demo.entity.schemas.nomencladores;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "equivpracticaodontograma", schema = "nomencladores")
public class EquivPracticaOdontograma {
    @EmbeddedId
    private EquivPracticaOdontogramaPK id;
    private String antecedente;

    public EquivPracticaOdontogramaPK getId() {
        return id;
    }

    public void setId(EquivPracticaOdontogramaPK id) {
        this.id = id;
    }

    public String getAntecedente() {
        return antecedente;
    }

    public void setAntecedente(String antecedente) {
        this.antecedente = antecedente;
    }
}
