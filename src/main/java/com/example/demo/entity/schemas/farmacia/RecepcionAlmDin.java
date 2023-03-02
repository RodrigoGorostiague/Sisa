package com.api.sisa.entity.schemas.farmacia;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "recepcionalmdin", schema = "farmacia")
public class RecepcionAlmDin {
    @Id
    @Column(name = "nrorecep")
    private Integer nroRecep;
    private Date fecha;
    private Boolean anulado;
    private String observaciones;
    private String tipo;
    @Column(name = "nrovalerafam")
    private Integer nroValeRafam;
    private Integer ejercicio;
    private LocalDateTime hora;
    @OneToMany
    @JoinColumn(name = "codigour", referencedColumnName = "codigour")
    private List<UnidadesRecepcion> unidadesRecepcion;

    public Integer getNroRecep() {
        return nroRecep;
    }

    public void setNroRecep(Integer nroRecep) {
        this.nroRecep = nroRecep;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Boolean getAnulado() {
        return anulado;
    }

    public void setAnulado(Boolean anulado) {
        this.anulado = anulado;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getNroValeRafam() {
        return nroValeRafam;
    }

    public void setNroValeRafam(Integer nroValeRafam) {
        this.nroValeRafam = nroValeRafam;
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

    public List<UnidadesRecepcion> getUnidadesRecepcion() {
        return unidadesRecepcion;
    }

    public void setUnidadesRecepcion(List<UnidadesRecepcion> unidadesRecepcion) {
        this.unidadesRecepcion = unidadesRecepcion;
    }
}
