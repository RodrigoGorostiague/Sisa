package com.example.demo.entity.schemas.turnos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "mediootorgamiento", schema = "turnos")
public class MedioOtorgamiento {
    @Id
    @Column(name = "codigomediootorgamiento")
    private String codigoMedioOtorgamiento;
    @Column(name = "nombremedio")
    private String nombreMedio;

    public String getCodigoMedioOtorgamiento() {
        return codigoMedioOtorgamiento;
    }

    public void setCodigoMedioOtorgamiento(String codigoMedioOtorgamiento) {
        this.codigoMedioOtorgamiento = codigoMedioOtorgamiento;
    }

    public String getNombreMedio() {
        return nombreMedio;
    }

    public void setNombreMedio(String nombreMedio) {
        this.nombreMedio = nombreMedio;
    }
}
