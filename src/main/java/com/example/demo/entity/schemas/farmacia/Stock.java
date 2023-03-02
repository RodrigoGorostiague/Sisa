package com.example.demo.entity.schemas.farmacia;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "stock", schema = "farmacia")
public class Stock {
    @EmbeddedId
    private StockPK id;
    @Column(name = "cantidadstockcritico")
    private Integer cantidadStockCritico;
    private Integer stock;

    public StockPK getId() {
        return id;
    }

    public void setId(StockPK id) {
        this.id = id;
    }

    public Integer getCantidadStockCritico() {
        return cantidadStockCritico;
    }

    public void setCantidadStockCritico(Integer cantidadStockCritico) {
        this.cantidadStockCritico = cantidadStockCritico;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }
}
