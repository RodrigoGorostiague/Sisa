package com.example.demo.entity.schemas.admSistema;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.io.Serializable;

@Embeddable
public class GrupoMenuPK implements Serializable {

    @ManyToOne
    @JoinColumn(name = "idgrupo", referencedColumnName = "idgrupo")
    private Grupo idGrupo;
    @ManyToOne
    @JoinColumn(name = "idmenu", referencedColumnName = "idmenu")
    private Menu idMenu;

    public Grupo getIdGrupo() {
        return idGrupo;
    }

    public void setIdGrupo(Grupo idGrupo) {
        this.idGrupo = idGrupo;
    }

    public Menu getIdMenu() {
        return idMenu;
    }

    public void setIdMenu(Menu idMenu) {
        this.idMenu = idMenu;
    }
}
