package com.example.demo.entity.schemas.servicioSocial;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "padronactividadescomunitarias", schema = "servicioSocial")
public class PadronActividadesComunitariasSCom {
    @Id
    private String codigo;
    private String nombre;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
