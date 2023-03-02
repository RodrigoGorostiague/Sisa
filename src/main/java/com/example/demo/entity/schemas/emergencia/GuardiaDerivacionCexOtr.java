package com.example.demo.entity.schemas.emergencia;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "emergencia", name = "guardiaderivacioncexotr")
public class GuardiaDerivacionCexOtr {
    @EmbeddedId
    private GuardiaDerivacionCexOtrPK id;

    public GuardiaDerivacionCexOtrPK getId() {
        return id;
    }

    public void setId(GuardiaDerivacionCexOtrPK id) {
        this.id = id;
    }
}
