package com.example.demo.entity.schemas.derivaciones;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "derivaciones", name = "reservaplanilla")
public class ReservaPlanilla {
    @EmbeddedId
    private ReservaPlanillaPK id;

    public ReservaPlanillaPK getId() {
        return id;
    }

    public void setId(ReservaPlanillaPK id) {
        this.id = id;
    }
}
