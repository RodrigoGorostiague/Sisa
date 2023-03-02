package com.example.demo.entity.schemas.emergencia;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "viajecombi", schema = "emergencia")
public class ViajeCombi {
    @EmbeddedId
    private ViajeCombiPK id;
    @Column(name = "ciudaddestino")
    private String ciudadDestino;
    private String observacion;
    @Column(name = "montoentregado")
    private Integer montoEntregado;
    @Column(name = "viaticochofer")
    private Integer viaticoChofer;
    private Integer gastos;
    @Column(name = "fecha_regreso")
    private Date fechaRegreso;
    @Column(name = "hora_regreso")
    private LocalDateTime horaRegreso;
    @Column(name = "kmrecorridos")
    private Integer kmRecorridos;
    private Integer transferido;

    public ViajeCombiPK getId() {
        return id;
    }

    public void setId(ViajeCombiPK id) {
        this.id = id;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public void setCiudadDestino(String ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Integer getMontoEntregado() {
        return montoEntregado;
    }

    public void setMontoEntregado(Integer montoEntregado) {
        this.montoEntregado = montoEntregado;
    }

    public Integer getViaticoChofer() {
        return viaticoChofer;
    }

    public void setViaticoChofer(Integer viaticoChofer) {
        this.viaticoChofer = viaticoChofer;
    }

    public Integer getGastos() {
        return gastos;
    }

    public void setGastos(Integer gastos) {
        this.gastos = gastos;
    }

    public Date getFechaRegreso() {
        return fechaRegreso;
    }

    public void setFechaRegreso(Date fechaRegreso) {
        this.fechaRegreso = fechaRegreso;
    }

    public LocalDateTime getHoraRegreso() {
        return horaRegreso;
    }

    public void setHoraRegreso(LocalDateTime horaRegreso) {
        this.horaRegreso = horaRegreso;
    }

    public Integer getKmRecorridos() {
        return kmRecorridos;
    }

    public void setKmRecorridos(Integer kmRecorridos) {
        this.kmRecorridos = kmRecorridos;
    }

    public Integer getTransferido() {
        return transferido;
    }

    public void setTransferido(Integer transferido) {
        this.transferido = transferido;
    }
}
