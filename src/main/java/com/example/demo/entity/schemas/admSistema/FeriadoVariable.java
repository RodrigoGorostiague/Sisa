package com.example.demo.entity.schemas.admSistema;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(schema = "admsistema", name = "feriadovariable")
public class FeriadoVariable {
    @Id
    @Column(name = "fechaferiado")
    private Date fechaFeriado;
    private String descripcion;

    public Date getFechaFeriado() {
        return fechaFeriado;
    }

    public void setFechaFeriado(Date fechaFeriado) {
        this.fechaFeriado = fechaFeriado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
