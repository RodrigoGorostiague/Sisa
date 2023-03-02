package com.example.demo.entity.schemas.asistencia;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(schema = "asistencia", name = "padronoms")
public class PadronOMS {
    @Id
    @Column(name = "codigooms")
    private Integer codigoOms;
    private String nombre;
    @Column(name = "nombrecorto")
    private String nombreCorto;
    @Column(name = "incluidap21")
    private String incluidaPlanilla21;

    public Integer getCodigoOms() {
        return codigoOms;
    }

    public void setCodigoOms(Integer codigoOms) {
        this.codigoOms = codigoOms;
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

    public String getIncluidaPlanilla21() {
        return incluidaPlanilla21;
    }

    public void setIncluidaPlanilla21(String incluidaPlanilla21) {
        this.incluidaPlanilla21 = incluidaPlanilla21;
    }
}
