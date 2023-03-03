package com.example.demo.entity.schemas.resapro;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pais_indec_ref_iop", schema = "resapro")
public class PaisIndecRefIop {
    @Id
    @Column(name = "pais_id")
    private Integer paisId;
    @Column(name = "contienen_id")
    private Integer contienenId;
    private String descrip;
    @Column(name = "ref_id_pais_interoperabilidad")
    private Integer refIdPaisInteroperabilidad;
    private String nacionalidad;

    public Integer getPaisId() {
        return paisId;
    }

    public void setPaisId(Integer paisId) {
        this.paisId = paisId;
    }

    public Integer getContienenId() {
        return contienenId;
    }

    public void setContienenId(Integer contienenId) {
        this.contienenId = contienenId;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public Integer getRefIdPaisInteroperabilidad() {
        return refIdPaisInteroperabilidad;
    }

    public void setRefIdPaisInteroperabilidad(Integer refIdPaisInteroperabilidad) {
        this.refIdPaisInteroperabilidad = refIdPaisInteroperabilidad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
}
