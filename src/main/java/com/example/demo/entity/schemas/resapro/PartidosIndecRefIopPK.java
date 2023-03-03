package com.example.demo.entity.schemas.resapro;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Date;

@Embeddable
public class PartidosIndecRefIopPK implements Serializable {
    @Column(name = "pais_id")
    private Integer paisId;
    @Column(name = "prov_id")
    private Integer provId;
    @Column(name = "partido_id")
    private Integer partidoId;

    public Integer getPaisId() {
        return paisId;
    }

    public void setPaisId(Integer paisId) {
        this.paisId = paisId;
    }

    public Integer getProvId() {
        return provId;
    }

    public void setProvId(Integer provId) {
        this.provId = provId;
    }

    public Integer getPartidoId() {
        return partidoId;
    }

    public void setPartidoId(Integer partidoId) {
        this.partidoId = partidoId;
    }

}
