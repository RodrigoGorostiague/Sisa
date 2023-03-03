package com.example.demo.entity.schemas.resapro;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "nacionalidad_indec_ref_iop", schema = "resapro")
public class NacionalidadIndecRefIop {
     @Id
     @Column(name = "id_nacionalidad")
     private Integer idNacionalidad;
     private String nacionalidad;
     @Column(name = "ref_id_pais_interoperabilidad")
     private Integer refIdPaisInteroperabilidad;

    public Integer getIdNacionalidad() {
        return idNacionalidad;
    }

    public void setIdNacionalidad(Integer idNacionalidad) {
        this.idNacionalidad = idNacionalidad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public Integer getRefIdPaisInteroperabilidad() {
        return refIdPaisInteroperabilidad;
    }

    public void setRefIdPaisInteroperabilidad(Integer refIdPaisInteroperabilidad) {
        this.refIdPaisInteroperabilidad = refIdPaisInteroperabilidad;
    }
}
