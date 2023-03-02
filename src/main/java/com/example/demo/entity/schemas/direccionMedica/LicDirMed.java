package com.example.demo.entity.schemas.direccionMedica;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "direccionmedica")
public class LicDirMed {
    @EmbeddedId
    private LicDirMedPK id;
    private String descripcionLicencia;

    public LicDirMedPK getId() {
        return id;
    }

    public void setId(LicDirMedPK id) {
        this.id = id;
    }

    public String getDescripcionLicencia() {
        return descripcionLicencia;
    }

    public void setDescripcionLicencia(String descripcionLicencia) {
        this.descripcionLicencia = descripcionLicencia;
    }
}
