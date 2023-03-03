package com.example.demo.entity.schemas.restServer;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "hc", schema = "rest_server")
public class Hc {
    @Id
    @Column(name = "obtenerhc")
    private Integer obtenerHc;

    public Integer getObtenerHc() {
        return obtenerHc;
    }

    public void setObtenerHc(Integer obtenerHc) {
        this.obtenerHc = obtenerHc;
    }
}
