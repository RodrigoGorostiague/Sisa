package com.example.demo.entity.schemas.auditoria;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "auditoria", name = "impresionhc")
public class ImpresionHc {
    @EmbeddedId
    private ImpresionHcPK id;

    public ImpresionHcPK getId() {
        return id;
    }

    public void setId(ImpresionHcPK id) {
        this.id = id;
    }
}
