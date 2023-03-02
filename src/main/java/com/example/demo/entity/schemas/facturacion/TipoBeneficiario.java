package com.example.demo.entity.schemas.facturacion;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tipobeneficiario", schema = "facturacion")
public class TipoBeneficiario {
    @Id
    private String idtipobeneficiario;
    private String nombre;

    public String getIdtipobeneficiario() {
        return idtipobeneficiario;
    }

    public void setIdtipobeneficiario(String idtipobeneficiario) {
        this.idtipobeneficiario = idtipobeneficiario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
