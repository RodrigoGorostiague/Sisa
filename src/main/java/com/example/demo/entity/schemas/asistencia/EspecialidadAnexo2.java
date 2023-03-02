package com.example.demo.entity.schemas.asistencia;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(schema = "asistencia", name = "especialidadanexo2")
public class EspecialidadAnexo2 {
    @Id
    @Column(name = "codigoanexo2")
    private String codigoAnexo;
    private String descripcion;
    private String validez;

    public String getCodigoAnexo() {
        return codigoAnexo;
    }

    public void setCodigoAnexo(String codigoAnexo) {
        this.codigoAnexo = codigoAnexo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getValidez() {
        return validez;
    }

    public void setValidez(String validez) {
        this.validez = validez;
    }
}
