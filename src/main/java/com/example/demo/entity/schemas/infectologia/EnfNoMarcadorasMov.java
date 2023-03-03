package com.example.demo.entity.schemas.infectologia;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "enfnomarcadorasmov", schema = "infectologia")
public class EnfNoMarcadorasMov {
    @EmbeddedId
    private EnfNoMarcadorasMovPK id;

    public EnfNoMarcadorasMovPK getId() {
        return id;
    }

    public void setId(EnfNoMarcadorasMovPK id) {
        this.id = id;
    }
}
