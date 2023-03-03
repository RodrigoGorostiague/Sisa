package com.example.demo.entity.schemas.paciente;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "vela_hc_pac", schema = "paciente")
public class VelaHcPac {
    @EmbeddedId
    private VelaHcPacPK id;

    public VelaHcPacPK getId() {
        return id;
    }

    public void setId(VelaHcPacPK id) {
        this.id = id;
    }
}
