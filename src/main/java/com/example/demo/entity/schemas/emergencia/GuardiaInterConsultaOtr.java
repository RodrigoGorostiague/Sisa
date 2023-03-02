package com.example.demo.entity.schemas.emergencia;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "guardiainterconsultaotr", schema = "emergencia")
public class GuardiaInterConsultaOtr {
    @EmbeddedId
    private GuardiaInterConsultaOtrPK id;

    public GuardiaInterConsultaOtrPK getId() {
        return id;
    }

    public void setId(GuardiaInterConsultaOtrPK id) {
        this.id = id;
    }
}
