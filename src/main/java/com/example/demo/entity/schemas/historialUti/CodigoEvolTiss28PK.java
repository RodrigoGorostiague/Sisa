package com.example.demo.entity.schemas.historialUti;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class CodigoEvolTiss28PK implements Serializable{
    @Column(name = "nrouti")
    private String nroUti;
    private String  codigo;
     @Column(name = "fechaevol")
    private String fechaEvol;

    public String getNroUti() {
        return nroUti;
    }

    public void setNroUti(String nroUti) {
        this.nroUti = nroUti;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getFechaEvol() {
        return fechaEvol;
    }

    public void setFechaEvol(String fechaEvol) {
        this.fechaEvol = fechaEvol;
    }
}
