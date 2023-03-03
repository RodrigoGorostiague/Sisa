package com.example.demo.entity.schemas.resapro;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "id_pais_otros", schema = "resapro")
public class IdPaisOtros {
    @Id
    @Column(name = "id_sisa")
    private Integer idSisa;
    @Column(name = "id_pais")
    private Integer idPais;
    private String descripcion;

    public Integer getIdSisa() {
        return idSisa;
    }

    public void setIdSisa(Integer idSisa) {
        this.idSisa = idSisa;
    }

    public Integer getIdPais() {
        return idPais;
    }

    public void setIdPais(Integer idPais) {
        this.idPais = idPais;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
