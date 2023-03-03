package com.example.demo.entity.schemas.historialInternacion;

import com.example.demo.entity.schemas.asistencia.PadronEspecialidad;
import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Embeddable
public class PedidoInterConsultaPK implements Serializable {
    @Column(name = "nrointernacion")
    private Integer nroInternacion;
    private Date fecha;
    private LocalDateTime hora;
    @ManyToOne
    @JoinColumn(name = "codigoespecialidad", referencedColumnName = "codigoespecialidad")
    private PadronEspecialidad padronEspecialidad;

    public Integer getNroInternacion() {
        return nroInternacion;
    }

    public void setNroInternacion(Integer nroInternacion) {
        this.nroInternacion = nroInternacion;
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

    public PadronEspecialidad getPadronEspecialidad() {
        return padronEspecialidad;
    }

    public void setPadronEspecialidad(PadronEspecialidad padronEspecialidad) {
        this.padronEspecialidad = padronEspecialidad;
    }
}
