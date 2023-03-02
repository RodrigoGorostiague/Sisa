package com.example.demo.entity.schemas.emergencia;

import com.example.demo.entity.schemas.personal.Personal;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Embeddable
public class ViajeCombiPK implements Serializable {
    private Date fecha;
    private LocalDateTime hora;
    @ManyToOne
    @JoinColumn(name = "chofer", referencedColumnName = "codigopersonal")
    private Personal personal;

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

    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }
}
