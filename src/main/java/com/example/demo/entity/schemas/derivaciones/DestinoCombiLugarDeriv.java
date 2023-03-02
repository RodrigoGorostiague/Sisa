package com.example.demo.entity.schemas.derivaciones;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "derivaciones", name = "destinocombilugarderiv")
public class DestinoCombiLugarDeriv {
    @EmbeddedId
    private DestinoCombiLugarDerivPK id;

    public DestinoCombiLugarDerivPK getId() {
        return id;
    }

    public void setId(DestinoCombiLugarDerivPK id) {
        this.id = id;
    }
}
