package com.example.demo.entity.schemas.auditoria;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "auditoria", name = "movimientodador")
public class MovimientoDadorAud {
    @EmbeddedId
    private MovimientoDadorAudPK id;
    private String operacion;
    @Column(name = "idpaciente")
    private Integer idPaciente;

    public MovimientoDadorAudPK getId() {
        return id;
    }

    public void setId(MovimientoDadorAudPK id) {
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
