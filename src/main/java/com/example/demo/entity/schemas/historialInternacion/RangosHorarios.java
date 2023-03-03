package com.example.demo.entity.schemas.historialInternacion;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(schema = "historialinternacion", name = "rangoshorarios")
public class RangosHorarios {
    @Id
    private String nombre;
    private String Date;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }
}
