package com.example.demo.entity.schemas.infectologia;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "drogasantiviralesmov", schema = "infectologia")
public class DrogasAntiviralesMov {
    @EmbeddedId
    private DrogasAntiviralesMovPK id;

    public DrogasAntiviralesMovPK getId() {
        return id;
    }

    public void setId(DrogasAntiviralesMovPK id) {
        this.id = id;
    }
}
