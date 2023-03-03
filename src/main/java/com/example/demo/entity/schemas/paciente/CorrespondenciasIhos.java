package com.example.demo.entity.schemas.paciente;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "correspondenciasihos", schema = "paciente")
public class CorrespondenciasIhos {
    @EmbeddedId
    private CorrespondenciasIhosPK id;
    @Column(name = "idpac_perteneciente_a")
    private String idPacPertenecienteA;

    public CorrespondenciasIhosPK getId() {
        return id;
    }

    public void setId(CorrespondenciasIhosPK id) {
        this.id = id;
    }

    public String getIdPacPertenecienteA() {
        return idPacPertenecienteA;
    }

    public void setIdPacPertenecienteA(String idPacPertenecienteA) {
        this.idPacPertenecienteA = idPacPertenecienteA;
    }
}
