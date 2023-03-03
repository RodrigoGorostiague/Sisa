package com.example.demo.entity.schemas.nomencladores;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "componentesciap2", schema = "nomencladores")
public class ComponentesCiap2 {
    @Id
    private Integer codigo;
    private String nombre;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
