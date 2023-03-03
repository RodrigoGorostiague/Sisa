package com.example.demo.entity.schemas.historialInternacion;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "historialinternacion", name = "cuentaadmservicio")
public class CuentaAdmServicio {
    @EmbeddedId
    private CuentaAdmServicioPK id;
    private String descripcion;

    public CuentaAdmServicioPK getId() {
        return id;
    }

    public void setId(CuentaAdmServicioPK id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
