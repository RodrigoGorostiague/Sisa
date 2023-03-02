package com.example.demo.entity.schemas.farmacia;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "a_quien_entrega", schema = "farmacia")
public class AQuienEntrega {
    @EmbeddedId
    private AQuienEntregaPK id;

    public AQuienEntregaPK getId() {
        return id;
    }

    public void setId(AQuienEntregaPK id) {
        this.id = id;
    }
}
