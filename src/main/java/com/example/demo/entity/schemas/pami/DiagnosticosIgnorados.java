package com.example.demo.entity.schemas.pami;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "diagnosticos_ignorados", schema = "pami_nuevo")
public class DiagnosticosIgnorados {
    @Id
    private String codigo;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
