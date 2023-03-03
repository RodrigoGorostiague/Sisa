package com.example.demo.entity.schemas.turnos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "secuenciadias", schema = "turnos")
public class SecuenciaDias {
    @Id
    @Column(name = "idsecuenciadias")
    private Integer idSecuenciaDias;
    private String nombre;

    public Integer getIdSecuenciaDias() {
        return idSecuenciaDias;
    }

    public void setIdSecuenciaDias(Integer idSecuenciaDias) {
        this.idSecuenciaDias = idSecuenciaDias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
