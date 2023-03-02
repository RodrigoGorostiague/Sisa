package com.example.demo.entity.schemas.electroEncefaloGramas;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "profesionalactuante", schema = "electroencefalograma")
public class ProfesionalActuanteEeg {
    @Id
    private String codigo;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
