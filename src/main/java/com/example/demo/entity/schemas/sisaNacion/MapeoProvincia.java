package com.example.demo.entity.schemas.sisaNacion;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "mapeoprovincia", schema = "sisanacion")
public class MapeoProvincia {
    @Id
    @Column(name = "idlocal")
    private Integer idLocal;
    @Column(name = "idnacion")
    private Integer idNacion;

    public Integer getIdLocal() {
        return idLocal;
    }

    public void setIdLocal(Integer idLocal) {
        this.idLocal = idLocal;
    }

    public Integer getIdNacion() {
        return idNacion;
    }

    public void setIdNacion(Integer idNacion) {
        this.idNacion = idNacion;
    }
}
