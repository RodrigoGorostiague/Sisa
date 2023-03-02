package com.example.demo.entity.schemas.auditoria;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "auditoria", name = "historialuti")
public class HistorialUTI {
    @EmbeddedId
    private HistorialUTIPK id;
    private String operacion;
    @Column(name = "idpaciente")
    private Integer idPaciente;

    public HistorialUTIPK getId() {
        return id;
    }

    public void setId(HistorialUTIPK id) {
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
