package com.example.demo.entity.schemas.nomencladores;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "equinomqui_prestint", schema = "nomencladores")
public class EquinomquiPrestint {
    @EmbeddedId
    private EquinomquiPrestintPK id;

    public EquinomquiPrestintPK getId() {
        return id;
    }

    public void setId(EquinomquiPrestintPK id) {
        this.id = id;
    }
}
