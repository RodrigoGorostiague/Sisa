package com.example.demo.entity.schemas.paciente;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "excepciontablasparabloquear", schema = "paciente")
public class ExcepcionTablasParaBloquear {
    @Id
    private String tabla;

    public String getTabla() {
        return tabla;
    }

    public void setTabla(String tabla) {
        this.tabla = tabla;
    }
}
