package com.example.demo.entity.schemas.seguridad;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class RolCompuestoPK implements Serializable {
    @Column(name = "id_rolv")
    private Integer idRolv;
    @Column(name = "id_rolh")
    private Integer idRolh;
    @Column(name = "id_rolf")
    private Integer idRolf;

    public Integer getIdRolv() {
        return idRolv;
    }

    public void setIdRolv(Integer idRolv) {
        this.idRolv = idRolv;
    }

    public Integer getIdRolh() {
        return idRolh;
    }

    public void setIdRolh(Integer idRolh) {
        this.idRolh = idRolh;
    }

    public Integer getIdRolf() {
        return idRolf;
    }

    public void setIdRolf(Integer idRolf) {
        this.idRolf = idRolf;
    }
}
