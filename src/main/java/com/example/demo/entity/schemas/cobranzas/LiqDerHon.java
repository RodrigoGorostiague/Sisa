package com.example.demo.entity.schemas.cobranzas;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(schema = "cobranzas", name = "liqderhon")
public class LiqDerHon {
    @Id
    @Column(name = "fecha_liq_ini")
    private Date fechaLiqIni;
    @Column(name = "fecha_liq_fin")
    private Date fechaLiqFin;
    @Column(name = "fechahora")
    private LocalDateTime fechaHora;
    private String usuario;

    public Date getFechaLiqIni() {
        return fechaLiqIni;
    }

    public void setFechaLiqIni(Date fechaLiqIni) {
        this.fechaLiqIni = fechaLiqIni;
    }

    public Date getFechaLiqFin() {
        return fechaLiqFin;
    }

    public void setFechaLiqFin(Date fechaLiqFin) {
        this.fechaLiqFin = fechaLiqFin;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
}
