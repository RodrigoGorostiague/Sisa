package com.example.demo.entity.schemas.historialInternacion;

import com.example.demo.entity.schemas.internacion.Internacion;
import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Embeddable
public class EvolucionEnfPK implements Serializable {
    @ManyToOne
    @JoinColumn(name = "nrointernacion", referencedColumnName = "nrointernacion")
    private Internacion internacion;
    @Column(name = "fechaevol")
    private Date fechaEvol;
    @Column(name = "horaevol")
    private LocalDateTime horaEvol;
    private String codigopersonal;

    public Internacion getInternacion() {
        return internacion;
    }

    public void setInternacion(Internacion internacion) {
        this.internacion = internacion;
    }

    public Date getFechaEvol() {
        return fechaEvol;
    }

    public void setFechaEvol(Date fechaEvol) {
        this.fechaEvol = fechaEvol;
    }

    public LocalDateTime getHoraEvol() {
        return horaEvol;
    }

    public void setHoraEvol(LocalDateTime horaEvol) {
        this.horaEvol = horaEvol;
    }

    public String getCodigopersonal() {
        return codigopersonal;
    }

    public void setCodigopersonal(String codigopersonal) {
        this.codigopersonal = codigopersonal;
    }
}
