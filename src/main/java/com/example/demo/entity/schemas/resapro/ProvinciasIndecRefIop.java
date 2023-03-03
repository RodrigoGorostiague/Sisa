package com.example.demo.entity.schemas.resapro;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "provincias_indec_ref_iop", schema = "resapro")
public class ProvinciasIndecRefIop {
    @EmbeddedId
    private ProvinciasIndecRefIopPK id;
    private String descrip;
    @Column(name = "fe_modifi")
    private Date feModifi;
    @Column(name = "usu_modifi")
    private String usuModifi;
    @Column(name = "cod_sisa")
    private Integer codSisa;
    @Column(name = "ref_id_provincia")
    private Integer refIdProvincia;

    public ProvinciasIndecRefIopPK getId() {
        return id;
    }

    public void setId(ProvinciasIndecRefIopPK id) {
        this.id = id;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public Date getFeModifi() {
        return feModifi;
    }

    public void setFeModifi(Date feModifi) {
        this.feModifi = feModifi;
    }

    public String getUsuModifi() {
        return usuModifi;
    }

    public void setUsuModifi(String usuModifi) {
        this.usuModifi = usuModifi;
    }

    public Integer getCodSisa() {
        return codSisa;
    }

    public void setCodSisa(Integer codSisa) {
        this.codSisa = codSisa;
    }

    public Integer getRefIdProvincia() {
        return refIdProvincia;
    }

    public void setRefIdProvincia(Integer refIdProvincia) {
        this.refIdProvincia = refIdProvincia;
    }
}
