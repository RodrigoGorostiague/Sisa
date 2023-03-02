package com.example.demo.entity.schemas.electroEncefaloGramas;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(schema = "electroencefalograma", name = "equipo")
public class Equipo {
    @Id
    private String codigo;
    private String descripcion;
    private String caracteristicas;
    @Column(name = "uniateeg")
    private String uniatEeg;

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

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public String getUniatEeg() {
        return uniatEeg;
    }

    public void setUniatEeg(String uniatEeg) {
        this.uniatEeg = uniatEeg;
    }
}
