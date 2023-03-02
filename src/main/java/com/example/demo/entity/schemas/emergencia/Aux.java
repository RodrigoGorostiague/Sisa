package com.example.demo.entity.schemas.emergencia;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "emergencia", name = "aux")
public class Aux {
    @EmbeddedId
    private AuxPK id;
    @Column(name = "tipoatencion")
    private String tipoAtencion;

    public AuxPK getId() {
        return id;
    }

    public void setId(AuxPK id) {
        this.id = id;
    }

    public String getTipoAtencion() {
        return tipoAtencion;
    }

    public void setTipoAtencion(String tipoAtencion) {
        this.tipoAtencion = tipoAtencion;
    }
}
