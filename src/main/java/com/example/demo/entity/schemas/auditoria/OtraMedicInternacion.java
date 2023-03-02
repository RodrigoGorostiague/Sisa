package com.example.demo.entity.schemas.auditoria;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "auditoria", name = "otramedicinternacion")
public class OtraMedicInternacion {
    @EmbeddedId
    private OtraMedicInternacionPK id;
    private String usuario;
    private String operacion;
    private String descmedicamento;

    public OtraMedicInternacionPK getId() {
        return id;
    }

    public void setId(OtraMedicInternacionPK id) {
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

    public String getDescmedicamento() {
        return descmedicamento;
    }

    public void setDescmedicamento(String descmedicamento) {
        this.descmedicamento = descmedicamento;
    }
}
