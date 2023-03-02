package com.example.demo.entity.schemas.auditoria;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "audiencia", name = "historiaclinica")
public class HistoriaClinicaAud {
    @EmbeddedId
    private HistoriaClinicaAudPK id;
    private String usuario;
    private String operacion;

    public HistoriaClinicaAudPK getId() {
        return id;
    }

    public void setId(HistoriaClinicaAudPK id) {
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
}
