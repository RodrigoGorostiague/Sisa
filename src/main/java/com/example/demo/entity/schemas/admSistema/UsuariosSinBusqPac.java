package com.example.demo.entity.schemas.admSistema;

import jakarta.persistence.*;

@Entity
@Table(schema = "admsistema", name = "usuariossinbusqpac")
public class UsuariosSinBusqPac {
    @Id
    private String usuario;
    @ManyToOne
    @JoinColumn(name = "idmodulo", referencedColumnName = "idmodulo")
    private Modulo modulos;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Modulo getModulos() {
        return modulos;
    }

    public void setModulos(Modulo modulos) {
        this.modulos = modulos;
    }
}
