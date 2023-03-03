package com.example.demo.entity.schemas.vacunacion;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.sql.Date;


@Entity
@Table(name = "recepcionvacunalinea", schema = "vacunacion")
public class RecepcionVacunaLinea {
    @EmbeddedId
    private RecepcionVacunaLineaPK id;
    @Column(name = "codigovacuna")
    private String codigoVacuna;
    private Integer cantidad;
    @Column(name = "numlote")
    private String numLote;
    private String  laboratorio;
    @Column(name = "fechavencimiento")
    private Date fechaVencimiento;
    @Column(name = "dosisporfrasco")
    private Integer dosisPorFrasco;
    @Column(name = "cantidaddefrascos")
    private Integer cantidadDeFrascos;
    private String clase;

    public RecepcionVacunaLineaPK getId() {
        return id;
    }

    public void setId(RecepcionVacunaLineaPK id) {
        this.id = id;
    }

    public String getCodigoVacuna() {
        return codigoVacuna;
    }

    public void setCodigoVacuna(String codigoVacuna) {
        this.codigoVacuna = codigoVacuna;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public String getNumLote() {
        return numLote;
    }

    public void setNumLote(String numLote) {
        this.numLote = numLote;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public Integer getDosisPorFrasco() {
        return dosisPorFrasco;
    }

    public void setDosisPorFrasco(Integer dosisPorFrasco) {
        this.dosisPorFrasco = dosisPorFrasco;
    }

    public Integer getCantidadDeFrascos() {
        return cantidadDeFrascos;
    }

    public void setCantidadDeFrascos(Integer cantidadDeFrascos) {
        this.cantidadDeFrascos = cantidadDeFrascos;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }
}
