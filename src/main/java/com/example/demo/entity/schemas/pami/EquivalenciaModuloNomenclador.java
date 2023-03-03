package com.example.demo.entity.schemas.pami;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "equivalencia_modulo_nomenclador", schema = "pami_nuevo")
public class EquivalenciaModuloNomenclador {
    @Id
    @Column(name = "id_modulo_nomenclador")
    private Integer idModuloNomenclador;
    @Column(name = "id_modulo_nomenclador_pami")
    private Integer idModuloNomencladorPami;
    private String descripcion;
    private Boolean exportable;
    private String observaciones;

    public Integer getIdModuloNomenclador() {
        return idModuloNomenclador;
    }

    public void setIdModuloNomenclador(Integer idModuloNomenclador) {
        this.idModuloNomenclador = idModuloNomenclador;
    }

    public Integer getIdModuloNomencladorPami() {
        return idModuloNomencladorPami;
    }

    public void setIdModuloNomencladorPami(Integer idModuloNomencladorPami) {
        this.idModuloNomencladorPami = idModuloNomencladorPami;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Boolean getExportable() {
        return exportable;
    }

    public void setExportable(Boolean exportable) {
        this.exportable = exportable;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
}
