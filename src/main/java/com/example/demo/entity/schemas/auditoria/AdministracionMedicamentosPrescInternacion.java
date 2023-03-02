package com.example.demo.entity.schemas.auditoria;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "auditoria", name = "administracionmedicamentosprescinternacion")
public class AdministracionMedicamentosPrescInternacion {
    @EmbeddedId
    private AdministracionMedicamentosPrescInternacionPK id;
    private String usuario;
    private String operaciones;

    public AdministracionMedicamentosPrescInternacionPK getId() {
        return id;
    }

    public void setId(AdministracionMedicamentosPrescInternacionPK id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getOperaciones() {
        return operaciones;
    }

    public void setOperaciones(String operaciones) {
        this.operaciones = operaciones;
    }
}
