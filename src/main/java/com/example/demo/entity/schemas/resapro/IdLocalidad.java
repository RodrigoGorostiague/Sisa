package com.example.demo.entity.schemas.resapro;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "id_localidad", schema = "resapro")
public class IdLocalidad {
    @Id
    private Integer id;
    @Column(name = "id_partido")
    private Integer idPartido;
    private String descripcion;
    @Column(name = "cod_postal")
    private String codPostal;
    @Column(name = "id_partido_sisa")
    private Integer idPartidoSisa;
    private Integer id_localidad_sisa;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdPartido() {
        return idPartido;
    }

    public void setIdPartido(Integer idPartido) {
        this.idPartido = idPartido;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCodPostal() {
        return codPostal;
    }

    public void setCodPostal(String codPostal) {
        this.codPostal = codPostal;
    }

    public Integer getIdPartidoSisa() {
        return idPartidoSisa;
    }

    public void setIdPartidoSisa(Integer idPartidoSisa) {
        this.idPartidoSisa = idPartidoSisa;
    }

    public Integer getId_localidad_sisa() {
        return id_localidad_sisa;
    }

    public void setId_localidad_sisa(Integer id_localidad_sisa) {
        this.id_localidad_sisa = id_localidad_sisa;
    }
}
