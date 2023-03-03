package com.example.demo.entity.schemas.resapro;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "id_nacionalidad", schema = "resapro")
public class IdNacionalidad {
    @Id
    private Integer id;
    private String descripcion;
    @Column(name = "id_sisa")
    private Integer idSisa;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getIdSisa() {
        return idSisa;
    }

    public void setIdSisa(Integer idSisa) {
        this.idSisa = idSisa;
    }
}
