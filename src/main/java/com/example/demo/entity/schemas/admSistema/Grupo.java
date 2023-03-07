package com.example.demo.entity.schemas.admSistema;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(schema = "admsistema", name = "grupo")
public class Grupo {
    @Id
    @Column(name = "idgrupo")
    private Integer idGrupo;
    private String descripcion;
    @ManyToMany
    @JoinTable(name = "grupomenu",schema = "admsistema",
            joinColumns = @JoinColumn(name = "idgrupo"),
            inverseJoinColumns = @JoinColumn(name = "idmenu"))
    private List<Menu> grupoMenus;

    public List<Menu> getGrupoMenus() {
        return grupoMenus;
    }

    public void setGrupoMenus(List<Menu> grupoMenus) {
        this.grupoMenus = grupoMenus;
    }

    public Integer getIdGrupo() {
        return idGrupo;
    }

    public void setIdGrupo(Integer idGrupo) {
        this.idGrupo = idGrupo;
    }

    public String getdescripcion() {
        return descripcion;
    }

    public void setdescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
