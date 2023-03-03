package com.example.demo.entity.schemas.historialInternacion;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "historialinternacion", name = "ingresoutiinfantil")
public class IngresoUtiInfantil {
    @EmbeddedId
    private IngresoUtiInfantilPK id;
    @Column(name = "vacunacion_completa")
    private Boolean vacunacionCompleta;

    public IngresoUtiInfantilPK getId() {
        return id;
    }

    public void setId(IngresoUtiInfantilPK id) {
        this.id = id;
    }

    public Boolean getVacunacionCompleta() {
        return vacunacionCompleta;
    }

    public void setVacunacionCompleta(Boolean vacunacionCompleta) {
        this.vacunacionCompleta = vacunacionCompleta;
    }
}
