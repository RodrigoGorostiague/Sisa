package com.example.demo.entity.schemas.infectologia;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "enfmarcadorasmov", schema = "infectologia")
public class EnfMarcadorasMov {
    @EmbeddedId
    private EnfMarcadorasMovPK id;

    public EnfMarcadorasMovPK getId() {
        return id;
    }

    public void setId(EnfMarcadorasMovPK id) {
        this.id = id;
    }
}
