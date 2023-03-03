package com.example.demo.entity.schemas.internacion;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.sql.Date;
import java.time.LocalDateTime;

@Entity
@Table(name = "causaexterna", schema = "internacion")
public class CausaExterna {
    @Id
    @Column(name = "nrointernacion")
    private Integer nroInternacion;
    private Date fecha;
    private LocalDateTime hora;
    @Column(name = "producidopor")
    private String producidoPor;
    @Column(name = "ocurrioen")
    private String ocurrioEn;
    private String descripcion;

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

    public String getProducidoPor() {
        return producidoPor;
    }

    public void setProducidoPor(String producidoPor) {
        this.producidoPor = producidoPor;
    }

    public String getOcurrioEn() {
        return ocurrioEn;
    }

    public void setOcurrioEn(String ocurrioEn) {
        this.ocurrioEn = ocurrioEn;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
