package com.example.demo.entity.schemas.auditoria;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "auditoria", name = "informeeeg")
public class InformeEegAud {
    @EmbeddedId
    private InformeEegAudPK id;
    private String operacion;
    @Column(name = "idpaciente")
    private Integer idPaciente;

    public InformeEegAudPK getId() {
        return id;
    }

    public void setId(InformeEegAudPK id) {
        this.id = id;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public Integer getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }
}
