package com.example.demo.entity.schemas.seguridad;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class RolCompuUsuPK implements Serializable {
    @Column(name = "id_rolh")
    private Integer idRolh;
    @Column(name = "id_rolv")
    private Integer idRolv;
    @Column(name = "id_rolf")
    private Integer idRolf;
    @Column(name = "id_usuario")
    private Integer idUsuario;

    public Integer getIdRolh() {
        return idRolh;
    }

    public void setIdRolh(Integer idRolh) {
        this.idRolh = idRolh;
    }

    public Integer getIdRolv() {
        return idRolv;
    }

    public void setIdRolv(Integer idRolv) {
        this.idRolv = idRolv;
    }

    public Integer getIdRolf() {
        return idRolf;
    }

    public void setIdRolf(Integer idRolf) {
        this.idRolf = idRolf;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }
}
