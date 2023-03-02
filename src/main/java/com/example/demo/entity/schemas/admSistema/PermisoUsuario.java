package com.example.demo.entity.schemas.admSistema;

import jakarta.persistence.*;

@Entity
@Table(schema = "admsistema", name = "permisousuario")
public class PermisoUsuario {
    @Id
    private String usuario;
    private Integer orden;
    @ManyToOne
    @JoinColumn(name = "idgrupo", referencedColumnName = "idgrupo")
    private Grupo grupo;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Integer getOrden() {
        return orden;
    }

    public void setOrden(Integer orden) {
        this.orden = orden;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }
}
