package com.example.demo.entity.schemas.resapro;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class ProvinciasIndecRefIopPK implements Serializable {
    @Column(name = "pais_id")
    private Integer paisId;
    @Column(name = "prov_id")
    private Integer prov_id;

    public Integer getPaisId() {
        return paisId;
    }

    public void setPaisId(Integer paisId) {
        this.paisId = paisId;
    }

    public Integer getProv_id() {
        return prov_id;
    }

    public void setProv_id(Integer prov_id) {
        this.prov_id = prov_id;
    }
}
