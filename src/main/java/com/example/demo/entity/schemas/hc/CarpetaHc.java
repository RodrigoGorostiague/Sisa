package com.example.demo.entity.schemas.hc;

import com.example.demo.entity.schemas.personal.Personal;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(schema = "hc", name = "carpetahc")
public class CarpetaHc {
    @EmbeddedId
    private CarpetaHcPK id;
    @Column(name = "fechaapertura")
    private LocalDateTime fechaApertura;
    private String observaciones;
    @ManyToOne
    @JoinColumn(name = "idestado", referencedColumnName = "idestado")
    private EstadoArchivo estadoArchivo;
    @Column(name = "numerocopias")
    private Integer numeroCopias;
    @ManyToOne
    @JoinColumn(name = "codigopersonal", referencedColumnName = "codigopersonal")
    private Personal personal;

    public CarpetaHcPK getId() {
        return id;
    }

    public void setId(CarpetaHcPK id) {
        this.id = id;
    }

    public LocalDateTime getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(LocalDateTime fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public EstadoArchivo getEstadoArchivo() {
        return estadoArchivo;
    }

    public void setEstadoArchivo(EstadoArchivo estadoArchivo) {
        this.estadoArchivo = estadoArchivo;
    }

    public Integer getNumeroCopias() {
        return numeroCopias;
    }

    public void setNumeroCopias(Integer numeroCopias) {
        this.numeroCopias = numeroCopias;
    }

    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }
}
