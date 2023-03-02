package com.example.demo.entity.schemas.electroEncefaloGramas;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(schema = "electroencefalograma", name = "padronmontaje")
public class PadronMontaje {
    @Id
    private String codigo;
    private String descripcion;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
