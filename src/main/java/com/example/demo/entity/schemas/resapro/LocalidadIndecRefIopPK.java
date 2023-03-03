package com.example.demo.entity.schemas.resapro;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class LocalidadIndecRefIopPK implements Serializable {
    @Column(name = "pais_id")
    private Integer paisId;
    @Column(name = "prov_id")
    private Integer provId;
    @Column(name = "partido_id")
    private Integer partidoId;
    @Column(name = "locali_id")
    private Integer localiId;

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

    public Integer getLocaliId() {
        return localiId;
    }

    public void setLocaliId(Integer localiId) {
        this.localiId = localiId;
    }
}
