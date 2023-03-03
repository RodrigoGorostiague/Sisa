package com.example.demo.entity.schemas.laboratorio;

import com.example.demo.entity.schemas.organizacion.UnidadAtencion;
import com.example.demo.entity.schemas.personal.Personal;
import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

@Embeddable
public class PedidoLaboratorioCabeceraPK implements Serializable {
    @ManyToOne
    @JoinColumn(name = "uniat", referencedColumnName = "codigouniat")
    private UnidadAtencion unidadAtencion;
    @Column(name = "nroatencion")
    private Integer nroAtencion;
    @ManyToOne
    @JoinColumn(name = "profesional", referencedColumnName = "codigopersonal")
    private Personal personal;
    private Date fecha;
    private LocalDateTime hora;

    public UnidadAtencion getUnidadAtencion() {
        return unidadAtencion;
    }

    public void setUnidadAtencion(UnidadAtencion unidadAtencion) {
        this.unidadAtencion = unidadAtencion;
    }

    public Integer getNroAtencion() {
        return nroAtencion;
    }

    public void setNroAtencion(Integer nroAtencion) {
        this.nroAtencion = nroAtencion;
    }

    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public LocalDateTime getHora() {
        return hora;
    }

    public void setHora(LocalDateTime hora) {
        this.hora = hora;
    }
}
