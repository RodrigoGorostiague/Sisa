package com.example.demo.entity.schemas.historialInternacion;

import jakarta.persistence.*;

@Entity
@Table(name = "perfilusuariovalidador", schema = "historialinternacion")
public class PerfilUsuarioValidador {
    @Id
    @ManyToOne
    @JoinColumn(name = "codigoperfil", referencedColumnName = "codigoperfil")
    private PerfilUsuarioInter perfilUsuarioInter;

    public PerfilUsuarioInter getPerfilUsuario() {
        return perfilUsuarioInter;
    }

    public void setPerfilUsuario(PerfilUsuarioInter perfilUsuarioInter) {
        this.perfilUsuarioInter = perfilUsuarioInter;
    }
}
