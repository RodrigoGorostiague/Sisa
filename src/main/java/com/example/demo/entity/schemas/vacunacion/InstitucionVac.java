package com.example.demo.entity.schemas.vacunacion;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "institucion", schema = "vacunacion")
public class InstitucionVac {
    @Id
    @Column(name = "codigoinstitucion")
    private String codigoInstitucion;
    @Column(name = "nombreinstitucion")
    private String nombreInstitucion;

    public String getCodigoInstitucion() {
        return codigoInstitucion;
    }

    public void setCodigoInstitucion(String codigoInstitucion) {
        this.codigoInstitucion = codigoInstitucion;
    }

    public String getNombreInstitucion() {
        return nombreInstitucion;
    }

    public void setNombreInstitucion(String nombreInstitucion) {
        this.nombreInstitucion = nombreInstitucion;
    }
}
