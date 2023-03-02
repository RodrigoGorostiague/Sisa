package com.example.demo.entity.schemas.anatomiaPatologica;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(schema = "anatomiapatologica", name = "estadificacion")
public class Estadificacion {
    @Id
    private String codigo;
    @Column(name = "codigoptnm")
    private String codigoPtnm;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigoPtnm() {
        return codigoPtnm;
    }

    public void setCodigoPtnm(String codigoPtnm) {
        this.codigoPtnm = codigoPtnm;
    }
}
