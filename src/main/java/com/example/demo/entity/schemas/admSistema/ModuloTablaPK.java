package com.example.demo.entity.schemas.admSistema;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.io.Serializable;

@Embeddable
public class ModuloTablaPK implements Serializable {
    @Column(name = "nombretabla")
    private String nombreTabla;
    @ManyToOne
    @JoinColumn(name = "idmodulo", referencedColumnName = "idmodulo")
    private Modulo idModulos;

    public String getNombreTabla() {
        return nombreTabla;
    }

    public void setNombreTabla(String nombreTabla) {
        this.nombreTabla = nombreTabla;
    }

    public Modulo getIdModulos() {
        return idModulos;
    }

    public void setIdModulos(Modulo idModulos) {
        this.idModulos = idModulos;
    }
}
