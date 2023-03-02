package com.example.demo.entity.schemas.auditoria;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "auditoria", name = "paciente")
public class PacienteAud {
    @EmbeddedId
    private PacienteAudPK id;
    @Column(name = "codigopersonal")
    private String codigoPersonal;
    @Column(name = "codigouniat")
    private String codigoUniat;

    public PacienteAudPK getId() {
        return id;
    }

    public void setId(PacienteAudPK id) {
        this.id = id;
    }

    public String getCodigoPersonal() {
        return codigoPersonal;
    }

    public void setCodigoPersonal(String codigoPersonal) {
        this.codigoPersonal = codigoPersonal;
    }

    public String getCodigoUniat() {
        return codigoUniat;
    }

    public void setCodigoUniat(String codigoUniat) {
        this.codigoUniat = codigoUniat;
    }
}
