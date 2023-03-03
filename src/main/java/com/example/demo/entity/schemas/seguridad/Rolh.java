package com.example.demo.entity.schemas.seguridad;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "rolh", schema = "seguridad")
public class Rolh {
    @Id
    @Column(name = "id_rolh")
    private Integer idRolh;
    @Column(name = "desc_rolh")
    private String descRolh;

    public Integer getIdRolh() {
        return idRolh;
    }

    public void setIdRolh(Integer idRolh) {
        this.idRolh = idRolh;
    }

    public String getDescRolh() {
        return descRolh;
    }

    public void setDescRolh(String descRolh) {
        this.descRolh = descRolh;
    }
}
