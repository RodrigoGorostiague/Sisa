package com.example.demo.entity.schemas.asistencia;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "asistencia", name = "uniatservicio")
public class UniatServicio {
    @EmbeddedId
    private UniatServicioPK id;

    public UniatServicioPK getId() {
        return id;
    }

    public void setId(UniatServicioPK id) {
        this.id = id;
    }
}
