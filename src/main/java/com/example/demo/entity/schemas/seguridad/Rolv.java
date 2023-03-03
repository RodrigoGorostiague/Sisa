package com.example.demo.entity.schemas.seguridad;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "rolv", schema = "seguridad")
public class Rolv {
    @Id
    @Column(name = "id_rolv")
    private Integer idRolv;
    @Column(name = "desc_rolv")
    private String descRolv;

    public Integer getIdRolv() {
        return idRolv;
    }

    public void setIdRolv(Integer idRolv) {
        this.idRolv = idRolv;
    }

    public String getDescRolv() {
        return descRolv;
    }

    public void setDescRolv(String descRolv) {
        this.descRolv = descRolv;
    }
}
