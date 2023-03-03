package com.example.demo.entity.schemas.resapro;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "id_partido", schema = "resapro")
public class IdPartido {
    @Id
    private Integer id;
    @Column(name = "id_provincia")
    private Integer idProvincia;
    private String descripcion;
    @Column(name = "id_sisa")
    private Integer idSisa;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdProvincia() {
        return idProvincia;
    }

    public void setIdProvincia(Integer idProvincia) {
        this.idProvincia = idProvincia;
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
