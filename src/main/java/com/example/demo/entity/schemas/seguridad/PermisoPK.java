package com.example.demo.entity.schemas.seguridad;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class PermisoPK implements Serializable {
    @Column(name = "nombre_campo")
    private String nombreCampo;
    @Column(name = "nombre_tabla")
    private String nombreTabla;
    @Column(name = "id_rolv")
    private String idRolv;

    public String getNombreCampo() {
        return nombreCampo;
    }

    public void setNombreCampo(String nombreCampo) {
        this.nombreCampo = nombreCampo;
    }

    public String getNombreTabla() {
        return nombreTabla;
    }

    public void setNombreTabla(String nombreTabla) {
        this.nombreTabla = nombreTabla;
    }

    public String getIdRolv() {
        return idRolv;
    }

    public void setIdRolv(String idRolv) {
        this.idRolv = idRolv;
    }
}
