package com.example.demo.entity.schemas.seguridad;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "campo", schema = "seguridad")
public class Campo {
    @EmbeddedId
    private CampoPK id;

    public CampoPK getId() {
        return id;
    }

    public void setId(CampoPK id) {
        this.id = id;
    }
}
