package com.example.demo.entity.schemas.emergencia;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "emergencia", name = "guardiaderivacioncex")
public class GuardiaDerivacionCex {
    @EmbeddedId
    private GuardiaDerivacionCexPK id;

    public GuardiaDerivacionCexPK getId() {
        return id;
    }

    public void setId(GuardiaDerivacionCexPK id) {
        this.id = id;
    }
}
