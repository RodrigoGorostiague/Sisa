package com.example.demo.entity.schemas.resapro;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cod_int_quirurgica", schema = "resapro")
public class CodIntQuirurgica {
    @Id
    @Column(name = "cod_int_quirurgica")
    private String codIntQuirurgica;
    private String descripcion;

    public String getCodIntQuirurgica() {
        return codIntQuirurgica;
    }

    public void setCodIntQuirurgica(String codIntQuirurgica) {
        this.codIntQuirurgica = codIntQuirurgica;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
