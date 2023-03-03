package com.example.demo.entity.schemas.historialInternacion;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(schema = "historialinternacion", name = "administracionmedicamentosprescripto")
public class AdministracionMedicamentosPrescripto {
    @Id
    private Integer id;
    private Date fecha;
    private LocalDateTime hora;
    private String observacion;
    @Column(name = "nrointernacion")
    private Integer nroInternacion;
    @Column(name = "viaadmin")
    private String viaAdmin;
    private String dosis;
    @Column(name = "idprescripcionmedicamento")
    private Integer idPrescripcionMedicamento;

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

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Integer getNroInternacion() {
        return nroInternacion;
    }

    public void setNroInternacion(Integer nroInternacion) {
        this.nroInternacion = nroInternacion;
    }

    public String getViaAdmin() {
        return viaAdmin;
    }

    public void setViaAdmin(String viaAdmin) {
        this.viaAdmin = viaAdmin;
    }

    public String getDosis() {
        return dosis;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }

    public Integer getIdPrescripcionMedicamento() {
        return idPrescripcionMedicamento;
    }

    public void setIdPrescripcionMedicamento(Integer idPrescripcionMedicamento) {
        this.idPrescripcionMedicamento = idPrescripcionMedicamento;
    }
}
