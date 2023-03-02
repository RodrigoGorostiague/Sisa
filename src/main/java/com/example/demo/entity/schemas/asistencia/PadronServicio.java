package com.example.demo.entity.schemas.asistencia;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(schema = "asistencia", name = "padronservicio")
public class PadronServicio {
    @Id
    @Column(name = "codigoservicio")
    private Integer codigoServicio;
    private String nombre;
    @Column(name = "nombrecorto")
    private String nombreCorto;
    @Column(name = "codigooms")
    private String codigoOMS;

    public Integer getCodigoServicio() {
        return codigoServicio;
    }

    public void setCodigoServicio(Integer codigoServicio) {
        this.codigoServicio = codigoServicio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreCorto() {
        return nombreCorto;
    }

    public void setNombreCorto(String nombreCorto) {
        this.nombreCorto = nombreCorto;
    }

    public String getCodigoOMS() {
        return codigoOMS;
    }

    public void setCodigoOMS(String codigoOMS) {
        this.codigoOMS = codigoOMS;
    }
}
