package com.example.demo.entity.schemas.seguridad;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "rolf", schema = "seguridad")
public class Rolf {
    @Id
    @Column(name = "id_rolf")
    private Integer idRolf;
    @Column(name = "desc_rolf")
    private String descRolf;
    @Column(name = "pagina_inicio")
    private String paginaInicio;

    public Integer getIdRolf() {
        return idRolf;
    }

    public void setIdRolf(Integer idRolf) {
        this.idRolf = idRolf;
    }

    public String getDescRolf() {
        return descRolf;
    }

    public void setDescRolf(String descRolf) {
        this.descRolf = descRolf;
    }

    public String getPaginaInicio() {
        return paginaInicio;
    }

    public void setPaginaInicio(String paginaInicio) {
        this.paginaInicio = paginaInicio;
    }
}
