package com.example.demo.entity.schemas.paciente;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "renaper_fallecidos", schema = "paciente")
public class RenaperFallecidos {
    @Id
    @Column(name = "idpaciente")
    private Integer idPaciente;
    @Column(name = "fechadefuncion")
    private Date fechaDeFuncion;

    public Integer getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }

    public Date getFechaDeFuncion() {
        return fechaDeFuncion;
    }

    public void setFechaDeFuncion(Date fechaDeFuncion) {
        this.fechaDeFuncion = fechaDeFuncion;
    }
}
