package com.example.demo.entity.schemas.vacunacion;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.sql.Date;


@Entity
@Table(name = "stockvacuna", schema = "vacunacion")
public class StockVacuna {
    @EmbeddedId
    private StockVacunaPK id;
    @Column(name = "cantidadstock")
    private Integer cantidadStock;
    @Column(name = "fechavencimiento")
    private Date fechaVencimiento;
    private String clase;

    public StockVacunaPK getId() {
        return id;
    }

    public void setId(StockVacunaPK id) {
        this.id = id;
    }

    public Integer getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(Integer cantidadStock) {
        this.cantidadStock = cantidadStock;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }
}
