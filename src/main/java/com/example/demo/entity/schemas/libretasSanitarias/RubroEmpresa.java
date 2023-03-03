package com.example.demo.entity.schemas.libretasSanitarias;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "rubroempresa", schema = "libretassanitarias")
public class RubroEmpresa {
    @Id
    private String nombre;
    @Column(name = "manipulaalimentos")
    private String manipulaAlimentos;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getManipulaAlimentos() {
        return manipulaAlimentos;
    }

    public void setManipulaAlimentos(String manipulaAlimentos) {
        this.manipulaAlimentos = manipulaAlimentos;
    }
}
