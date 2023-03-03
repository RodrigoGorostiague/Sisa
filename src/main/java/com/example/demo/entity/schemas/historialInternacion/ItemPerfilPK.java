package com.example.demo.entity.schemas.historialInternacion;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

import java.io.Serializable;

@Embeddable
public class ItemPerfilPK implements Serializable {
    @OneToOne
    @JoinColumn(name = "codigoperfil", referencedColumnName = "codigoperfil")
    private PerfilUsuario perfilUsuario;
    @ManyToOne
    @JoinColumn(name = "codigoitem",referencedColumnName = "codigoitem")
    private ItemMenu1 itemMenu1;

    public PerfilUsuario getPerfilUsuario() {
        return perfilUsuario;
    }

    public void setPerfilUsuario(PerfilUsuario perfilUsuario) {
        this.perfilUsuario = perfilUsuario;
    }

    public ItemMenu1 getItemMenu1() {
        return itemMenu1;
    }

    public void setItemMenu1(ItemMenu1 itemMenu1) {
        this.itemMenu1 = itemMenu1;
    }
}
