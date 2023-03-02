package com.example.demo.entity.schemas.emergencia;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "emergencia", name = "guardiainterconsulta")
public class GuardiaInterConsulta {
    @EmbeddedId
    private GuardiaInterConsultaPK id;

    public GuardiaInterConsultaPK getId() {
        return id;
    }

    public void setId(GuardiaInterConsultaPK id) {
        this.id = id;
    }
}
