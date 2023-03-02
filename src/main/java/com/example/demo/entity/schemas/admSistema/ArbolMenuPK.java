package com.example.demo.entity.schemas.admSistema;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.io.Serializable;

@Embeddable
public class ArbolMenuPK implements Serializable {
    @ManyToOne
    @JoinColumn(name = "iditemmenu", referencedColumnName = "iditemmenu")
    private ItemMenu iditemmenu;
    @ManyToOne
    @JoinColumn(name = "idmenu", referencedColumnName = "idmenu")
    private Menu idmenu;

    public ItemMenu getIditemmenu() {
        return iditemmenu;
    }

    public void setIditemmenu(ItemMenu iditemmenu) {
        this.iditemmenu = iditemmenu;
    }

    public Menu getIdmenu() {
        return idmenu;
    }

    public void setIdmenu(Menu idmenu) {
        this.idmenu = idmenu;
    }
}
