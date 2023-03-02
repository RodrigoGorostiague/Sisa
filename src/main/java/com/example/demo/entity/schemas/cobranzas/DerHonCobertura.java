package com.example.demo.entity.schemas.cobranzas;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(schema = "cobranzas", name = "derhon_cobertura")
public class DerHonCobertura {
     @Id
    private Integer cobertura;
     @Column(name = "porc_derechos")
     private Integer porcDerechos;
     @Column(name = "porc_honorarios")
     private Integer porcHonorarios;

    public Integer getCobertura() {
        return cobertura;
    }

    public void setCobertura(Integer cobertura) {
        this.cobertura = cobertura;
    }

    public Integer getPorcDerechos() {
        return porcDerechos;
    }

    public void setPorcDerechos(Integer porcDerechos) {
        this.porcDerechos = porcDerechos;
    }

    public Integer getPorcHonorarios() {
        return porcHonorarios;
    }

    public void setPorcHonorarios(Integer porcHonorarios) {
        this.porcHonorarios = porcHonorarios;
    }
}
