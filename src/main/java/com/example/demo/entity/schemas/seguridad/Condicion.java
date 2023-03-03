package com.example.demo.entity.schemas.seguridad;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "condicion", schema = "seguridad")
public class Condicion {
    @Id
    @Column(name = "id_condicion")
    private Integer idCondicion;
    @Column(name = "id_rolh")
    private Integer idRolh;

    public Integer getIdCondicion() {
        return idCondicion;
    }

    public void setIdCondicion(Integer idCondicion) {
        this.idCondicion = idCondicion;
    }

    public Integer getIdRolh() {
        return idRolh;
    }

    public void setIdRolh(Integer idRolh) {
        this.idRolh = idRolh;
    }
}
