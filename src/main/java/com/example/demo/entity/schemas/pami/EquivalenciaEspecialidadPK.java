package com.example.demo.entity.schemas.pami;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class EquivalenciaEspecialidadPK implements Serializable {
    @Column(name = "id_especialidad_pami")
    private Integer idEspecialidadPami;
    @Column(name = "id_especialidad_sisa")
    private Integer idEspecialidadSisa;

    public Integer getIdEspecialidadPami() {
        return idEspecialidadPami;
    }

    public void setIdEspecialidadPami(Integer idEspecialidadPami) {
        this.idEspecialidadPami = idEspecialidadPami;
    }

    public Integer getIdEspecialidadSisa() {
        return idEspecialidadSisa;
    }

    public void setIdEspecialidadSisa(Integer idEspecialidadSisa) {
        this.idEspecialidadSisa = idEspecialidadSisa;
    }
}
