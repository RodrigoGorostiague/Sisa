package com.example.demo.entity.schemas.turnos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "estadoatencion", schema = "turnos")
public class EstadoAtencion {
    @Id
    @Column(name = "idestadoatencion")
    private String idEstadoAtencion;
    @Column(name = "nombreestadoatencion")
    private String nombreEstadoAtencion;

    public String getIdEstadoAtencion() {
        return idEstadoAtencion;
    }

    public void setIdEstadoAtencion(String idEstadoAtencion) {
        this.idEstadoAtencion = idEstadoAtencion;
    }

    public String getNombreEstadoAtencion() {
        return nombreEstadoAtencion;
    }

    public void setNombreEstadoAtencion(String nombreEstadoAtencion) {
        this.nombreEstadoAtencion = nombreEstadoAtencion;
    }
}
