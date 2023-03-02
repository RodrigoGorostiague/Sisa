package com.example.demo.entity.schemas.auditoria;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "auditoria", name = "vacuninternacion")
public class VacunInternacion {
    @EmbeddedId
    private VacunInternacionPK id;
    @Column(name = "nrointernacion")
    private Integer nroInternacion;
    private String usuario;
    private String operacion;

    public VacunInternacionPK getId() {
        return id;
    }

    public void setId(VacunInternacionPK id) {
        this.id = id;
    }

    public Integer getNroInternacion() {
        return nroInternacion;
    }

    public void setNroInternacion(Integer nroInternacion) {
        this.nroInternacion = nroInternacion;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }
}
