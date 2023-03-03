package com.example.demo.entity.schemas.turnos;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "licenciaprofesional", schema = "turnos")
public class LicenciaProfesional {
    @EmbeddedId
    private LicenciaProfesionalPK id;
    @Column(name = "descripcionlicencia")
    private String descripcionLicencia;
    @Column(name = "incluyeaps")
    private String incluyeAps;

    public LicenciaProfesionalPK getId() {
        return id;
    }

    public void setId(LicenciaProfesionalPK id) {
        this.id = id;
    }

    public String getDescripcionLicencia() {
        return descripcionLicencia;
    }

    public void setDescripcionLicencia(String descripcionLicencia) {
        this.descripcionLicencia = descripcionLicencia;
    }

    public String getIncluyeAps() {
        return incluyeAps;
    }

    public void setIncluyeAps(String incluyeAps) {
        this.incluyeAps = incluyeAps;
    }
}
