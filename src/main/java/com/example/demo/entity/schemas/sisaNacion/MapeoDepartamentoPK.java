package com.example.demo.entity.schemas.sisaNacion;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class MapeoDepartamentoPK implements Serializable {
    @Column(name = "idprovincia")
    private Integer idProvincia;
    @Column(name = "idlocal")
    private Integer idLocal;

    public Integer getIdProvincia() {
        return idProvincia;
    }

    public void setIdProvincia(Integer idProvincia) {
        this.idProvincia = idProvincia;
    }

    public Integer getIdLocal() {
        return idLocal;
    }

    public void setIdLocal(Integer idLocal) {
        this.idLocal = idLocal;
    }
}
