package com.example.demo.entity.schemas.turnos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tipoatencion", schema = "turnos")
public class TipoAtencion {
    @Id
    @Column(name = "codigotipoatencion")
    private String codigoTipoAtencion;
    @Column(name = "nombretipoatencion")
    private String nombreTipoAtencion;

    public String getCodigoTipoAtencion() {
        return codigoTipoAtencion;
    }

    public void setCodigoTipoAtencion(String codigoTipoAtencion) {
        this.codigoTipoAtencion = codigoTipoAtencion;
    }

    public String getNombreTipoAtencion() {
        return nombreTipoAtencion;
    }

    public void setNombreTipoAtencion(String nombreTipoAtencion) {
        this.nombreTipoAtencion = nombreTipoAtencion;
    }
}
