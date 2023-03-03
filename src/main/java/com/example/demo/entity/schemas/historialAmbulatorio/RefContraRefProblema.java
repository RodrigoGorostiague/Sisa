package com.example.demo.entity.schemas.historialAmbulatorio;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "refcontrarefproblema", schema = "historialambultorio")
public class RefContraRefProblema {
    @EmbeddedId
    private RefContraRefProblemaPK id;

    public RefContraRefProblemaPK getId() {
        return id;
    }

    public void setId(RefContraRefProblemaPK id) {
        this.id = id;
    }
}
