package com.example.demo.entity.schemas.historialInternacion;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(schema = "historialinternacion", name = "administracionmedicamentosnoprescripto")
public class AdministracionMedicamentoNnoPrescripto {
    @Id
    private Integer id;
    @Column(name = "codigoclase")
    private Integer codigoClase;
    private Integer item;
    @Column(name = "otromedicamento")
    private String otroMedicamento;
    private Date fecha;
    private LocalDateTime hora;
    @Column(name = "viaadmin")
    private String  viaAdmin;
    private String observacion;
    @Column(name = "nrointernacion")
    private Integer nroInternacion;
    private String dasis;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCodigoClase() {
        return codigoClase;
    }

    public void setCodigoClase(Integer codigoClase) {
        this.codigoClase = codigoClase;
    }

    public Integer getItem() {
        return item;
    }

    public void setItem(Integer item) {
        this.item = item;
    }

    public String getOtroMedicamento() {
        return otroMedicamento;
    }

    public void setOtroMedicamento(String otroMedicamento) {
        this.otroMedicamento = otroMedicamento;
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

    public String getViaAdmin() {
        return viaAdmin;
    }

    public void setViaAdmin(String viaAdmin) {
        this.viaAdmin = viaAdmin;
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

    public String getDasis() {
        return dasis;
    }

    public void setDasis(String dasis) {
        this.dasis = dasis;
    }
}
