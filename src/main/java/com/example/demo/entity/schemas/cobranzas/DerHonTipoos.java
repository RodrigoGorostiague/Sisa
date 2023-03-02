package com.example.demo.entity.schemas.cobranzas;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "derhon_tipoos", schema = "cobranzas")
public class DerHonTipoos {
    @Id
    private Integer tipos;
    @Column(name = "porc_derechos")
    private Integer porcDerechos;
    @Column(name = "porc_honorarios")
    private Integer porcHonorarios;

    public Integer getTipos() {
        return tipos;
    }

    public void setTipos(Integer tipos) {
        this.tipos = tipos;
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
