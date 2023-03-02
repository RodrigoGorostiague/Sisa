package com.example.demo.entity.schemas.facturacion;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tipoingr_brutos", schema = "facturacion")
public class TipoIngrBrutos {
    @Id
    @Column(name = "idtipoingr_brutos")
    private Integer idTipoIngrBrutos;
    private String nombre;

    public Integer getIdTipoIngrBrutos() {
        return idTipoIngrBrutos;
    }

    public void setIdTipoIngrBrutos(Integer idTipoIngrBrutos) {
        this.idTipoIngrBrutos = idTipoIngrBrutos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
