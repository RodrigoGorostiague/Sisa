package com.example.demo.entity.schemas.paciente;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "factorsanguineo", schema = "paciente")
public class FactorSanguineo {
    @Id
    @Column(name = "idfactorsanguineo")
    private String idFactorSanguineo;
    private String descripcion;

    public String getIdFactorSanguineo() {
        return idFactorSanguineo;
    }

    public void setIdFactorSanguineo(String idFactorSanguineo) {
        this.idFactorSanguineo = idFactorSanguineo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
