package com.example.demo.entity.schemas.turnos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tipocupo", schema = "turnos")
public class TipoCupo {
    @Id
    @Column(name = "codigocupo")
    private String codigoCupo;
    @Column(name = "nombrecupo")
    private String nombreCupo;

    public String getCodigoCupo() {
        return codigoCupo;
    }

    public void setCodigoCupo(String codigoCupo) {
        this.codigoCupo = codigoCupo;
    }

    public String getNombreCupo() {
        return nombreCupo;
    }

    public void setNombreCupo(String nombreCupo) {
        this.nombreCupo = nombreCupo;
    }
}
