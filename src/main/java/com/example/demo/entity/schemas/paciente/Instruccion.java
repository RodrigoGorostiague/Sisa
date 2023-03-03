package com.example.demo.entity.schemas.paciente;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "instruccion", schema = "paciente")
public class Instruccion {
    @Id
    @Column(name = "idinstruccion")
    private Integer idInstruccion;
    private String nombre;
    private String descripcion;
    @Column(name = "codigohoja10")
    private Integer codigoHoja10;

    public Integer getIdInstruccion() {
        return idInstruccion;
    }

    public void setIdInstruccion(Integer idInstruccion) {
        this.idInstruccion = idInstruccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getCodigoHoja10() {
        return codigoHoja10;
    }

    public void setCodigoHoja10(Integer codigoHoja10) {
        this.codigoHoja10 = codigoHoja10;
    }
}
