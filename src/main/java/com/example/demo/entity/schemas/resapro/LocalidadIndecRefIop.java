package com.example.demo.entity.schemas.resapro;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "localidad_indec_ref_iop", schema = "resapro")
public class LocalidadIndecRefIop {
    @EmbeddedId
    private LocalidadIndecRefIopPK id;
    private String descrip;
    @Column(name = "codlocalidadsisa")
    private String codLocalidadSisa;
    @Column(name = "codindecsisa")
    private String codIndecSisa;
    @Column(name = "codigo_postal")
    private String codigoPostal;
    private String indec;
    @Column(name = "ref_id_localidad_interoperabilidad")
    private Integer refIdLocalidadInteroperabilidad;

    public LocalidadIndecRefIopPK getId() {
        return id;
    }

    public void setId(LocalidadIndecRefIopPK id) {
        this.id = id;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public String getCodLocalidadSisa() {
        return codLocalidadSisa;
    }

    public void setCodLocalidadSisa(String codLocalidadSisa) {
        this.codLocalidadSisa = codLocalidadSisa;
    }

    public String getCodIndecSisa() {
        return codIndecSisa;
    }

    public void setCodIndecSisa(String codIndecSisa) {
        this.codIndecSisa = codIndecSisa;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getIndec() {
        return indec;
    }

    public void setIndec(String indec) {
        this.indec = indec;
    }

    public Integer getRefIdLocalidadInteroperabilidad() {
        return refIdLocalidadInteroperabilidad;
    }

    public void setRefIdLocalidadInteroperabilidad(Integer refIdLocalidadInteroperabilidad) {
        this.refIdLocalidadInteroperabilidad = refIdLocalidadInteroperabilidad;
    }
}
