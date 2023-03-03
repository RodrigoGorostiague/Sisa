package com.example.demo.entity.schemas.radiologia;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "placas", schema = "radiologia")
public class Placas {
    @Id
    private String codigo;
    private String descripcion;
    @Column(name = "cantidadstock")
    private Integer cantidadStock;
    @Column(name = "cantidadstockcritico")
    private Integer cantidadStockCritico;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(Integer cantidadStock) {
        this.cantidadStock = cantidadStock;
    }

    public Integer getCantidadStockCritico() {
        return cantidadStockCritico;
    }

    public void setCantidadStockCritico(Integer cantidadStockCritico) {
        this.cantidadStockCritico = cantidadStockCritico;
    }
}
