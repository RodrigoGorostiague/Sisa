package com.example.demo.entity.schemas.auditoria;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "auditoria", name = "informegastro")
public class InformeGastroAud {
    @EmbeddedId
    private InformeGastroAudPK id;
    private String operacion;
    @Column(name = "idpaciente")
    private Integer idPaciente;

    public InformeGastroAudPK getId() {
        return id;
    }

    public void setId(InformeGastroAudPK id) {
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
