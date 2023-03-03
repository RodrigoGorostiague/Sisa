package com.example.demo.entity.schemas.historialInternacion;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(schema = "historialinternacion", name = "administracioninfusionprescripta")
public class AdministracionInfusionPrescripta {
    @Id
    private Integer id;
    private Date fecha;
    private LocalDateTime hora;
    private String observaciones;
    @Column(name = "nrointernacion")
    private Integer nroInternacion;
    @Column(name = "cantgoteo")
    private Integer cantGoteo;
    @Column(name = "tipogoteo")
    private String tipoGoteo;
    @Column(name = "idprescripcioninfusion")
    private Integer idPrescripcioninFusion;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Integer getNroInternacion() {
        return nroInternacion;
    }

    public void setNroInternacion(Integer nroInternacion) {
        this.nroInternacion = nroInternacion;
    }

    public Integer getCantGoteo() {
        return cantGoteo;
    }

    public void setCantGoteo(Integer cantGoteo) {
        this.cantGoteo = cantGoteo;
    }

    public String getTipoGoteo() {
        return tipoGoteo;
    }

    public void setTipoGoteo(String tipoGoteo) {
        this.tipoGoteo = tipoGoteo;
    }

    public Integer getIdPrescripcioninFusion() {
        return idPrescripcioninFusion;
    }

    public void setIdPrescripcioninFusion(Integer idPrescripcioninFusion) {
        this.idPrescripcioninFusion = idPrescripcioninFusion;
    }
}
