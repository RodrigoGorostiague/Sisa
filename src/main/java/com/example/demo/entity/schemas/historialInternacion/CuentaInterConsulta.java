package com.example.demo.entity.schemas.historialInternacion;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "historialinternacion", name = "cuentainterconsulta")
public class CuentaInterConsulta {
    @EmbeddedId
    private CuentaInterConsultaPK id;
    private String desripcion;

    public CuentaInterConsultaPK getId() {
        return id;
    }

    public void setId(CuentaInterConsultaPK id) {
        this.id = id;
    }

    public String getDesripcion() {
        return desripcion;
    }

    public void setDesripcion(String desripcion) {
        this.desripcion = desripcion;
    }
}
