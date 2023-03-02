package com.example.demo.entity.schemas.admSistema;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(schema = "admsistema", name = "grupo")
public class Grupo {
    @Id
    @Column(name = "idgrupo")
    private Integer idGrupo;
    private String descripcuion;
    @OneToMany(mappedBy = "id.idGrupo")
    private List<GrupoMenu> grupoMenus;
    @OneToMany(mappedBy = "id.grupo")
    private List<PermisoUsuario> permisosUsuario;

    public List<PermisoUsuario> getPermisosUsuario() {
        return permisosUsuario;
    }

    public void setPermisosUsuario(List<PermisoUsuario> permisosUsuario) {
        this.permisosUsuario = permisosUsuario;
    }

    public List<GrupoMenu> getGrupoMenus() {
        return grupoMenus;
    }

    public void setGrupoMenus(List<GrupoMenu> grupoMenus) {
        this.grupoMenus = grupoMenus;
    }

    public Integer getIdGrupo() {
        return idGrupo;
    }

    public void setIdGrupo(Integer idGrupo) {
        this.idGrupo = idGrupo;
    }

    public String getDescripcuion() {
        return descripcuion;
    }

    public void setDescripcuion(String descripcuion) {
        this.descripcuion = descripcuion;
    }
}
