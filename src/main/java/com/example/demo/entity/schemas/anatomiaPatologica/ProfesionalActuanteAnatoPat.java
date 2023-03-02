package com.example.demo.entity.schemas.anatomiaPatologica;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(schema = "anatomiapatologica", name = "profesionalactuante")
public class ProfesionalActuanteAnatoPat {
    @Id
    private String codigo;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
