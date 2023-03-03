package com.example.demo.entity.schemas.seguridad;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "rol_compuesto", schema = "seguridad")
public class RolCompuesto {
    @EmbeddedId
    private RolCompuestoPK id;
    @Column(name = "desc_rol_comp")
    private String descRolComp;

    public String getDescRolComp() {
        return descRolComp;
    }

    public void setDescRolComp(String descRolComp) {
        this.descRolComp = descRolComp;
    }

    public RolCompuestoPK getId() {
        return id;
    }

    public void setId(RolCompuestoPK id) {
        this.id = id;
    }
}
