package com.example.demo.entity.schemas.pami;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "internaciones_ignoradas", schema = "pami_nuevo")
public class InternacionesIgnoradas {
    @Id
    @Column(name = "nrointernacion")
    private Integer nroInternacion;

    public Integer getNroInternacion() {
        return nroInternacion;
    }

    public void setNroInternacion(Integer nroInternacion) {
        this.nroInternacion = nroInternacion;
    }
}
