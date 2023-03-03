package com.example.demo.entity.schemas.historialInternacion;

import com.example.demo.entity.schemas.personal.Personal;
import com.example.demo.entity.schemas.vacunacion.DosisVacuna;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Entity
@Table(schema = "historialinternacion", name = "vacunacion")
public class Vacunacion {
    @Id
    private Integer id;
    @Column(name = "nrointernacion")
    private Integer nroInternacion;
    @ManyToOne
    @JoinColumn(name = "codigopersonal", referencedColumnName = "codigopersonal")
    private Personal personal;
    private Date fecha;
    private LocalDateTime hora;
    @ManyToOne
    @JoinColumn(name = "codigodosis", referencedColumnName = "codigodosis")
    private DosisVacuna dosisVacuna;
    private String observacion;
    private String sala;
    @Column(name = "fechasuspension" )
    private Date fechaSuspension;
    @Column(name = "horasuspension")
    private LocalDateTime horaSuspension;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNroInternacion() {
        return nroInternacion;
    }

    public void setNroInternacion(Integer nroInternacion) {
        this.nroInternacion = nroInternacion;
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

    public DosisVacuna getDosisVacuna() {
        return dosisVacuna;
    }

    public void setDosisVacuna(DosisVacuna dosisVacuna) {
        this.dosisVacuna = dosisVacuna;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public Date getFechaSuspension() {
        return fechaSuspension;
    }

    public void setFechaSuspension(Date fechaSuspension) {
        this.fechaSuspension = fechaSuspension;
    }

    public LocalDateTime getHoraSuspension() {
        return horaSuspension;
    }

    public void setHoraSuspension(LocalDateTime horaSuspension) {
        this.horaSuspension = horaSuspension;
    }
}
