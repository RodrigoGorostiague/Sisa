package com.example.demo.entity.schemas.admSistema;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(schema = "admsistema", name = "arbolmenu")
public class ArbolMenu {
    @EmbeddedId
    private ArbolMenuPK id;
    private Integer orden;
    @ManyToMany
    @JoinColumns({
            @JoinColumn(name="iditemmenu", referencedColumnName="iditemmenupadre"),
            @JoinColumn(name="idmenu", referencedColumnName="idmenupadre")})
    private List<ArbolMenu> hijos;

    public ArbolMenuPK getId() {
        return id;
    }

    public void setId(ArbolMenuPK id) {
        this.id = id;
    }

    public Integer getOrden() {
        return orden;
    }

    public void setOrden(Integer orden) {
        this.orden = orden;
    }

    public List<ArbolMenu> getHijos() {
        return hijos;
    }

    public void setHijos(List<ArbolMenu> hijos) {
        this.hijos = hijos;
    }
}
