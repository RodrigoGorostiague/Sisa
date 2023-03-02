package com.example.demo.entity.schemas.auditoria;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "auditoria", name = "planillaguardia_emergencias")
public class PlanillaGuardiaEmergenciasAud {
    @EmbeddedId
    private PlanillaGuardiaEmergenciasAudPK id;
    private String usuario;
    private String operacion;
    @Column(name = "idpaciente")
    private Integer idPaciente;

    public PlanillaGuardiaEmergenciasAudPK getId() {
        return id;
    }

    public void setId(PlanillaGuardiaEmergenciasAudPK id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
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
