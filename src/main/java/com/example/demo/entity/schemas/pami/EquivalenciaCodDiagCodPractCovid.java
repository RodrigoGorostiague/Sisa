package com.example.demo.entity.schemas.pami;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "equivalencia_cod_diag_cod_pract_covid", schema = "pami_nuevo")
public class EquivalenciaCodDiagCodPractCovid {
    @Id
    @Column(name = "id_sisa")
    private String idSisa;
    @Column(name = "descripcion_sisa")
    private String descripcionSisa;
    @Column(name = "id_pami")
    private String idPami;
    @Column(name = "descripcion_pami")
    private String descripcionPami;

    public String getIdSisa() {
        return idSisa;
    }

    public void setIdSisa(String idSisa) {
        this.idSisa = idSisa;
    }

    public String getDescripcionSisa() {
        return descripcionSisa;
    }

    public void setDescripcionSisa(String descripcionSisa) {
        this.descripcionSisa = descripcionSisa;
    }

    public String getIdPami() {
        return idPami;
    }

    public void setIdPami(String idPami) {
        this.idPami = idPami;
    }

    public String getDescripcionPami() {
        return descripcionPami;
    }

    public void setDescripcionPami(String descripcionPami) {
        this.descripcionPami = descripcionPami;
    }
}
