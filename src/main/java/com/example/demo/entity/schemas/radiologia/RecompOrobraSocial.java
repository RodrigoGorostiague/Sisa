package com.example.demo.entity.schemas.radiologia;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "recomporobrasocial", schema = "radiologia")
public class RecompOrobraSocial {
    @Id
    @Column(name = "obresocial")
    private Integer obreSocial;
    private String descripcion;

    public Integer getObreSocial() {
        return obreSocial;
    }

    public void setObreSocial(Integer obreSocial) {
        this.obreSocial = obreSocial;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
