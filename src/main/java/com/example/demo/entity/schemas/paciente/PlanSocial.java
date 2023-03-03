package com.example.demo.entity.schemas.paciente;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "plansocial", schema = "paciente")
public class PlanSocial {
    @Id
    @Column(name = "idplansocial")
    private String idPlanSocial;
    private String nombre;
    private String descripcion;

    public String getIdPlanSocial() {
        return idPlanSocial;
    }

    public void setIdPlanSocial(String idPlanSocial) {
        this.idPlanSocial = idPlanSocial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
