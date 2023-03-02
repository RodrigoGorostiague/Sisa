package com.api.sisa.entity.schemas.farmacia;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "unidades_recepcion", schema = "farmacia")
public class UnidadesRecepcion {
    @Id
    @Column(name = "codigour")
    private String codigoUr;
    private String  descripcion;

    public String getCodigoUr() {
        return codigoUr;
    }

    public void setCodigoUr(String codigoUr) {
        this.codigoUr = codigoUr;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
