package com.example.demo.entity.schemas.farmacia;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "devolalmgral", schema = "farmacia")
public class DevolAlmGral {
    @Id
    @Column(name = "nrodevol")
    private Integer nroDevol;
    private Date fecha;
    @Column(name = "nrodevolrafam")
    private Integer nroDevolRafam;
    private Integer ejercicio;
    private LocalDateTime hora;
    @ManyToOne
    @JoinColumn(name = "codigour", referencedColumnName = "codigour")
    private UnidadesRecepcion unidadesRecepcion;

    public Integer getNroDevol() {
        return nroDevol;
    }

    public void setNroDevol(Integer nroDevol) {
        this.nroDevol = nroDevol;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Integer getNroDevolRafam() {
        return nroDevolRafam;
    }

    public void setNroDevolRafam(Integer nroDevolRafam) {
        this.nroDevolRafam = nroDevolRafam;
    }

    public Integer getEjercicio() {
        return ejercicio;
    }

    public void setEjercicio(Integer ejercicio) {
        this.ejercicio = ejercicio;
    }

    public LocalDateTime getHora() {
        return hora;
    }

    public void setHora(LocalDateTime hora) {
        this.hora = hora;
    }

    public UnidadesRecepcion getUnidadesRecepcion() {
        return unidadesRecepcion;
    }

    public void setUnidadesRecepcion(UnidadesRecepcion unidadesRecepcion) {
        this.unidadesRecepcion = unidadesRecepcion;
    }
}
